package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71803Kd {
    public final C1X8 A00;
    public final C71773Ka A01;
    public final C1Wr A02;
    public final C3KZ A03;
    public final C1WJ A04;
    public final String A05;

    public C71803Kd(C1X8 c1x8, C71773Ka c71773Ka, C1Wr c1Wr, C3KZ c3kz, C1WJ c1wj, String str) {
        C14360o3.A0B(c1Wr, 4);
        C14360o3.A0B(str, 6);
        this.A00 = c1x8;
        this.A04 = c1wj;
        this.A03 = c3kz;
        this.A02 = c1Wr;
        this.A01 = c71773Ka;
        this.A05 = str;
    }

    public final C116155Nu A00(String str, boolean z) {
        C14360o3.A0B(str, 0);
        C3KZ c3kz = this.A03;
        InterfaceC19630xq interfaceC19630xq = c3kz.A03;
        boolean contains = interfaceC19630xq.contains(AnonymousClass001.A0R(str, "|showing"));
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj(AnonymousClass001.A0R(str, "|showing"));
        ARD.apply();
        String A00 = AbstractC116145Nt.A00(this.A05, str);
        C116155Nu c116155Nu = null;
        this.A00.A03(null, A00, 64278);
        this.A01.A01(A00);
        if (contains) {
            List list = (List) c3kz.A05.get(str);
            if (list == null) {
                list = C16930sl.A00;
            }
            c116155Nu = (C116155Nu) AbstractC001800i.A0L(list);
        }
        if (z) {
            List list2 = (List) c3kz.A05.remove(str);
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.EEj(AnonymousClass001.A0R(str, "|showing"));
            if (list2 != null) {
                int i = 0;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    ARD2.EEj(AnonymousClass001.A0G(str, '|', i));
                    i = i2;
                }
            }
            ARD2.apply();
        }
        return c116155Nu;
    }

    public final void A01(AbstractC12990ll abstractC12990ll, Runnable runnable, String str, boolean z, boolean z2) {
        UserSession userSession;
        String A00 = AbstractC116145Nt.A00(this.A05, str);
        if (abstractC12990ll instanceof UserSession) {
            userSession = (UserSession) abstractC12990ll;
        } else {
            userSession = null;
        }
        C3KZ c3kz = this.A03;
        List list = (List) c3kz.A05.get(str);
        if (list == null) {
            list = C16930sl.A00;
        }
        C1WJ c1wj = this.A04;
        C47690L3x AEk = c1wj.AEk(userSession, A00, str, list, z);
        AEk.A02 = z2;
        C116155Nu c116155Nu = AEk.A04;
        C14360o3.A07(c116155Nu);
        InterfaceC19610xo ARD = c3kz.A03.ARD();
        ARD.E77(AnonymousClass001.A0R(str, "|showing"), true);
        ARD.apply();
        this.A02.A05(c116155Nu, abstractC12990ll);
        this.A00.A02(AEk, abstractC12990ll, runnable, A00, 64278);
        c1wj.AB1(c116155Nu, userSession, str);
    }
}
