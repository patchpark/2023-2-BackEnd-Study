# HTTP
	1. 정의

		HTTP(HyperText Transfer Protocol)란 웹에서 사용하는 프로토콜로 
		TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다

	2. 특징

		1) application layer와 network layer 사이의 transfer layer에서 
			TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다

		2) 클라이언트와 서버가 한번 연결을 맺은 후 클라이언트의 요청에 대해
			서버가 응답을 마치면 연결을 끊는 비 연결성의 특징을 가진다

		3) 서버는 클라이언트와 연결에 대한 정보를 저장하지 않기에 서버는 
			클라이언트를 식별하지 못하는 무상태성의 특징을 가진다

	3. HTTP Message

		1)	HTTP는 HTTP message를 통해 데이터를 주고 받으며, request와 
			response message 두 종류가 존재한다. message는 HTTP method, 
			경로, HTTP 버전, 헤더로 이루어져있다.

		2) HTTP method의 종류
			가. GET
				리소스 조회
			나. POST
				요청 데이터 처리, 주로 등록에 사용
			다. PUT
				리소스를 대체, 해당 리소스가 없으면 생성
			라. PATCH
				리소스 부분 변경
			마. DELETE
				리소스 삭제

		3) 자주 볼 수 있는 HTTP 상태 코드
			가. 200
				클라이언트의 요청을 정상적으로 수행함
			나. 201
				클라이언트가 생성을 요청한 리소스를 성공적으로 생성함
			다. 204
				클라이언트가 삭제를 요청한 리소스를 성공적으로 삭제함
			라. 400
				클라이언트의 요청이 부적절 할 경우 사용함
			마. 401
				클라이언트가 인증되지 않은 상태에서 보호된 
				리소스를 요청했을떄 사용함
			바. 403
				인증상태와 관계 없이 응답하고 싶지 않은 리소스를
				요청했을때 사용함
			사. 404
				클라이언트가 요청한 리소스에서 사용 불가한
				Method를 이용했을 경우 사용함
			아. 500
				서버에 문제가 있을 경우 사용함
			자. 502
				게이트웨이 오류일 경우 사용함
# HTTPS
	HTTPS의 개념과 HTTP와의 차이

		HTTP에서 S(Secure)가 추가된 프로토콜이다. HTTP 프로토콜의 문제점은
		클라이언트와 서버가 통신을 통하여 정보를 주고 받을 때, 그 정보가 암
		호화 되지 않는다는 것이다. 민감한 정보를 포함한 통신을 전송 중간에
		제3자가 탈취한 경우, HTTP는 그 정보가 고스란히 노출이 된다. 그러나
		HTTPS 프로토콜은 SSL(보안 소켓 계층) 혹은 TSL 알고리즘을 사용함으
		로써 HTTP 통신 과정에서 정보를 암호화한다. 사용하는 암호화 방식에는 
		암호화, 복호화에 사용하는 키가 같은 대칭키 암호화 방식과 암호화 복
		호화에 사용하는 키가 다른 공개키 암호화 방식이 존재한다.

# URI 설계

	1. 이벤트 목록 조회
		GET /events

	2. 이벤트 조회
		GET /events/{eventId}

	3. 이벤트 등록
		POST /events/{eventId}

	4. 이벤트 수정
		PUT /events/{eventId}

	5. 이벤트 삭제
		DELETE /events/{eventId}

	6. 이벤트 상태 변경
		PUT /events/{eventId}/state

	7. 특정 이벤트의 주문 목록 조회
		GET /events/{eventId}/orders

	8. 멤버 목록 조회
		GET /users

	9. 특정 멤버 권한 변경
		PUT /users/{userId}/permission

	10. 특정 멤버 정보 조회
		GET /users/{userId}/info

	11. 특정 멤버 정보 변경
		PUT /users/{userId}/info

	12. 멤버 등록
		POST /users/{userId}