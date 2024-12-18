package X;

import android.graphics.Color;

/* renamed from: X.A1r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22747A1r {
    public static final int A00(C217859kI c217859kI) {
        C14360o3.A0B(c217859kI, 0);
        String str = c217859kI.A00.A01;
        if (str != null) {
            try {
                return AbstractC13950nL.A04(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(AnonymousClass001.A0v("Failed parsing ", c217859kI.A00.A01, " (", str, ')'), e);
            }
        }
        if (3 - c217859kI.A01.intValue() != 0) {
            return -1;
        }
        return -16777216;
    }
}
