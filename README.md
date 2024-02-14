# java-racingcar
## 기능 목록
- [ ] 자동차 이름을 입력 받는다
  - [ ] 공백, null 값이면 예외를 발생 시킨다
  - [ ] ✅ ","로 시작한다면 ","이후 문자열만 가져온다
  - [ ] ","로 split 해준다
- [ ] 자동차 이름에 올바른 값이 들어왔는지 확인한다(자동차 각각)
  - [ ] 앞 뒤 공백을 제거한다
  - [ ] 공백, null 값 체크
  - [ ] ✅ 영문, 숫자, "_", "-"를 제외한 다른 값이 있는 경우 예외를 발생 시킨다
  - [ ] 5자를 초과하는 경우 예외를 발생 시킨다
- [ ] 중복되는 자동차 이름이 있으면 예외를 발생 시킨다
- [ ] ✅ 총 자동차가 2대 이상 10대 이하가 아니면 예외를 발생 시킨다
- [ ] 시도할 횟수를 입력 받는다
  - [ ] 공백, null 값이면 예외를 발생 시킨다
  - [ ] 입력한 숫자가 양의 정수가 아니면 예외를 발생 시킨다
  - [ ] Integer의 범위를 초과하면 예외를 발생 시킨다
- [ ] 아래 동작을 시도할 횟수만큼 반복한다
  - [ ] 0에서 9 사이의 랜덤 값을 생성한다
  - [ ] 생성한 랜덤 값이 4 이상이면 자동차를 전진한다
  - [ ] 각 자동차의 현재 상황을 "이름 : -"와 같이 출력한다
- [ ] 모든 자동차 중에 가장 큰 전진 횟수를 찾는다
- [ ] 가장 큰 전진 횟수와 동일한 자동차들을 필터링한다
- [ ] ", "로 합쳐서 출력한다
- [ ] ✅ 사용자의 입력에 대한 예외가 발생하면 해당 입력을 다시 받을 수 있도록 돌아간다

## 요구 사항
- 단위 테스트 구현
- 한 메서드에 오직 한 단계의 들여쓰기만 한다
- else 예약어를 쓰지 않는다
- 함수(또는 메서드)의 길이다 15 라인을 넘어가지 않도록 구현한다

## 예시
```markdown
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```