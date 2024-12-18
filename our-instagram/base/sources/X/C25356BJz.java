package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BJz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25356BJz implements InterfaceC30931Dil {
    public final List A00 = AbstractC166987dD.A1E();
    public final BK0 A01;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A09) {
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, c120985dq.getId());
            A00.A00(this.A01);
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                A00.A00((InterfaceC43071ya) it.next());
            }
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
    }

    public C25356BJz(C07T c07t, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = new BK0(c07t, userSession, interfaceC60442pS);
    }
}
