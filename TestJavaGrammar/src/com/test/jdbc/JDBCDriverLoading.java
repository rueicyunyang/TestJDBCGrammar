package com.test.jdbc;

import java.lang.reflect.Method;

public class JDBCDriverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("java.lang.String");
			Method[] mds = c.getDeclaredMethods();
			for(int i=0;i<mds.length;i++){
				System.out.print(mds[i].getName()+" ");
			}
			System.out.println();
			System.out.println();
			ClassLoader loader = c.getClassLoader();

			System.out.print(loader);
			System.out.println();
			System.out.println();

			c = Class.forName("oracle.jdbc.driver.OracleDriver");
			Method[] driverMds = c.getDeclaredMethods();
			for(int i=0;i<driverMds.length;i++){
				System.out.print(driverMds[i].getName()+" ");
			}
			System.out.println();
			System.out.println();

			loader = c.getClassLoader();

			System.out.print(loader);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
