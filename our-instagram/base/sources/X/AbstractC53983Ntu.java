package X;

import android.app.Activity;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ntu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53983Ntu {
    public static final void A00(Activity activity, UserSession userSession, String str, boolean z) {
        long j;
        long j2;
        long j3;
        boolean A00 = C196218mC.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A00) {
            j = 2342156184607262523L;
        } else {
            j = 2342156322046216058L;
        }
        if (!C18U.A06(c06090Tz, userSession, j)) {
            if (A00) {
                j2 = 36313175393634108L;
            } else {
                j2 = 36313312832718715L;
            }
            if (C18U.A06(c06090Tz, userSession, j2)) {
                Handler A0J = AbstractC167007dF.A0J();
                GPU gpu = new GPU(userSession, activity, str);
                if (z) {
                    j3 = 2500;
                } else {
                    j3 = 0;
                }
                A0J.postDelayed(gpu, j3);
            }
        }
    }
}
