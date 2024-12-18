package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WG5 {
    public final Map A00 = new HashMap();

    public static final void A01(WG5 wg5, int i, boolean z) {
        if (i != -1) {
            Map map = wg5.A00;
            synchronized (map) {
                C69578Vrh c69578Vrh = (C69578Vrh) AbstractC166997dE.A0m(map, i);
                if (c69578Vrh != null) {
                    java.util.Set set = c69578Vrh.A02;
                    if (!set.contains("is_success")) {
                        C006802i.A0p.markerAnnotate(c69578Vrh.A00, "is_success", z);
                        set.add("is_success");
                    }
                }
            }
        }
    }

    public static final void A04(WG5 wg5, String str, int i) {
        if (i != -1) {
            Map map = wg5.A00;
            synchronized (map) {
                C69578Vrh c69578Vrh = (C69578Vrh) AbstractC166997dE.A0m(map, i);
                if (c69578Vrh != null) {
                    C006802i.A0p.markerPoint(c69578Vrh.A00, str);
                }
            }
        }
    }

    public static final void A00(WG5 wg5, int i) {
        Map map = wg5.A00;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C69578Vrh c69578Vrh = (C69578Vrh) map.remove(valueOf);
            C14360o3.A0A(c69578Vrh);
            C006802i.A0p.markerPoint(c69578Vrh.A00, "NEW_START_FOUND");
            c69578Vrh.A00();
        }
        C69578Vrh c69578Vrh2 = new C69578Vrh(i);
        map.put(valueOf, c69578Vrh2);
        C006802i c006802i = C006802i.A0p;
        int i2 = c69578Vrh2.A00;
        c006802i.markerStart(i2);
        C006802i.A0p.markerAnnotate(i2, "hashtag_version", "v3");
    }

    public static final void A02(WG5 wg5, String str) {
        Map map = wg5.A00;
        synchronized (map) {
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                C69578Vrh c69578Vrh = (C69578Vrh) A16.next();
                java.util.Set set = c69578Vrh.A02;
                if (!set.contains("is_success")) {
                    C006802i.A0p.markerAnnotate(c69578Vrh.A00, "is_success", false);
                    set.add("is_success");
                }
                String str2 = str;
                C006802i c006802i = C006802i.A0p;
                int i = c69578Vrh.A00;
                if (str == null) {
                    str2 = "Unknown";
                }
                c006802i.markerPoint(i, "EXIT_NAVIGATION", str2);
                c69578Vrh.A00();
            }
            map.clear();
        }
    }

    public static final void A03(WG5 wg5, String str, int i) {
        Map map = wg5.A00;
        synchronized (map) {
            A00(wg5, i);
            Object A0m = AbstractC166997dE.A0m(map, i);
            C14360o3.A0A(A0m);
            ((C69578Vrh) A0m).A01.put("tab", str);
        }
    }

    public static final void A05(WG5 wg5, String str, int i) {
        Map map = wg5.A00;
        synchronized (map) {
            C69578Vrh c69578Vrh = (C69578Vrh) AbstractC166997dE.A0m(map, i);
            if (c69578Vrh != null) {
                C006802i c006802i = C006802i.A0p;
                int i2 = c69578Vrh.A00;
                c006802i.markerPoint(i2, str);
                c69578Vrh.A00();
                map.remove(Integer.valueOf(i2));
            }
        }
    }
}
