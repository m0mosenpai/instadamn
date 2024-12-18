package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40051tW {
    public static final C84923qg A00(C40061tX c40061tX, String str, boolean z) {
        C14360o3.A0B(c40061tX, 0);
        for (C84923qg c84923qg : c40061tX.A00) {
            if (!C14360o3.A0K(str, c84923qg.A0G)) {
                if (z && c84923qg.A01 > 0) {
                    for (C84923qg c84923qg2 : c84923qg2.A0L) {
                        if (C14360o3.A0K(str, c84923qg2.A0G)) {
                        }
                    }
                }
            }
            return c84923qg2;
        }
        return null;
    }

    public static final void A05(C38321qM c38321qM, Collection collection) {
        synchronized (collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((C84923qg) it.next()).A01(c38321qM);
            }
        }
    }

    public static final C40061tX A01(C40061tX c40061tX) {
        C40061tX c40061tX2 = new C40061tX();
        for (C84923qg c84923qg : c40061tX.A00) {
            if (c84923qg.A06.A00()) {
                c40061tX2.A02(c84923qg);
            }
        }
        return c40061tX2;
    }

    public static final void A02(C40061tX c40061tX) {
        int i = 0;
        for (C84923qg c84923qg : c40061tX.A00) {
            if (c84923qg.A06.A00()) {
                c84923qg.A0B = String.valueOf(i);
                i++;
            }
        }
    }

    public static final void A03(C40061tX c40061tX, EnumC166477cG enumC166477cG, C38321qM c38321qM, List list, boolean z) {
        if (list != null) {
            A05(c38321qM, list);
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (C84923qg c84923qg : c40061tX.A00) {
                    EnumC84933qh enumC84933qh = c84923qg.A06;
                    if (enumC84933qh == EnumC84933qh.A07 || enumC84933qh == EnumC84933qh.A06) {
                        arrayList.add(c84923qg);
                    }
                }
                c40061tX.A01();
            }
            if (enumC166477cG == EnumC166477cG.A05) {
                int size = list.size();
                while (size > 0) {
                    size--;
                    c40061tX.A03((C84923qg) list.get(size));
                }
            } else {
                c40061tX.A04(list);
            }
            if (enumC166477cG == EnumC166477cG.A04) {
                c40061tX.A04(arrayList);
            }
        }
    }

    public static final void A04(C40061tX c40061tX, String str) {
        if (c40061tX != null) {
            C14360o3.A0B(str, 0);
            java.util.Set set = c40061tX.A02;
            if (set.contains(str)) {
                set.remove(str);
                List list = c40061tX.A00;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C84923qg c84923qg = (C84923qg) it.next();
                    String str2 = c84923qg.A0G;
                    if (str2 != null && str2.equals(str)) {
                        c40061tX.A01.remove(c84923qg.A00());
                        list.remove(c84923qg);
                        break;
                    }
                }
            }
            A02(c40061tX);
        }
    }
}
