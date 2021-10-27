package br.com.patterns.command;

import java.util.Deque;
import java.util.LinkedList;

public class Magico {

    private final Deque<Runnable> undoStack = new LinkedList<>();
    private final Deque<Runnable> redoStack = new LinkedList<>();

    public Magico() {
    }

    public void lancaMagia(Runnable runnable) {
        runnable.run();
        undoStack.offerLast(runnable);
    }

    public void desfazUltimaMagia() {
        if (!undoStack.isEmpty()) {
            var previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    public void refazUltimaMagia() {
        if (!redoStack.isEmpty()) {
            var previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    @Override
    public String toString() {
        return "Magico";
    }
}