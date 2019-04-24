import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        timGTLNVaIndex(hienThiMang(nhapGiaTriPhanTu(nhap())));
    }

    static int nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Mang khong duoc qua 20. Nhap lai !!!");
            nhap();
        } else {
            System.out.println("Mang co " + size + " phan tu");
        }
        return size;
    }

    static int[] nhapGiaTriPhanTu(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] monkey = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + i + " la");
            monkey[i] = scanner.nextInt();
        }
        return monkey;
    }

    static int[] hienThiMang(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println("]");
        return arr;
    }

    static void timGTLNVaIndex(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("So lon nhat la " + max + " nam o vi tri thu " + (index + 1) + " trong mang");
    }
}
