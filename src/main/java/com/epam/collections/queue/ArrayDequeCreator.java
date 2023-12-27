package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();

        resultDeque.offer(firstQueue.poll());
        resultDeque.offer(firstQueue.poll());
        resultDeque.offer(secondQueue.poll());
        resultDeque.offer(secondQueue.poll());
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.offer(resultDeque.poll());
            resultDeque.offer(firstQueue.poll());
            resultDeque.offer(firstQueue.poll());
            secondQueue.offer(resultDeque.poll());
            resultDeque.offer(secondQueue.poll());
            resultDeque.offer(secondQueue.poll());

        }

        return resultDeque;
    }
}
