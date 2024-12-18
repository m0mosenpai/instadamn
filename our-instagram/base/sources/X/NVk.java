package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NVk extends OwC {
    public C82H A00;
    public OE3 A01;
    public static final C55088Oal A03 = new Object();
    public static final CallerContext A02 = CallerContext.A01("CrosspostingUnifiedOnboardingUpsellManager");
    public static final C19L A04 = AbstractC167017dG.A0w(C12L.A00, 763);

    public final void A07() {
        OE3 oe3 = this.A01;
        if (oe3 != null) {
            UserSession userSession = oe3.A03;
            FragmentActivity fragmentActivity = oe3.A00;
            AbstractC59962oe abstractC59962oe = oe3.A02;
            AbstractC54212Nxq.A00(fragmentActivity, oe3.A01, abstractC59962oe, userSession, oe3.A04, oe3.A05);
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A0E.A03(NVk.class);
    }
}
