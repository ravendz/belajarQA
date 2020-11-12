import java.util.Scanner;
import java.util.Arrays;
    public class Array1 {
            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String batas = "=====";

            System.out.println(batas + "Aplikasi Input Data Diri" + batas);
            System.out.println(batas + batas + batas + batas + batas + batas + "====");


            System.out.println("Banyak Data diri yang diinginkan =");
            int row = input.nextInt();

            int col = 4;


            String[][] dataDiri = new String[row][col];

            int urutanData = 1;
            int x = 0;


            for (int i = 0; i < dataDiri.length; i++) {
                for (int j = 0; j <= i; j++) {

                    System.out.println("Data Diri No " + urutanData);
                    System.out.print("Nama = ");
                    dataDiri[i][j] = input.next();
                    j++;

                    System.out.print("Alamat = ");
                    dataDiri[i][j] = input.next();
                    j++;

                    System.out.println("No Telp = ");
                    dataDiri[i][j] = input.next();


                    int panjangNo = dataDiri[i][j].length();
                    panjangNo = dataDiri[i][j].length();

                    while (panjangNo < 10 || panjangNo > 12) {
                        System.out.println("No Telp yang masukan tidak lengkap = ");
                        dataDiri[i][j] = input.next();
                        panjangNo = dataDiri[i][j].length();
                    }
                    j++;

                    String jenisKelamin;
                    boolean check;
                    String wanita = "wanita";
                    String laki = "laki laki";
                    do {

                        System.out.println("Jenis Kelamin = (WANITA / LAKI LAKI)");
                        jenisKelamin = input.next();

                        if (jenisKelamin == wanita) {
                            check = false;
                            break;
                        } else if (jenisKelamin == laki) {
                            check = false;
                            break;
                        } else if (jenisKelamin != wanita || jenisKelamin != laki) {
                            check = true;
                            break;
                        } else {
                            check = true;
                        }

                    }while (jenisKelamin == wanita || jenisKelamin == laki);

                    dataDiri[i][j] = jenisKelamin;

                    urutanData++;
                }

                System.out.println();
            }

            System.out.println(batas + batas + "SELURUH DATA DIRI" + batas + batas);

            for (int i = 0; i < dataDiri.length; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("Nama = " + dataDiri[i][j] + ", ");
                    j++;
                    System.out.print("Alamat = " + dataDiri[i][j] + ", ");
                    j++;
                    System.out.print("No Telp = " + dataDiri[i][j] + ", ");
                    j++;
                    System.out.println("Jenis Kelamin = " + dataDiri[i][j]);
                }
            }

        }
    }

