package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BJs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25349BJs implements InterfaceC30931Dil {
    public final List A00 = AbstractC166987dD.A1E();
    public final C25347BJq A01;
    public final C37529Gfl A02;
    public final C25350BJt A03;
    public final C37532Gfo A04;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0G) {
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, c120985dq.getId());
            A00.A00(this.A03);
            A00.A00(this.A04);
            A00.A00(this.A02.A00);
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                A00.A00((InterfaceC43071ya) it.next());
            }
            Iterator it2 = this.A01.A00.iterator();
            while (it2.hasNext()) {
                ((InterfaceC673231x) it2.next()).ABj(A00);
            }
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
    }

    public C25349BJs(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C25347BJq c25347BJq, C37529Gfl c37529Gfl, String str) {
        this.A02 = c37529Gfl;
        this.A01 = c25347BJq;
        C30W c30w = new C30W(userSession, null);
        this.A03 = new C25350BJt(userSession, c30w, interfaceC60442pS);
        this.A04 = new C37532Gfo(userSession, c30w, interfaceC60442pS, str);
    }
}
