package X;

import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.List;

/* renamed from: X.0oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14620oa {
    public static final BackgroundGradientColors A00(C18160v1 c18160v1) {
        if (c18160v1 == null) {
            return null;
        }
        List list = c18160v1.A02;
        Number number = (Number) AbstractC001800i.A0O(list, 0);
        Number number2 = (Number) AbstractC001800i.A0O(list, list.size() - 1);
        if (number == null || number2 == null) {
            return null;
        }
        return new BackgroundGradientColors(number.intValue(), number2.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0v1, java.lang.Object] */
    public static final C18160v1 A01(BackgroundGradientColors backgroundGradientColors, int i) {
        if (backgroundGradientColors == null) {
            return null;
        }
        List list = C18160v1.A03;
        int i2 = 0;
        List A1Q = AbstractC16960so.A1Q(Integer.valueOf(backgroundGradientColors.A01), Integer.valueOf(backgroundGradientColors.A00));
        if (i % 180 != 0) {
            i2 = 1;
        }
        ?? obj = new Object();
        obj.A02 = A1Q;
        obj.A00 = i2;
        obj.A01 = null;
        return obj;
    }
}
