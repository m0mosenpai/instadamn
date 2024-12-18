package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.CJo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27695CJo {
    public static final void A00(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 0);
        C70843Fw A00 = AbstractC70833Fv.A00(userSession);
        if (!A00.A04.getBoolean("has_seen_roll_call_nux", false)) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0T = null;
            C189478aR A002 = A0y.A00();
            C26724Br5 c26724Br5 = new C26724Br5();
            C26703Bqk c26703Bqk = new C26703Bqk();
            c26724Br5.mLifecycleRegistry.A09(new C28884Cos(A00));
            c26724Br5.A00 = ViewOnClickListenerC28666ClE.A00(A002, 18);
            c26724Br5.A01 = new ViewOnClickListenerC28651Ckz(6, userSession, c26724Br5, activity, c26703Bqk);
            A002.A02(activity, c26724Br5);
        }
    }
}
