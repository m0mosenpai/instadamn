package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DexStore;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.math.RoundingMode;

/* renamed from: X.SdR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63123SdR {
    public static final int FLOOR_SQRT_MAX_INT = 46340;
    public static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    public static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;
    public static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    public static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, DexStore.MS_IN_NS, MemoryUtil.MAX_ALLOC_SIZE, 100000000, 1000000000};
    public static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    public static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Constants.LOAD_RESULT_PGO_ATTEMPTED, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int A00(int a, int b) {
        long j = a + b;
        int i = (int) j;
        S38.A00(a, b, "checkedAdd", AbstractC167007dF.A1N((j > i ? 1 : (j == i ? 0 : -1))));
        return i;
    }

    public static int A01(RoundingMode p, int q, int mode) {
        p.getClass();
        if (mode != 0) {
            int i = q / mode;
            int i2 = q - (mode * i);
            if (i2 != 0) {
                int i3 = ((q ^ mode) >> 31) | 1;
                switch (AbstractC58318PtA.A06(p, S7X.A00)) {
                    case 1:
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    case 2:
                        return i;
                    case 3:
                        if (i3 >= 0) {
                            return i;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i3 <= 0) {
                            return i;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i2);
                        int abs2 = abs - (Math.abs(mode) - abs);
                        if (abs2 == 0 || abs2 <= 0) {
                            return i;
                        }
                        break;
                    default:
                        throw AbstractC58318PtA.A0V();
                }
                return i + i3;
            }
            return i;
        }
        throw new ArithmeticException("/ by zero");
    }
}
