package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* loaded from: classes8.dex */
public final class L20 {
    public final C25671My A00;
    public final InterfaceC41501vz A01;
    public final HorizontalRecyclerPager A02;

    public L20(UserSession userSession, HorizontalRecyclerPager horizontalRecyclerPager) {
        C44288Jhe c44288Jhe = new C44288Jhe(this, 20);
        this.A01 = c44288Jhe;
        this.A02 = horizontalRecyclerPager;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.A01(c44288Jhe, C70712Wfb.class);
        this.A00 = A00;
    }
}
