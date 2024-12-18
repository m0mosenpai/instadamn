package X;

import java.util.Arrays;

/* renamed from: X.Sh4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63300Sh4 {
    public static final C63300Sh4 A04;
    public int A00 = 0;
    public int[] A02 = new int[8];
    public Object[] A03 = new Object[8];
    public boolean A01 = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Sh4, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A02 = new int[0];
        obj.A03 = new Object[0];
        obj.A01 = false;
        A04 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C63300Sh4)) {
                C63300Sh4 c63300Sh4 = (C63300Sh4) obj;
                int i = this.A00;
                if (i == c63300Sh4.A00) {
                    int[] iArr = this.A02;
                    int[] iArr2 = c63300Sh4.A02;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A03;
                            Object[] objArr2 = c63300Sh4.A03;
                            for (int i3 = 0; i3 < i; i3++) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Sh4, java.lang.Object] */
    public static C63300Sh4 A00() {
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A02 = new int[8];
        obj.A03 = new Object[8];
        obj.A01 = true;
        return obj;
    }

    public static final void A01(C63300Sh4 c63300Sh4, int i) {
        int[] iArr = c63300Sh4.A02;
        if (i > iArr.length) {
            int i2 = c63300Sh4.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            c63300Sh4.A02 = Arrays.copyOf(iArr, i);
            c63300Sh4.A03 = Arrays.copyOf(c63300Sh4.A03, i);
        }
    }

    public final void A02(int i, Object obj) {
        if (this.A01) {
            A01(this, this.A00 + 1);
            int[] iArr = this.A02;
            int i2 = this.A00;
            iArr[i2] = i;
            this.A03[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = i + 527;
        int[] iArr = this.A02;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.A03;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = AbstractC166987dD.A0I(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }
}
