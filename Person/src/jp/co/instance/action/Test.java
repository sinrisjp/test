package jp.co.instance.action;

public class Test {

	public static void main(String[] args) {

		Person taro = new Person();

		taro.name="山田太郎";

		taro.age =20;

		taro.phoneNumber="000-1111-2222";

		taro.address="北海道";

		taro.gender="男";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.gender);



		Person jiro = new Person();

		jiro.name="木村次郎";

		jiro.age=18;

		jiro.phoneNumber="333-4444-5555";

		jiro.address="群馬県";

		jiro.gender="男";


		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.gender);

		Person hanako =new Person();

		hanako.name="鈴木花子";

		hanako.age=16;

		hanako.phoneNumber="666-7777-8888";

		hanako.address="沖縄県";

		hanako.gender="女";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.gender);


		Person shinri =new Person();

		shinri.name="谷口槙理";

		shinri.age=29;

		shinri.phoneNumber="123-4567-8901";

		shinri.address="東京都";

		shinri.gender="男";

		System.out.println(shinri.name);
		System.out.println(shinri.age);
		System.out.println(shinri.phoneNumber);
		System.out.println(shinri.address);
		System.out.println(shinri.gender);



		taro.talk();

		taro.walk();

		taro.run();



		Robot aibo = new Robot();

		Robot asimo = new Robot();

		Robot pepper = new Robot();

		Robot doraemon = new Robot();

		aibo.name = "アイボ";

		aibo.talk();

		aibo.walk();

		aibo.run();


		asimo.name = "アシモ";

		asimo.talk();

		asimo.walk();

		asimo.run();


		pepper.name = "ペッパー";

		pepper.talk();

		pepper.walk();

		pepper.run();


		doraemon.name = "ドラえもん";

		doraemon.talk();

		doraemon.walk();

		doraemon.run();

	}

}