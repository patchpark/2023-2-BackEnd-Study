# Java와 객체 지향 프로그래밍
## 자바의 특징
		1. 운영체제, 하드웨어로 부터의 독립성(JVM)
		2. 객체 지향 언어
		3. 자동 메모리 관리
		4. 네트워크와 분산처리를 지원
		5. 멀티 쓰레드 지원
		6. 동적 로딩 지원

## 객체지향 프로그래밍
		1. 객체 지향 프로그래밍의 특징
			1) 추상화(abstraction)
				객체에서 공통된 속성과 행위를 추출
				공통의 속성과 행위를 찾아 타입을 정의
				필요한 속성/정보를 추출하고 그 외는 숨기는 과정
			2) 캡슐화(encapsulation)
				데이터 구조와 데이터를 다루는 방법들을 결합 시켜 묶음
				낮은 결합도 유지
				재사용, 정보 은닉의 장점
			3) 상속(inheritance)
				클래스의 속성과 행위를 하위 클래스가 물려받는 것
				새로운 클래스가 기존의 클래스의 데이터와 연산을 이용 가능
			4) 다형성(polymorphism)
				같은 변수명, 함수명이 상황에 따라 다른 의미로 해석
				예) 오버라이딩, 오버로딩

		2. 객체 지향 프로그래밍의 장점
		 	장점
				코드의 재사용성이 높다
				유지보수가 쉽다
				대형 프로젝트에 적합하다
			단점
				처리 속도가 상대적으로 느리다
				객체가 많아지면 용량이 커질 수 있다
				설계시 많은 노력과 시간이 필요하다
## 객체 지향의 설계 원칙
		1. 단일 책임 원칙(Single Responsibility Principle)			
			하나의 클래스는 하나의 책임
			지키지 않을시 다른 책임과 관련된 코드에 영향
		2. 개방-폐쇄 원칙(Open/Closed Principle)
			확장에는 열려있으나 변경에는 닫혀있어야한다
			기능을 변경하거나 확장할 수 있으면서 기능을 사용하는 코드는 수정하지 않는다
		3. 리스코프 치환 원칙(Liskov Substitution Principle)
			객체는 프로그램의 정확성을 해하지 않으며 
			하위 타입의 인스턴스로 바꿀 수 있어야 한다
			상위 타입의 객체를 하위 타입의 객체로 치환해도, 
			상위 타입을 사용하는 프로그램은 정상적으로 동작해야 한다
			서브 클래스가 확장에 대한 인터페이스를 준수해야 한다
		4. 인터페이스 분리 원칙 (Interface Segregation Principle)
			하나보다는 여러 개의 인터페이스
			인터페이스를 사용하는 클라이언트를 기준으로 분리함으로써
			클라이언트가 사용하지 않는 인터페이스에 변경이 있어도
			영향을 받지 않도록 해야한다
		5. 의존 관계 역전 원칙(Dependency Inversion Principle)
			추상화에 의존
			


***
# 실습 과제


```java
// Main 클래스


package org.example;

public class Main {
	
	public static void main(String[] args) {

        Calculator calculator = new CalculatorChild();

        System.out.println("1234 + 4321 = " + calculator.plus(1234, 4321));
        System.out.println("911 - 170 = " + calculator.minus(911, 170));
        System.out.println("2 * 3 = " + calculator.mul(2, 3));
        System.out.println("33 / 11 = " + calculator.div(33, 11));

        System.out.println("\n");

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}

// Calculator 인터페이스

package org.example;

public interface Calculator {  
    
		int plus(int a, int b);  
		int minus(int a, int b);  
		int mul(int a, int b);  
		int div(int a, int b);  
		}

// CalculatorChild 클래스

package org.example;

public class CalculatorChild implements Calculator{

	@Override
	public int plus(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

}

// Animal 추상클래스  

package org.example;

public abstract class Animal {

	public abstract void speak();
	
}

// Cat 클래스

package org.example;

public class Cat extends Animal{

	@Override
	public void speak() {
		System.out.println("cat says Meow!");
		
	}
	
}


// Dog Class  

package org.example;

public class Dog extends Animal{

	@Override
	public void speak() {
		System.out.println("dog says Woof!");
		
	}

	
}
```