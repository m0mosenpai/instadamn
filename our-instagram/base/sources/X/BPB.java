package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class BPB {
    public static final boolean A00(View view, UserSession userSession, float f, float f2, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (!z && C18U.A06(C06090Tz.A05, userSession, 36329032414085093L)) {
            double width = view.getWidth() * 0.1d;
            double height = view.getHeight() * 0.1d;
            double d = f;
            if (d > width && d < view.getWidth() - width) {
                double d2 = f2;
                if (d2 <= height || d2 >= view.getHeight() - height) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36329032413560800L) && !C18U.A06(c06090Tz, userSession, 36329032413429726L)) {
            return false;
        }
        return true;
    }
}
