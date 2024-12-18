package X;

import java.math.RoundingMode;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class S7X {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        A00 = iArr;
        try {
            MSY.A1I(RoundingMode.UNNECESSARY, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(RoundingMode.DOWN, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(RoundingMode.FLOOR, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MSY.A1L(RoundingMode.UP, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
