# MVC

	1. MVC란
		Model-View-Controller의 약자로 애플리케이션의 데이터 처리, 사용자 인터페이스, 
		제어 로직을 분리하여 구분하는 디자인 패턴이다.

	2. MVC의 장점	
		1) 분리 및 재사용
			각 컴포넌트는 독립적이기에 다른 부분에 영향을 주지 않고 수정/재사용 가능
		2) 유지 보수
			변경이 필요한 경우, 해당 컴포넌트만을 수정하면 됨
		3) 확장성
			새로운 기능이나 로직을 추가하기 쉬움

# Model

	* 데이터와 비지니스 로직을 처리
	* 데이터베이스와 상호 작용, 쿼리 실행, 데이터 저장 및 조회와 같은 작업 포함
	* 변경 발생시 관련 View에 알릴 수 있음

# View

	* 화면에 표시되는 UI 부분
	* 데이터를 표시하거나 사용자와 상호작용을 위한 인터페이스를 표시하는 영역

# Controller

	* Model과 View 사이의 중간 역할 담당
	* 클라이언트 요청에 대해 실제 업무를 수행하는 Model 컴포넌트를 호출,
	  결과를 View에 전달