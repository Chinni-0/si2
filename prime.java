public class PrintNumbers {  
    // Recursive method to print numbers from 'start' to 'end'  
    public static void printNumbers(int start, int end) {  
        if (start <= end) {  
            System.out.print(start+"\t");  
            printNumbers(start + 1, end);  
        }  
    }  
    public static void main(String[] args) {  
        int start = 1;  
        int end = 100;  
        System.out.println("Printing numbers from " + start + " to " + end + " using recursion:");  
        printNumbers(start, end);  
    }  
}  