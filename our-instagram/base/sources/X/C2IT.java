package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2IT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IT implements C2IU {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC16820sZ A02;
    public final boolean A03;
    public final InterfaceC16820sZ A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (X.C2E8.A0B(r5, A01(X.C47062Du.A00, (X.C2DS) r3.A01.getValue())) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36315365827677352L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2IT(X.InterfaceC16820sZ r4, com.instagram.common.session.UserSession r5, X.InterfaceC16820sZ r6) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 3
            X.C14360o3.A0B(r6, r0)
            r3.<init>()
            r3.A00 = r5
            r3.A02 = r4
            r3.A04 = r6
            r1 = 17
            X.9EW r0 = new X.9EW
            r0.<init>(r3, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r3.A01 = r0
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.C2E7.A03(r0)
            if (r0 != 0) goto L41
            X.0do r0 = r3.A01
            java.lang.Object r1 = r0.getValue()
            X.2DS r1 = (X.C2DS) r1
            X.2Du r0 = X.C47062Du.A00
            boolean r0 = A01(r0, r1)
            boolean r1 = X.C2E8.A0B(r5, r0)
            r0 = 0
            if (r1 == 0) goto L42
        L41:
            r0 = 1
        L42:
            r3.A05 = r0
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.C2E7.A03(r0)
            if (r0 == 0) goto L60
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315365827677352(0x8104a2000c0ca8, double:3.029321807439534E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L61
        L60:
            r0 = 0
        L61:
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IT.<init>(X.0sZ, com.instagram.common.session.UserSession, X.0sZ):void");
    }

    public static final boolean A01(AbstractC46972Dl abstractC46972Dl, C2DS c2ds) {
        Object obj = ((C2DU) c2ds).A0C.A0E.get(abstractC46972Dl);
        if (obj != null && obj.equals(true)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C2IU
    public final C71943Kr E8Z() {
        C09530e4 c09530e4;
        C71933Kq c71933Kq;
        ArrayList arrayList;
        int i;
        int i2;
        Collection linkedHashSet;
        if (this.A05) {
            UserSession userSession = this.A00;
            InterfaceC09390do interfaceC09390do = this.A01;
            C2DS c2ds = (C2DS) interfaceC09390do.getValue();
            HashSet hashSet = new HashSet();
            if (C2E8.A07(userSession)) {
                hashSet.add(C46962Dk.A00);
                hashSet.add(C47032Dr.A00);
            }
            C47062Du c47062Du = C47062Du.A00;
            if (C2E8.A0B(userSession, A01(c47062Du, c2ds)) && !C18U.A06(C06090Tz.A05, userSession, 36317908448646828L)) {
                hashSet.add(C4I1.A00);
            }
            if (C2E8.A00(userSession)) {
                hashSet.add(C47072Dv.A00);
            }
            if (C2E8.A03(userSession)) {
                List A0E = ((C2DU) c2ds).A0C.A0E();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : A0E) {
                    if (obj instanceof C2E6) {
                        arrayList2.add(obj);
                    }
                }
                hashSet.addAll(arrayList2);
            }
            boolean A01 = A01(c47062Du, c2ds);
            if (C5SJ.A04(userSession, A01) || C5SJ.A03(userSession, A01)) {
                hashSet.add(c47062Du);
            }
            if (this.A03) {
                hashSet.add(C4I2.A00);
            }
            C47092Dx c47092Dx = C47092Dx.A00;
            if (A01(c47092Dx, c2ds) && C2E8.A0A(userSession, false)) {
                hashSet.add(c47092Dx);
            }
            C2DS c2ds2 = (C2DS) interfaceC09390do.getValue();
            HashMap hashMap = new HashMap(hashSet.size());
            Iterator it = hashSet.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) it.next();
                if (!C14360o3.A0K(abstractC46972Dl, C47072Dv.A00)) {
                    if (C14360o3.A0K(abstractC46972Dl, c47062Du) && !C5SJ.A04(userSession, A01(abstractC46972Dl, c2ds2))) {
                        linkedHashSet = C16910sj.A00;
                    } else {
                        List A0G = ((C2DU) c2ds2).A0C.A0G(abstractC46972Dl, C2EB.A04, C4I3.A03);
                        int min = Math.min(A0G.size(), 21);
                        linkedHashSet = new LinkedHashSet();
                        while (i2 < min) {
                            if (((C2EH) A0G.get(i2)).Cf8(userSession)) {
                                linkedHashSet.add(A00((C2EC) A0G.get(i2)));
                            }
                            i2++;
                        }
                    }
                    hashMap.put(abstractC46972Dl, linkedHashSet);
                }
            }
            Collection values = hashMap.values();
            C14360o3.A07(values);
            List A0W = AbstractC001800i.A0W(AbstractC06950Ym.A1F(values));
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf(((java.util.Set) entry.getValue()).size()));
            }
            LinkedHashMap A03 = AbstractC06930Yk.A03(linkedHashMap);
            C47072Dv c47072Dv = C47072Dv.A00;
            if (hashSet.contains(c47072Dv)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    if (!C14360o3.A0K(entry2.getKey(), C4I2.A00)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                A03.put(c47072Dv, Integer.valueOf(AbstractC001800i.A0W(AbstractC06950Ym.A1F(linkedHashMap2.values())).size()));
            }
            if (hashSet.contains(c47062Du) && C5SJ.A03(userSession, A01(c47062Du, c2ds2))) {
                Number number = (Number) A03.get(c47062Du);
                if (number != null) {
                    i2 = number.intValue();
                }
                C5e4 c5e4 = (C5e4) userSession.A00(C5e4.class);
                int i3 = 0;
                if (c5e4 != null) {
                    List list = c5e4.A01("direct_ibc_inbox_invitations").A02;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((DirectShareTarget) it2.next()).A0U && (i3 = i3 + 1) < 0) {
                                AbstractC16960so.A1T();
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                A03.put(c47062Du, Integer.valueOf(i2 + i3));
            }
            c09530e4 = new C09530e4(A0W, AbstractC06930Yk.A0B(A03));
        } else {
            C16930sl c16930sl = C16930sl.A00;
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            c09530e4 = new C09530e4(c16930sl, c16920sk);
        }
        ?? r4 = (List) c09530e4.A00;
        Map map = (Map) c09530e4.A01;
        boolean z = this.A03;
        if (!z) {
            C2DS c2ds3 = (C2DS) this.A01.getValue();
            synchronized (this) {
                C46922Dg c46922Dg = ((C2DU) c2ds3).A0C;
                List A1Q = AbstractC16960so.A1Q(C4I1.A00, C4I2.A00);
                C4I3 c4i3 = C4I3.A03;
                C2EB c2eb = C2EB.A04;
                List unmodifiableList = Collections.unmodifiableList(c46922Dg.A0A.A0Q(c2eb, c4i3, c2eb.A01, A1Q));
                C14360o3.A07(unmodifiableList);
                List A0i = AbstractC001800i.A0i(unmodifiableList, C17s.A0C(0, Math.min(unmodifiableList.size(), 20)));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : A0i) {
                    if (((C2EC) obj2).Cf8(this.A00)) {
                        arrayList3.add(obj2);
                    }
                }
                r4 = new ArrayList(AbstractC06950Ym.A1E(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    r4.add(A00((C2EC) it3.next()));
                }
            }
        }
        boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
        int i4 = -1;
        int i5 = 0;
        if (!r4.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36320803255559072L)) {
                arrayList = new ArrayList();
                for (Object obj3 : r4) {
                    if (!((C54J) obj3).A0A) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                arrayList = r4;
            }
            if (booleanValue) {
                Iterator it4 = arrayList.iterator();
                i = 0;
                i4 = 0;
                while (it4.hasNext()) {
                    i5++;
                    if (((C54J) it4.next()).A08) {
                        i4++;
                    } else {
                        i++;
                    }
                }
            } else {
                i5 = arrayList.size();
                i = i5;
            }
            if (z) {
                i5 = Math.min(i5, 20);
                i = Math.min(i, 20);
                i4 = Math.min(i4, 20);
            }
            c71933Kq = new C71933Kq(i5, i, i4);
        } else {
            if (booleanValue) {
                i4 = 0;
            }
            c71933Kq = new C71933Kq(0, 0, i4);
        }
        return new C71943Kr(c71933Kq, r4, map);
    }

    public static final C54J A00(C2EC c2ec) {
        String str;
        String str2;
        C2EY c2ey;
        DirectThreadKey BKb = c2ec.BKb();
        boolean CM2 = c2ec.CM2();
        boolean CM5 = c2ec.CM5();
        boolean CM3 = c2ec.CM3();
        boolean CXz = c2ec.CXz();
        boolean isMuted = c2ec.isMuted();
        boolean CWl = c2ec.CWl();
        C83403nh BLr = c2ec.BLr();
        Long l = null;
        if (BLr != null) {
            str = BLr.A0h();
        } else {
            str = null;
        }
        C83403nh BLr2 = c2ec.BLr();
        if (BLr2 != null && (c2ey = BLr2.A10) != null) {
            str2 = c2ey.A00;
        } else {
            str2 = null;
        }
        C83403nh BLr3 = c2ec.BLr();
        if (BLr3 != null) {
            l = Long.valueOf(BLr3.C8i());
        }
        return new C54J(BKb, l, Long.valueOf(c2ec.BLF()), str, str2, CM2, CM5, CM3, CXz, isMuted, CWl);
    }
}
