package tools.package_01;

import tools.package_02.KlasseB;

public class KlasseA {
public static void main (String[] args) {
	KlasseB kb = new KlasseB();
	kb.mijnMethode();
	System.out.print(kb.w);
	System.out.print(kb.x);
	System.out.print(kb.y);
	System.out.print(kb.z);
}
}
