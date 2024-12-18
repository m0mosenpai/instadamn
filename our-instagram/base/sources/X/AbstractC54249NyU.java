package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NyU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54249NyU {
    public static final int A00(Context context, UserSession userSession, int i, boolean z, boolean z2) {
        int i2;
        if (AbstractC54956OSg.A00()) {
            return 640;
        }
        if (z) {
            i2 = 1080;
        } else {
            i2 = 640;
            if (C04100Kb.A00(context) >= 2009) {
                i2 = 720;
            }
        }
        if (z2) {
            int i3 = 1;
            if (C18U.A06(C06090Tz.A05, userSession, 36320137535561815L)) {
                i3 = 2;
            }
            int i4 = i * i3;
            int i5 = 480;
            if (i4 >= 480) {
                i5 = 720;
                if (i4 >= 720) {
                    i5 = 1080;
                }
            }
            return Math.min(i5, i2);
        }
        return AbstractC38301qK.A00(i, 480, i2);
    }
}
