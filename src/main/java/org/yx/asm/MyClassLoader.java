package org.yx.asm;

public class MyClassLoader extends ClassLoader {
	public Class<?> defineClass(String name, byte[] b) {
		return defineClass(name, b, 0, b.length);
	}
}
