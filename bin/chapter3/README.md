# 03 자바의 여러 가지 연산자
---

## 03-1 기본 연산자
---

### 항과 연산자

- 항(operand): 연산에 사용되는 값
- 연산자(operator): 항을 이용하여 연산하는 기호
- 항의 개수에 따른 연산자 구분

![Untitled](https://user-images.githubusercontent.com/59382707/130031404-f7492c6b-1f23-4be5-b5e4-1a59892eb9c4.png)

### 대입 연산자

- 변수에 값을 대입하는 연산자
- 연산의 결과를 변수에 대입한다.
- 우선 순위가 가장 낮은 연산자
- 왼쪽 변수에 오른쪽 변수(값)를 대입한다.

### 부호 연산자

- 단항 연산자. 양수/음수의 표현, 값의  부호를 변경

![Untitled](https://user-images.githubusercontent.com/59382707/130031691-e5d3c260-3ef5-4cdb-8378-8ecc7ccf1fad.png)

### 산술 연산자

- 사칙연산에 사용되는 연산자.
- % 연산자 → 숫자 n의 나머지는 0~n-1 범위의 수

![Untitled](https://user-images.githubusercontent.com/59382707/130031976-6df36d78-b92f-4868-8100-29bfb024c4e9.png)

### 증가ᆞ감소 연산자

- 단항 연산자. 1만큼 더하거나 뺄 때 사용하는 연산자.
- 항의 앞/뒤 위치에 따라 연산의 결과가 달라진다.

![Untitled](https://user-images.githubusercontent.com/59382707/130032236-1bfcb7b7-1d80-4077-9230-218ec33355b8.png)

### 관계 연산자

- 이항 연산자. 연산의 결과가 true(참)/false(거짓)으로 반환된다.

![Untitled](https://user-images.githubusercontent.com/59382707/130032870-1daf0914-f414-4543-a76e-ddc6ac5426b8.png)

### 논리 연산자

- 관계 연산자와 혼합하여 많이 사용된다.
- 연산의 결과가 true(참)/false(거짓)으로 반환된다.

![Untitled](https://user-images.githubusercontent.com/59382707/130033294-36447ab4-1189-46c4-a9e6-2ca8ea998e49.png)

### 단락 회로 평가(Short-Circuit Evaluation)

- **논리 곱(&&)**

⇒ 앞의 항이 false이면 뒤 항의 결과를 평가하지 않아도 false이다.

- **논리 합(||)**

⇒ 앞의 항이 true이면 뒤 항의 결과를 평가하지 않아도 true이다.

## 03-2 비트 연산자
---

비트 연산자는 정수에만 사용가능하다.
![Untitled](https://user-images.githubusercontent.com/59382707/130038917-640483e1-2035-4218-a050-42601024475a.png)
