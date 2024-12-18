package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.Lvd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49584Lvd implements C0JG {
    public final C116155Nu A00;

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.KoK] */
    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        String str;
        UserSession userSession2;
        JZK jzk;
        boolean z;
        String str2;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, interfaceC03960Jm);
        C116155Nu c116155Nu = this.A00;
        if (c116155Nu.A1S) {
            C47142Eg A00 = AbstractC47132Ef.A00(userSession);
            C132515ya A002 = C60J.A00(userSession);
            A002.A09(A1R);
            HashMap A01 = LCJ.A01(c116155Nu);
            if (AbstractC31177DnL.A1Z(A00.A0t)) {
                JZJ jzj = JZK.A0A;
                ?? obj = new Object();
                synchronized (jzj) {
                    jzk = JZK.A09;
                    if (jzk == null) {
                        jzk = new JZK(obj);
                        JZK.A09 = jzk;
                    }
                }
                String str3 = userSession.userId;
                C14360o3.A0B(str3, 0);
                LJd lJd = jzk.A01;
                if (lJd != null) {
                    z = lJd.A0J.get();
                } else {
                    z = false;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = jzk.A05;
                if (!JZK.A03(jzk, str3, concurrentLinkedQueue)) {
                    LJd lJd2 = jzk.A01;
                    if (lJd2 != null) {
                        str2 = lJd2.A0D;
                    } else {
                        str2 = null;
                    }
                    if (!C14360o3.A0K(str2, str3) || z) {
                        if (!JZK.A03(jzk, str3, jzk.A04)) {
                            concurrentLinkedQueue.add(new C45126Jxv(str3, AbstractC25231BEo.A0p(), "push_notification", A01));
                        }
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = jzk.A06;
                        if (JZK.A03(jzk, str3, concurrentLinkedQueue2)) {
                            Iterator A13 = AbstractC166997dE.A13(concurrentLinkedQueue2);
                            while (A13.hasNext()) {
                                C45126Jxv c45126Jxv = (C45126Jxv) A13.next();
                                if (str3.equals(c45126Jxv.A01)) {
                                    concurrentLinkedQueue2.remove(c45126Jxv);
                                }
                            }
                        }
                        if (jzk.A01 == null && !jzk.A07.getAndSet(A1R)) {
                            JZK.A00(jzk);
                        }
                    }
                }
            } else {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327627958794989L);
                if (A06) {
                    C91Y A012 = C91Y.A0A.A01();
                    String str4 = userSession.userId;
                    C14360o3.A0B(str4, 0);
                    C49593Lvm c49593Lvm = A012.A02;
                    if (c49593Lvm != null && (userSession2 = c49593Lvm.A03) != null) {
                        str = userSession2.userId;
                    } else {
                        str = null;
                    }
                    if (!C14360o3.A0K(str, str4)) {
                        C129115sX.A00.A01(userSession, A01);
                    }
                }
                C91Y.A0A.A01().A03(new LU2(A06, userSession), A002, userSession.userId, A01);
            }
        }
        MRU A003 = JQX.A00(c116155Nu.A0j);
        Long l = c116155Nu.A0K;
        C14360o3.A07(l);
        A003.DW6(l.longValue());
        interfaceC03960Jm.AIn(null);
    }

    public C49584Lvd(C116155Nu c116155Nu) {
        this.A00 = c116155Nu;
    }
}
