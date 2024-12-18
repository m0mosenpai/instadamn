package X;

import java.util.Iterator;

/* renamed from: X.Te6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C65131Te6 extends TTE implements Iterator, C0s1 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final Pw1 A03;

    public C65131Te6(Pw1 pw1, TT7[] tt7Arr) {
        super(pw1.A04, tt7Arr);
        this.A03 = pw1;
        this.A00 = pw1.A00;
    }

    public static final void A00(Object obj, C65131Te6 c65131Te6, C6LW c6lw, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            TT7[] tt7Arr = ((TTE) c65131Te6).A02;
            TT7 tt7 = tt7Arr[i2];
            Object[] objArr = c6lw.A02;
            int length = objArr.length;
            int i4 = 0;
            tt7.A02 = objArr;
            tt7.A00 = length;
            while (true) {
                tt7.A01 = i4;
                if (C14360o3.A0K(tt7.A02[i4], obj)) {
                    break;
                }
                tt7 = tt7Arr[i2];
                i4 = tt7.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = c6lw.A00;
            if ((i5 & i6) != 0) {
                int bitCount = Integer.bitCount((i5 - 1) & i6) * 2;
                TT7 tt72 = ((TTE) c65131Te6).A02[i2];
                Object[] objArr2 = c6lw.A02;
                int bitCount2 = Integer.bitCount(i6) * 2;
                tt72.A02 = objArr2;
                tt72.A00 = bitCount2;
                tt72.A01 = bitCount;
            } else {
                int A08 = c6lw.A08(i5);
                C6LW A0A = c6lw.A0A(A08);
                TT7 tt73 = ((TTE) c65131Te6).A02[i2];
                Object[] objArr3 = c6lw.A02;
                int bitCount3 = Integer.bitCount(c6lw.A00) * 2;
                tt73.A02 = objArr3;
                tt73.A00 = bitCount3;
                tt73.A01 = A08;
                A00(obj, c65131Te6, A0A, i, i2 + 1);
                return;
            }
        }
        ((TTE) c65131Te6).A00 = i2;
    }

    @Override // X.TTE, java.util.Iterator
    public final Object next() {
        if (this.A03.A00 == this.A00) {
            this.A01 = A02();
            this.A02 = true;
            return super.next();
        }
        throw AbstractC58318PtA.A0z();
    }
}
