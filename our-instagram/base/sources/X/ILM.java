package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class ILM {
    public final C57112jm A00;
    public final C39380HaK A01;

    public ILM(UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS) {
        C39380HaK c39380HaK;
        C14360o3.A0B(userSession, 1);
        this.A00 = c57112jm;
        if (C18U.A06(C06090Tz.A05, userSession, 36315133899377712L)) {
            c39380HaK = new C39380HaK(userSession, interfaceC60442pS);
        } else {
            c39380HaK = null;
        }
        this.A01 = c39380HaK;
    }

    public final void A00(View view, OUA oua) {
        C39380HaK c39380HaK = this.A01;
        if (c39380HaK != null) {
            ((AbstractC64292vo) c39380HaK).A00.put(oua, view);
            C59072n8 A00 = C59062n7.A00(oua, C0eB.A00, oua.A02);
            A00.A00(c39380HaK);
            this.A00.A05(view, A00.A01());
        }
    }
}
