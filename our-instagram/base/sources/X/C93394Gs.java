package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93394Gs {
    public static final C93444Gx A00 = new C93444Gx(C93434Gw.A00, C93404Gt.A00);
    public static final Comparator A02 = C93464Gz.A00;
    public static final Comparator A03 = C4H0.A00;
    public static final Comparator A05 = C4H1.A00;
    public static final Comparator A01 = C4H2.A00;
    public static final Comparator A04 = C4H3.A00;

    public static final int A01(String str, List list) {
        C14360o3.A0B(list, 0);
        if (str == null) {
            return 0;
        }
        int A002 = A00(str, list);
        int i = A002 ^ (-1);
        if (A002 >= 0) {
            return A002 + 1;
        }
        return i;
    }

    public static final String A03(String str, List list) {
        if (!list.isEmpty()) {
            String A0h = ((C83403nh) list.get(list.size() - 1)).A0h();
            if (str == null || (A0h != null && A02.compare(str, A0h) <= 0)) {
                return A0h;
            }
        }
        return str;
    }

    public static final String A04(String str, List list) {
        if (!list.isEmpty()) {
            String A0h = ((C83403nh) list.get(0)).A0h();
            if (str == null || (A0h != null && A02.compare(str, A0h) >= 0)) {
                return A0h;
            }
        }
        return str;
    }

    public static final boolean A07(String str, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(str, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            if (str.equals(c83403nh.A0h()) || str.equals(c83403nh.A0g())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public static final int A00(String str, List list) {
        if ("MINCURSOR".equals(str)) {
            return -1;
        }
        if ("MAXCURSOR".equals(str)) {
            return list.size() ^ (-1);
        }
        C83403nh c83403nh = new C83403nh();
        c83403nh.A1F(str);
        return Collections.binarySearch(list, c83403nh, A04);
    }

    public static final C4H4 A02(K8O k8o) {
        boolean z;
        String str = k8o.A03;
        String str2 = k8o.A02;
        C93404Gt c93404Gt = C93404Gt.A00;
        boolean z2 = false;
        if (str != null) {
            z2 = true;
        }
        String A012 = C93404Gt.A01(str, z2, true);
        Boolean bool = k8o.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new C4H4(c93404Gt, A012, C93404Gt.A00(str2, z));
    }

    public static final void A06(FNP fnp, C83403nh c83403nh, List list, int i) {
        if (c83403nh != null && c83403nh.A0h() != null && c83403nh.A1j != null) {
            String A0h = c83403nh.A0h();
            String str = "";
            if (A0h == null) {
                A0h = "";
            }
            fnp.A02 = A0h;
            String str2 = c83403nh.A1j;
            if (str2 != null) {
                str = str2;
            }
            fnp.A03 = str;
        }
        fnp.A00 = i;
        list.add(fnp);
    }

    public static final String A05(Map map) {
        C9CG c9cg;
        String str;
        Collection<C80993jT> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (C80993jT c80993jT : values) {
            if (c80993jT != null && (c9cg = c80993jT.A01) != null && (str = c9cg.A02) != null) {
                arrayList.add(str);
            }
        }
        return (String) AbstractC001800i.A06(arrayList);
    }
}
