package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4S0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S0 {
    public static C4S1 A00;
    public static C4S2 A01;
    public static String A02;
    public static WeakReference A03;
    public static boolean A04;
    public static final C4S0 A05 = new Object();
    public static final Map A07 = new LinkedHashMap();
    public static final Map A06 = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4S0, java.lang.Object] */
    static {
        C4S1 c4s1 = new C4S1(false, false, false, false, false);
        c4s1.A00 = true;
        A00 = c4s1;
    }

    public static final String A00(View view, String str) {
        int i;
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        if (A04) {
            return AnonymousClass001.A0G(str, '_', i);
        }
        return str;
    }

    public static final void A01(View view, String str, long j) {
        if (str != null) {
            C5RC c5rc = (C5RC) A07.get(A00(view, str));
            if (c5rc != null) {
                L5N l5n = c5rc.A03;
                C95744Si c95744Si = l5n.A01;
                if (c95744Si == null) {
                    c95744Si = new C95744Si(str);
                    l5n.A01 = c95744Si;
                }
                long A002 = C5RC.A00();
                long currentTimeMillis = System.currentTimeMillis();
                XNT xnt = new XNT(j, j, currentTimeMillis);
                if (l5n.A00 >= 50 && c5rc.A04) {
                    xnt.A04 = currentTimeMillis * 100;
                }
                c95744Si.A03(xnt);
                if (!l5n.A0B) {
                    l5n.A0B = true;
                    c5rc.A02 = false;
                    l5n.A03 = Long.valueOf(A002);
                    C5RC.A02(c5rc, AbstractC43591JPw.A00(1400), l5n.A00, j, A002);
                }
            }
        }
    }

    public static final boolean A03() {
        C4S1 c4s1 = A00;
        if (!c4s1.A04 && !c4s1.A05) {
            return false;
        }
        return true;
    }

    public final void A04(String str, String str2) {
        List singletonList;
        if (A04) {
            java.util.Set keySet = A07.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                String str3 = (String) obj;
                if (AbstractC002300n.A0h(str3, str, false)) {
                    int length = str3.length();
                    int length2 = str.length();
                    if (length > length2 && str3.charAt(length2) == '_') {
                        arrayList.add(obj);
                    }
                }
            }
            singletonList = AbstractC001800i.A0a(arrayList);
        } else {
            singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
        }
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            C5RC c5rc = (C5RC) A07.get(it.next());
            if (c5rc != null) {
                c5rc.A03.A05 = str2;
            }
        }
    }

    public final void A05(String str, String str2) {
        if (A04) {
            str = str2;
        }
        Map map = A07;
        C5RC c5rc = (C5RC) map.get(str);
        if (c5rc != null) {
            if (c5rc.A01) {
                map.remove(str);
            } else {
                c5rc.A02 = true;
            }
        }
    }

    public static final void A02(String str, View view) {
        C5RC c5rc = (C5RC) A07.get(A00(view, str));
        if (c5rc != null) {
            long A012 = C5RC.A01(c5rc, str);
            long A002 = C5RC.A00();
            L5N l5n = c5rc.A03;
            List list = l5n.A07;
            Long valueOf = Long.valueOf(A002);
            list.add(valueOf);
            C5RC.A02(c5rc, "paused", l5n.A00, A012, A002);
            l5n.A09.put(valueOf, Long.valueOf(A012));
        }
    }
}
