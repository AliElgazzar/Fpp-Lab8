package StackAPI;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentUrl;

    public BrowserHistory(String initialUrl) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentUrl = initialUrl;
        System.out.println("Starting URL: " + currentUrl);
    }

    public void visit(String url) {
        if (currentUrl != null) {
            backStack.push(currentUrl);
        }
        currentUrl = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentUrl);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentUrl);
            currentUrl = backStack.pop();
            System.out.println("Back to: " + currentUrl);
        } else {
            System.out.println("No history to go back to.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentUrl);
            currentUrl = forwardStack.pop();
            System.out.println("Forward to: " + currentUrl);
        } else {
            System.out.println("No forward history.");
        }
    }
}