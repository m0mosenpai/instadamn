package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1AB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AB {
    public final C229419w A00;

    public final TreeMap A02(boolean z) {
        C229419w c229419w = this.A00;
        C5F7 A0B = c229419w.A0B();
        TreeMap treeMap = new TreeMap();
        if (A0B != null) {
            HashSet hashSet = null;
            if (z) {
                hashSet = new HashSet();
                for (int i : c229419w.A0I()) {
                    hashSet.add(Integer.valueOf(i));
                }
            }
            List list = A0B.A03;
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < list.size(); i4++) {
                C5NW c5nw = (C5NW) list.get(i4);
                if (i2 != c5nw.A03) {
                    if (i2 > 0) {
                        A01(c229419w, list, treeMap, hashSet, c229419w.A06, i3, i4);
                    }
                    i2 = c5nw.A03;
                    i3 = i4;
                }
            }
            A01(c229419w, list, treeMap, hashSet, c229419w.A06, i3, list.size());
        }
        return treeMap;
    }

    public static Object A00(InterfaceC10260gi interfaceC10260gi, C06090Tz c06090Tz, C5NW c5nw, long j) {
        Object obj;
        int i = c5nw.A06;
        if (i == 1) {
            obj = Integer.valueOf(interfaceC10260gi.AhF(c06090Tz, j, true) ? 1 : 0);
        } else if (i == 2) {
            obj = Long.valueOf(interfaceC10260gi.BPE(c06090Tz, j, 20210614L));
        } else if (i == 3) {
            obj = interfaceC10260gi.C2y(c06090Tz, "20210614", j);
        } else if (i == 4) {
            obj = Double.valueOf(interfaceC10260gi.AzA(c06090Tz, 2021.0614d, j));
        } else {
            C0K8.A0Q("MobileConfigFunctions", "Caught unsupported type %d for config %s, param %s in IG consistency logging", Integer.valueOf(i), c5nw.A00, c5nw.A01);
            obj = null;
        }
        MobileConfigValueSource mobileConfigValueSource = c06090Tz.A00.A00;
        if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.OVERRIDE) {
            return null;
        }
        return obj;
    }

    private void A01(InterfaceC10260gi interfaceC10260gi, List list, Map map, java.util.Set set, int i, int i2, int i3) {
        if (i2 < i3) {
            C5NW c5nw = (C5NW) list.get(i2);
            if (c5nw.A08 == i) {
                if (set != null && !set.contains(Integer.valueOf(c5nw.A02))) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                C06090Tz A00 = C06090Tz.A00(new C06090Tz());
                A00.A03 = true;
                C06090Tz A002 = C06090Tz.A00(A00);
                A002.A02 = true;
                while (i2 < i3) {
                    C5NW c5nw2 = (C5NW) list.get(i2);
                    Object A003 = A00(interfaceC10260gi, A002, c5nw2, c5nw2.A00());
                    if (A003 != null) {
                        Integer valueOf = Integer.valueOf(c5nw2.A04);
                        arrayList.add(StringFormatUtil.formatStrLocaleSafe("%d: _%d: %s", valueOf, valueOf, A003));
                    }
                    i2++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Integer valueOf2 = Integer.valueOf(c5nw.A03);
                map.put(StringFormatUtil.formatStrLocaleSafe("%d:_%d", valueOf2, valueOf2), arrayList);
            }
        }
    }

    public final void A03(boolean z) {
        C229419w c229419w = this.A00;
        c229419w.A0C();
        c229419w.A0A().fetchNames(z, new C124205jZ(this, 0, z));
    }

    public C1AB(C229419w c229419w) {
        this.A00 = c229419w;
    }
}
