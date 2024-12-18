package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.32J, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C32J implements C32K {
    public UserSession A00;
    public C1PK A01;
    public Boolean A02 = false;
    public final InterfaceC62242sP A03;
    public final InterfaceC671231d A04;
    public final C32L A05;
    public final C31F A06;
    public final C1PY A07;
    public final C18920wW A08;

    public Iterable A06(Object obj) {
        return null;
    }

    public void A08(C38321qM c38321qM, LinkedHashMap linkedHashMap) {
    }

    public void A09(List list, List list2, int i) {
    }

    public boolean A0C() {
        return AbstractC61652rS.A04(((C32H) this).A00);
    }

    public boolean A0D() {
        return AbstractC61652rS.A06(((C32H) this).A00);
    }

    public boolean A0F(Object obj) {
        C32H c32h = (C32H) this;
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        C38321qM A02 = C3XH.A02(c82373m0.A01.A05);
        if (A02 != null) {
            return C3YS.A00(c32h.A00).A05(A02);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r2 == X.EnumC73363Qm.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0G(java.lang.Object r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r1 = r4
            X.32H r1 = (X.C32H) r1
            X.3m0 r5 = (X.C82373m0) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            com.instagram.common.session.UserSession r3 = r1.A00
            X.3Qm r2 = r5.A02
            X.3Qm r0 = X.EnumC73363Qm.A03
            if (r2 == r0) goto L16
            X.3Qm r1 = X.EnumC73363Qm.A04
            r0 = 0
            if (r2 != r1) goto L17
        L16:
            r0 = 1
        L17:
            boolean r0 = X.C32V.A07(r3, r6, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32J.A0G(java.lang.Object, boolean, boolean):boolean");
    }

    private J6W A00(Map map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            C5I5 C03 = ((C5I4) entry.getValue()).C03();
            C5I5 c5i5 = C5I5.A03;
            C5I4 c5i4 = (C5I4) entry.getValue();
            if (C03 == c5i5) {
                arrayList.add(A01(c5i4));
            } else if (c5i4.C03() == C5I5.A06) {
                arrayList2.add(A01((C5I4) entry.getValue()));
            }
        }
        return new J6W(this, arrayList2, arrayList);
    }

    public static String A01(C5I4 c5i4) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c5i4.getId());
            A0A.A0Q("insertion_index", c5i4.BIC());
            C5I5 C03 = c5i4.C03();
            if (C03 == C5I5.A06) {
                A0A.A0R("timestamp", c5i4.BsG());
            } else if (C03 == C5I5.A03) {
                A0A.A0R("timestamp", c5i4.BIE());
            }
            Integer Awh = c5i4.Awh();
            if (Awh != null) {
                A0A.A0S(AbstractC111324zv.A00(4253), AbstractC37798GkD.A00(Awh));
            }
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A07(C32J.class, "Failed to convert ad info to json", e, new Object[0]);
            return "";
        }
    }

    private void A02(String str, LinkedHashMap linkedHashMap, List list, Map map) {
        J6W j6w;
        boolean z = !linkedHashMap.isEmpty();
        HashSet hashSet = new HashSet();
        if (z) {
            hashSet.add(0);
        }
        for (int i = 1; i < list.size(); i++) {
            if (E6J(str, Collections.singletonList(list.get(i)), map, false).A00.size() > 0) {
                hashSet.add(Integer.valueOf(i));
                z = true;
            }
        }
        if (z) {
            for (int i2 = 1; i2 < list.size(); i2++) {
                if (!hashSet.contains(Integer.valueOf(i2))) {
                    Object obj = list.get(i2);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("invalid_ad_in_multi_ad", new ArrayList());
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C1PZ c1pz = new C1PZ(C05F.A00);
                    C14360o3.A0B(str, 0);
                    c1pz.A0E = str;
                    ArrayList arrayList3 = new ArrayList(linkedHashMap2.keySet());
                    String str2 = (String) new ArrayList(linkedHashMap2.keySet()).get(0);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = linkedHashMap2.values().iterator();
                    while (it.hasNext()) {
                        arrayList4.addAll((Collection) it.next());
                    }
                    C31F c31f = this.A06;
                    String obj2 = Collections.unmodifiableList(arrayList).toString();
                    String obj3 = Collections.unmodifiableList(arrayList2).toString();
                    if (arrayList3.contains("duplicate_ad_received")) {
                        if (C18U.A06(C06090Tz.A05, this.A00, 36318565577660735L)) {
                            j6w = A00(map);
                            c31f.CiA(c1pz, null, obj, str2, null, obj2, obj3, arrayList4, arrayList3, j6w, map, false);
                        }
                    }
                    j6w = null;
                    c31f.CiA(c1pz, null, obj, str2, null, obj2, obj3, arrayList4, arrayList3, j6w, map, false);
                }
            }
            linkedHashMap.put("invalid_ad_in_multi_ad", new ArrayList());
        }
    }

    private void A03(boolean z) {
        if (C18U.A06(C06090Tz.A05, this.A00, 36317380166554739L)) {
            C18920wW c18920wW = this.A08;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "on_device_auto_exclusion_targeting");
            if (A00.isSampled()) {
                A00.A7v("is_invalidated", Boolean.valueOf(z));
                A00.Cht();
            }
        }
    }

    private boolean A04(Object obj) {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if ((C18U.A06(c06090Tz, userSession, 36313712265529558L) || C18U.A06(c06090Tz, userSession, 36319450340793796L) || C18U.A06(c06090Tz, userSession, 36320584212161213L) || C18U.A06(c06090Tz, userSession, 36325136877499160L)) && this.A03.CZK(obj)) {
            return true;
        }
        return false;
    }

    public Iterable A05(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        C38321qM A02 = C3XH.A02(c82373m0.A01.A05);
        if (A02 != null) {
            List singletonList = Collections.singletonList(A02);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public boolean A0A() {
        if (this instanceof C32H) {
            return C18U.A06(C06090Tz.A05, ((C32H) this).A00, 36330630140871619L);
        }
        return false;
    }

    public boolean A0B() {
        if (this instanceof C32H) {
            return C18U.A06(C06090Tz.A05, ((C32H) this).A00, 36326103245141650L);
        }
        return false;
    }

    public boolean A0E() {
        if (this instanceof C32H) {
            return C18U.A06(C06090Tz.A05, ((C32H) this).A00, 36330630140675008L);
        }
        return false;
    }

    @Override // X.C32K
    public final void AWR(EnumC72351Xbn enumC72351Xbn, C1PZ c1pz, Object obj) {
        if (this.A03.CdX(obj) && !A04(obj)) {
            enumC72351Xbn.A01(this.A06, c1pz, obj);
        } else {
            if (!A04(obj)) {
                return;
            }
            enumC72351Xbn.A02(this.A06, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0468, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f1, code lost:
    
        if (X.AbstractC38186Gqr.A01(r0) == X.C05F.A00) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016a, code lost:
    
        if (X.C14360o3.A0K(r0.CPy(), true) == false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r47v0, types: [X.32J] */
    /* JADX WARN: Type inference failed for: r7v12, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C32K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5IC E6J(java.lang.String r48, java.util.Collection r49, java.util.Map r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32J.E6J(java.lang.String, java.util.Collection, java.util.Map, boolean):X.5IC");
    }

    public C32J(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk) {
        this.A00 = userSession;
        this.A03 = interfaceC62242sP;
        this.A06 = c31f;
        this.A04 = interfaceC671231d;
        this.A07 = c1py;
        this.A01 = c1pk;
        this.A05 = new C32L(userSession, c1pk);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "on_device_auto_exclusion_targeting";
        this.A08 = c12210kP.A00();
    }

    public List A07(C38321qM c38321qM) {
        if (!c38321qM.A3Y().isEmpty()) {
            return c38321qM.A3Y();
        }
        return Collections.emptyList();
    }
}
