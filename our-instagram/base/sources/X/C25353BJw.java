package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BJw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25353BJw implements InterfaceC30931Dil {
    public final C07T A00;
    public final C07T A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C5GV A04;
    public final InterfaceC43589JPu A05;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C5GV c5gv;
        C14360o3.A0B(c57112jm, 0);
        AbstractC25233BEq.A0v(1, view, c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A08) {
            if (i > 1 && (c5gv = this.A04) != null) {
                c5gv.A00(view, c120985dq);
            }
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AnonymousClass001.A0O(c120985dq.getId(), i));
            C07T c07t = this.A01;
            C07T c07t2 = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            UserSession userSession = this.A02;
            A00.A00(new C50592MVd(c07t, c07t2, userSession, interfaceC60442pS, this.A05));
            A00.A00(new BRY(userSession));
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
    }

    public C25353BJw(C07T c07t, C07T c07t2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C5GV c5gv, InterfaceC43589JPu interfaceC43589JPu) {
        this.A01 = c07t;
        this.A00 = c07t2;
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A05 = interfaceC43589JPu;
        this.A04 = c5gv;
    }
}
