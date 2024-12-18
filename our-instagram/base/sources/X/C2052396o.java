package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.96o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2052396o implements InterfaceC13000lm {
    public final Context A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        UserSession userSession = this.A01;
        userSession.A03(C2052396o.class);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E7G(AbstractC111324zv.A00(2948), 0L);
        ARD.apply();
    }

    public C2052396o(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
