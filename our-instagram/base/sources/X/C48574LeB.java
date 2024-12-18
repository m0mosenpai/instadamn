package X;

import com.facebook.android.maps.model.LatLngBounds;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.LeB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48574LeB implements InterfaceC57132jo {
    public long A00;
    public final KCU A01;
    public final KCU A02;
    public final Map A03;
    public final Map A04;
    public final java.util.Set A05;
    public final java.util.Set A06;

    public C48574LeB(C57112jm c57112jm, KCU kcu, KCU kcu2) {
        C14360o3.A0B(c57112jm, 1);
        this.A02 = kcu;
        this.A01 = kcu2;
        c57112jm.A00 = this;
        this.A00 = System.currentTimeMillis();
        this.A06 = AbstractC31171DnF.A0l();
        this.A03 = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1I();
        this.A05 = AbstractC31171DnF.A0l();
    }

    @Override // X.InterfaceC57132jo
    public final void DiQ() {
        KYZ kyz;
        if (System.currentTimeMillis() - this.A00 > 250) {
            this.A00 = System.currentTimeMillis();
            Map map = this.A04;
            map.clear();
            java.util.Set set = this.A05;
            set.clear();
            java.util.Set set2 = this.A06;
            set2.clear();
            KCU kcu = this.A02;
            C69800Vvm c69800Vvm = kcu.A0g;
            if (c69800Vvm != null) {
                C69305VlD A02 = c69800Vvm.A02();
                if (A02 != null) {
                    C69800Vvm c69800Vvm2 = kcu.A0g;
                    if (c69800Vvm2 != null) {
                        HashSet A05 = c69800Vvm2.A05(c69800Vvm2.A06());
                        LatLngBounds latLngBounds = new LatLngBounds(A02.A04, A02.A01);
                        Iterator it = A05.iterator();
                        while (it.hasNext()) {
                            ULQ ulq = (ULQ) it.next();
                            if (!(ulq instanceof KYZ) || (kyz = (KYZ) ulq) == null) {
                                break;
                            }
                            C69800Vvm c69800Vvm3 = kcu.A0g;
                            if (c69800Vvm3 != null) {
                                C69305VlD A03 = c69800Vvm3.A03(KYZ.A00(kyz));
                                if (A03 != null && latLngBounds.A01(A03.A00) && !kyz.A0S) {
                                    C45128JyU c45128JyU = kyz.A0P;
                                    if (!c45128JyU.A0C && !c45128JyU.A0H && !c45128JyU.A0D && !c45128JyU.A0K) {
                                        set2.add(kyz.getId());
                                    }
                                }
                            }
                        }
                    }
                }
                Map map2 = this.A03;
                Iterator A15 = AbstractC166997dE.A15(map2);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    long A0N = AbstractC166987dD.A0N(A1K.getValue());
                    if (!set2.contains(key)) {
                        AbstractC43592JPx.A1V(key, this.A00 - A0N, map);
                        A15.remove();
                    }
                }
                for (Object obj : set2) {
                    if (!map2.containsKey(obj)) {
                        AbstractC43592JPx.A1V(obj, this.A00, map2);
                        set.add(obj);
                    }
                }
                if ((!map.isEmpty()) || AbstractC31171DnF.A1b(set)) {
                    set.size();
                    map.size();
                    this.A01.A04(map);
                    return;
                }
                return;
            }
            C14360o3.A0F("mapViewController");
            throw C00O.createAndThrow();
        }
    }
}
