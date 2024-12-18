package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75803al {
    public final C51182Wr A00;
    public final C2XL A01;
    public final C2XM A02;
    public final C2X4 A03;
    public final C2XO A04;
    public final C2XO A05;
    public final C75823an A06;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r6 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r10.A03;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r5 = new X.C2X4(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r10 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = r10.A00;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r3 = r10.A02;
        r4 = r4;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r3 = new java.lang.Object();
        r3 = r3;
        r4 = r4;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r2 = new X.C2XL();
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r8.A00 == r7.A00) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r9.A05 = r8;
        r9.A04 = r7;
        r9.A06 = r6;
        r9.A03 = r5;
        r9.A00 = r4;
        r9.A02 = r3;
        r9.A01 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        throw new java.lang.IllegalArgumentException("The same InitialState cannot be used for both resolve and layout states");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        r2 = r10.A01;
        r3 = r3;
        r4 = r4;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        r4 = new java.lang.Object();
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        if (r10 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x001e, code lost:
    
        if (r10 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C75803al(X.C75803al r10) {
        /*
            r9 = this;
            r1 = 0
            if (r10 == 0) goto L62
            X.2XO r0 = r10.A05
        L5:
            X.2XO r8 = new X.2XO
            r8.<init>(r0)
            if (r10 == 0) goto L60
            X.2XO r0 = r10.A04
        Le:
            X.2XO r7 = new X.2XO
            r7.<init>(r0)
            if (r10 == 0) goto L19
            X.3an r6 = r10.A06
            if (r6 != 0) goto L20
        L19:
            X.3an r6 = new X.3an
            r6.<init>()
            if (r10 == 0) goto L22
        L20:
            X.2X4 r1 = r10.A03
        L22:
            X.2X4 r5 = new X.2X4
            r5.<init>(r1)
            if (r10 == 0) goto L2d
            X.2Wr r4 = r10.A00
            if (r4 != 0) goto L34
        L2d:
            X.2Wr r4 = new X.2Wr
            r4.<init>()
            if (r10 == 0) goto L38
        L34:
            X.2XM r3 = r10.A02
            if (r3 != 0) goto L3f
        L38:
            X.2XM r3 = new X.2XM
            r3.<init>()
            if (r10 == 0) goto L43
        L3f:
            X.2XL r2 = r10.A01
            if (r2 != 0) goto L48
        L43:
            X.2XL r2 = new X.2XL
            r2.<init>()
        L48:
            r9.<init>()
            X.2XJ r1 = r8.A00
            X.2XJ r0 = r7.A00
            if (r1 == r0) goto L64
            r9.A05 = r8
            r9.A04 = r7
            r9.A06 = r6
            r9.A03 = r5
            r9.A00 = r4
            r9.A02 = r3
            r9.A01 = r2
            return
        L60:
            r0 = r1
            goto Le
        L62:
            r0 = r1
            goto L5
        L64:
            java.lang.String r1 = "The same InitialState cannot be used for both resolve and layout states"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75803al.<init>(X.3al):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public final Object A00(Object obj, String str, int i, boolean z) {
        C2XO c2xo;
        Object obj2;
        C77223d8 c77223d8;
        C14360o3.A0B(obj, 2);
        if (z) {
            c2xo = this.A04;
        } else {
            c2xo = this.A05;
        }
        synchronized (c2xo) {
            C77203d6 c77203d6 = new C77203d6(str, i);
            Map map = c2xo.A02;
            obj2 = null;
            if (map != null && (c77223d8 = (C77223d8) map.get(c77203d6)) != null && AbstractC78713fd.A02(c77223d8.A01, obj)) {
                if (c77223d8.A00 != obj.hashCode()) {
                    String str2 = "Litho.DebugInfo";
                    InterfaceC16820sZ interfaceC16820sZ = AbstractC58570Pxo.A05;
                    EnumC50702Ur enumC50702Ur = EnumC50702Ur.A03;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (enumC50702Ur.compareTo(AbstractC50692Uq.A00()) >= 0) {
                        java.util.Set set = AbstractC50692Uq.A00;
                        if (!set.isEmpty()) {
                            Iterator it = set.iterator();
                            ?? r4 = 0;
                            while (true) {
                                boolean z2 = true;
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                String[] strArr = ((AbstractC50682Uo) next).A00;
                                if (!AbstractC009903n.A0O("Litho.DebugInfo", strArr) && !AbstractC009903n.A0O("*", strArr)) {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (r4 == 0) {
                                        r4 = new ArrayList();
                                    }
                                    r4.add(next);
                                }
                            }
                            if (r4 == 0) {
                                r4 = C16930sl.A00;
                            }
                            if (!r4.isEmpty()) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "StateHandler:MutableTypeUsedAsCachedValueDep");
                                linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, "Unexpected mutable value used as CachedValue dep");
                                linkedHashMap.put(CacheBehaviorLogger.SOURCE, obj.getClass().getName());
                                C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str2, (String) interfaceC16820sZ.invoke(), linkedHashMap);
                                Iterator it2 = r4.iterator();
                                while (it2.hasNext()) {
                                    ((AbstractC50682Uo) it2.next()).A00(c58571Pxp);
                                }
                            }
                        }
                    }
                } else {
                    obj2 = c77223d8.A02;
                }
            }
        }
        return obj2;
    }

    public final void A03(InterfaceC1124255u interfaceC1124255u, String str, boolean z) {
        C2XO c2xo;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(interfaceC1124255u, 1);
        if (z) {
            c2xo = this.A04;
        } else {
            c2xo = this.A05;
        }
        synchronized (c2xo) {
            Map map = c2xo.A09;
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList();
                map.put(str, list);
            }
            list.add(interfaceC1124255u);
        }
    }

    public final void A05(C125975mo c125975mo, String str, boolean z, boolean z2) {
        C2XO c2xo;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c125975mo, 1);
        if (z2) {
            c2xo = this.A04;
        } else {
            c2xo = this.A05;
        }
        synchronized (c2xo) {
            Map map = c2xo.A07;
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList(4);
                map.put(str, list);
            }
            list.add(c125975mo);
            if (z) {
                Map map2 = c2xo.A05;
                List list2 = (List) map2.get(str);
                if (list2 == null) {
                    list2 = new ArrayList(4);
                    map2.put(str, list2);
                }
                list2.add(c125975mo);
            }
        }
    }

    public final boolean A08(String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        C2XO c2xo;
        C14360o3.A0B(interfaceC16660sJ, 0);
        if (z) {
            c2xo = this.A04;
        } else {
            c2xo = this.A05;
        }
        Map map = c2xo.A08;
        if (map.get(str) == null) {
            return false;
        }
        synchronized (c2xo) {
            C77083cu c77083cu = (C77083cu) map.get(str);
            ArrayList arrayList = null;
            if (c77083cu == null) {
                return false;
            }
            AbstractC50922Vo abstractC50922Vo = c77083cu.A01;
            List list = (List) c2xo.A09.get(str);
            if (list != null) {
                arrayList = new ArrayList(list);
            }
            C2Y6 c2y6 = (C2Y6) abstractC50922Vo;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c2y6 = ((InterfaceC1124255u) it.next()).CDD(c2y6);
                }
            }
            if (c2y6 == null) {
                return false;
            }
            Object A0O = AbstractC001800i.A0O(c2y6.A00, i);
            Object invoke = interfaceC16660sJ.invoke(A0O);
            if (A0O == null) {
                if (invoke != null) {
                    return false;
                }
            } else if (!A0O.equals(invoke)) {
                return false;
            }
            return true;
        }
    }

    public final void A01() {
        C2XO c2xo = this.A04;
        C2XJ c2xj = c2xo.A00;
        synchronized (c2xj) {
            c2xj.A00.add(c2xo);
        }
    }

    public final void A02(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, boolean z) {
        C2XO c2xo;
        C2Y6 c2y6;
        Map map;
        C77083cu c77083cu;
        Throwable th;
        List list;
        Object obj;
        if (z) {
            c2xo = this.A04;
        } else {
            c2xo = this.A05;
        }
        synchronized (c2xo) {
            Map map2 = c2xo.A07;
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                String str = (String) ((Map.Entry) it.next()).getKey();
                try {
                    map = c2xo.A08;
                    c77083cu = (C77083cu) map.get(str);
                } catch (Exception e) {
                    boolean z2 = c2xe.A0A;
                    C75793ak c75793ak = c2xe.A03;
                    if (c75793ak != null) {
                        c75793ak.A03.EG7(str, z2);
                    }
                    if (c2w1 != null) {
                        C75813am.A00(c2w1, C2XO.A0A, e, str);
                    } else {
                        C51372Xk.A01(abstractC50812Vc, c2xe, e);
                    }
                }
                if (c77083cu == null) {
                    C2XJ c2xj = c2xo.A00;
                    C14360o3.A0B(str, 0);
                    synchronized (c2xj) {
                        try {
                            Map map3 = c2xj.A01;
                            obj = map3.get(str);
                            if (obj == null) {
                                obj = new Object();
                                map3.put(str, obj);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    synchronized (obj) {
                        try {
                            c77083cu = (C77083cu) c2xj.A02.get(str);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                            break;
                        }
                    }
                    if (c77083cu == null) {
                    }
                }
                AbstractC50922Vo clone = c77083cu.A01.clone();
                C2VE c2ve = c77083cu.A00;
                C14360o3.A0B(clone, 0);
                map.put(str, new C77083cu(c2ve, clone));
                C2XO c2xo2 = c2xo;
                synchronized (c2xo2) {
                    try {
                        list = (List) map2.get(str);
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                        break;
                        break;
                    }
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        clone.A01((C125975mo) it2.next());
                    }
                    AbstractC76113bG.A00.addAndGet(list.size());
                    synchronized (c2xo2) {
                        c2xo.A05.remove(str);
                        c2xo.A04.put(str, list);
                    }
                }
            }
            map2.clear();
            Map map4 = c2xo.A09;
            for (Map.Entry entry : map4.entrySet()) {
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                Map map5 = c2xo.A08;
                C77083cu c77083cu2 = (C77083cu) map5.get(key);
                if (c77083cu2 != null && (c2y6 = (C2Y6) c77083cu2.A01) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        c2y6 = ((InterfaceC1124255u) it3.next()).CDD(c2y6);
                    }
                    map5.put(key, new C77083cu(c77083cu2.A00, c2y6));
                }
            }
            c2xo.A01.putAll(map4);
            map4.clear();
        }
    }

    public final void A04(C50882Vk c50882Vk) {
        List<C28000CVx> list;
        C2X4 c2x4 = this.A03;
        c2x4.A00 = c50882Vk.A0A;
        HashSet hashSet = new HashSet();
        C78303ew c78303ew = c50882Vk.A0L;
        if (c78303ew == null || (list = c78303ew.A01) == null) {
            list = C16930sl.A00;
        }
        for (C28000CVx c28000CVx : list) {
            CVI cvi = c28000CVx.A01;
            if (hashSet.add(cvi)) {
                c2x4.A01.put(cvi, c28000CVx.A02());
            } else {
                throw new RuntimeException(AnonymousClass001.A0R("Cannot record render data for KComponent, found another Component with the same key: ", cvi.A00));
            }
        }
    }

    public final void A06(Object obj, Object obj2, String str, int i, boolean z) {
        C2XO c2xo;
        if (z) {
            c2xo = this.A04;
        } else {
            c2xo = this.A05;
        }
        synchronized (c2xo) {
            C77203d6 c77203d6 = new C77203d6(str, i);
            if (obj2 == null) {
                Map map = c2xo.A02;
                if (map != null) {
                    map.remove(c77203d6);
                }
            } else {
                if (c2xo.A02 == null) {
                    c2xo.A02 = new LinkedHashMap();
                }
                C77223d8 c77223d8 = new C77223d8(obj, obj.hashCode(), obj2);
                Map map2 = c2xo.A02;
                if (map2 != null) {
                    map2.put(c77203d6, c77223d8);
                }
            }
        }
    }

    public final void A07(List list, List list2) {
        C2XM c2xm = this.A02;
        synchronized (c2xm) {
            c2xm.A00();
            if (list != null) {
                this.A01.A02(list);
            }
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C2Y5 c2y5 = (C2Y5) it.next();
                    AbstractC50812Vc abstractC50812Vc = c2y5.A03;
                    C14360o3.A0C(abstractC50812Vc, "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent");
                    AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
                    C2XE c2xe = c2y5.A04;
                    this.A01.A01(c2xe, abstractC50792Va, c2xe.A08());
                    abstractC50792Va.A0q(c2xe, c2xm);
                }
            }
        }
        this.A01.A00();
    }

    public C75803al() {
        this(null);
    }
}
