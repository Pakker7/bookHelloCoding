## 해시 테이블
- 장점
  - 빠르다 O(1)
  - 어떤 것과 다른 것 사이의 관계를 모형화 할 수 있다.
  - 중복을 막을 수 있다.
  - 서버에게 작업을 시키지 않고 자료를 캐싱 할 수 있다.  
- 충돌
  - 충돌 안하게 하려면 같은 공간에 여러개의 키를 연결리스트로 만들어 넣기
  - 해시 함수는 키를 해시 테이블 전체에 고르게 할당 해야 함