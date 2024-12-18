package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Y7, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Y7 {
    public static final C32K A00(final UserSession userSession, final InterfaceC62242sP interfaceC62242sP, final InterfaceC671231d interfaceC671231d, final C31F c31f, final C1PY c1py, final C1PK c1pk) {
        C32K c32k;
        C14360o3.A0B(c1py, 4);
        final C32K c32k2 = new C32K(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk) { // from class: X.6Y8
            public final C31F A00;
            public final C32K A01;

            @Override // X.C32K
            public final /* bridge */ /* synthetic */ void AWR(EnumC72351Xbn enumC72351Xbn, C1PZ c1pz, Object obj) {
                C14360o3.A0B(obj, 0);
                C14360o3.A0B(enumC72351Xbn, 1);
                C14360o3.A0B(c1pz, 2);
                this.A01.AWR(enumC72351Xbn, c1pz, obj);
            }

            @Override // X.C32K
            public final C5IC E6J(String str, Collection collection, Map map, boolean z) {
                String str2;
                C14360o3.A0B(collection, 1);
                C14360o3.A0B(map, 2);
                C14360o3.A0B(str, 3);
                C5IC E6J = this.A01.E6J(str, collection, map, z);
                Collection collection2 = E6J.A00;
                C14360o3.A06(collection2);
                ArrayList arrayList = new ArrayList();
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    C37881pR c37881pR = ((C41551w4) it.next()).A0H.A0X;
                    if (c37881pR != null && (str2 = c37881pR.A02) != null) {
                        arrayList.add(str2);
                    }
                }
                java.util.Set A0k = AbstractC001800i.A0k(arrayList);
                ArrayList arrayList2 = new ArrayList(E6J.A01);
                ArrayList arrayList3 = new ArrayList(collection2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C41551w4 c41551w4 = (C41551w4) it2.next();
                    C37881pR c37881pR2 = c41551w4.A0H.A0X;
                    if (c37881pR2 != null && A0k.contains(c37881pR2.A02)) {
                        C31F c31f2 = this.A00;
                        ArrayList arrayList4 = new ArrayList();
                        List singletonList = Collections.singletonList("ad_from_ad_pod_is_invalidated");
                        C14360o3.A07(singletonList);
                        c31f2.CiA(new C1PZ(C05F.A00), null, c41551w4, "ad_from_ad_pod_is_invalidated", null, null, null, arrayList4, singletonList, null, null, false);
                        it2.remove();
                        arrayList3.add(c41551w4);
                    }
                }
                return new C5IC(arrayList2, arrayList3);
            }

            {
                C32J c32j = new C32J(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk) { // from class: X.5Oi
                    public final UserSession A00;

                    @Override // X.C32J
                    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C14360o3.A0B(c41551w4, 0);
                        List A0O = c41551w4.A0H.A0O(this.A00);
                        C14360o3.A07(A0O);
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0O, 10));
                        Iterator it = A0O.iterator();
                        while (it.hasNext()) {
                            C38321qM c38321qM = ((C41181vS) it.next()).A0b;
                            if (c38321qM != null) {
                                arrayList.add(c38321qM);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.C32J
                    public final /* bridge */ /* synthetic */ Iterable A06(Object obj) {
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C14360o3.A0B(c41551w4, 0);
                        List A0O = c41551w4.A0H.A0O(this.A00);
                        C14360o3.A07(A0O);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = A0O.iterator();
                        while (it.hasNext()) {
                            C38541qi c38541qi = ((C41181vS) it.next()).mBrandResearchSurvey;
                            if (c38541qi != null) {
                                arrayList.add(c38541qi);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.C32J
                    public final boolean A0A() {
                        return C18U.A06(C06090Tz.A05, this.A00, 36330630140937156L);
                    }

                    @Override // X.C32J
                    public final boolean A0B() {
                        return C18U.A06(C06090Tz.A05, this.A00, 36326103245207187L);
                    }

                    @Override // X.C32J
                    public final boolean A0C() {
                        UserSession userSession2 = this.A00;
                        if (AbstractC61652rS.A03(userSession2) && C18U.A06(C06090Tz.A05, userSession2, 36312866156381534L)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.C32J
                    public final boolean A0D() {
                        UserSession userSession2 = this.A00;
                        if (AbstractC61652rS.A05(userSession2) && C18U.A06(C06090Tz.A05, userSession2, 36312866156381534L)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.C32J
                    public final boolean A0E() {
                        return C18U.A06(C06090Tz.A05, this.A00, 36330630140740545L);
                    }

                    @Override // X.C32J
                    public final /* bridge */ /* synthetic */ boolean A0F(Object obj) {
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C14360o3.A0B(c41551w4, 0);
                        C6Z1 A00 = C6Z1.A00(this.A00);
                        return A00.A01.getBoolean(c41551w4.A0H.getId(), false);
                    }

                    @Override // X.C32J
                    public final /* bridge */ /* synthetic */ boolean A0G(Object obj, boolean z, boolean z2) {
                        return C32V.A06(this.A00, z);
                    }

                    {
                        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk);
                        this.A00 = userSession;
                    }

                    @Override // X.C32J
                    public final List A07(C38321qM c38321qM) {
                        List A3p = c38321qM.A3p();
                        if (A3p == null) {
                            return C16930sl.A00;
                        }
                        return A3p;
                    }

                    @Override // X.C32J
                    public final void A08(C38321qM c38321qM, LinkedHashMap linkedHashMap) {
                        String A30;
                        float A0m = c38321qM.A0m();
                        boolean z = false;
                        if (A0m > 0.5725f && (A0m > 1.93f || A0m < 0.79f)) {
                            z = true;
                        }
                        if (z) {
                            C0f5 AEp = C18950wb.A01.AEp("AD_INVALID_MEDIA_ASPECT_RATIO", 817903741);
                            AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R("invalid_media_aspect_ratio ", AbstractC41071vF.A07(this.A00, c38321qM)));
                            AEp.report();
                        }
                        if (c38321qM.A0m() > 0.5725f) {
                            String A31 = c38321qM.A31();
                            if (A31 == null || A31.length() == 0 || (A30 = c38321qM.A30()) == null || A30.length() == 0) {
                                C0f5 AEp2 = C18950wb.A01.AEp("AD_MISSING_RENDERING_COLOR", 817903741);
                                AEp2.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R("missing_rendering_color ", AbstractC41071vF.A07(this.A00, c38321qM)));
                                AEp2.report();
                            }
                        }
                    }
                };
                this.A00 = c31f;
                this.A01 = c32j;
            }
        };
        final C32K c32k3 = new C32K(userSession, interfaceC671231d, c31f) { // from class: X.6Y9
            public final UserSession A00;
            public final InterfaceC671231d A01;
            public final C31F A02;

            @Override // X.C32K
            public final C5IC E6J(String str, Collection collection, Map map, boolean z) {
                C14360o3.A0B(collection, 1);
                ArrayList arrayList = new ArrayList(collection);
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C41551w4 c41551w4 = (C41551w4) it.next();
                    Reel reel = c41551w4.A0H;
                    if (reel.A0m()) {
                        ArrayList arrayList2 = new ArrayList();
                        if (this.A01.CWc(c41551w4)) {
                            arrayList2.add("duplicate_netego_received");
                        }
                        if (C6Z1.A00(this.A00).A01.getBoolean(reel.getId(), false)) {
                            arrayList2.add("netego_is_hidden");
                        }
                        Integer num = reel.A0f;
                        if ((num == C05F.A00 || num == C05F.A01) && reel.A0F == null) {
                            arrayList2.add("background_media_missing");
                        }
                        if (!arrayList2.isEmpty()) {
                            this.A02.Ckh(c41551w4, (String) arrayList2.get(0), arrayList2);
                            hashSet.add(c41551w4);
                            it.remove();
                        }
                    }
                }
                return new C5IC(arrayList, hashSet);
            }

            @Override // X.C32K
            public final /* bridge */ /* synthetic */ void AWR(EnumC72351Xbn enumC72351Xbn, C1PZ c1pz, Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                C14360o3.A0B(enumC72351Xbn, 1);
                if (c41551w4.A0H.A0m()) {
                    enumC72351Xbn.A02(this.A02, c41551w4);
                }
            }

            {
                this.A00 = userSession;
                this.A01 = interfaceC671231d;
                this.A02 = c31f;
            }
        };
        if (C1P9.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36323715244240397L)) {
            c32k = new C37349Gcr(c32k2, c32k3);
        } else {
            c32k = new C32K(c32k2, c32k3) { // from class: X.6X2
                public final C32K A00;
                public final C32K A01;

                @Override // X.C32K
                public final /* bridge */ /* synthetic */ void AWR(EnumC72351Xbn enumC72351Xbn, C1PZ c1pz, Object obj) {
                    this.A00.AWR(enumC72351Xbn, c1pz, obj);
                    this.A01.AWR(enumC72351Xbn, c1pz, obj);
                }

                @Override // X.C32K
                public final C5IC E6J(String str, Collection collection, Map map, boolean z) {
                    C5IC E6J = this.A00.E6J(str, collection, map, z);
                    C5IC E6J2 = this.A01.E6J(str, E6J.A01, map, z);
                    ArrayList arrayList = new ArrayList(E6J.A00);
                    arrayList.addAll(E6J2.A00);
                    return new C5IC(E6J2.A01, arrayList);
                }

                {
                    this.A00 = c32k2;
                    this.A01 = c32k3;
                }
            };
        }
        return c32k;
    }
}
