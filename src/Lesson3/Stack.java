package Lesson3;

import java.io.IOException;

public class Stack {
    // максимальный размер стека
    private int maxSize;
    // внутреннее хранилище стека
    private int[] stack;
    // верхний элемент
    private int head;

    // конуструктор задающий размер стека
    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[size];
        // -1 в головном элементе значит что стек пуст
        this.head = -1;
    }
    // проверка является ли стек пустым
    public boolean isEmpty() {
        return head == -1;
    }
    // проверка заполнен ли стек
    public boolean isFull() {
        //стек заполнен если позиция головного элемента последняя в хранилище
        return head == maxSize - 1;
    }
    // помещение элемента в стек
    public boolean push(int i) {
        // проверка не переполнен ли стек
        if (isFull()) {
            return false;
        }
        // если в стеке есть место, то смещаем голову на элемент вперед и кладем туда i
        stack[++head] = i;
        return true;
    }
    // достаем элемент из стека и удаляем его

    public int pop() throws IOException {
        // если в стеке ничего нет бросаем исключение
        if (isEmpty()) throw new IOException("Stack is empty");
        // возвращаем значение головы и смещаем голову на элемент назад
        return stack[head--];
    }
    // достаем элемент из стека без удаления
    public int peek() throws IOException {
        if (isEmpty()) throw new IOException("Stack is empty");
        return stack[head];
    }

}
