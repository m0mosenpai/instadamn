package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W91 {
    public InterfaceC41501vz A00;
    public final Activity A01;
    public final UserSession A02;
    public final C68746VbP A03;
    public final C69108Vhy A04;

    public static final void A00(C66542ULx c66542ULx, W91 w91) {
        Activity activity = w91.A01;
        if (activity != null) {
            UserSession userSession = w91.A02;
            C14360o3.A0B(userSession, 0);
            AbstractC61813Ru7.A00(userSession).A00(activity, new C67602UsN(0, c66542ULx, w91), AbstractC111324zv.A00(4837), "ig4a", null);
        }
    }

    public W91(Activity activity, UserSession userSession, C68746VbP c68746VbP, C69108Vhy c69108Vhy) {
        AbstractC43594JPz.A1P(userSession, c69108Vhy);
        this.A01 = activity;
        this.A02 = userSession;
        this.A03 = c68746VbP;
        this.A04 = c69108Vhy;
    }

    public W91() {
    }
}
