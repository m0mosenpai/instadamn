package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2IV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IV implements C2IW {
    public C71943Kr A00;
    public C71943Kr A01;
    public final C2IX A02;
    public final C47922Ib A03;
    public final C2IY A04;

    public C2IV(C2IX c2ix, C47922Ib c47922Ib, C2IY c2iy) {
        C14360o3.A0B(c2ix, 1);
        this.A02 = c2ix;
        this.A04 = c2iy;
        this.A03 = c47922Ib;
    }

    @Override // X.C2IW
    public final void Ct1(C4JH c4jh) {
        C71943Kr c71943Kr;
        int i;
        C4JH c4jh2 = c4jh;
        String str = c4jh2.A02;
        boolean A0K = C14360o3.A0K(str, "armadillo_update");
        C71943Kr c71943Kr2 = c4jh2.A01;
        if (A0K) {
            this.A00 = c71943Kr2;
            c71943Kr = this.A01;
        } else {
            this.A01 = c71943Kr2;
            C2IX c2ix = this.A02;
            int i2 = c4jh2.A00;
            InterfaceC19610xo ARD = c2ix.A00.ARD();
            ARD.E7D("direct_threads_badge_count", i2);
            ARD.apply();
            c71943Kr = c71943Kr2;
            c71943Kr2 = this.A00;
        }
        if (c71943Kr != null && c71943Kr2 != null) {
            C71933Kq c71933Kq = c71943Kr.A00;
            int i3 = c71933Kq.A02;
            int i4 = c71933Kq.A00;
            int i5 = c71933Kq.A01;
            List list = c71943Kr2.A01;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (Object obj : list) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.badging.model.ArmadilloThreadBadgeInfo");
                arrayList.add(obj);
            }
            List list2 = c71943Kr.A01;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((C5NQ) obj2).A00.A01.A01) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C3o9 c3o9 = ((C54J) it.next()).A00;
                    C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                    arrayList3.add(((DirectThreadKey) c3o9).A00);
                }
                java.util.Set A0k = AbstractC001800i.A0k(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (A0k.contains(((C5NQ) obj3).A00.A04)) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(AbstractC06950Ym.A1E(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(Long.valueOf(((C5NQ) it2.next()).A00.A02.A00));
                }
                java.util.Set A0k2 = AbstractC001800i.A0k(arrayList5);
                if (!A0k2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (!A0k2.contains(Long.valueOf(((C5NQ) obj4).A00.A02.A00))) {
                            arrayList.add(obj4);
                        }
                    }
                }
            }
            int size = arrayList.size();
            int i6 = i3 + size;
            if (i5 == -1) {
                i5 = 0;
            }
            C71933Kq c71933Kq2 = new C71933Kq(i6, i4, size + i5);
            ArrayList A0S = AbstractC001800i.A0S(arrayList, list2);
            Map map = c71943Kr.A02;
            Map map2 = c71943Kr2.A02;
            LinkedHashSet A00 = AnonymousClass090.A00(map2.keySet(), map.keySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj5 : A00) {
                Number number = (Number) map.get(obj5);
                int i7 = 0;
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 0;
                }
                Number number2 = (Number) map2.get(obj5);
                if (number2 != null) {
                    i7 = number2.intValue();
                }
                linkedHashMap.put(obj5, Integer.valueOf(i + i7));
            }
            c4jh2 = new C4JH(new C71943Kr(c71933Kq2, A0S, linkedHashMap), str);
        }
        this.A03.Ct1(c4jh2);
    }
}
