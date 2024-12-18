package X;

import android.view.animation.PathInterpolator;

/* renamed from: X.VKt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68281VKt {
    public static PathInterpolator A00(C102884kP c102884kP) {
        if (c102884kP == null) {
            return new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);
        }
        return new PathInterpolator(c102884kP.A02(35, 0.0f), c102884kP.A02(38, 0.0f), c102884kP.A02(36, 1.0f), c102884kP.A02(40, 1.0f));
    }
}
