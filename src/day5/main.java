package day5;

public class main {

	public static void main(String[] args) {
		/* in(nhapThongTin()); */
		SinhVien[] danhsachbandau = nhapThongTin();
		SinhVien[] danhsachsapxep = sapXepTheoMa(danhsachbandau);
		in(danhsachsapxep);
	}

	public static SinhVien[] nhapThongTin() {
		SinhVien a = new SinhVien();
		a.maSv = "002";
		a.tenSv = "PhamTuanHiep";
		a.gioiTinh = "Nam";
		a.userName = "HiepGa";

		SinhVien b = new SinhVien();
		b.maSv = "001";
		b.tenSv = "PhamTuanThanh";
		b.gioiTinh = "Nu";
		b.userName = "HiepGa";

		SinhVien c = new SinhVien();
		c.maSv = "004";
		c.tenSv = "PhamTuanTinn";
		c.gioiTinh = "Nam";
		c.userName = "HiepGa";

		SinhVien[] danhSachSinhVien = new SinhVien[3];
		danhSachSinhVien[0] = a;
		danhSachSinhVien[1] = b;
		danhSachSinhVien[2] = c;
		return danhSachSinhVien;
	}

	public static void in(SinhVien[] danhSachSinhVien) {
		for (int i = 0; i < danhSachSinhVien.length; i++) {
			System.out.print(" " + danhSachSinhVien[i].maSv);
			System.out.print(" " + danhSachSinhVien[i].tenSv);
			System.out.print(" " + danhSachSinhVien[i].gioiTinh);
			System.out.println();

		}
	}

	public static SinhVien[] sapXepTheoMa(SinhVien[] danhSachSinhVien) {
		for (int i = 0; i < danhSachSinhVien.length - 1; i++)
			for (int j = 0; j < danhSachSinhVien.length - 1 - i; j++) {
				if (danhSachSinhVien[j].maSv.compareTo(danhSachSinhVien[j + 1].maSv) < 0) {
					SinhVien temp = danhSachSinhVien[j];
					danhSachSinhVien[j] = danhSachSinhVien[j + 1];
					danhSachSinhVien[j + 1] = temp;

				}
			}
		return danhSachSinhVien;

	}

}
