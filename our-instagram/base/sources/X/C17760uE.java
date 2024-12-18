package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0uE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17760uE implements InterfaceC17700u7 {
    public final /* synthetic */ C17570ts A00;

    @Override // X.InterfaceC17700u7
    public final synchronized void E28(final int i) {
        C17570ts c17570ts = this.A00;
        Map map = c17570ts.A05;
        final HashSet hashSet = new HashSet(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.add(new C17530to((C17530to) it.next()));
        }
        if (C20150ym.A07(AbstractC20100yh.A00(36328057456311377L))) {
            UserSession userSession = c17570ts.A01;
            String str = new C17590tu(AbstractC17610tw.A00(userSession)).A00;
            C1AU A01 = C1AT.A01(userSession);
            C1AV c1av = C1AV.A1R;
            InterfaceC19610xo ARD = A01.A03(c1av).ARD();
            ARD.E7K(c1av.toString(), str);
            ARD.commit();
        }
        c17570ts.A02.ATO(new AbstractRunnableC14200nk(i) { // from class: X.0uF
            @Override // java.lang.Runnable
            public final void run() {
                C17760uE.this.A00.A03.FEL(hashSet);
            }
        });
    }

    public C17760uE(C17570ts c17570ts) {
        this.A00 = c17570ts;
    }
}
