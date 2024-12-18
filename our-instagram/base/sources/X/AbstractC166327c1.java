package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC166327c1 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r1 = (X.C206209Bd) r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r1 = (java.util.List) r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r3 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (X.C14360o3.A0K(((X.C167297di) r2).A0K, r4) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return (X.C167297di) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000f, code lost:
    
        if (r5 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r3.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (X.C14360o3.A0K(((X.C167297di) ((X.C9BW) r2).A01).A0K, r4) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r2 = (X.C9BW) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r0 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3.hasNext() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (X.C14360o3.A0K(((X.C167297di) ((X.C9BW) r2).A01).A0K, r5) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r2 = (X.C9BW) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r2 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C167297di A01(X.C166137bh r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            r0 = 0
            java.util.List r1 = r3.A06
            java.util.Iterator r3 = r1.iterator()
            if (r5 == 0) goto L59
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.9BW r1 = (X.C9BW) r1
            java.lang.Object r1 = r1.A01
            X.7di r1 = (X.C167297di) r1
            java.lang.String r1 = r1.A0K
            boolean r1 = X.C14360o3.A0K(r1, r5)
            if (r1 == 0) goto L11
        L2a:
            X.9BW r2 = (X.C9BW) r2
            if (r2 == 0) goto L56
            java.lang.Object r1 = r2.A00
            X.9Bd r1 = (X.C206209Bd) r1
            if (r1 == 0) goto L56
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L56
            java.util.Iterator r3 = r1.iterator()
        L3e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.7di r1 = (X.C167297di) r1
            java.lang.String r1 = r1.A0K
            boolean r1 = X.C14360o3.A0K(r1, r4)
            if (r1 == 0) goto L3e
            r0 = r2
        L54:
            X.7di r0 = (X.C167297di) r0
        L56:
            return r0
        L57:
            r2 = r0
            goto L2a
        L59:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.9BW r1 = (X.C9BW) r1
            java.lang.Object r1 = r1.A01
            X.7di r1 = (X.C167297di) r1
            java.lang.String r1 = r1.A0K
            boolean r1 = X.C14360o3.A0K(r1, r4)
            if (r1 == 0) goto L59
        L72:
            X.9BW r2 = (X.C9BW) r2
            if (r2 == 0) goto L56
            java.lang.Object r0 = r2.A01
            goto L54
        L79:
            r2 = r0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC166327c1.A01(X.7bh, java.lang.String, java.lang.String):X.7di");
    }

    public static final C167297di A02(C166137bh c166137bh, String str, String str2) {
        Object obj;
        Object obj2;
        C206209Bd c206209Bd;
        List list;
        C14360o3.A0B(c166137bh, 0);
        C14360o3.A0B(str, 1);
        Object obj3 = null;
        if (str2 != null) {
            Iterator it = c166137bh.A06.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((C167297di) ((C9BW) obj2).A01).A0K, str2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C9BW c9bw = (C9BW) obj2;
            if (c9bw == null || (c206209Bd = (C206209Bd) c9bw.A00) == null || (list = (List) c206209Bd.A02) == null) {
                return null;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C14360o3.A0K(((C167297di) next).A0K, str)) {
                    obj3 = next;
                    break;
                }
            }
        } else {
            Iterator it3 = c166137bh.A07.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (C14360o3.A0K(((C167297di) ((C9BW) obj).A01).A0K, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C9BW c9bw2 = (C9BW) obj;
            if (c9bw2 == null) {
                return null;
            }
            obj3 = c9bw2.A01;
        }
        return (C167297di) obj3;
    }

    public static final C166137bh A04(C166137bh c166137bh, C168567fq c168567fq, boolean z) {
        Collection collection;
        C14360o3.A0B(c168567fq, 1);
        C9BW c9bw = c168567fq.A00;
        boolean z2 = false;
        if (c9bw != null) {
            z2 = true;
        }
        if (z && c9bw != null) {
            collection = AbstractC001800i.A0S(c166137bh.A06, AbstractC16960so.A1N(c9bw));
        } else {
            collection = c166137bh.A06;
        }
        ArrayList A0S = AbstractC001800i.A0S(c168567fq.A05, collection);
        C166087bc c166087bc = c166137bh.A03;
        String str = c168567fq.A04;
        if (str == null) {
            str = c166087bc.A01;
        }
        boolean z3 = c168567fq.A08;
        C166077bb c166077bb = c166087bc.A00;
        Integer num = c168567fq.A03;
        EnumC166067ba enumC166067ba = c168567fq.A02;
        boolean z4 = false;
        String str2 = c166077bb.A04;
        String str3 = c166077bb.A06;
        boolean z5 = c166077bb.A08;
        int i = c166077bb.A01;
        int i2 = c166077bb.A00;
        String str4 = c166077bb.A05;
        boolean z6 = c166077bb.A07;
        boolean z7 = c166077bb.A09;
        boolean z8 = c166077bb.A0A;
        C14360o3.A0B(str2, 0);
        C14360o3.A0B(num, 2);
        C14360o3.A0B(enumC166067ba, 3);
        C166087bc c166087bc2 = new C166087bc(new C166077bb(enumC166067ba, num, str2, str3, str4, i, i2, z5, z6, z7, z8), str, z3, c166087bc.A04, c166087bc.A05);
        if (c166137bh.A08 || z2) {
            z4 = true;
        }
        return C166137bh.A00(null, null, c166087bc2, c166137bh, A0S, null, 0, 4090, false, z4);
    }

    public static final C166137bh A05(C166137bh c166137bh, Integer num) {
        C166137bh A00;
        C14360o3.A0B(num, 1);
        C166087bc c166087bc = c166137bh.A03;
        C166077bb c166077bb = c166087bc.A00;
        String str = c166077bb.A04;
        String str2 = c166077bb.A06;
        EnumC166067ba enumC166067ba = c166077bb.A02;
        boolean z = c166077bb.A08;
        int i = c166077bb.A01;
        int i2 = c166077bb.A00;
        String str3 = c166077bb.A05;
        boolean z2 = c166077bb.A07;
        boolean z3 = c166077bb.A09;
        boolean z4 = c166077bb.A0A;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC166067ba, 3);
        A00 = C166137bh.A00(null, null, new C166087bc(new C166077bb(enumC166067ba, num, str, str2, str3, i, i2, z, z2, z3, z4), c166087bc.A01, c166087bc.A03, c166087bc.A04, c166087bc.A05), c166137bh, null, null, 0, 8187, false, false);
        return A00;
    }

    public static final C166137bh A06(C166137bh c166137bh, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 1);
        if (str2 != null) {
            return A08(c166137bh, str2, new C207409Ft(str, interfaceC16660sJ, 0));
        }
        return A08(c166137bh, str, new C206999Ee(interfaceC16660sJ, 44));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.9BW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.9Ee] */
    public static final C166137bh A07(C166137bh c166137bh, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 1);
        if (str2 != null) {
            return A08(c166137bh, str2, new C50269MHy(str, interfaceC16660sJ, 25));
        }
        ?? c206999Ee = new C206999Ee(interfaceC16660sJ, 45);
        List<??> list = c166137bh.A07;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        for (?? r1 : list) {
            if (C14360o3.A0K(((C167297di) r1.A01).A0K, str)) {
                r1 = c206999Ee.invoke(r1);
            }
            arrayList.add(r1);
        }
        return C166137bh.A00(null, null, null, c166137bh, null, arrayList, 0, 8189, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.9BW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0sJ] */
    public static final C166137bh A08(C166137bh c166137bh, String str, InterfaceC16660sJ interfaceC16660sJ) {
        List<??> list = c166137bh.A06;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        for (?? r1 : list) {
            if (C14360o3.A0K(((C167297di) r1.A01).A0K, str)) {
                r1 = interfaceC16660sJ.invoke(r1);
            }
            arrayList.add(r1);
        }
        return C166137bh.A00(null, null, null, c166137bh, arrayList, null, 0, 8190, false, false);
    }

    public static final C166137bh A09(C166137bh c166137bh, java.util.Set set, java.util.Set set2) {
        C14360o3.A0B(set, 1);
        C14360o3.A0B(set2, 2);
        return C166137bh.A00(null, null, null, c166137bh, A0B(c166137bh.A06, set, set2), A0B(c166137bh.A07, set, set2), 0, 8188, false, false);
    }

    public static final C51760Mtj A00(List list) {
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C167297di) it.next()).A0K);
        }
        java.util.Set A0k = AbstractC001800i.A0k(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((C167297di) it2.next()).A0N;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        java.util.Set A0k2 = AbstractC001800i.A0k(arrayList2);
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C167297di) it3.next()).A0C);
        }
        return new C51760Mtj(A0k, A0k2, AbstractC001800i.A0k(arrayList3));
    }

    public static final C166137bh A03(C169277h1 c169277h1, C166137bh c166137bh, UserSession userSession, C115925Mi c115925Mi, C115935Mj c115935Mj, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3) {
        String str5;
        User CDj;
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str4, 8);
        C38321qM A02 = C1DW.A00(userSession).A02(str4);
        boolean z4 = false;
        if (str3 != null) {
            z4 = true;
        }
        User A01 = C17060sy.A01.A01(userSession);
        C168497fj c168497fj = new C168497fj(null, null, null, null, null, false);
        EnumC168507fk enumC168507fk = EnumC168507fk.A04;
        EnumC168517fl enumC168517fl = EnumC168517fl.A02;
        C170317ik c170317ik = new C170317ik();
        EnumC166167bk enumC166167bk = EnumC166167bk.A03;
        if (A02 != null && (CDj = A02.A0C.CDj()) != null) {
            str5 = CDj.getId();
        } else {
            str5 = null;
        }
        Integer num = C05F.A01;
        EnumC168547fo enumC168547fo = (EnumC168547fo) EnumC168547fo.A01.get(Integer.valueOf((int) C18U.A01(C06090Tz.A05, userSession, 36606096458126707L)));
        if (enumC168547fo == null) {
            enumC168547fo = EnumC168547fo.A06;
        }
        C167297di c167297di = new C167297di(enumC168517fl, enumC168547fo, null, c169277h1, c170317ik, enumC168507fk, enumC166167bk, c168497fj, c115925Mi, null, c115935Mj, null, A01, null, null, null, null, num, null, str, str3, str2, null, str4, str5, list, null, z4, false, false, false, false, false, z, false, false, false, false, false, false, false, false, false, z3, false, false, false, z2);
        if (str3 != null) {
            List<C9BW> list2 = c166137bh.A06;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            for (C9BW c9bw : list2) {
                if (C14360o3.A0K(((C167297di) c9bw.A01).A0K, str3)) {
                    C206209Bd c206209Bd = (C206209Bd) c9bw.A00;
                    Collection collection = (Collection) c206209Bd.A02;
                    List singletonList = Collections.singletonList(c167297di);
                    C14360o3.A07(singletonList);
                    c9bw = C9BW.A00(C206209Bd.A00((C168557fp) c206209Bd.A00, (List) c206209Bd.A01, AbstractC001800i.A0S(singletonList, collection)), (C167297di) c9bw.A01);
                }
                arrayList.add(c9bw);
            }
            return C166137bh.A00(new C206409Bx(c167297di.A0K, null, null, 2, 4), null, null, c166137bh, arrayList, null, 0, 8158, false, false);
        }
        C16930sl c16930sl = C16930sl.A00;
        Integer num2 = C05F.A00;
        List singletonList2 = Collections.singletonList(new C9BW(new C206209Bd(new C168557fp(num2, num2, null, null, 0, 0, false, false, false), c16930sl, c16930sl), c167297di));
        C14360o3.A07(singletonList2);
        return C166137bh.A00(new C206409Bx(c167297di.A0K, null, null, 2, 4), null, null, c166137bh, null, AbstractC001800i.A0S(c166137bh.A07, singletonList2), 0, 8157, false, false);
    }

    public static final ArrayList A0A(C166137bh c166137bh, InterfaceC16660sJ interfaceC16660sJ) {
        ArrayList arrayList = new ArrayList();
        for (C9BW c9bw : c166137bh.A06) {
            Object obj = c9bw.A01;
            if (((Boolean) interfaceC16660sJ.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
            List list = (List) ((C206209Bd) c9bw.A00).A01;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((Boolean) interfaceC16660sJ.invoke(obj2)).booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final List A0B(List list, java.util.Set set, java.util.Set set2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9BW c9bw = (C9BW) it.next();
            String str = ((C167297di) c9bw.A01).A0K;
            if (!set.contains(str)) {
                if (set2.contains(str)) {
                    C206209Bd c206209Bd = (C206209Bd) c9bw.A00;
                    List<C167297di> list2 = (List) c206209Bd.A01;
                    ArrayList arrayList2 = new ArrayList();
                    for (C167297di c167297di : list2) {
                        if (!set.contains(c167297di.A0K)) {
                            arrayList2.add(c167297di);
                        }
                    }
                    List<C167297di> list3 = (List) c206209Bd.A02;
                    ArrayList arrayList3 = new ArrayList();
                    for (C167297di c167297di2 : list3) {
                        if (!set.contains(c167297di2.A0K)) {
                            arrayList3.add(c167297di2);
                        }
                    }
                    c9bw = C9BW.A00(C206209Bd.A00((C168557fp) c206209Bd.A00, arrayList2, arrayList3), (C167297di) c9bw.A01);
                }
                arrayList.add(c9bw);
            }
        }
        return arrayList;
    }
}
