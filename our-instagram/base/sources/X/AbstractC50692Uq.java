package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50692Uq {
    public static final AtomicReference A03 = new AtomicReference(EnumC50702Ur.A02);
    public static final java.util.Set A00 = new CopyOnWriteArraySet();
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public static final Map A01 = new HashMap();

    public static final EnumC50702Ur A00() {
        Object obj = A03.get();
        C14360o3.A07(obj);
        return (EnumC50702Ur) obj;
    }

    public static final Integer A01(String str) {
        java.util.Set set = A00;
        if (!set.isEmpty()) {
            if ((set instanceof Collection) && set.isEmpty()) {
                return null;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String[] strArr = ((AbstractC50682Uo) it.next()).A00;
                if (AbstractC009903n.A0O(str, strArr) || AbstractC009903n.A0O("*", strArr)) {
                    return Integer.valueOf(A02.getAndIncrement());
                }
            }
            return null;
        }
        return null;
    }

    public static final void A02(int i) {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A03(i, c16920sk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public static final void A03(int i, Map map) {
        C47803L9l c47803L9l = (C47803L9l) A01.remove(Integer.valueOf(i));
        if (c47803L9l != null) {
            String str = c47803L9l.A03;
            java.util.Set set = A00;
            if (!set.isEmpty()) {
                ?? r2 = 0;
                for (Object obj : set) {
                    String[] strArr = ((AbstractC50682Uo) obj).A00;
                    if (AbstractC009903n.A0O(str, strArr) || AbstractC009903n.A0O("*", strArr)) {
                        if (r2 == 0) {
                            r2 = new ArrayList();
                        }
                        r2.add(obj);
                    }
                }
                if (r2 == 0) {
                    r2 = C16930sl.A00;
                }
                if (!r2.isEmpty()) {
                    long nanoTime = System.nanoTime();
                    long j = c47803L9l.A01;
                    R6Z r6z = new R6Z(str, c47803L9l.A02, AbstractC06930Yk.A04(c47803L9l.A04, map), j, nanoTime - c47803L9l.A00);
                    Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC50682Uo) it.next()).A00(r6z);
                    }
                }
            }
        }
    }

    public static final void A06(String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        interfaceC16660sJ.invoke(linkedHashMap);
        A05(str, str2, linkedHashMap, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0sJ] */
    public static final void A04(EnumC50702Ur enumC50702Ur, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        long currentTimeMillis = System.currentTimeMillis();
        if (enumC50702Ur.compareTo(A00()) >= 0) {
            java.util.Set set = A00;
            if (!set.isEmpty()) {
                ?? r0 = 0;
                for (Object obj : set) {
                    String[] strArr = ((AbstractC50682Uo) obj).A00;
                    if (AbstractC009903n.A0O(str, strArr) || AbstractC009903n.A0O("*", strArr)) {
                        if (r0 == 0) {
                            r0 = new ArrayList();
                        }
                        r0.add(obj);
                    }
                }
                if (r0 == 0) {
                    r0 = C16930sl.A00;
                }
                if (!r0.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC16660sJ.invoke(linkedHashMap);
                    C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str, (String) interfaceC16820sZ.invoke(), linkedHashMap);
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        ((AbstractC50682Uo) it.next()).A00(c58571Pxp);
                    }
                }
            }
        }
    }

    public static final void A05(String str, String str2, Map map, int i) {
        A01.put(Integer.valueOf(i), new C47803L9l(str, map, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0sJ] */
    public static final void A07(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        long currentTimeMillis = System.currentTimeMillis();
        if (EnumC50702Ur.A02.compareTo(A00()) >= 0) {
            java.util.Set set = A00;
            if (!set.isEmpty()) {
                ?? r0 = 0;
                for (Object obj : set) {
                    String[] strArr = ((AbstractC50682Uo) obj).A00;
                    if (AbstractC009903n.A0O(str, strArr) || AbstractC009903n.A0O("*", strArr)) {
                        if (r0 == 0) {
                            r0 = new ArrayList();
                        }
                        r0.add(obj);
                    }
                }
                if (r0 == 0) {
                    r0 = C16930sl.A00;
                }
                if (!r0.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC16660sJ.invoke(linkedHashMap);
                    C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str, (String) interfaceC16820sZ.invoke(), linkedHashMap);
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        ((AbstractC50682Uo) it.next()).A00(c58571Pxp);
                    }
                }
            }
        }
    }
}
