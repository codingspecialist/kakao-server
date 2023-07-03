## d2hub 빌드
프로젝트가 정상적으로 실행되려면 Dockerfile이 현재 프로젝트의 최상단에 있어야 합니다.

( 예 : `/workspace/project_name/Dockerfile` )

## 퍼미션 주기
chmod +x startFront.sh

## 로컬 프론트엔드 앱 실행
로컬에서 프론트엔드를 실행시키려면 `startFront.sh`를 실행해주세요.

## 데이터베이스 시작
데이터베이스 시작은 `service mysql start` 로 해주세요.
- 계정 `root`
- 비밀번호 `root`
- 실행 명령어 `mysql -uroot -proot`