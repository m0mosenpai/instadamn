package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BWF implements InterfaceC30776DgD {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Object A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final int[] A0A;
    public final InterfaceC118245Wl A0B;
    public final InterfaceC118225Wj A0C;
    public final AnonymousClass583 A0D;

    public final void A00(int i) {
        this.A01 += i;
        int[] iArr = this.A0A;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.A08) {
                if (i2 % 2 != 1) {
                }
                iArr[i2] = iArr[i2] + i;
            } else {
                if (i2 % 2 != 0) {
                }
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void A01(int i, int i2, int i3) {
        int i4;
        this.A01 = i;
        boolean z = this.A08;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A00 = i5;
        List list = this.A07;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C59W c59w = (C59W) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0A;
            if (z) {
                InterfaceC118245Wl interfaceC118245Wl = this.A0B;
                if (interfaceC118245Wl != null) {
                    iArr[i7] = interfaceC118245Wl.AB8(this.A0D, c59w.A01, i2);
                    iArr[i7 + 1] = i;
                    i4 = c59w.A00;
                } else {
                    throw AbstractC166987dD.A12("null horizontalAlignment");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                InterfaceC118225Wj interfaceC118225Wj = this.A0C;
                if (interfaceC118225Wj != null) {
                    iArr[i8] = interfaceC118225Wj.AB4(c59w.A00, i3);
                    i4 = c59w.A01;
                } else {
                    throw AbstractC166987dD.A12("null verticalAlignment");
                }
            }
            i += i4;
        }
    }

    public BWF(C6M3 c6m3, InterfaceC118245Wl interfaceC118245Wl, InterfaceC118225Wj interfaceC118225Wj, AnonymousClass583 anonymousClass583, Object obj, List list, int i, int i2, long j, boolean z) {
        int i3;
        this.A03 = i;
        this.A04 = i2;
        this.A07 = list;
        this.A05 = j;
        this.A06 = obj;
        this.A0B = interfaceC118245Wl;
        this.A0C = interfaceC118225Wj;
        this.A0D = anonymousClass583;
        this.A09 = z;
        this.A08 = AbstractC167007dF.A1X(c6m3, C6M3.Vertical);
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C59W c59w = (C59W) list.get(i5);
            if (!this.A08) {
                i3 = c59w.A00;
            } else {
                i3 = c59w.A01;
            }
            i4 = Math.max(i4, i3);
        }
        this.A02 = i4;
        this.A0A = new int[this.A07.size() * 2];
        this.A00 = Integer.MIN_VALUE;
    }
}
