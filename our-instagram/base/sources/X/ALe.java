package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class ALe {
    public static Point A00(float f, int i) {
        int round = Math.round(i / 2.0f) * 2;
        float f2 = round;
        if (f <= 0.0f || f >= 100.0f) {
            C0w9.A03("wrong_aspect_ratio", AnonymousClass001.A0N("value ", f));
        }
        if (f != 0.0f) {
            return new Point(round, Math.round((f2 / f) / 2.0f) * 2);
        }
        throw AbstractC166987dD.A12("Aspect Ratio cannot be 0.");
    }

    public static final Point A02(Context context, UserSession userSession, float f, int i) {
        return A00(f, AbstractC54249NyU.A00(context, userSession, i, false, false));
    }

    public static final Point A01(Context context, UserSession userSession) {
        return A02(context, userSession, 0.5625f, AbstractC54249NyU.A00(context, userSession, Integer.MAX_VALUE, false, false));
    }

    public static Point A03(Context context, UserSession userSession, int i, int i2, boolean z, boolean z2) {
        if (z) {
            return A00(i / i2, AbstractC54249NyU.A00(context, userSession, i, z2, false));
        }
        Point A02 = A02(context, userSession, i2 / i, i2);
        return new Point(A02.y, A02.x);
    }
}
