package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64352vu extends AbstractC60592pi {
    public final C30Y A00;
    public final C5GQ A01;
    public final C30Y A02;

    public final void A00(C11520jB c11520jB, C1NI c1ni, int i, int i2, boolean z) {
        C30Y c30y = this.A00;
        if (c30y != null && z) {
            c30y.A05(c11520jB, c1ni, i, i2);
        }
        C5GQ c5gq = this.A01;
        if (c5gq != null) {
            String A00 = C5GQ.A00(c5gq, c1ni);
            long currentTimeMillis = System.currentTimeMillis();
            if (AbstractC75423a9.A02(c1ni, c5gq.A00)) {
                c5gq.A03.put(A00, new C138226Od(c1ni, "feed_unit", currentTimeMillis, false));
            }
        }
        C30Y c30y2 = this.A02;
        if (c30y2 != null) {
            if ((c1ni instanceof C38321qM) || (c1ni instanceof C41181vS) || (c1ni instanceof C120985dq)) {
                c30y2.A05(c11520jB, c1ni, i, i2);
            }
        }
    }

    public final void A01(C81493kJ c81493kJ, C1NI c1ni, int i) {
        C30Y c30y = this.A00;
        if (c30y != null) {
            String A01 = C30Y.A01(c30y, c1ni);
            C1BX A00 = C30Y.A00(c30y, c1ni);
            if (A01 != null && A00 != null) {
                c30y.A04.put(A01, new C141726ap(c1ni, Long.valueOf(System.currentTimeMillis()), null, i, -1, c81493kJ.A00));
            }
        }
    }

    public final void A02(C1NI c1ni, int i) {
        C30Y c30y = this.A00;
        if (c30y != null) {
            c30y.A06(c1ni, i);
        }
        C5GQ c5gq = this.A01;
        if (c5gq != null) {
            String A00 = C5GQ.A00(c5gq, c1ni);
            if (AbstractC75423a9.A02(c1ni, c5gq.A00) && c5gq.A03.remove(A00) != null) {
                System.currentTimeMillis();
            }
        }
    }

    public final void A03(C1NI c1ni, int i) {
        C30Y c30y = this.A00;
        if (c30y != null) {
            String A01 = C30Y.A01(c30y, c1ni);
            C1BX A00 = C30Y.A00(c30y, c1ni);
            if (A01 != null && A00 != null) {
                C141726ap c141726ap = (C141726ap) c30y.A04.remove(A01);
                if (c141726ap == null) {
                    C0K8.A0O("ImpressionTracker", "Viewable info missing for media with key %s", A01);
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C141726ap c141726ap2 = new C141726ap(c1ni, c141726ap.A05, Long.valueOf(currentTimeMillis), c141726ap.A01, c141726ap.A00, c141726ap.A02);
                c30y.A05.put(A01, c141726ap2);
                C30Y.A04(A00, c30y, c141726ap2, c1ni, c30y.A03, A01, i);
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        C5GQ c5gq = this.A01;
        if (c5gq != null) {
            c5gq.A03.clear();
            c5gq.A02.clear();
            c5gq.A01.clear();
        }
        C30Y c30y = this.A00;
        if (c30y != null) {
            c30y.A04.clear();
            c30y.A05.clear();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C5GQ c5gq = this.A01;
        if (c5gq != null) {
            Map map = c5gq.A03;
            HashMap hashMap = new HashMap(map);
            Map map2 = c5gq.A01;
            HashMap hashMap2 = new HashMap(map2);
            Map map3 = c5gq.A02;
            HashMap hashMap3 = new HashMap(map3);
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                C1NI c1ni = ((C138226Od) it.next()).A01;
                String A00 = C5GQ.A00(c5gq, c1ni);
                if (AbstractC75423a9.A02(c1ni, c5gq.A00) && map.remove(A00) != null) {
                    System.currentTimeMillis();
                }
            }
            for (C138226Od c138226Od : hashMap2.values()) {
                c5gq.A02(c138226Od.A01, c138226Od.A02);
            }
            for (C138226Od c138226Od2 : hashMap3.values()) {
                C1NI c1ni2 = c138226Od2.A01;
                String A01 = C5GQ.A01(c5gq, c1ni2, c138226Od2.A02);
                if (AbstractC75423a9.A02(c1ni2, c5gq.A00) && map3.remove(A01) != null) {
                    System.currentTimeMillis();
                }
            }
            map.clear();
            map.putAll(hashMap);
            map2.clear();
            map2.putAll(hashMap2);
            map3.clear();
            map3.putAll(hashMap3);
        }
        C30Y c30y = this.A00;
        if (c30y != null) {
            for (Map.Entry entry : c30y.A04.entrySet()) {
                C141726ap c141726ap = (C141726ap) entry.getValue();
                String str = (String) entry.getKey();
                C1NI c1ni3 = c141726ap.A03;
                C1BX A002 = C30Y.A00(c30y, c1ni3);
                Long l = c141726ap.A05;
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                long j = c141726ap.A02;
                int i = c141726ap.A01;
                int i2 = c141726ap.A00;
                C141726ap c141726ap2 = new C141726ap(c1ni3, l, valueOf, i, i2, j);
                c30y.A05.put(str, c141726ap2);
                C30Y.A04(A002, c30y, c141726ap2, c1ni3, c30y.A03, str, i2);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Map map4 = c30y.A05;
            for (C141726ap c141726ap3 : map4.values()) {
                C1NI c1ni4 = c141726ap3.A03;
                arrayList.add(c1ni4);
                arrayList2.add(Integer.valueOf(c141726ap3.A00));
                hashSet.add(c1ni4.getId());
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                C1NI c1ni5 = (C1NI) arrayList.get(i3);
                int intValue = ((Number) arrayList2.get(i3)).intValue();
                c30y.A06(c1ni5, intValue);
                if (c1ni5 instanceof C38321qM) {
                    C38321qM c38321qM = (C38321qM) c1ni5;
                    if (c38321qM.A5M() && intValue != -1) {
                        c30y.A07(c38321qM, c38321qM.A1e(intValue), intValue);
                    }
                }
            }
            map4.clear();
            C62732tC c62732tC = c30y.A00;
            if (c62732tC != null) {
                c62732tC.A01.A09();
                c62732tC.A00.A09();
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C5GQ c5gq = this.A01;
        if (c5gq != null) {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            Map map = c5gq.A03;
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                C138226Od c138226Od = (C138226Od) entry.getValue();
                hashMap.put(key, new C138226Od(c138226Od.A01, c138226Od.A02, currentTimeMillis, c138226Od.A03));
            }
            map.clear();
            map.putAll(hashMap);
            HashMap hashMap2 = new HashMap();
            Map map2 = c5gq.A02;
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key2 = entry2.getKey();
                C138226Od c138226Od2 = (C138226Od) entry2.getValue();
                hashMap2.put(key2, new C138226Od(c138226Od2.A01, c138226Od2.A02, currentTimeMillis, c138226Od2.A03));
            }
            map2.clear();
            map2.putAll(hashMap2);
            HashMap hashMap3 = new HashMap();
            Map map3 = c5gq.A01;
            for (Map.Entry entry3 : map3.entrySet()) {
                Object key3 = entry3.getKey();
                C138226Od c138226Od3 = (C138226Od) entry3.getValue();
                hashMap3.put(key3, new C138226Od(c138226Od3.A01, c138226Od3.A02, currentTimeMillis, c138226Od3.A03));
            }
            map3.clear();
            map3.putAll(hashMap3);
        }
        C30Y c30y = this.A00;
        if (c30y != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            HashMap hashMap4 = new HashMap();
            Map map4 = c30y.A04;
            for (Map.Entry entry4 : map4.entrySet()) {
                Object key4 = entry4.getKey();
                C141726ap c141726ap = (C141726ap) entry4.getValue();
                hashMap4.put(key4, new C141726ap(c141726ap.A03, Long.valueOf(currentTimeMillis2), null, c141726ap.A01, c141726ap.A00, c141726ap.A02));
            }
            map4.clear();
            map4.putAll(hashMap4);
        }
    }

    public C64352vu(UserSession userSession, C30V c30v, InterfaceC60442pS interfaceC60442pS, boolean z) {
        if (z) {
            this.A00 = null;
        } else {
            this.A00 = new C30Y(userSession, null, c30v, interfaceC60442pS);
        }
        this.A01 = null;
        this.A02 = null;
    }

    public C64352vu(C30Y c30y, C30Y c30y2, C5GQ c5gq) {
        this.A01 = c5gq;
        this.A00 = c30y;
        this.A02 = c30y2;
    }

    public C64352vu(InterfaceC64342vt interfaceC64342vt) {
        this.A00 = null;
        this.A02 = interfaceC64342vt.AXL();
        this.A01 = null;
    }
}
