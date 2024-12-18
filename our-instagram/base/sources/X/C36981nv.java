package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36981nv {
    public static final long A03 = TimeUnit.HOURS.toSeconds(6);
    public final Context A00;
    public final List A01 = Collections.synchronizedList(new ArrayList());
    public final List A02 = Collections.synchronizedList(new ArrayList());

    public static final synchronized void A01(InterfaceC1116050z interfaceC1116050z, C36981nv c36981nv) {
        synchronized (c36981nv) {
            if (c36981nv.A01.isEmpty() && c36981nv.A02.isEmpty() && interfaceC1116050z != null) {
                interfaceC1116050z.AVi("explore_popular_background_prefetch");
            }
        }
    }

    public static final void A00(InterfaceC1116050z interfaceC1116050z, UserSession userSession, C36981nv c36981nv, C2044693f c2044693f) {
        C38321qM A00;
        ImageUrl A1q;
        C38321qM A1e;
        C1ID.A00(((C1IB) C1P2.A00(userSession)).A00);
        ArrayList A06 = C127895qI.A06(userSession, null, c2044693f.A03);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36606324091786680L);
        List list = c36981nv.A01;
        list.clear();
        List list2 = c36981nv.A02;
        list2.clear();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C128005qU) {
                for (InterfaceC127955qO interfaceC127955qO : ((C128005qU) next).A02) {
                    boolean z = interfaceC127955qO instanceof InterfaceC127975qQ;
                    if (interfaceC127955qO instanceof C128045qY) {
                        A00 = I0C.A00(((C128045qY) interfaceC127955qO).A01.A00);
                    } else if ((interfaceC127955qO instanceof InterfaceC127965qP) || z) {
                        A00 = ((InterfaceC127975qQ) interfaceC127955qO).BQN();
                    }
                    if (A00 != null) {
                        boolean z2 = !z;
                        if (z) {
                            A1q = A00.A1S();
                        } else {
                            A1q = A00.A1q(c36981nv.A00);
                        }
                        if (A1q != null) {
                            C70696WfJ c70696WfJ = new C70696WfJ(interfaceC1116050z, c36981nv);
                            list.add(c70696WfJ);
                            C1OG A0J = C25821No.A00().A0J(A1q, "explore_popular_background_prefetch");
                            A0J.A0I = true;
                            A0J.A0F = false;
                            A0J.A02(c70696WfJ);
                            arrayList.add(A0J.A00());
                        }
                        if (A00.Cff() || (A00.A5M() && (A1e = A00.A1e(A00.A0x())) != null && A1e.Cff())) {
                            if (z2 && (!A00.A5M() || (A00 = A00.A1e(A00.A0x())) != null)) {
                                C4AD c4ad = new C4AD(A00.CFR(), "explore_popular_background_prefetch");
                                C71157Wos c71157Wos = new C71157Wos(interfaceC1116050z, c36981nv);
                                c4ad.A01(c71157Wos, A01);
                                list2.add(c71157Wos);
                                arrayList2.add(c4ad);
                            }
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C25821No.A00().A0N((InterfaceC59502nt) it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C4AG.A00(userSession).A01((C4AD) it3.next());
        }
    }

    public C36981nv(Context context) {
        this.A00 = context;
    }
}
