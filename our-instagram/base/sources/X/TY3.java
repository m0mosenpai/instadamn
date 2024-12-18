package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TY3 extends Thread {
    public final /* synthetic */ C58883QEt A00;

    public TY3(C58883QEt c58883QEt) {
        this.A00 = c58883QEt;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C07X c07x;
        InterfaceC172717mh interfaceC172717mh;
        AbstractC10360h2 abstractC10360h2;
        C58883QEt c58883QEt = this.A00;
        UserSession userSession = c58883QEt.A0a;
        if (userSession != null && c58883QEt.A04 == null) {
            c58883QEt.A04 = new SDQ(userSession);
        }
        InterfaceC172727mi interfaceC172727mi = ((AbstractC63223SfY) c58883QEt).A04;
        if (interfaceC172727mi instanceof C07X) {
            c07x = (C07X) interfaceC172727mi;
        } else {
            AbstractC63402SjX.A0A(c58883QEt.A03(), c58883QEt.A0Y, c58883QEt.A0X.A00("NULL_LIFE_CYCLE_OWNER", false).A00());
            c07x = null;
        }
        SDQ sdq = c58883QEt.A04;
        if (sdq != null && c07x != null) {
            if (c58883QEt.A02 == null) {
                c58883QEt.A02 = C63628Sqa.A00(c58883QEt, 16);
            }
            SF1 sf1 = sdq.A00;
            AbstractC63317ShP.A00(new C60902RbH(sf1, 3), sf1.A01);
            STG.A00(new RunnableC64675TPg(c07x, sf1.A00, c58883QEt));
        }
        if (((AbstractC63223SfY) c58883QEt).A02 != null && c58883QEt.A05 != null && (interfaceC172717mh = ((AbstractC63223SfY) c58883QEt).A03) != null) {
            interfaceC172717mh.getParentFragmentManager();
            java.util.Set set = C63269SgT.A0F;
            C5G6 c5g6 = c58883QEt.A0Y;
            if (set.contains(AbstractC58320PtC.A0y(C06090Tz.A06, c5g6.A04.A00))) {
                View view = ((AbstractC63223SfY) c58883QEt).A02;
                C63380Siu c63380Siu = c58883QEt.A05;
                InterfaceC172717mh interfaceC172717mh2 = ((AbstractC63223SfY) c58883QEt).A03;
                if (interfaceC172717mh2 != null) {
                    abstractC10360h2 = interfaceC172717mh2.getParentFragmentManager();
                } else {
                    abstractC10360h2 = null;
                }
                c58883QEt.A06 = new SOE(view, abstractC10360h2, c5g6, c58883QEt, c63380Siu, userSession);
            }
        }
    }
}
