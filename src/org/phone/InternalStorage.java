package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Qualcomm Snapdragon 712 AIE");
	}
	private void ramSize() {
		System.out.println("4GB RAM");
	}
public static void main(String[]args) {
	InternalStorage a = new InternalStorage();
	a.processorName();
	a.ramSize();
	ExternalStorage b = new ExternalStorage();
	b.size();
}
}
