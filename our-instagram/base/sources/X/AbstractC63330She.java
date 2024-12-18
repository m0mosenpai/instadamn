package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.math.RoundingMode;

/* renamed from: X.She, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63330She {
    public static final long FLOOR_SQRT_MAX_LONG = 3037000499L;
    public static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;
    public static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    public static final byte[] maxLog10ForLeadingZeros = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, DalvikInternals.IOPRIO_CLASS_SHIFT, DalvikInternals.IOPRIO_CLASS_SHIFT, DalvikInternals.IOPRIO_CLASS_SHIFT, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    public static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    public static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    public static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    public static final long[][] A00 = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long A00(long a, long b) {
        long j = a + b;
        boolean z = true;
        boolean A1P = AbstractC25230BEn.A1P(((a ^ b) > 0L ? 1 : ((a ^ b) == 0L ? 0 : -1)));
        if ((a ^ j) < 0) {
            z = false;
        }
        if (A1P | z) {
            return j;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("overflow: ");
        A1C.append("checkedAdd");
        A1C.append("(");
        A1C.append(a);
        AbstractC58318PtA.A1S(A1C);
        A1C.append(b);
        throw new ArithmeticException(AbstractC166997dE.A0x(")", A1C));
    }

    public static long A01(long a, long b) {
        if (a >= 0) {
            if (b >= 0) {
                if (a == 0) {
                    return b;
                }
                if (b != 0) {
                    int numberOfTrailingZeros = Long.numberOfTrailingZeros(a);
                    long j = a >> numberOfTrailingZeros;
                    int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(b);
                    long j2 = b >> numberOfTrailingZeros2;
                    while (j != j2) {
                        long j3 = j - j2;
                        long j4 = (j3 >> 63) & j3;
                        long j5 = (j3 - j4) - j4;
                        j2 += j4;
                        j = j5 >> Long.numberOfTrailingZeros(j5);
                    }
                    return j << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
                }
                return a;
            }
            throw AbstractC166987dD.A12(AnonymousClass001.A0s("b", " (", ") must be >= 0", b));
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0s("a", " (", ") must be >= 0", a));
    }

    public static long A03(RoundingMode p, long q, long mode) {
        long j = q / mode;
        long j2 = q - (mode * j);
        if (j2 != 0) {
            int i = ((int) ((q ^ mode) >> 63)) | 1;
            switch (AbstractC58318PtA.A06(p, S7Y.A00)) {
                case 1:
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return j;
                case 3:
                    if (i >= 0) {
                        return j;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i <= 0) {
                        return j;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    long abs = Math.abs(j2);
                    long abs2 = abs - (Math.abs(mode) - abs);
                    if (abs2 == 0) {
                        if (p != RoundingMode.HALF_UP && (p != RoundingMode.HALF_EVEN || (1 & j) == 0)) {
                            return j;
                        }
                    } else if (abs2 <= 0) {
                        return j;
                    }
                    break;
                default:
                    throw AbstractC58318PtA.A0V();
            }
            return j + i;
        }
        return j;
    }

    public static long A02(long a, long b) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(a) + Long.numberOfLeadingZeros(a ^ (-1)) + Long.numberOfLeadingZeros(b) + Long.numberOfLeadingZeros((-1) ^ b);
        if (numberOfLeadingZeros > 65) {
            return a * b;
        }
        long j = ((a ^ b) >>> 63) + Long.MAX_VALUE;
        boolean z = true;
        boolean A1Q = AbstractC167007dF.A1Q(numberOfLeadingZeros, 64);
        boolean A1P = AbstractC25230BEn.A1P((a > 0L ? 1 : (a == 0L ? 0 : -1)));
        if (b != Long.MIN_VALUE) {
            z = false;
        }
        if (A1Q | (A1P & z)) {
            return j;
        }
        long j2 = a * b;
        if (a != 0 && j2 / a != b) {
            return j;
        }
        return j2;
    }
}
