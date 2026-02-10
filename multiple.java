class Demo {
    public static void main(String args[]) {

        int a[] = {4, 9, 11, 865};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(a[i]);
            }
        }
        catch (ArithmeticException obj) {
            System.out.println(obj);
        }
        catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);
        }
    }
}
