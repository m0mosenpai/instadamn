package androidx.compose.ui.unit;

import X.C5AU;

/* loaded from: classes3.dex */
public final class Constraints {
    public final long A00;

    public static final int A00(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> ((i2 + 15) + 31))) & ((1 << (18 - i2)) - 1);
        int i4 = i3 - 1;
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    public static final int A01(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        int i3 = i2 - 1;
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static final int A02(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int A03(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static final boolean A06(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> ((i2 + 15) + 31))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean A07(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean A08(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = i2 + 15;
        int i5 = ((int) (j >> i4)) & i3;
        int i6 = ((int) (j >> (i4 + 31))) & i3;
        int i7 = i6 - 1;
        if (i6 == 0) {
            i7 = Integer.MAX_VALUE;
        }
        return i5 == i7;
    }

    public static final boolean A09(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        int i5 = i4 - 1;
        if (i4 == 0) {
            i5 = Integer.MAX_VALUE;
        }
        return i3 == i5;
    }

    public static final long A04(int i, int i2, int i3, int i4) {
        StringBuilder sb;
        if (i3 >= 0 && i >= 0) {
            boolean z = false;
            if (i2 >= i) {
                z = true;
            }
            if (!z) {
                sb = new StringBuilder();
                sb.append("maxWidth(");
                sb.append(i2);
                sb.append(") must be >= minWidth(");
                sb.append(i);
            } else {
                if (i4 >= i3) {
                    return C5AU.A05(i, i2, i3, i4);
                }
                sb = new StringBuilder();
                sb.append("maxHeight(");
                sb.append(i4);
                sb.append(") must be >= minHeight(");
                sb.append(i3);
            }
            sb.append(')');
        } else {
            sb = new StringBuilder();
            sb.append("minHeight(");
            sb.append(i3);
            sb.append(") and minWidth(");
            sb.append(i);
            sb.append(") must be >= 0");
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof Constraints) || j != ((Constraints) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A05(this.A00);
    }

    public static String A05(long j) {
        String valueOf;
        int A01 = A01(j);
        String str = "Infinity";
        if (A01 == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(A01);
        }
        int A00 = A00(j);
        if (A00 != Integer.MAX_VALUE) {
            str = String.valueOf(A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Constraints(minWidth = ");
        sb.append(A03(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(A02(j));
        sb.append(", maxHeight = ");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
