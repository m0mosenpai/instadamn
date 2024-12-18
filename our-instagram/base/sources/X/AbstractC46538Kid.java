package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Kid, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46538Kid {
    public static final String A00(C6FW c6fw) {
        Object[] copyOf;
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.bloks.stdlib.animation.BloksDimensionValueAnimator");
        C44819Jst c44819Jst = (C44819Jst) A03;
        Object animatedValue = c44819Jst.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        Number number = (Number) animatedValue;
        float floatValue = number.floatValue();
        Integer num = c44819Jst.A00;
        Integer num2 = C05F.A00;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (num == num2) {
            objArr[0] = number;
            copyOf = Arrays.copyOf(objArr, 1);
            str = "%.2f%%";
        } else {
            AbstractC25235BEs.A1R(objArr, C1H4.A01(floatValue), 0);
            copyOf = Arrays.copyOf(objArr, 1);
            str = "%dpx";
        }
        String format = String.format(locale, str, copyOf);
        C14360o3.A07(format);
        return format;
    }
}
