package edu.utdallas.acn.utility;

public class SensorNode {

	private String nodeName;
	private int xCoordinate;
	private int yCoordinate;
	private String ipAddress;
	private int port;
	private double transmissionRange;
	private double temperature;
	private boolean isSinkNode;
		
	public SensorNode() {
		this.nodeName = "";
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		this.ipAddress = "";
		this.port = 0;
		this.transmissionRange = 0.0;
		this.temperature = 0.0;
		this.isSinkNode = false;
		
	}

	public SensorNode(String nodeName, int xCoordinate, int yCoordinate,
			String ipAddress, int port, double transmissionRange,
			double temperature, boolean isSinkNode) {
		this.nodeName = nodeName;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.ipAddress = ipAddress;
		this.port = port;
		this.transmissionRange = transmissionRange;
		this.temperature = temperature;
		this.isSinkNode = isSinkNode;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public double getTransmissionRange() {
		return transmissionRange;
	}

	public void setTransmissionRange(double transmissionRange) {
		this.transmissionRange = transmissionRange;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public boolean isSinkNode() {
		return isSinkNode;
	}

	public void setSinkNode(boolean isSinkNode) {
		this.isSinkNode = isSinkNode;
	}
			
}
