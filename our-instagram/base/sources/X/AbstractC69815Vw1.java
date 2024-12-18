package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.Vw1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69815Vw1 {
    public static final int A00(Context context, float f) {
        float f2;
        C14360o3.A0B(context, 0);
        float A00 = f * AbstractC65702TsY.A00(context);
        if (A00 >= 0.0f) {
            f2 = A00 + 0.5f;
        } else {
            f2 = A00 - 0.5f;
        }
        return (int) f2;
    }

    public static final int A01(Resources resources, float f) {
        float f2;
        float f3 = f * resources.getDisplayMetrics().density;
        if (f3 >= 0.0f) {
            f2 = f3 + 0.5f;
        } else {
            f2 = f3 - 0.5f;
        }
        return (int) f2;
    }
}
