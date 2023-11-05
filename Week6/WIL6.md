# DB

	DB : 여러 사용자가 공유하여 사용할 수 있도록 통합해서 저장한 운영 데이터의 집합

	SQL : 관계 DB, 정형 데이터

	NoSQL(not only SQL) : 데이터 구조가 정해저 있지 않는 비정형 데이터

# ORM

	ORM : DB와 객체지향 프로그래밍 언어 사이의 관계형 데이터를
		  객체로 매핑하는 기술(SQL 작성 없이 데이터 조작 가능)

	장점
		1. 추상화 :  데이터베이스와의 상호 작용을 객체 지향적인 방식으로 처리
		2. 데이터베이스 독립성 : 다양한 DBMS에 대해 동일한 코드를 사용 가능
		3. 생산성 : SQL 쿼리를 직접 작성하지 않아도 됨
		4. 유지 보수 : 코드 변경이 필요할 때, 객체 모델만 수정 가능

	단점
		1. 성능 : 개발자가 작성한 쿼리보다 비효율적일 수 있다.
		2. 복잡성 : 복잡한 쿼리나 특정 데이터베이스 최적화 기술을 사용하려면 
					ORM을 벗어나야 할 수 있다.

# JPA

	JPA : 자바 애플리케이션에서 관계형 DB를 사용하는 방법을 정의한 자바 API

	특징
		1. 객체-테이블 매핑 : 어노테이션 또는 XML을 사용하여 자바 객체와 
							 데이터베이스 테이블을 매핑
		2. 쿼리 언어 사용 : JPQL라는 객체지향 쿼리 언어를 제공하여 
						   데이터베이스에 질의 가능 
		3. 생명주기 관리 : 엔티티의 생명 주기 (예: 생성, 조회, 수정, 삭제)를 관리
		4. 캐싱 : 기본적인 캐시 전략을 지원
		5. 자동 스키마 생성: 데이터베이스 스키마를 자동으로 생성하거나 업데이트 가능