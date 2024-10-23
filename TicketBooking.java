import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan hari (Reguler Senin, Selasa, Weekend, ....): ");
        String day = scanner.nextLine();

        System.out.print("Masukkan tanggal (DD/MM/YYYY): ");
        String date = scanner.nextLine();

        if (name.isEmpty() || day.isEmpty() || date.isEmpty()) {
            System.out.println("Data harus diisi.");
            return;
        }

        System.out.println("Pilih jenis tiket:");
        System.out.println("1. Tiket Reguler");
        System.out.println("2. Tiket Weekend");
        System.out.print("Pilihan: ");
        int ticketType = scanner.nextInt();

        System.out.print("Masukkan jumlah dewasa: ");
        int adultCount = scanner.nextInt();

        System.out.print("Masukkan jumlah anak-anak: ");
        int childCount = scanner.nextInt();

        double ticketPrice = 0;

        if (ticketType == 1) { // Tiket Reguler
            ticketPrice += (adultCount * 75000) + (childCount * 60000);
        } else if (ticketType == 2) { // Tiket Vip Sabtu sampai minggu
            ticketPrice += (adultCount * 100000) + (childCount * 85000);
        }

        // Kenaikan harga untuk hari Sabtu dan Minggu
        if (day.equalsIgnoreCase("Sabtu") || day.equalsIgnoreCase("Minggu")) {
            ticketPrice *= 1.2;
        }

        System.out.printf("Total harga tiket untuk %s: Rp %.2f\n", name, ticketPrice);

        scanner.close();
    }
}
