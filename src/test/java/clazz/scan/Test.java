package clazz.scan;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		ClassPath classPath = ClassPath.from(Test.class.getClassLoader());
		List<ClassInfo> classInfos = classPath.getAllClasses();
		System.out.println(classInfos.size());
	}
}
