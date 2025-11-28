Recursion and Backtracking Tips and Trick:

* Recursion = the function calling itself with a smaller subproblem.
* Backtracking = choosing → exploring → unchoosing.

Works for:
✅ Subsequence problems
✅ Parentheses generation
✅ Permutations
✅ Combinations
✅ Maze backtracking
✅ Subset sum


⭐1. Golden Rule of Recursion

Every recursion function needs just three things:

✔ 1️⃣ Base Case
When do you STOP?

✔ 2️⃣ Choices / Branching
What decisions can you make at each step?

✔ 3️⃣ Recursion Call
Move forward with one choice.


⭐ 2. Golden Rule of BACKTRACKING

Backtracking = Recursion + Undo Step.
At each level:
for each choice:
    make the choice
    recurse
    undo the choice   ← BACKTRACK

⭐ 3. Always Draw the RECURSION TREE

Works for:

✅ Subsequence problems
✅ Parentheses generation
✅ Permutations
✅ Combinations
✅ Maze backtracking
✅ Subset sum

⭐ 4. MEMORIZE THESE COMMON PATTERNS
🔹 Pattern 1: Print all subsequences

void f(int i, List curr) {
  
    //base condition
    if (i == n) { print curr; return; }
    // include
    curr.add(arr[i]);
    f(i+1, curr);
    // exclude
    curr.removeLast();
    f(i+1, curr);
}

🔹 Pattern 2: Generate Parentheses
void f(open, close, curr):
    if length == 2*n:
        add curr
        return

    if open < n:
        f(open+1, close, curr + "(")

    if close < open:
        f(open, close+1, curr + ")")
        
🔹 Pattern 3: Permutations

if (used all numbers)
    add result

for each number:
    if not used:
        used[i] = true
        curr.add(nums[i])
        f()
        used[i] = false     ← backtrack
        curr.removeLast()

🔹 Pattern 4: Combinations:
if (k numbers chosen)
    store result

for num from start → n:
    curr.add(num)
    f(num+1)
    curr.removeLast()


🔹 Pattern 5: Maze / Grid backtracking

if out of bounds or blocked:
    return

if dest reached:
    print path

mark visited
for each direction:
    move
unmark visited


# Recursion vs Backtracking – Summary Table

| Topic        | Core idea                  | Template        |
| ------------ | -------------------------- | --------------- |
| Recursion    | Base case + Recursive call | `f(i) → f(i+1)` |
| Backtracking | Try → Recurse → Undo       | Loop + undo     |
| Subsequence  | Include/Exclude            | 2 branches      |
| Permutation  | Pick unused elements       | `visited[]`     |
| Combination  | Controlled start index     | `start → end`   |
| Parentheses  | `open < n`, `close < open` | Two conditions  |
| Maze         | Visit → Explore → Unvisit  | Grid traversal  |


| Concept | Recursion | Backtracking |
|--------|-----------|--------------|
| **Definition** | A function calling itself until a base condition is met. | A refined form of recursion where you explore possibilities and *undo (backtrack)* to try alternative paths. |
| **Used For** | Divide & conquer, tree traversal, DP, mathematical sequences. | Combinatorial problems, generating all possibilities, constraint problems. |
| **Key Idea** | Break problem → smaller subproblem. | Build partial solution → explore → undo → explore next. |
| **State Changes** | Not always reverted. | Always reverted after exploring a branch (*backtrack step*). |
| **Examples** | Fibonacci, factorial, binary search, DFS. | N-Queens, subsets, permutations, parenthesis generation. |
| **Flow** | Top → down until base case. | DFS tree + automatic cleanup when returning. |
| **When to Use** | You need result of smaller problems. | You need *all valid combinations* or explore possibilities. |
| **Memory Use** | Depends on depth. | Usually deeper — explores full decision tree. |
| **Output** | Single output. | Often produces *lists of strings/arrays*. |
