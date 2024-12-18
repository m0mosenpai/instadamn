package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7y {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public L7y(Context context, View view, UserSession userSession) {
        C14360o3.A0B(view, 3);
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = MHQ.A00(view, 21);
        this.A03 = MHQ.A00(view, 20);
        this.A06 = MHQ.A00(view, 23);
        this.A05 = MHQ.A00(this, 22);
    }

    public final void A00() {
        ((AbstractC58662mP) AbstractC166987dD.A17(this.A05)).stop();
        AbstractC166987dD.A0d(this.A04).setVisibility(8);
        AbstractC43593JPy.A1W(this.A03, 8);
        AbstractC43593JPy.A1W(this.A06, 8);
    }
}
