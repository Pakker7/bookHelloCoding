## 호출 스택
- 재귀는 메모리를 많이 사용한다 
  - 이유는 1번째 함수가 실행되다가 재귀로 2번째 함수가 실행 되다가 재귀로 3번째 함수가 실행되다가....
    이기 때문에 마지막 재귀가 끝나기 전까지는 1,2,3.... 함수가 계속 실행되고 있으면서 메모리를 먹기 때문이다.