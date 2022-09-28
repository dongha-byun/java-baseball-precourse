# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현 기능 목록
1) 1~9 까지 숫자 중 서로 다른 세 숫자 선별(컴퓨터 입장)
2) 맞추고자 하는 서로 다른 세 숫자 입력
* 숫자만 입력인지 검사
* 길이가 3이 맞는지 검사
* 서로 다른 세 숫자를 입력했는지 검사
* 위 셋 중 하나라도 불충족하는 경우 exception
3) 입력 받은 값 체크(올바르지 않은 경우 예외 처리)
4) 볼 체크 
5) 낫싱 체크
6) 스트라이크 체크
7) 2번에서 입력한 숫자에 대한 최종 체크 여부 출력
8) 3스트라이크 일 경우, 게임종료 or 재시작 처리