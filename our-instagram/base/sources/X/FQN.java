package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQN {
    public C189478aR A00;
    public Integer A01;
    public final Activity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C34474FHm A05 = new C34474FHm(this);

    public FQN(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = activity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
    }

    public final void A00() {
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = this.A04;
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putBoolean("show_only_main_options", false);
        A0b.putBoolean("is_group_profile", false);
        C32347EMt c32347EMt = new C32347EMt();
        c32347EMt.setArguments(A0b);
        c32347EMt.A01 = this.A05;
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, false);
        A0X.A0U = new C36727GGw(3, c32347EMt, this);
        A0X.A0T = c32347EMt;
        Activity activity = this.A02;
        AbstractC31172DnG.A1G(activity.getResources(), A0X, 2131976138);
        A0X.A07 = 1;
        this.A00 = A0X.A00().A02(activity, c32347EMt);
    }
}
