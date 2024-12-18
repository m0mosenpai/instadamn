package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C111354zy {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final List A03;
    public final List A04;

    public C111354zy(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = Collections.synchronizedList(new ArrayList());
        this.A04 = Collections.synchronizedList(new ArrayList());
        this.A00 = (int) C18U.A01(C06090Tz.A05, userSession, 36606324091786680L);
    }

    public static final synchronized void A00(InterfaceC1116050z interfaceC1116050z, C111354zy c111354zy) {
        synchronized (c111354zy) {
            if (c111354zy.A03.isEmpty() && c111354zy.A04.isEmpty()) {
                interfaceC1116050z.AVi("reel_background_prefetch");
            }
        }
    }

    public static final void A01(InterfaceC1116050z interfaceC1116050z, C111354zy c111354zy, List list) {
        C38321qM A1e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List A0O = ((Reel) it.next()).A0O(c111354zy.A02);
            C14360o3.A07(A0O);
            int size = A0O.size();
            for (int i = 0; i < size; i++) {
                C38321qM c38321qM = ((C41181vS) A0O.get(i)).A0b;
                if (c38321qM != null) {
                    C42224InA c42224InA = new C42224InA(interfaceC1116050z, c111354zy);
                    c111354zy.A03.add(c42224InA);
                    ExtendedImageUrl A1q = c38321qM.A1q(c111354zy.A01);
                    if (A1q != null) {
                        C1OG A0J = C25821No.A00().A0J(A1q, "reel_background_prefetch");
                        A0J.A0I = true;
                        A0J.A02(c42224InA);
                        c38321qM.A18();
                        A0J.A0F = false;
                        arrayList.add(A0J.A00());
                    }
                    if ((c38321qM.Cff() || (c38321qM.A5M() && (A1e = c38321qM.A1e(c38321qM.A0x())) != null && A1e.Cff())) && (!c38321qM.A5M() || (c38321qM = c38321qM.A1e(c38321qM.A0x())) != null)) {
                        C4AD c4ad = new C4AD(c38321qM.CFR(), "reel_background_prefetch");
                        J20 j20 = new J20(interfaceC1116050z, c111354zy);
                        c111354zy.A04.add(j20);
                        c4ad.A01(j20, c111354zy.A00);
                        arrayList2.add(c4ad);
                    }
                }
            }
        }
        if (arrayList.size() == 0 && arrayList2.size() == 0) {
            A00(interfaceC1116050z, c111354zy);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C25821No.A00().A0N((InterfaceC59502nt) it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C4AG.A00(c111354zy.A02).A01((C4AD) it3.next());
        }
    }
}
