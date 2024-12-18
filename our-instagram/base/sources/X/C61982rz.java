package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61982rz {
    public List A00;
    public final InterfaceC14020nS A01;
    public final Object A02 = new Object();
    public final Map A04 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();

    public static final ArrayList A00(InterfaceC28041Xi interfaceC28041Xi, C61982rz c61982rz, final C4QH c4qh, List list, final java.util.Set set, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C14360o3.A0B(c4qh, 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new InterfaceC28011Xf(c4qh) { // from class: X.4QK
            public final C4QH A00;

            @Override // X.InterfaceC28011Xf
            public final /* synthetic */ boolean AC7(C108104tt c108104tt) {
                return true;
            }

            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C38321qM c38321qM;
                C38321qM A02;
                Long BLz;
                C3XG c3xg = (C3XG) obj;
                if (c3xg != null) {
                    c38321qM = C3XH.A02(c3xg.A05);
                } else {
                    c38321qM = null;
                }
                if (c38321qM == null || (A02 = C3XH.A02(c3xg.A05)) == null || (BLz = A02.A0C.BLz()) == null) {
                    return false;
                }
                long longValue = BLz.longValue();
                C4QH c4qh2 = this.A00;
                long currentTimeMillis = System.currentTimeMillis();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                if (longValue <= currentTimeMillis - timeUnit.toMillis(c4qh2.A00) || longValue >= currentTimeMillis - timeUnit.toMillis(c4qh2.A01)) {
                    return false;
                }
                return true;
            }

            {
                this.A00 = c4qh;
            }
        });
        arrayList2.add(new InterfaceC28011Xf(set) { // from class: X.4QL
            public final java.util.Set A00;

            @Override // X.InterfaceC28011Xf
            public final boolean AC7(C108104tt c108104tt) {
                C14360o3.A0B(c108104tt, 0);
                return !this.A00.contains(c108104tt.A04);
            }

            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                C38321qM A02;
                C3XG c3xg = (C3XG) obj;
                if (c3xg != null && (A02 = C3XH.A02(c3xg.A05)) != null) {
                    return !AbstractC001800i.A0u(this.A00, A02.getId());
                }
                return false;
            }

            {
                this.A00 = set;
            }
        });
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(c61982rz.A00);
        arrayList3.addAll(arrayList2);
        if (interfaceC28041Xi != null) {
            arrayList3.add(interfaceC28041Xi);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3XG c3xg = (C3XG) it.next();
            List A0a = AbstractC001800i.A0a(arrayList3);
            C14360o3.A0B(c3xg, 0);
            Iterator it2 = A0a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((InterfaceC28041Xi) it2.next()).apply(c3xg)) {
                        break;
                    }
                } else if (!z || !C3YW.A02(c3xg)) {
                    arrayList.add(c3xg);
                    if (arrayList.size() == i) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean A02() {
        boolean z;
        synchronized (this.A02) {
            z = !this.A04.isEmpty();
        }
        return z;
    }

    public C61982rz(List list) {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "FeedPool-worker";
        this.A01 = new C18240vB(A00);
        this.A00 = list;
    }

    public final void A01(UserSession userSession, List list) {
        System.currentTimeMillis();
        synchronized (this.A02) {
            Map map = this.A04;
            map.clear();
            Map map2 = this.A03;
            map2.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3XG c3xg = (C3XG) it.next();
                C38321qM A02 = C3XH.A02(c3xg.A05);
                if (A02 != null) {
                    C1XV c1xv = c3xg.A06;
                    if ((c1xv == C1XV.A0Y || (C1XT.A03(userSession) && (c1xv == C1XV.A0a || C3YW.A02(c3xg)))) && !A02.CdW()) {
                        map.put(c3xg.A09, c3xg);
                    }
                    if (c1xv == C1XV.A0H && !A02.CdW()) {
                        map2.put(c3xg.A09, c3xg);
                    }
                }
            }
            map.size();
            map2.size();
            System.currentTimeMillis();
        }
    }
}
