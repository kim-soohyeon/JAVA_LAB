# 04 제어 흐름 이해하기

## 04-1 조건문
---
### 조건문이란?

주어진 조건에 따라 다른 수행문이 실행되도록 프로그래밍하는 것

### if문과 if-else문

- **if문**

	if(조건식){
	
	수행문;
	
	}

- **if-else 문**

	if(조건식){
	
	수행문1;
	
	}else{
	
	수행문2;
	
	}
### if-else if-else문

- if-else-if-else문: 하나의 경우에 조건이 여러 개에 해당하는 경우

   ![Untitled](https://user-images.githubusercontent.com/59382707/130347814-11f3b1af-b1c5-4d0c-9350-c62cd986719c.png)

	if(조건1){
	
	문장1;
	
	}else if(조건2){
	
	문장2;
	
	}else if(조건3){
	
	문장3;
	
	}else{
	
	문장4;
	
	}

### 조건문과 조건 연산자

간단한 if-else 조건문은 조건 연산자로 구현할 수 있다.

![Untitled](https://user-images.githubusercontent.com/59382707/130347866-45bec698-b4ef-485d-b406-f7f79aea9491.png)

### switch-case문

조건식의 결과가 정수 또는 문자열의 값이고 그 값에 따라 수행문이 결정될 때 사용한다.

- 순위에 따른 메달의 색을 정해주는 코드

	switch(rank){
	
	case 1: medalColor = 'G';
	
	break;
	
	case 2: medalColor = 'S;
	
	break;
	
	case 3: medalColor = 'B';
	
	break;
	
	default: medalColor = 'A;
	
	}

### case문에 문자열 사용하기(자바 7 이상가능)

switch-case문의 case에 문자열을 사용할 수 있다.

## 04-2 반복문
---
### 반복문이란?

주어진 조건이 만족할 때까지 수행문을 반복적으로 수행한다.

### while문

조건식이 참인 동안 수행문을 반복해서 수행한다.

주로 조건식이 true, false로 나타난다.

### do-while문

먼저 수행문을 한 번 수행하고 조건식을 체크한다.

(수행문이 반드시 한 번 이상 수행 되어야하는 경우에 사용한다.)

### for문

반복문 중 가장 많이 사용하는 반복문으로 조건이 수의 범위, 횟수인 경우에 사용한다.

### 무한 반복

	while(true){
	
	수행문;
	
	}
	
	do{
	
	수행문;
	
	}while(true);
	
	for(;;){
	
	수행문;
	
	}
	
### 중첩된 반복문

반복문 내부에 반복문이 사용된다.

ex) 구구단

### continue문

반복문과 함께 쓰이며, 반복문 내부에서 continue문을 만나면

이후 반복문을 수행하지 않고 조건식이나 증감식을 수행한다.

ex) 1부터 100까지 홀수만 더하기