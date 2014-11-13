package edu.utdallas.acn.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import edu.utdallas.acn.utility.SensorNode;

public class DistanceCalculator {

	public static double calculateDistance(SensorNode firstNode, SensorNode secondNode)
	{
		double distance = 0.0;
		int x1= firstNode.getxCoordinate();
		int x2= secondNode.getxCoordinate();
		int y1= firstNode.getyCoordinate();
		int y2= secondNode.getyCoordinate();
		distance= Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		return distance;
	}
	private static SensorNode createSensorNode(String[] arr)
	{
		 String nodeName= arr[0];
		 int xCoordinate = Integer.parseInt(arr[1].trim());
		 int yCoordinate =Integer.parseInt(arr[2].trim());
		 String ipAddress= arr[3].split("/")[0];
		 int port = Integer.parseInt(arr[3].split("/")[1]);
		 int transmissionRange = Integer.parseInt(arr[5].trim());
		 double temperature= Double.parseDouble(arr[4].trim());
		 boolean isSinkNode= Boolean.parseBoolean(arr[6].trim());
		 SensorNode sensorNode = new SensorNode(nodeName, xCoordinate, yCoordinate, ipAddress, port, transmissionRange, temperature, isSinkNode);

		 return sensorNode;
	}
	public static ArrayList<SensorNode> readTopology()
	{
		ArrayList<SensorNode> listOfNodes = new ArrayList<SensorNode>();
		try 
		{
			String str;
			String arr[];
			SensorNode node;
			BufferedReader topo = new BufferedReader(new FileReader("TopologyThree.txt"));
			while ((str = topo.readLine()) != null) {
				System.out.println(str);
				    arr = str.split(",");
				
				    node = createSensorNode(arr);
				    listOfNodes.add(node);
			}
			topo.close();
		}catch (IOException e) {
		}
		return listOfNodes;
	}
	public static void main(String[] args) {
	
		ArrayList<SensorNode> listOfNodes = DistanceCalculator.readTopology();

		HashMap<SensorNode, ArrayList<SensorNode>> neighborsMap = new HashMap<SensorNode, ArrayList<SensorNode>>();
		ArrayList<SensorNode> neighborsList = new ArrayList<SensorNode>();
		double distance;

		SensorNode firstNode;
		SensorNode secondNode;
		
		for(int i=0; i<listOfNodes.size(); i++)
		{
			firstNode = listOfNodes.get(i);
			
			for(int j=0; j<listOfNodes.size(); j++)
			{
				secondNode = listOfNodes.get(j);
				distance = DistanceCalculator.calculateDistance(firstNode, secondNode);
				if(distance != 0.0 && distance <= firstNode.getTransmissionRange())
				{
					neighborsList.add(secondNode);
				}
				
			}
			neighborsMap.put(firstNode, neighborsList);
			System.out.println("\nNode: "+ firstNode.getNodeName());
			System.out.println("Neighbours: ");
			for (SensorNode sensorNode : neighborsList) {
				System.out.print(sensorNode.getNodeName()+" ");
				
			}
			neighborsList.clear();
			neighborsMap.clear();

		}
	}
}
