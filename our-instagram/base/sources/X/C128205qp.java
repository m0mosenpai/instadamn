package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128205qp {
    public static final C128205qp A00 = new Object();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Gwt, X.0Zx] */
    public static final C38532Gwt A00(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        ?? c0Zx = new C0Zx();
        c0Zx.A06("m_pk", c38321qM.A1g(userSession).getId());
        c0Zx.A06("tracking_token", c38321qM.A1g(userSession).CAR());
        if (!c38321qM.A5M() && c38321qM.A1g(userSession).A5M()) {
            c0Zx.A06("carousel_media_id", c38321qM.getId());
            c0Zx.A05("carousel_index", Long.valueOf(c38321qM.A16(userSession)));
        }
        return c0Zx;
    }

    public static final C9CO A01(C11520jB c11520jB) {
        if (c11520jB == null) {
            return null;
        }
        String str = (String) c11520jB.A01(C5I8.A6U);
        String str2 = (String) c11520jB.A01(C5I8.A5K);
        String str3 = (String) c11520jB.A01(C5I8.A5d);
        String str4 = (String) c11520jB.A01(C5I8.A1C);
        Number number = (Number) c11520jB.A01(C5I8.A1A);
        return new C9CO((Integer) null, number != null ? Integer.valueOf((int) number.longValue()) : null, str, str2, str3, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C38683GzO A03(com.instagram.common.session.UserSession r13, com.instagram.user.model.Product r14) {
        /*
            r0 = 0
            X.C14360o3.A0B(r14, r0)
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            java.lang.String r1 = r14.A0H
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)
            if (r0 == 0) goto Lb6
            long r11 = r0.longValue()
        L1a:
            com.instagram.user.model.User r0 = r14.A0B
            r8 = 0
            if (r0 == 0) goto Lb3
            java.lang.String r0 = X.AbstractC76433bn.A00(r0)
        L23:
            X.4SX r4 = X.C4SX.A00(r0)
            boolean r0 = r14.A04()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311822478869276(0x8101690000031c, double:3.0270809793853865E-306)
            boolean r0 = X.C18U.A06(r2, r13, r0)
            r3 = 0
            if (r0 == 0) goto L4e
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r14.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L4e
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r2 = r14.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r2.A0C
            if (r0 == 0) goto Lb1
            java.lang.Integer r0 = r0.A0C
            if (r0 == 0) goto Lb1
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L66:
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r2.A0F
            if (r0 == 0) goto Laf
            java.lang.Long r0 = r0.BMJ()
            if (r0 == 0) goto Lac
            long r0 = r0.longValue()
        L74:
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L78:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r14.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r0.A0F
            if (r0 == 0) goto L88
            java.lang.Boolean r0 = r0.BBz()
            if (r0 == 0) goto L88
            boolean r3 = r0.booleanValue()
        L88:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r14.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto La6
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r0 = r0.A01
            if (r0 == 0) goto La6
            com.instagram.model.payments.CurrencyAmountInfo r0 = r0.Buc()
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.getAmount()
            if (r0 == 0) goto La6
            java.lang.Double r8 = X.AnonymousClass010.A0m(r0)
        La6:
            X.GzO r3 = new X.GzO
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        Lac:
            r0 = 0
            goto L74
        Laf:
            r10 = r8
            goto L78
        Lb1:
            r9 = r8
            goto L66
        Lb3:
            r0 = r8
            goto L23
        Lb6:
            r11 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128205qp.A03(com.instagram.common.session.UserSession, com.instagram.user.model.Product):X.GzO");
    }

    public static final C128215qq A04(C38321qM c38321qM) {
        return A06(c38321qM, c38321qM.A3S(true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r13 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C128215qq A06(X.C38321qM r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128205qp.A06(X.1qM, java.util.List):X.5qq");
    }

    public static final C38642Gyj A07(C38321qM c38321qM, Integer num, String str) {
        C9C2 c9c2;
        String AZ3;
        int intValue;
        String str2;
        Long l;
        if (c38321qM == null) {
            return null;
        }
        if (c38321qM.A5M() && num != null && (intValue = num.intValue()) != -1) {
            Long valueOf = Long.valueOf(intValue);
            C38321qM A1e = c38321qM.A1e(intValue);
            if (A1e != null) {
                str2 = A1e.getId();
            } else {
                str2 = null;
            }
            if (c38321qM.A1e(intValue) != null) {
                l = Long.valueOf(r0.BRp().A00);
            } else {
                l = null;
            }
            c9c2 = new C9C2(valueOf, l, str2, 5);
        } else {
            c9c2 = null;
        }
        String id = c38321qM.getId();
        if (id == null) {
            id = "";
        }
        long j = c38321qM.BRp().A00;
        long A1B = c38321qM.A1B();
        String CAR = c38321qM.CAR();
        if (c38321qM.A5M()) {
            C38321qM A1e2 = c38321qM.A1e(0);
            if (A1e2 != null) {
                AZ3 = A1e2.A0C.AZ3();
            } else {
                AZ3 = null;
            }
        } else {
            AZ3 = c38321qM.A0C.AZ3();
        }
        return new C38642Gyj(c9c2, c38321qM.A63() ? A02(c38321qM, str) : null, A04(c38321qM), id, CAR, AZ3, c38321qM.A0C.getLoggingInfoToken(), j, A1B);
    }

    public static final ArrayList A09(C38321qM c38321qM) {
        ArrayList A3S = c38321qM.A3S(true);
        if (A3S != null && !A3S.isEmpty()) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A3S, 10));
            Iterator it = A3S.iterator();
            while (it.hasNext()) {
                arrayList.add(((Product) it.next()).A0B);
            }
            List A0X = AbstractC001800i.A0X(arrayList);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : A0X) {
                if (hashSet.add(((User) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return null;
    }

    public static final List A0C(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Product) it.next()).A0H;
            C14360o3.A0B(str, 0);
            Long A0k = AbstractC003100w.A0k(10, str);
            if (A0k != null) {
                arrayList.add(A0k);
            }
        }
        return arrayList;
    }

    public static final Map A0D(List list) {
        String A002;
        Long A0k;
        C14360o3.A0B(list, 0);
        ArrayList<C09530e4> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            User user = product.A0B;
            if (user != null && (A002 = AbstractC76433bn.A00(user)) != null && (A0k = AbstractC003100w.A0k(10, A002)) != null) {
                arrayList.add(new C09530e4(A0k, product));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C09530e4 c09530e4 : arrayList) {
            Long valueOf = Long.valueOf(((Number) c09530e4.A00).longValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            String str = ((Product) c09530e4.A01).A0H;
            C14360o3.A0B(str, 0);
            ((List) obj).add(AbstractC003100w.A0k(10, str));
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new C09530e4(entry.getKey(), AbstractC001800i.A0X((Iterable) entry.getValue())));
        }
        return AbstractC06930Yk.A08(arrayList2);
    }

    public static final C26087BgG A02(C38321qM c38321qM, String str) {
        ArrayList arrayList;
        String str2;
        List A3w;
        String A0J;
        EnumC75383a5 enumC75383a5 = EnumC75383a5.A0y;
        List<C84823qW> A3w2 = c38321qM.A3w(enumC75383a5);
        List list = null;
        if (A3w2 != null && (!A3w2.isEmpty())) {
            arrayList = new ArrayList();
            for (C84823qW c84823qW : A3w2) {
                String str3 = c84823qW.A0H().A0H;
                C14360o3.A0B(str3, 0);
                Long A0k = AbstractC003100w.A0k(10, str3);
                if (A0k != null && (A0J = c84823qW.A0J()) != null) {
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A05("product_id", A0k);
                    c0Zx.A06("sticker_id", A0J);
                    c0Zx.A06("sticker_type", c84823qW.A12.A00);
                    arrayList.add(c0Zx);
                }
            }
        } else {
            arrayList = null;
        }
        if (str != null) {
            str2 = null;
            if (c38321qM.A63() && (A3w = c38321qM.A3w(enumC75383a5)) != null && !A3w.isEmpty()) {
                Iterator it = A3w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C84823qW c84823qW2 = (C84823qW) it.next();
                    if (str.equals(c84823qW2.A0H().A0H)) {
                        str2 = c84823qW2.A0J();
                        break;
                    }
                }
            }
        } else {
            str2 = null;
        }
        Product A2A = c38321qM.A2A();
        if (A2A != null) {
            String str4 = A2A.A0H;
            C14360o3.A0B(str4, 0);
            list = AbstractC16960so.A1O(AbstractC003100w.A0k(10, str4));
        }
        return new C26087BgG(C5I9.A00(c38321qM.A22(), c38321qM.A23(), c38321qM.A24(), c38321qM.A25()), list, arrayList, str2, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A0A(X.C41181vS r5) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.1qM r0 = r5.A0b
            if (r0 == 0) goto L4b
            java.util.ArrayList r0 = r0.A3N()
            java.util.Iterator r3 = r0.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r3.next()
            X.3qW r2 = (X.C84823qW) r2
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.3a5 r0 = r2.A12
            int r1 = r0.ordinal()
            r0 = 30
            if (r1 == r0) goto L53
            r0 = 36
            if (r1 == r0) goto L4c
            r0 = 38
            if (r1 != r0) goto L11
            com.instagram.user.model.Product r0 = r2.A0I()
            if (r0 == 0) goto L11
        L39:
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r1)
        L40:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L11
            r4.addAll(r1)
        L4b:
            return r4
        L4c:
            java.util.List r1 = r2.A0M()
            if (r1 == 0) goto L11
            goto L40
        L53:
            com.instagram.user.model.Product r0 = r2.A0H()
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128205qp.A0A(X.1vS):java.util.ArrayList");
    }

    public static final HashMap A0B(C41181vS c41181vS) {
        ArrayList A09;
        Long A0k;
        String A002;
        HashMap hashMap = new HashMap();
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (A09 = A09(c38321qM)) != null) {
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                String A003 = AbstractC76433bn.A00((User) it.next());
                if (A003 != null && (A0k = AbstractC003100w.A0k(10, A003)) != null) {
                    ArrayList A0A = A0A(c41181vS);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = A0A.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        User user = ((Product) next).A0B;
                        if (user != null && (A002 = AbstractC76433bn.A00(user)) != null && A002.equalsIgnoreCase(A003)) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str = ((Product) it3.next()).A0H;
                        C14360o3.A0B(str, 0);
                        Long A0k2 = AbstractC003100w.A0k(10, str);
                        if (A0k2 != null) {
                            arrayList2.add(A0k2);
                        }
                    }
                    hashMap.put(A0k, arrayList2);
                }
            }
        }
        return hashMap;
    }

    public static final Map A0E(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                arrayList.add(new C09530e4(key, value));
            }
        }
        return AbstractC06930Yk.A08(arrayList);
    }

    public static final C128215qq A05(C38321qM c38321qM, Integer num) {
        ArrayList arrayList;
        ArrayList A3R = c38321qM.A3R(num);
        if (A3R != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(A3R, 10));
            Iterator it = A3R.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC38048Gob.A01(((ProductTag) it.next()).A02));
            }
        } else {
            arrayList = null;
        }
        return A06(c38321qM, arrayList);
    }

    public static final Boolean A08(List list) {
        if (list.isEmpty()) {
            return null;
        }
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Product) it.next()).A04()) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
