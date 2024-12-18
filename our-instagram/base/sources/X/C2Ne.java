package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccount;

/* renamed from: X.2Ne, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Ne extends AbstractC49112Nh implements InterfaceC13000lm {
    public final C40921uz A00;
    public final UserSession A01;

    public C2Ne(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC40751ui.A00(userSession);
    }

    public final FxCalAccount A01(CallerContext callerContext, String str) {
        return (FxCalAccount) AbstractC001800i.A0J(this.A00.A03(callerContext, str, "FACEBOOK"));
    }

    public final void A02(CallerContext callerContext, InterfaceC196048lu interfaceC196048lu, String str) {
        this.A00.A0K(callerContext, interfaceC196048lu, str, false, false);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C2Ne.class);
    }

    public final boolean A03(CallerContext callerContext, String str) {
        return A00(callerContext, str);
    }

    public C2Ne() {
    }
}
