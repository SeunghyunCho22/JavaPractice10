import java.io.*;
import java.util.*;

public class Main {
    public static class MyStack<E> extends Vector<E> {
        /*
         * 1. push(E item): item을 MyStack<E> 맨 위에 add
         * 2. pop(): MyStack<E> 맨 위의 값을 제거, 만약 스택이 비어있으면 Stack is empty. 출력
         * 3. peek(): MyStack<E> 맨 위의 값을 리턴, 만약 스택이 비어있으면 Stack is empty. 출력
         * 4. isEmpty(): 스택이 비어있는지 확인, 비어 있다면 size == 0 리턴
         * 5. search(Object o): 스택에서 o를 검색하여 해당 객체가 스택에서 발견되는 경우 그 위치(인덱스)를 반환
         */
    }

    public static void main(String[] args) {
        Vector<Integer> stack = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stacksize = 0;
        for (int i = 0; i < n; i++) {
            String fname = sc.next();
            if (fname.equals("push")) { // push일때
                int sn = sc.nextInt();
                stack.add(sn);
                stacksize += 1;
            } else {// 입력값이 pop일때
                if (stacksize == 0) {
                    System.out.println("Stack is empty.");
                } else { // 스택 안에 뭐라도 있을 때
                    stack.remove(stacksize - 1);
                    stacksize -= 1;
                }
            }
        }
        String compare;
        int idx = stack.indexOf(3);
        if (idx != -1) {
            idx += 1;
        }
        // 2 pop pop 하면 에러가 뜬다. 현재 stacksize는 -1이다.

        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");

        } else {
            Integer obj = stack.get(stacksize - 1);
            int peek = obj.intValue();
            compare = "false";
            System.out.println("Peek: " + peek);
        }

        System.out.println("Is Stack empty? " + stack.isEmpty());
        System.out.println("Position of 3: " + (idx));

        /*
         * "
         * 스택 선언: MyStack<Integer> stack = new MyStack<>();
         * 숫자 하나를 입력 받아 그 숫자 만큼 명령어를 입력받는다.
         * 명령어 설명
         * 1. push (숫자): 숫자를 입력받아 push 함수 실행
         * 2. pop: 스택 맨 위의 숫자 제거
         * 출력 설명 - 테스트케이스 1번을 확인하여 작성
         * 1. peek 함수 사용하여 첫번째 줄 출력
         * 2. isEmpty 함수 사용하여 스택 비어있는지 여부 출력 - 만약 비어있으면 Stack is empty.만 출력
         * 3. "숫자 3"이 어디에 위치해있는지 출력 (아래에서부터 1번쨰, 2번쨰, 3번째 ...)
         * 이서연 월케 킹받음???
         
         
         */
    }
}
