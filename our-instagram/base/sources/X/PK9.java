package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class PK9 implements InterfaceC58198Pr4, InterfaceC13000lm {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final UserSession A04;

    public PK9(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = "";
        this.A00 = "";
        this.A02 = "";
        this.A03 = "";
    }

    @Override // X.InterfaceC58198Pr4
    public final String Aqu(Context context) {
        if (C1564570q.A00.A01(this.A04, this.A00)) {
            return this.A00;
        }
        return AbstractC166997dE.A0p(context, 2131975759);
    }

    @Override // X.InterfaceC58198Pr4
    public final String BDH(Context context) {
        if (C1564570q.A00.A01(this.A04, this.A01)) {
            return this.A01;
        }
        return AbstractC166997dE.A0p(context, 2131975760);
    }

    @Override // X.InterfaceC58198Pr4
    public final ImageUrl BGt() {
        return null;
    }

    @Override // X.InterfaceC58198Pr4
    public final String BgN(Context context) {
        if (C1564570q.A00.A01(this.A04, this.A02)) {
            return this.A02;
        }
        return AbstractC166997dE.A0p(context, 2131965780);
    }

    @Override // X.InterfaceC58198Pr4
    public final String BrY(Context context) {
        if (C1564570q.A00.A01(this.A04, this.A03)) {
            return this.A03;
        }
        return AbstractC166997dE.A0p(context, 2131965781);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A04.A03(PK9.class);
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

    @Override // X.InterfaceC58198Pr4
    public final String B7k(Context context) {
        return null;
    }
}
