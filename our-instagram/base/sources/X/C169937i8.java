package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169937i8 implements InterfaceC169907i5 {
    public final C169927i7 A04;
    public final InterfaceC169907i5 A05;
    public final SparseArray A03 = new SparseArray();
    public int A02 = Integer.MAX_VALUE;
    public int A01 = -1;
    public int A00 = -1;

    @Override // X.InterfaceC169907i5
    public final void EJ6(int i, int i2) {
        this.A05.EJ6(i, 0);
    }

    @Override // X.InterfaceC169907i5
    public final void EJM(Integer num, Object obj, int i) {
        this.A05.EJM(num, obj, 0);
    }

    public static ArrayList A00(SparseArray sparseArray, int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            Object obj = sparseArray.get(i3);
            if (obj != null) {
                arrayList.add(obj);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", Integer.valueOf(i3)));
            }
        }
        return arrayList;
    }

    public final void A01() {
        int i = this.A02;
        if (i != Integer.MAX_VALUE) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int i2 = this.A00;
                        InterfaceC169907i5 interfaceC169907i5 = this.A05;
                        int i3 = this.A01;
                        if (i2 > 1) {
                            interfaceC169907i5.AOj(i3, i2);
                        } else {
                            interfaceC169907i5.AOY(i3);
                        }
                    }
                } else {
                    int i4 = this.A01;
                    int i5 = this.A00;
                    SparseArray sparseArray = this.A03;
                    ArrayList A00 = A00(sparseArray, i4, i5);
                    int i6 = this.A00;
                    if (i6 > 1) {
                        this.A05.FBw(A00, this.A01, i6);
                    } else {
                        InterfaceC169907i5 interfaceC169907i52 = this.A05;
                        int i7 = this.A01;
                        interfaceC169907i52.FA8((InterfaceC170717jO) sparseArray.get(i7), i7);
                    }
                }
            } else {
                int i8 = this.A01;
                int i9 = this.A00;
                SparseArray sparseArray2 = this.A03;
                ArrayList A002 = A00(sparseArray2, i8, i9);
                int i10 = this.A00;
                if (i10 > 1) {
                    this.A05.COg(A002, this.A01, i10);
                } else {
                    InterfaceC169907i5 interfaceC169907i53 = this.A05;
                    int i11 = this.A01;
                    interfaceC169907i53.COb((InterfaceC170717jO) sparseArray2.get(i11), i11);
                }
            }
            this.A02 = Integer.MAX_VALUE;
            this.A03.clear();
        }
    }

    @Override // X.InterfaceC169907i5
    public final void AOY(int i) {
        int i2;
        if (this.A02 == 3 && (i2 = this.A01) >= i && i2 <= i + 1) {
            this.A00++;
            this.A01 = i;
        } else {
            A01();
            this.A01 = i;
            this.A00 = 1;
            this.A02 = 3;
        }
    }

    @Override // X.InterfaceC169907i5
    public final void COb(InterfaceC170717jO interfaceC170717jO, int i) {
        int i2;
        int i3;
        int i4;
        if (this.A02 == 1 && i >= (i2 = this.A01) && i <= (i4 = i2 + (i3 = this.A00)) && i >= i4) {
            this.A00 = i3 + 1;
            this.A01 = Math.min(i, i2);
        } else {
            A01();
            this.A01 = i;
            this.A00 = 1;
            this.A02 = 1;
        }
        this.A03.put(i, interfaceC170717jO);
    }

    @Override // X.InterfaceC169907i5
    public final void Ct3(InterfaceC170847jb interfaceC170847jb, boolean z) {
        this.A05.Ct3(interfaceC170847jb, z);
    }

    @Override // X.InterfaceC169907i5
    public final void EJL(Integer num, int i, int i2) {
        this.A05.EJL(num, i, i2);
    }

    @Override // X.InterfaceC169907i5
    public final boolean EpQ() {
        return this.A05.EpQ();
    }

    @Override // X.InterfaceC169907i5
    public final void FA8(InterfaceC170717jO interfaceC170717jO, int i) {
        int i2;
        int i3;
        int i4;
        if (this.A02 == 2 && i <= (i3 = (i2 = this.A01) + this.A00) && (i4 = i + 1) >= i2) {
            int min = Math.min(i, i2);
            this.A01 = min;
            this.A00 = Math.max(i3, i4) - min;
        } else {
            A01();
            this.A01 = i;
            this.A00 = 1;
            this.A02 = 2;
        }
        this.A03.put(i, interfaceC170717jO);
    }

    public C169937i8(C169927i7 c169927i7, InterfaceC169907i5 interfaceC169907i5) {
        this.A05 = interfaceC169907i5;
        this.A04 = c169927i7;
    }

    @Override // X.InterfaceC169907i5
    public final void AOj(int i, int i2) {
        A01();
        this.A05.AOj(i, i2);
    }

    @Override // X.InterfaceC169907i5
    public final void COg(List list, int i, int i2) {
        A01();
        this.A05.COg(list, i, i2);
    }

    @Override // X.InterfaceC169907i5
    public final void Cps(int i, int i2) {
        A01();
        this.A05.Cps(i, i2);
    }

    @Override // X.InterfaceC169907i5
    public final void FBw(List list, int i, int i2) {
        A01();
        this.A05.FBw(list, i, i2);
    }
}
