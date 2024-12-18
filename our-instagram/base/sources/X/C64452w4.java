package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64452w4 {
    public final UserSession A00;
    public final C61382r1 A01;
    public final C60662pp A02;
    public final Map A03;
    public final InterfaceC09390do A04;

    public C64452w4(UserSession userSession, C61382r1 c61382r1, C60662pp c60662pp) {
        C14360o3.A0B(c61382r1, 3);
        this.A02 = c60662pp;
        this.A00 = userSession;
        this.A01 = c61382r1;
        this.A04 = C1XM.A00(new C9EN(this, 40));
        this.A03 = new LinkedHashMap();
    }

    public final void A01(String str) {
        C65192xH c65192xH = (C65192xH) this.A02.getAdapter();
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c65192xH).A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = abstractC65332xV.A02.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C3XG c3xg = (C3XG) next;
            C14360o3.A0B(c3xg, 0);
            if (c3xg.A06 == C1XV.A08 && C14360o3.A0K(c3xg.A09, str)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            abstractC65332xV.A0D(it2.next());
        }
        abstractC65332xV.A01 = Collections.unmodifiableList(arrayList2);
        AbstractC65332xV.A00(abstractC65332xV);
        c65192xH.A0A(-1);
    }

    public static final List A00(HBC hbc, C64452w4 c64452w4) {
        List list = hbc.A0B;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((IL5) it.next()).A00());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!C3YS.A00(c64452w4.A00).A05((C38321qM) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
