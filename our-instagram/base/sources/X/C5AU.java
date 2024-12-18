package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5AU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5AU {
    public static final int A01(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long A04(int i, int i2, int i3, int i4) {
        StringBuilder sb;
        if (!(i2 >= i)) {
            sb = new StringBuilder();
            sb.append("maxWidth(");
            sb.append(i2);
            sb.append(") must be >= than minWidth(");
            sb.append(i);
        } else {
            if (i4 >= i3) {
                if (i >= 0 && i3 >= 0) {
                    return A05(i, i2, i3, i4);
                }
                sb = new StringBuilder();
                sb.append("minWidth(");
                sb.append(i);
                sb.append(") and minHeight(");
                sb.append(i3);
                sb.append(") must be >= 0");
                throw new IllegalArgumentException(sb.toString());
            }
            sb = new StringBuilder();
            sb.append("maxHeight(");
            sb.append(i4);
            sb.append(") must be >= than minHeight(");
            sb.append(i3);
        }
        sb.append(')');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int A00(int i) {
        if (i < 8191) {
            return 262142;
        }
        if (i < 32767) {
            return 65534;
        }
        if (i < 65535) {
            return 32766;
        }
        if (i < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Can't represent a size of ", " in Constraints", i));
    }

    public static final long A07(long j, long j2) {
        return AbstractC119215ad.A00(C17s.A03((int) (j2 >> 32), Constraints.A03(j), Constraints.A01(j)), C17s.A03(C119055aN.A00(j2), Constraints.A02(j), Constraints.A00(j)));
    }

    public static final int A02(long j, int i) {
        return C17s.A03(i, Constraints.A02(j), Constraints.A00(j));
    }

    public static final int A03(long j, int i) {
        return C17s.A03(i, Constraints.A03(j), Constraints.A01(j));
    }

    public static final long A05(int i, int i2, int i3, int i4) {
        int i5 = i4;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        }
        int A01 = A01(i5);
        int i6 = i2;
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        }
        int A012 = A01(i6);
        if (A01 + A012 > 31) {
            throw new IllegalArgumentException(AnonymousClass001.A0n("Can't represent a width of ", " and height of ", " in Constraints", i6, i5));
        }
        int i7 = i2 + 1;
        int i8 = i7 & ((i7 >> 31) ^ (-1));
        int i9 = i4 + 1;
        int i10 = i9 & ((i9 >> 31) ^ (-1));
        int i11 = 0;
        if (A012 != 13) {
            if (A012 != 18) {
                if (A012 != 15) {
                    if (A012 == 16) {
                        i11 = 2;
                    }
                } else {
                    i11 = 1;
                }
            } else {
                i11 = 3;
            }
        }
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3) + 15;
        return (i8 << 33) | i11 | (i << 2) | (i3 << i12) | (i10 << (i12 + 31));
    }

    public static final long A06(long j, int i, int i2) {
        int A03 = Constraints.A03(j) + i;
        if (A03 < 0) {
            A03 = 0;
        }
        int A01 = Constraints.A01(j);
        if (A01 != Integer.MAX_VALUE && (A01 = A01 + i) < 0) {
            A01 = 0;
        }
        int A02 = Constraints.A02(j) + i2;
        if (A02 < 0) {
            A02 = 0;
        }
        int A00 = Constraints.A00(j);
        if (A00 != Integer.MAX_VALUE && (A00 = A00 + i2) < 0) {
            A00 = 0;
        }
        return A04(A03, A01, A02, A00);
    }

    public static final long A08(long j, long j2) {
        int A03 = Constraints.A03(j2);
        int A032 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        int A033 = C17s.A03(A03, A032, A01);
        int A034 = C17s.A03(Constraints.A01(j2), A032, A01);
        int A02 = Constraints.A02(j2);
        int A022 = Constraints.A02(j);
        int A00 = Constraints.A00(j);
        return A04(A033, A034, C17s.A03(A02, A022, A00), C17s.A03(Constraints.A00(j2), A022, A00));
    }

    public static final boolean A09(long j, long j2) {
        int A03 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        int i = (int) (j2 >> 32);
        if (A03 <= i && i <= A01) {
            int A02 = Constraints.A02(j);
            int A00 = Constraints.A00(j);
            int A002 = C119055aN.A00(j2);
            if (A02 <= A002 && A002 <= A00) {
                return true;
            }
            return false;
        }
        return false;
    }
}
