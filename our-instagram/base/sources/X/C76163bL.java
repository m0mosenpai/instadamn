package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76163bL {
    public static final C76163bL A01 = new Object();
    public static final int A00 = AbstractC75953b0.A00;

    public static final C2W1 A02(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C76133bI c76133bI) {
        C14360o3.A0B(c76133bI, 0);
        int i = A00;
        return A04(abstractC50812Vc, c2xe, c76133bI, null, null, i, i, false);
    }

    public static final C2W1 A03(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C76133bI c76133bI) {
        C2W1 c2w1 = c76133bI.A07;
        C76163bL c76163bL = A01;
        C75803al c75803al = c76133bI.A00;
        boolean z = false;
        if (c2w1 != null && (c75803al.A05.A07() || c75803al.A04.A07())) {
            AbstractC50812Vc A02 = c2w1.A02();
            if (C14360o3.A0K(abstractC50812Vc.A0I(), A02.A0I()) && (A02 == abstractC50812Vc || C14360o3.A0K(A02.getClass(), abstractC50812Vc.getClass()))) {
                z = C51372Xk.A04(A02, abstractC50812Vc, C2V3.shouldCompareCommonPropsInIsEquivalentTo);
            }
        }
        try {
            c75803al.A02(abstractC50812Vc, c2xe, c2w1, false);
            if (!z) {
                C2W1 A022 = A02(abstractC50812Vc, c2xe, c76133bI);
                if (A022 != null) {
                    if (!c76133bI.A00()) {
                        C78243eq c78243eq = C78233ep.A01;
                        Context context = c2xe.A0C;
                        C14360o3.A07(context);
                        A022.A0D(c76133bI, c78243eq.A00(context), 0, 0, true);
                    }
                    if (c76133bI.A00()) {
                        return A022;
                    }
                }
                c76133bI.A02 = false;
                return A022;
            }
            if (c2w1 != null) {
                String A08 = ((C2Y5) c2w1.A0u.get(r2.size() - 1)).A04.A08();
                HashSet hashSet = new HashSet();
                hashSet.addAll(c75803al.A05.A03());
                hashSet.addAll(c75803al.A04.A03());
                return c76163bL.A01(abstractC50812Vc, c2xe, c2w1, null, c76133bI, A08, hashSet);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            C51372Xk.A01(abstractC50812Vc, c2xe, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3ew, java.lang.Object] */
    public static final C78323ey A05(C2W1 c2w1) {
        if (c2w1 != null) {
            ArrayList arrayList = new ArrayList();
            ?? obj = new Object();
            A01.A09(c2w1, obj, arrayList);
            if (!arrayList.isEmpty() || !AbstractC79423gp.A00(obj)) {
                return new C78323ey(obj, arrayList);
            }
        }
        return null;
    }

    public static final void A06(C2W1 c2w1, C76133bI c76133bI) {
        C14360o3.A0B(c76133bI, 0);
        C14360o3.A0B(c2w1, 1);
        List list = c2w1.A0f;
        if (list != null) {
            C2XE A05 = c2w1.A05();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c2w1.A0E((AbstractC50812Vc) it.next(), A05, c76133bI);
            }
            list.clear();
        }
        int size = c2w1.A0h.size();
        for (int i = 0; i < size; i++) {
            A06((C2W1) c2w1.A0h.get(i), c76133bI);
        }
        C78243eq c78243eq = C78233ep.A01;
        Context context = c2w1.A04().A0C;
        C14360o3.A07(context);
        c2w1.A0D(c76133bI, c78243eq.A00(context), 0, 0, true);
    }

    public static final void A08(C2W1 c2w1, C75803al c75803al) {
        C14360o3.A0B(c2w1, 1);
        int size = c2w1.A0h.size();
        A07(c2w1, c75803al);
        for (int i = 0; i < size; i++) {
            A08((C2W1) c2w1.A0h.get(i), c75803al);
        }
    }

    public static final C2XE A00(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C76133bI c76133bI, C2XU c2xu, String str) {
        C2XO c2xo;
        Map map;
        C77083cu c77083cu;
        Object obj;
        if (str == null) {
            str = C2XX.A00(c2xe.A01, abstractC50812Vc, c2xe);
        }
        C2XE A002 = C2XE.A00(abstractC50812Vc, c2xe, str);
        if (abstractC50812Vc instanceof AbstractC50792Va) {
            AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
            if (abstractC50792Va.A12()) {
                C2Y5 c2y5 = A002.A05;
                c2y5.getClass();
                C75803al c75803al = c76133bI.A00;
                C14360o3.A0B(str, 2);
                if (A002.A0A) {
                    c2xo = c75803al.A04;
                } else {
                    c2xo = c75803al.A05;
                }
                synchronized (c2xo) {
                    map = c2xo.A08;
                    c77083cu = (C77083cu) map.get(str);
                }
                if (c77083cu != null) {
                    c2xo.A03.add(str);
                } else {
                    C2XJ c2xj = c2xo.A00;
                    synchronized (c2xj) {
                        Map map2 = c2xj.A01;
                        obj = map2.get(str);
                        if (obj == null) {
                            obj = new Object();
                            map2.put(str, obj);
                        }
                    }
                    synchronized (obj) {
                        Map map3 = c2xj.A02;
                        C14360o3.A06(map3);
                        Object obj2 = map3.get(str);
                        if (obj2 == null) {
                            boolean isTracing = ComponentsSystrace.A00.isTracing();
                            if (isTracing) {
                                ComponentsSystrace.A02(AnonymousClass001.A0R("create-initial-state:", abstractC50812Vc.A0H()));
                            }
                            AbstractC50922Vo A0g = abstractC50792Va.A0g();
                            abstractC50792Va.A0x(A002, A0g);
                            C14360o3.A07(A0g);
                            if (isTracing) {
                                ComponentsSystrace.A01();
                            }
                            obj2 = new C77083cu(null, A0g);
                            map3.put(str, obj2);
                        }
                        c77083cu = (C77083cu) obj2;
                    }
                    C14360o3.A05(c77083cu);
                    synchronized (c2xo) {
                        c2xo.A03.add(str);
                        map.put(str, c77083cu);
                    }
                }
                c2y5.A02 = c77083cu;
            }
            C2XU c2xu2 = c2xe.A07;
            A002.A06 = c2xu2;
            if (c2xu == null) {
                c2xu = c2xu2;
            }
            A002.A07 = c2xu;
        }
        return A002;
    }

    private final C2W1 A01(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, C2W1 c2w12, C76133bI c76133bI, String str, java.util.Set set) {
        int A012;
        int i;
        C76133bI c76133bI2;
        int i2;
        int i3;
        boolean z;
        List list = c2w1.A0u;
        if (!(c2w1 instanceof C78313ex)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (set.contains(((C2Y5) it.next()).A04.A08())) {
                }
            }
            String A08 = ((C2Y5) list.get(list.size() - 1)).A04.A08();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (AbstractC002300n.A0h((String) it2.next(), A08, false)) {
                    boolean isTracing = ComponentsSystrace.A00.isTracing();
                    if (isTracing) {
                        ComponentsSystrace.A02(AnonymousClass001.A0R("reconcile:", abstractC50812Vc.A0H()));
                    }
                    C2W1 clone = c2w1.clone();
                    clone.A0h = new ArrayList(c2w1.A0h.size());
                    clone.A0j = null;
                    A07(c2w1, c76133bI.A00);
                    C2XE A05 = clone.A05();
                    int size = c2w1.A0h.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C2W1 c2w13 = (C2W1) c2w1.A0h.get(i4);
                        List list2 = c2w13.A0u;
                        int max = Math.max(0, list2.size() - 1);
                        C2W1 A013 = A01(((C2Y5) list2.get(max)).A03, A05, c2w13, c2w1, c76133bI, c2w13.A0B(max), set);
                        if (A013 != null) {
                            clone.A0h.add(clone.A0h.size(), A013);
                        }
                    }
                    if (isTracing) {
                        ComponentsSystrace.A01();
                    }
                    return clone;
                }
            }
            A08(c2w1, c76133bI.A00);
            return c2w1;
        }
        ThreadLocal threadLocal = c2xe.A0E;
        Object obj = threadLocal.get();
        Object obj2 = null;
        if (obj instanceof C76133bI) {
            obj2 = obj;
        }
        threadLocal.set(c76133bI);
        try {
            int i5 = A00;
            C2W1 A04 = A04(abstractC50812Vc, c2xe, c76133bI, null, str, i5, i5, false);
            if (A04 != null) {
                if (c2w12 == null) {
                    C78243eq c78243eq = C78233ep.A01;
                    Context context = c2xe.A0C;
                    C14360o3.A07(context);
                    A012 = c78243eq.A00(context);
                    z = true;
                    c76133bI2 = c76133bI;
                    i2 = 0;
                    i3 = 0;
                } else {
                    A012 = c2w12.A01();
                    int i6 = c2w12.A03;
                    C50952Vr c50952Vr = c2w12.A0M;
                    if (c50952Vr != null) {
                        i = c50952Vr.A0B;
                    } else {
                        i = 0;
                    }
                    c76133bI2 = c76133bI;
                    i2 = i6;
                    i3 = i;
                    z = c2w12.A0m;
                }
                A04.A0D(c76133bI2, A012, i2, i3, z);
                return A04;
            }
            return A04;
        } finally {
            threadLocal.set(obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x017e, code lost:
    
        if (r4 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0193, code lost:
    
        if (r20 == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0105, code lost:
    
        if (r30 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0227, code lost:
    
        if (r30 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0385, code lost:
    
        if (r4 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0389, code lost:
    
        if ((r23 instanceof X.AbstractC50792Va) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x038b, code lost:
    
        r4 = ((X.AbstractC50792Va) r23).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0392, code lost:
    
        if ((r0 instanceof X.C78073eZ) != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0394, code lost:
    
        if (r4 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0396, code lost:
    
        if (r14 == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0398, code lost:
    
        if (r30 != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x039a, code lost:
    
        r4.A0N(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x039d, code lost:
    
        r2.A00 = r4;
        r0.A0F(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03a4, code lost:
    
        if ((r23 instanceof X.AbstractC50792Va) == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03a6, code lost:
    
        r11 = (X.AbstractC50792Va) r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03ac, code lost:
    
        if (r11.A10() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03ae, code lost:
    
        r5 = new X.C51162Wn(r2, r11, r3);
        r1 = r0.A0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03b5, code lost:
    
        if (r1 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03b7, code lost:
    
        r1 = new java.util.ArrayList(4);
        r0.A0d = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03be, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03c1, code lost:
    
        r2.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03c4, code lost:
    
        if (r4 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03c6, code lost:
    
        r1 = r4.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03c8, code lost:
    
        if (r1 == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03ca, code lost:
    
        r1 = r1.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03cc, code lost:
    
        r0.A0G(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03dc, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03cf, code lost:
    
        if (r20 == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03d1, code lost:
    
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03d6, code lost:
    
        if (r20 != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
    
        if (r20 == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0056, code lost:
    
        if (r30 != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0353 A[LOOP:4: B:225:0x034d->B:227:0x0353, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2W1 A04(X.AbstractC50812Vc r23, X.C2XE r24, X.C76133bI r25, X.C2XU r26, java.lang.String r27, int r28, int r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76163bL.A04(X.2Vc, X.2XE, X.3bI, X.2XU, java.lang.String, int, int, boolean):X.2W1");
    }

    public static final void A07(C2W1 c2w1, C75803al c75803al) {
        C2XO c2xo;
        Iterator it = c2w1.A0u.iterator();
        while (it.hasNext()) {
            C2XE c2xe = ((C2Y5) it.next()).A04;
            String A08 = c2xe.A08();
            if (c2xe.A0A) {
                c2xo = c75803al.A04;
            } else {
                c2xo = c75803al.A05;
            }
            c2xo.A03.add(A08);
        }
    }

    private final void A09(C2W1 c2w1, C78303ew c78303ew, List list) {
        C78303ew c78303ew2;
        int size = c2w1.A0h.size();
        for (int i = 0; i < size; i++) {
            A09((C2W1) c2w1.A0h.get(i), c78303ew, list);
        }
        List list2 = c2w1.A0d;
        if (list2 != null) {
            list.addAll(list2);
        }
        if (c2w1.A05().A02.A02 && !(c2w1 instanceof C78313ex) && (c78303ew2 = c2w1.A0Q) != null) {
            c78303ew.A00(c78303ew2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3ew, java.lang.Object] */
    public static final void A0A(C2W1 c2w1, C78303ew c78303ew, List list) {
        if (c78303ew != null) {
            C78303ew c78303ew2 = c2w1.A0Q;
            C78303ew c78303ew3 = c78303ew2;
            if (c78303ew2 == null) {
                ?? obj = new Object();
                c2w1.A0Q = obj;
                c78303ew3 = obj;
            }
            c78303ew3.A00(c78303ew);
        }
        if (list != null) {
            for (Object obj2 : list) {
                C14360o3.A0B(obj2, 0);
                List list2 = c2w1.A0d;
                if (list2 == null) {
                    list2 = new ArrayList(4);
                    c2w1.A0d = list2;
                }
                list2.add(obj2);
            }
        }
    }
}
