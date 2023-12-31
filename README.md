# IDE 활용법

문서
https://docs.google.com/document/d/1pIXFl8PheUcqjKOXYm18zEt89amxZQmsCJ7wrY-ODvA/edit

배포문서 (IDE)
https://docs.google.com/document/d/1pIXFl8PheUcqjKOXYm18zEt89amxZQmsCJ7wrY-ODvA/edit

배포문서 (IDE v2)
https://docs.google.com/document/d/1BL-jHoBOIU0k7lXfcLKXaGODcfyKMARXmDSaB0YpMxs/edit

배포문서 (DKOS)
https://docs.google.com/document/d/1cJFWNyhv6rJYsFzNnpiQTvoc7v5D8b2T_4PROdyLv7g/edit

## 1. IDE에서 실행하는법
```text
실행 URL과 포트를 80포트로 변경
```

```text
service mysql start
```

```text
gradle clean build && java -jar -Dspring.profiles.active=ide build/libs/kakao-1.0.jar
```

```text
chmod +x ./startFront.sh && ./startFront.sh
```

## 2.  배포하는 법
```text
빌드
카르고배포 (화면쪽에 아직 문제 있음)
```

## 3. 배포된 서버 확인하는 법
- url/api 로 조회해야함.
- ex) https://user-app.krampoline.com/kd52020ea7a71a/api/products

## 4. 카르고 배포환경 초기화하는 법
```text
kubectl delete statefulset mariadb
kubectl delete svc mariadb
kubectl delete pvc data-mariadb-0
```

# 구름에서 정리한 MD 파일

## 배포방법 PDF
https://file.notion.so/f/s/4311cb97-1efd-434e-b796-dbae3b5aac2f/%ED%85%8C%ED%81%AC%EC%BA%A0%ED%8D%BC%EC%8A%A4_%EB%B0%B0%ED%8F%AC_%EC%8B%9C%EB%82%98%EB%A6%AC%EC%98%A4.pdf?id=7e37819e-025e-4229-b896-7f631b4de6fe&table=block&spaceId=079fd135-2d90-4bdf-b746-cdd6f990ba6a&expirationTimestamp=1688515200000&signature=_NGoT-F7w9N0Kt66av8bZ4YGXQpy0y3yijQK-2HtIM8&downloadName=%ED%85%8C%ED%81%AC%EC%BA%A0%ED%8D%BC%EC%8A%A4+%EB%B0%B0%ED%8F%AC+%EC%8B%9C%EB%82%98%EB%A6%AC%EC%98%A4.pdf
https://www.notion.so/goorm/IDE-0706-9e6818607d334e8780fe05f9605271d1?pvs=4

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
