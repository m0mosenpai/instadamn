package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.2tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62832tM implements InterfaceC13000lm {
    public final UserSession A00;
    public final ConcurrentMap A01;

    public C62832tM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new ConcurrentHashMap();
    }

    public final C125605m6 A02(String str) {
        Object putIfAbsent;
        C14360o3.A0B(str, 0);
        ConcurrentMap concurrentMap = this.A01;
        Object obj = concurrentMap.get(str);
        if (obj == null && (putIfAbsent = concurrentMap.putIfAbsent(str, (obj = new C125605m6()))) != null) {
            obj = putIfAbsent;
        }
        return (C125605m6) obj;
    }

    public final void A04(InterfaceC62852tO interfaceC62852tO, String str) {
        C14360o3.A0B(interfaceC62852tO, 1);
        if (str != null) {
            A02(str).A05.add(interfaceC62852tO);
        }
    }

    public final void A05(InterfaceC62852tO interfaceC62852tO, String str) {
        C125605m6 c125605m6;
        C14360o3.A0B(interfaceC62852tO, 1);
        if (str != null && (c125605m6 = (C125605m6) this.A01.get(str)) != null) {
            c125605m6.A05.remove(interfaceC62852tO);
        }
    }

    public final void A08(String str, List list, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(list, 1);
        C125605m6 c125605m6 = (C125605m6) this.A01.get(str);
        if (c125605m6 != null) {
            List list2 = c125605m6.A03;
            list2.clear();
            list2.addAll(list);
            Iterator it = c125605m6.A05.iterator();
            while (it.hasNext()) {
                ((InterfaceC62852tO) it.next()).D5I(c125605m6.A01, list, z, z2);
            }
        }
    }

    public static final ArrayList A00(UserSession userSession, List list, List list2) {
        String str;
        String A2u;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C120985dq) it.next()).A02;
            if (c38321qM != null && (A2u = c38321qM.A2u()) != null) {
                arrayList.add(A2u);
            }
        }
        java.util.Set A0k = AbstractC001800i.A0k(arrayList);
        ArrayList arrayList2 = new ArrayList(list);
        if (C18U.A06(C06090Tz.A05, userSession, 36322834775026359L)) {
            ArrayList<C120985dq> arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                C38321qM c38321qM2 = ((C120985dq) next).A02;
                if (c38321qM2 != null) {
                    str = c38321qM2.A2u();
                } else {
                    str = null;
                }
                if (AbstractC001800i.A0u(A0k, str)) {
                    arrayList3.add(next);
                }
            }
            for (C120985dq c120985dq : arrayList3) {
                C3YM.A00(userSession).A07(new C25615BUc(C3YP.A06, C05F.A00, Integer.valueOf(arrayList2.indexOf(c120985dq) + list2.size()), Integer.valueOf(list2.indexOf(c120985dq)), null, null, null, c120985dq.getId()));
                arrayList2.removeAll(arrayList3);
            }
        } else {
            AnonymousClass016.A1A(arrayList2, new C9E2(A0k, 18));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x002c, code lost:
    
        if (r7.A07 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.InterfaceC111084zP r12, X.EnumC125615m7 r13, java.lang.String r14, java.util.List r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62832tM.A03(X.4zP, X.5m7, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public final void A06(C120985dq c120985dq, Integer num, String str, int i) {
        C125605m6 c125605m6 = (C125605m6) this.A01.get(str);
        if (c125605m6 != null) {
            Iterator it = c125605m6.A05.iterator();
            while (it.hasNext()) {
                ((InterfaceC62852tO) it.next()).D5C(c120985dq, num, i);
            }
        }
    }

    public final void A07(String str) {
        if (str != null) {
            this.A01.remove(str);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public static final void A01(InterfaceC111084zP interfaceC111084zP, List list, java.util.Set set, boolean z, boolean z2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC62852tO) it.next()).D5D(interfaceC111084zP, list, z, z2);
        }
    }
}
