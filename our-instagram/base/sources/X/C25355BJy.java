package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BJy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25355BJy implements InterfaceC30931Dil {
    public final List A00 = AbstractC166987dD.A1E();
    public final C25347BJq A01;
    public final C37537Gft A02;
    public final C37536Gfs A03;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0A) {
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, c120985dq.getId());
            A00.A00(this.A02);
            A00.A00(this.A03);
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                A00.A00((InterfaceC43071ya) it.next());
            }
            Iterator it2 = this.A01.A00.iterator();
            while (it2.hasNext()) {
                ((InterfaceC673231x) it2.next()).ABm(A00);
            }
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
    }

    public C25355BJy(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64052vQ c64052vQ, C25347BJq c25347BJq, C37526Gfi c37526Gfi) {
        this.A01 = c25347BJq;
        this.A03 = new C37536Gfs(userSession, interfaceC60442pS, c37526Gfi);
        this.A02 = new C37537Gft(userSession, c64052vQ, c37526Gfi);
    }
}
