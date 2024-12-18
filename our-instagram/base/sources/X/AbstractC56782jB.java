package X;

import android.content.res.Resources;

/* renamed from: X.2jB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56782jB {
    public static final int A00(Resources resources, float f) {
        C14360o3.A0B(resources, 0);
        if (f > 0.0f) {
            return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
        }
        return -((int) (((-f) * resources.getDisplayMetrics().density) + 0.5f));
    }
}
