package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GJk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36787GJk implements InterfaceC58134Ppx {
    public final /* synthetic */ C35272Fh7 A00;

    @Override // X.InterfaceC58134Ppx
    public final void getDismissAction() {
    }

    @Override // X.InterfaceC58134Ppx
    public final void getSecondaryCtaAction() {
        C36783GJg c36783GJg = new C36783GJg(this, 1);
        C35272Fh7 c35272Fh7 = this.A00;
        Fragment fragment = c35272Fh7.A00;
        if (fragment != null) {
            C28301Yr c28301Yr = C28301Yr.A01;
            UserSession userSession = c35272Fh7.A04;
            c28301Yr.A01(fragment, userSession, c36783GJg).A06("ig_logout_upsell", AbstractC149576oA.A00(userSession).A08("IG_LOGOUT_UPSELL"));
        }
    }

    public C36787GJk(C35272Fh7 c35272Fh7) {
        this.A00 = c35272Fh7;
    }

    @Override // X.InterfaceC58134Ppx
    public final void getPrimaryCtaAction() {
        this.A00.A0D(EnumC33353Eom.A05, true);
    }
}
