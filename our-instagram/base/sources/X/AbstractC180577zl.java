package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.7zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC180577zl {
    public static final void A00(Context context, Typeface typeface, C6RB c6rb, Integer num) {
        Typeface A02;
        if (AbstractC14710oj.A08()) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    A02 = AbstractC14710oj.A00(context);
                } else {
                    A02 = AbstractC14710oj.A01(context);
                }
            } else {
                A02 = AbstractC14710oj.A02(context);
            }
            c6rb.A0I(A02);
            return;
        }
        if (typeface == null) {
            return;
        }
        c6rb.A0I(typeface);
    }
}
