package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PK4 implements GZY {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C195918ld A03;

    @Override // X.GZY
    public final void onAuthorizeFail() {
    }

    public PK4(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, C195918ld c195918ld) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = abstractC59962oe;
        this.A03 = c195918ld;
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        C195918ld c195918ld = this.A03;
        if (!C18U.A06(C06090Tz.A05, userSession, 36326541332199374L)) {
            AbstractC54211Nxp.A00(fragmentActivity, abstractC59962oe.getContext(), abstractC59962oe, C82G.A0v, userSession, new PG7(c195918ld, 6));
        }
    }
}
