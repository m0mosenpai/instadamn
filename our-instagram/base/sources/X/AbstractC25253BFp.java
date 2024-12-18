package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.BFp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25253BFp {
    public static final long A00(BFo bFo) {
        long A06 = C119365at.A06(bFo.A06, bFo.A07);
        if (bFo.A02()) {
            return 0L;
        }
        return A06;
    }

    public static final boolean A02(BFo bFo) {
        if (bFo.A0C && !bFo.A0B) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean A03(BFo bFo, long j) {
        long j2 = bFo.A06;
        float A01 = C119365at.A01(j2);
        float A02 = C119365at.A02(j2);
        int A06 = AbstractC25225BEi.A06(j);
        int A00 = C119055aN.A00(j);
        if (A01 >= 0.0f && A01 <= A06 && A02 >= 0.0f && A02 <= A00) {
            return false;
        }
        return true;
    }

    public static final boolean A04(BFo bFo, long j, long j2) {
        if (bFo.A04 == 1) {
            long j3 = bFo.A06;
            float A01 = C119365at.A01(j3);
            float A02 = C119365at.A02(j3);
            float f = -C5YC.A02(j2);
            float A06 = AbstractC25225BEi.A06(j) + C5YC.A02(j2);
            float f2 = -C5YC.A00(j2);
            float A00 = C119055aN.A00(j) + C5YC.A00(j2);
            if (A01 >= f && A01 <= A06 && A02 >= f2 && A02 <= A00) {
                return false;
            }
            return true;
        }
        return A03(bFo, j);
    }

    public static final boolean A01(BFo bFo) {
        if (!bFo.A02() && bFo.A0C && !bFo.A0B) {
            return true;
        }
        return false;
    }
}
