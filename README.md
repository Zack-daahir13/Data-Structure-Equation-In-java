# 📘 Data Structures & Algorithms in Java

## 🚀 Overview
Welcome to **Data Structures and Algorithms** (DSA) in **Java**! 🔥 This repository contains essential concepts, coding examples, and equations to help you master DSA for problem-solving and coding interviews. 💡✨

## 📌 Topics Covered
### 1️⃣ **Arrays & Strings** 📊
- Basics of Arrays & Strings
- Two Pointer Techniques
- Sliding Window
- Hashing for Optimization
- **Example:** Find the maximum sum subarray (Kadane’s Algorithm)
  ```java
  public int maxSubArray(int[] nums) {
      int maxSum = nums[0], currentSum = nums[0];
      for (int i = 1; i < nums.length; i++) {
          currentSum = Math.max(nums[i], currentSum + nums[i]);
          maxSum = Math.max(maxSum, currentSum);
      }
      return maxSum;
  }
  ```

### 2️⃣ **Linked Lists** 🔗
- Singly & Doubly Linked List
- Fast & Slow Pointer Approach
- **Example:** Detect cycle in a linked list (Floyd’s Cycle Detection Algorithm)
  ```java
  public boolean hasCycle(ListNode head) {
      ListNode slow = head, fast = head;
      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
          if (slow == fast) return true;
      }
      return false;
  }
  ```

### 3️⃣ **Stacks & Queues** 📚
- Stack Implementation (Array & Linked List)
- Queue & Deque (Double-ended Queue)
- **Example:** Implement a Stack using a Queue
  ```java
  class MyStack {
      Queue<Integer> queue = new LinkedList<>();
      public void push(int x) {
          queue.add(x);
          for (int i = 0; i < queue.size() - 1; i++) {
              queue.add(queue.poll());
          }
      }
      public int pop() {
          return queue.poll();
      }
  }
  ```

### 4️⃣ **Recursion & Backtracking** 🔄
- Factorial, Fibonacci, Subsets, Permutations
- N-Queens Problem
- **Example:** Solve the N-Queens problem using Backtracking
  ```java
  public boolean solveNQueens(int board[][], int col) {
      if (col >= board.length) return true;
      for (int i = 0; i < board.length; i++) {
          if (isSafe(board, i, col)) {
              board[i][col] = 1;
              if (solveNQueens(board, col + 1)) return true;
              board[i][col] = 0;
          }
      }
      return false;
  }
  ```

### 5️⃣ **Sorting Algorithms** 🔢
- Bubble Sort, Selection Sort, Merge Sort, Quick Sort
- **Example:** Implement Quick Sort
  ```java
  public void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          int pi = partition(arr, low, high);
          quickSort(arr, low, pi - 1);
          quickSort(arr, pi + 1, high);
      }
  }
  private int partition(int[] arr, int low, int high) {
      int pivot = arr[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
          if (arr[j] < pivot) {
              i++;
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }
      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;
      return i + 1;
  }
  ```

### 6️⃣ **Binary Search & Trees** 🌲
- Binary Search (Iterative & Recursive)
- Binary Search Tree (BST) Operations
- **Example:** Search in a BST
  ```java
  public TreeNode searchBST(TreeNode root, int val) {
      if (root == null || root.val == val) return root;
      return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
  }
  ```

### 7️⃣ **Graphs & Graph Algorithms** 🔗
- BFS, DFS, Dijkstra’s Algorithm
- **Example:** Implement BFS Traversal
  ```java
  public void bfs(GraphNode node) {
      Queue<GraphNode> queue = new LinkedList<>();
      Set<GraphNode> visited = new HashSet<>();
      queue.add(node);
      visited.add(node);
      while (!queue.isEmpty()) {
          GraphNode curr = queue.poll();
          System.out.print(curr.val + " ");
          for (GraphNode neighbor : curr.neighbors) {
              if (!visited.contains(neighbor)) {
                  queue.add(neighbor);
                  visited.add(neighbor);
              }
          }
      }
  }
  ```

## 🎯 Practice & Challenges
- ✅ Solve 100+ DSA problems in Java 💯
- ✅ Implement and optimize key algorithms 🚀
- ✅ Improve problem-solving skills for coding interviews 🎯

## 📩 Contact
For any inquiries or contributions, feel free to reach out:
- 👨‍💻 **Zack Daahir**  
- 📧 Email: **zackdaahir909@gmail.com**  
- 🌍 GitHub: **https://github.com/Zack-daahir13**  

---
_🔥 Keep coding and mastering DSA! 💡_

