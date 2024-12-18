package X;

import com.facebook.android.maps.model.LatLng;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Wpl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71196Wpl implements Iterable, InterfaceC71891X8y {
    public double A00;
    public double A01;
    public double A02;
    public C71196Wpl A04;
    public AbstractC66278U6y A05;
    public int A08;
    public LatLng A09;
    public boolean A0B = false;
    public final double[] A0E = new double[2];
    public final double[] A0D = new double[2];
    public boolean A0C = false;
    public boolean A0A = false;
    public boolean A06 = false;
    public C71193Wpi[] A07 = new C71193Wpi[2];
    public int A03 = 0;

    public final void A05(C71193Wpi c71193Wpi) {
        this.A0B = false;
        this.A06 = false;
        this.A0C = false;
        this.A0A = false;
        int i = this.A03;
        int i2 = i + 1;
        C71193Wpi[] c71193WpiArr = this.A07;
        int length = c71193WpiArr.length;
        if (i2 == length) {
            C71193Wpi[] c71193WpiArr2 = new C71193Wpi[length + (length >> 1)];
            this.A07 = c71193WpiArr2;
            System.arraycopy(c71193WpiArr, 0, c71193WpiArr2, 0, i);
        }
        C71193Wpi[] c71193WpiArr3 = this.A07;
        int i3 = this.A03;
        this.A03 = i3 + 1;
        c71193WpiArr3[i3] = c71193Wpi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71196Wpl) {
                C71196Wpl c71196Wpl = (C71196Wpl) obj;
                if (this.A03 == c71196Wpl.A03) {
                    A02(this);
                    A02(c71196Wpl);
                    for (int i = 0; i < this.A03; i++) {
                        if (this.A07[i].equals(c71196Wpl.A07[i])) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + i;
    }

    private void A01() {
        double[] dArr;
        double d;
        double d2;
        if (!this.A0B) {
            int i = this.A03;
            if (i == 0) {
                C42961yO.A0J.A03("Cannot compute centroid of an empty cluster");
                return;
            }
            if (!this.A06) {
                if (i == 1) {
                    C71193Wpi c71193Wpi = this.A07[0];
                    double[] dArr2 = this.A0D;
                    c71193Wpi.Amj(dArr2);
                    this.A02 = dArr2[1];
                    d2 = A00(dArr2[0]);
                    this.A00 = d2;
                } else {
                    this.A02 = 1.0d;
                    double d3 = 1.0d;
                    double d4 = 0.0d;
                    double[] dArr3 = new double[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        C71193Wpi c71193Wpi2 = this.A07[i2];
                        double[] dArr4 = this.A0D;
                        c71193Wpi2.Amj(dArr4);
                        double d5 = dArr4[0];
                        double d6 = dArr4[1];
                        if (d6 < d3) {
                            this.A02 = d6;
                            d3 = d6;
                        }
                        if (d6 > d4) {
                            d4 = d6;
                        }
                        dArr3[i2] = A00(d5);
                    }
                    Arrays.sort(dArr3);
                    int i3 = this.A03;
                    d2 = dArr3[i3 - 1];
                    double d7 = dArr3[0];
                    double d8 = (d7 - d2) + 1.0d;
                    for (int i4 = 1; i4 < i3; i4++) {
                        double d9 = dArr3[i4 - 1];
                        double d10 = dArr3[i4];
                        double d11 = d10 - d9;
                        if (d11 > d8) {
                            d2 = d9;
                            d7 = d10;
                            d8 = d11;
                        }
                    }
                    this.A00 = d7;
                }
                this.A01 = d2;
                this.A06 = true;
            }
            if (i == 1) {
                dArr = this.A0E;
                dArr[0] = this.A00;
                d = this.A02;
            } else {
                double d12 = this.A00;
                double d13 = this.A01;
                boolean A1O = AbstractC167007dF.A1O((d12 > d13 ? 1 : (d12 == d13 ? 0 : -1)));
                double d14 = 0.0d;
                double d15 = 0.0d;
                for (int i5 = 0; i5 < this.A03; i5++) {
                    C71193Wpi c71193Wpi3 = this.A07[i5];
                    double[] dArr5 = this.A0D;
                    c71193Wpi3.Amj(dArr5);
                    double d16 = dArr5[0];
                    d15 += dArr5[1];
                    double A00 = A00(d16);
                    if (A1O && 0.0d <= A00 && A00 <= d13) {
                        A00 += 1.0d;
                    }
                    d14 += A00;
                }
                dArr = this.A0E;
                double d17 = i;
                dArr[0] = A00(d14 / d17);
                d = d15 / d17;
            }
            dArr[1] = d;
            this.A0B = true;
            this.A09 = null;
        }
    }

    public static void A02(C71196Wpl c71196Wpl) {
        if (!c71196Wpl.A0A) {
            Arrays.sort(c71196Wpl.A07, 0, c71196Wpl.A03);
            c71196Wpl.A0A = true;
        }
    }

    public final LinkedList A04() {
        InterfaceC71945XBu interfaceC71945XBu;
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < this.A03; i++) {
            A02(this);
            if (i < this.A03 && i >= 0 && (interfaceC71945XBu = this.A07[i].A04) != null) {
                linkedList.add(interfaceC71945XBu);
            }
        }
        return linkedList;
    }

    public final int hashCode() {
        if (!this.A0C) {
            this.A08 = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.A03; i2++) {
                i += this.A07[i2].hashCode();
                this.A08 = i;
            }
            this.A0C = true;
        }
        return this.A08;
    }

    public final LatLng A03() {
        A01();
        LatLng latLng = this.A09;
        if (latLng == null) {
            double[] dArr = this.A0E;
            LatLng latLng2 = new LatLng(WFW.A03(dArr[1]), WFW.A02(dArr[0]));
            this.A09 = latLng2;
            return latLng2;
        }
        return latLng;
    }

    @Override // X.InterfaceC71891X8y
    public final void Amj(double[] dArr) {
        A01();
        double[] dArr2 = this.A0E;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        A02(this);
        return new C71661WyD(this);
    }
}
