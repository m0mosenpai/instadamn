package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl;

/* loaded from: classes9.dex */
public final class NLx extends AbstractC1564470p implements InterfaceC13000lm {
    public final UserSession A00;

    @Override // X.AbstractC1564470p
    public final void showUpsell(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity) {
        C14360o3.A0B(activity, 1);
        AbstractC53980Ntr.A00(this.A00, this.entryPoint).A01(interfaceC58134Ppx, activity);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Pr4, java.lang.Object] */
    @Override // X.AbstractC1564470p
    public final InterfaceC58198Pr4 getUpsellContent() {
        return new Object();
    }

    @Override // X.AbstractC1564470p
    public final boolean isUpsellEligible() {
        UserSession userSession = this.A00;
        return AbstractC149576oA.A00(userSession).A0B(userSession, this.entryPoint, true);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(FxIgLogoutACUpsellImpl.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NLx(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AbstractC167017dG.A1Q(userSession, str);
        this.A00 = userSession;
    }
}
