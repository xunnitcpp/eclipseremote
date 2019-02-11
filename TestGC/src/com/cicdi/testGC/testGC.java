package com.cicdi.testGC;
///////////////////////11111111111111
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class testGC {
	public static void main(String[] args) {
		List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean b:l) {
			System.out.println(b.getName());
		}
	} 
}
