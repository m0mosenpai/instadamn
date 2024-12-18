package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class OWR {
    public static final long A03 = TimeUnit.DAYS.toMillis(7);
    public C5SW A00;
    public C5SW A01;
    public C5SW A02;

    public final void A00(Activity activity, View view, UserSession userSession) {
        boolean A1b = AbstractC25233BEq.A1b(activity, userSession, view);
        C5SW c5sw = this.A01;
        if (c5sw == null) {
            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131962527));
            A0f.A03(view);
            A0f.A01();
            A0f.A0A = A1b;
            A0f.A00 = 3000;
            A0f.A04 = new C220459oV(userSession, 5);
            c5sw = A0f.A00();
            this.A01 = c5sw;
        }
        if (c5sw != null) {
            c5sw.A07(userSession);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01(Activity activity, View view, UserSession userSession) {
        boolean A1b = AbstractC25233BEq.A1b(activity, userSession, view);
        C5SW c5sw = this.A02;
        if (c5sw == null) {
            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131962529));
            A0f.A03(view);
            A0f.A02();
            A0f.A0A = A1b;
            A0f.A00 = 3000;
            A0f.A04 = new C220459oV(userSession, 6);
            c5sw = A0f.A00();
            this.A02 = c5sw;
        }
        if (c5sw != null) {
            c5sw.A07(userSession);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
