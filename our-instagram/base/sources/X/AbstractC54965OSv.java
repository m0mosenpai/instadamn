package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OSv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54965OSv {
    public final boolean A00;

    public static final void A00(View view, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(view, 0);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A04 = new C52374NFq(interfaceC16660sJ, 21);
        A0s.A07 = true;
        A0s.A02 = 0.95f;
        A0s.A00();
    }

    public AbstractC54965OSv(UserSession userSession) {
        this.A00 = C18U.A06(C06090Tz.A05, userSession, 36324681611030912L);
    }
}
