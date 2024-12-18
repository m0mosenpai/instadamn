package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NLy extends AbstractC1564470p implements InterfaceC13000lm {
    public boolean A00;
    public final UserSession A01;

    @Override // X.AbstractC1564470p
    public final void showUpsell(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity) {
        C14360o3.A0B(activity, 1);
        UserSession userSession = this.A01;
        N51 A00 = AbstractC53980Ntr.A00(userSession, this.entryPoint);
        PK6 pk6 = new PK6(activity, this, A00);
        AbstractC35174FfR.A02(EnumC72435Xdf.A0C, userSession, "upsell_impressions", null, 2);
        A00(EnumC201098ur.VIEW, this);
        A00.A01(pk6, activity);
    }

    public static final void A00(EnumC201098ur enumC201098ur, NLy nLy) {
        UserSession userSession = nLy.A01;
        C82G c82g = C82G.A03;
        C82H c82h = C82H.A0S;
        C82I A0H = MSW.A0H();
        A0H.A09(AbstractC166997dE.A0a());
        AbstractC50523MSb.A18(A0H, 1L);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }

    @Override // X.AbstractC1564470p
    public final InterfaceC58198Pr4 getUpsellContent() {
        UserSession userSession = this.A01;
        return (PKB) userSession.A01(PKB.class, new C50152MDf(userSession, 21));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(NLy.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NLy(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AbstractC167017dG.A1Q(userSession, str);
        this.A01 = userSession;
    }
}
