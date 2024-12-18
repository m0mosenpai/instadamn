package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BK1 implements InterfaceC30931Dil {
    public C25620BUi A00;
    public C38228GrX A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final C07T A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC43589JPu A06;
    public final C25347BJq A07;
    public final boolean A08;

    /* JADX WARN: Type inference failed for: r8v0, types: [X.2uS, java.lang.Object] */
    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0B) {
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, c120985dq.getId());
            C07T c07t = this.A03;
            UserSession userSession = this.A04;
            InterfaceC60442pS interfaceC60442pS = this.A05;
            C38228GrX c38228GrX = new C38228GrX(c07t, userSession, interfaceC60442pS, this.A06);
            this.A01 = c38228GrX;
            A00.A00(c38228GrX);
            if (this.A08) {
                C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A01;
                C14360o3.A07(c1bx);
                C25620BUi c25620BUi = new C25620BUi(c1bx, userSession, interfaceC60442pS, AbstractC63462uT.A00(userSession), new Object());
                this.A00 = c25620BUi;
                A00.A00(c25620BUi);
            }
            Iterator it = this.A07.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC673231x) it.next()).ABh(A00);
            }
            Iterator it2 = this.A02.iterator();
            while (it2.hasNext()) {
                A00.A00((InterfaceC43071ya) it2.next());
            }
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
    }

    public BK1(C07T c07t, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, C25347BJq c25347BJq) {
        this.A03 = c07t;
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A06 = interfaceC43589JPu;
        this.A07 = c25347BJq;
        this.A08 = C18U.A06(C06090Tz.A05, userSession, 36318883405372151L);
    }
}
