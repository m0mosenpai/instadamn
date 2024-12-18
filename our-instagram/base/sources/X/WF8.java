package X;

import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes11.dex */
public abstract class WF8 {
    public static final int A00(Typeface typeface, float f, int i, int i2) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f);
        return ((int) Math.floor(i / textPaint.measureText("n"))) * i2;
    }

    public static final int A01(C6S5 c6s5, int i) {
        C14360o3.A0B(c6s5, 0);
        if (c6s5 == C6S5.A06) {
            return AbstractC13950nL.A04(i);
        }
        return i;
    }

    public static final int A02(C6S5 c6s5, Integer num, int i) {
        C14360o3.A0B(c6s5, 0);
        int A04 = AbstractC13950nL.A04(i);
        int ordinal = c6s5.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 || num == null) {
                return A04;
            }
        } else if (num == null) {
            return i;
        }
        return num.intValue();
    }

    public static final Integer A03(C6S5 c6s5, int i) {
        int A05 = AbstractC25227BEk.A05(c6s5, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                return Integer.valueOf(i);
            }
            return Integer.valueOf(AbstractC13950nL.A04(i));
        }
        return null;
    }

    public static final Integer A04(C6S5 c6s5, int i) {
        int A05 = AbstractC25227BEk.A05(c6s5, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                return null;
            }
            return Integer.valueOf(i);
        }
        return Integer.valueOf(AbstractC13950nL.A04(i));
    }
}
