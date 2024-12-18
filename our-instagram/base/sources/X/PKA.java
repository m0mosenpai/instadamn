package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class PKA implements InterfaceC58198Pr4, InterfaceC13000lm {
    public static final CallerContext A06 = CallerContext.A01("FxIgFbFeedCrossPostingUpsellContent");
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final UserSession A05;

    public PKA(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A02 = "";
        this.A00 = "";
        this.A03 = "";
        this.A04 = "";
    }

    @Override // X.InterfaceC58198Pr4
    public final String Aqu(Context context) {
        C1564570q c1564570q = C1564570q.A00;
        UserSession userSession = this.A05;
        if (c1564570q.A01(userSession, this.A00)) {
            return this.A00;
        }
        int i = 2131951998;
        if (AnonymousClass252.A00(userSession).A01) {
            i = 2131951999;
        }
        return AbstractC166997dE.A0p(context, i);
    }

    @Override // X.InterfaceC58198Pr4
    public final String B7k(Context context) {
        if (C1564570q.A00.A01(this.A05, this.A01)) {
            return this.A01;
        }
        return context.getString(2131952000);
    }

    @Override // X.InterfaceC58198Pr4
    public final String BDH(Context context) {
        if (C1564570q.A00.A01(this.A05, this.A02)) {
            return this.A02;
        }
        return AbstractC166997dE.A0p(context, 2131952003);
    }

    @Override // X.InterfaceC58198Pr4
    public final ImageUrl BGt() {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String BgN(Context context) {
        if (C1564570q.A00.A01(this.A05, this.A03)) {
            return this.A03;
        }
        return AbstractC166997dE.A0p(context, 2131952001);
    }

    @Override // X.InterfaceC58198Pr4
    public final String BrY(Context context) {
        if (C1564570q.A00.A01(this.A05, this.A04)) {
            return this.A04;
        }
        return AbstractC166997dE.A0p(context, 2131952002);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A05.A03(PKA.class);
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agv(Context context) {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agw(Context context) {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agx(Context context) {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agy(Context context) {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Ah0(Context context) {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Ah1(Context context) {
        return null;
    }
}
