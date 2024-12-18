package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PK6 implements InterfaceC58134Ppx {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ NLy A01;
    public final /* synthetic */ N51 A02;

    @Override // X.InterfaceC58134Ppx
    public final void getPrimaryCtaAction() {
        C36780GJd c36780GJd = new C36780GJd(3);
        N51 n51 = this.A02;
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
        String A01 = EnumC72412Xd8.A0O.A01();
        C28301Yr A00 = AbstractC34213F7l.A00();
        NLy nLy = this.A01;
        UserSession userSession = nLy.A01;
        A00.A01(n51, userSession, c36780GJd).A06(A01, AbstractC001800i.A0U(AbstractC149576oA.A00(userSession).A00));
        AbstractC35174FfR.A02(EnumC72435Xdf.A0C, userSession, "upsell_primary_click", null, 2);
        NLy.A00(EnumC201098ur.ACCEPT, nLy);
        nLy.A00 = true;
    }

    public PK6(Activity activity, NLy nLy, N51 n51) {
        this.A02 = n51;
        this.A00 = activity;
        this.A01 = nLy;
    }

    @Override // X.InterfaceC58134Ppx
    public final void getDismissAction() {
        NLy nLy = this.A01;
        if (!nLy.A00) {
            AbstractC35174FfR.A02(EnumC72435Xdf.A0C, nLy.A01, "upsell_dismiss", null, 2);
        }
        nLy.A00 = false;
    }

    @Override // X.InterfaceC58134Ppx
    public final void getSecondaryCtaAction() {
        NLy nLy = this.A01;
        AbstractC35174FfR.A02(EnumC72435Xdf.A0C, nLy.A01, "upsell_secondary_click", null, 2);
        NLy.A00(EnumC201098ur.DECLINE, nLy);
        nLy.A00 = true;
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }
}
