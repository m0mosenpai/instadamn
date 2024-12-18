package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.31D, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C31D implements C31E {
    public String A00 = "";
    public String A01;
    public final UserSession A02;
    public final AnonymousClass318 A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC114715Gb A05;
    public final String A06;
    public final String A07;
    public final C31A A08;

    @Override // X.C31G
    public final void Ci6(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ads_client_platform_debug");
        if (A00.isSampled()) {
            A00.AAP("debug_event_name", str3);
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("debug_string", str2);
            A00.AAP("ad_id", str);
            A00.Cht();
        }
    }

    @Override // X.C31G
    public final void CiD(int i, boolean z, long j) {
        CiE(null, i, j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (r6 > r8) goto L15;
     */
    @Override // X.C31G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void CiG(X.C85633rs r16, java.util.List r17, int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31D.CiG(X.3rs, java.util.List, int, long, boolean):void");
    }

    @Override // X.C31G
    public void CiH(C85633rs c85633rs, Iterable iterable) {
        C14360o3.A0B(c85633rs, 0);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A00;
        List list = c85633rs.A08;
        AnonymousClass318 anonymousClass318 = this.A03;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_requested");
        if (A00.isSampled()) {
            A00.AAP("viewer_session_id", str);
            A00.AAP("tray_session_id", str2);
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("ad_client_delivery_session_id", str3);
            A00.AAk("organic_ids", list);
            A00.AAP("afs_enablement_status", C32V.A00(userSession));
            A00.AAP("ad_pool_snapshot", anonymousClass318.A0R);
            Boolean bool = anonymousClass318.A05;
            if (bool != null) {
                A00.A7v("is_self_pog_chaining", bool);
            }
            A00.Cht();
        }
    }

    @Override // X.C31E
    public final void CkN(String str, String str2) {
    }

    @Override // X.C31E
    public final void CkO(InterfaceC42381xS interfaceC42381xS, Iterable iterable) {
        C14360o3.A0B(interfaceC42381xS, 0);
        C14360o3.A0B(iterable, 1);
        Object BUM = interfaceC42381xS.BUM();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String ATy = this.A08.ATy(((InterfaceC42381xS) it.next()).BUM());
            if (ATy != null) {
                arrayList.add(ATy);
            }
        }
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        C31A c31a = this.A08;
        c31a.AUe(BUM);
        String ATy2 = c31a.ATy(BUM);
        if (ATy2 == null) {
            ATy2 = "";
        }
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A00;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_item_exit_pool");
        if (A00.isSampled()) {
            A00.AAP("ad_id", ATy2);
            A00.AAk("ad_ids_in_pool", arrayList);
            A00.AAP("viewer_session_id", str);
            A00.AAP("tray_session_id", str2);
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("ad_client_delivery_session_id", str3);
            A00.Cht();
        }
    }

    @Override // X.C31E
    public void Cm0(C3ZB c3zb) {
        C14360o3.A0B(c3zb, 0);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C32U.A08(this.A02, this.A03, c3zb, interfaceC60442pS, this.A06, this.A07, this.A00, this.A01);
    }

    @Override // X.C31E
    public void DrI(C3ZB c3zb) {
        String str;
        C14360o3.A0B(c3zb, 0);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A00;
        String str5 = this.A01;
        AnonymousClass318 anonymousClass318 = this.A03;
        C32U.A08(userSession, anonymousClass318, c3zb, interfaceC60442pS, str2, str3, str4, str5);
        InterfaceC114715Gb interfaceC114715Gb = this.A05;
        if (interfaceC114715Gb != null) {
            str = interfaceC114715Gb.Amq();
        } else {
            str = null;
        }
        this.A01 = str;
        C32U.A09(userSession, anonymousClass318, interfaceC60442pS, str2, str3, this.A00, str);
    }

    @Override // X.C31E
    public final void ERS(String str) {
        C14360o3.A0B(str, 0);
        this.A00 = str;
    }

    @Override // X.C31E
    public void Ci7(Integer num, Object obj) {
        C38321qM A02;
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C41551w4 c41551w4 = (C41551w4) obj;
            C14360o3.A0B(c41551w4, 0);
            C14360o3.A0B(num, 1);
            if (c3gq.A08.CYw(c41551w4)) {
                List A0O = c41551w4.A0H.A0O(c3gq.A02);
                C14360o3.A07(A0O);
                int size = A0O.size();
                for (int i = 0; i < size; i++) {
                    C1NI A09 = ((C41181vS) A0O.get(i)).A09();
                    if (A09 != null) {
                        C3GQ.A01(A09, c41551w4, c3gq, num, C3GQ.A00(c3gq, c3gq.A06.BeT()), i);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return;
            }
            C1NI A092 = c41551w4.A09(c3gq.A02).A09();
            if (A092 != null) {
                C3GQ.A01(A092, c41551w4, c3gq, num, C3GQ.A00(c3gq, c3gq.A06.BeT()), c41551w4.A01);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (this instanceof C31C) {
            C31C c31c = (C31C) this;
            C82373m0 c82373m0 = (C82373m0) obj;
            C14360o3.A0B(c82373m0, 0);
            C14360o3.A0B(num, 1);
            int i2 = -1;
            if (c31c.A04.CYw(c82373m0)) {
                UserSession userSession = c31c.A00;
                if (C18U.A06(C06090Tz.A05, userSession, 36327855591865264L)) {
                    C3XG c3xg = c82373m0.A01;
                    C1XV c1xv = c3xg.A06;
                    if (c1xv == C1XV.A0l) {
                        C38321qM A022 = C3XH.A02(c3xg.A05);
                        if (A022 != null) {
                            IL6 A00 = I23.A00(userSession);
                            Integer num2 = c3xg.A07;
                            if (num2 != null) {
                                i2 = num2.intValue();
                            }
                            HBC A002 = A00.A00(A022, i2);
                            c31c.A03.A0G(A002);
                            Iterator it = A002.A0B.iterator();
                            while (it.hasNext()) {
                                C31C.A05(((IL5) it.next()).A00(), c31c, c82373m0, num);
                            }
                            return;
                        }
                        return;
                    }
                    if (c1xv == C1XV.A0T) {
                        Iterator it2 = c3xg.A01().A0B.iterator();
                        while (it2.hasNext()) {
                            C31C.A05(((IL5) it2.next()).A00(), c31c, c82373m0, num);
                        }
                        return;
                    }
                    return;
                }
            }
            C3XG c3xg2 = c82373m0.A01;
            C1XV c1xv2 = c3xg2.A06;
            if (c1xv2 == C1XV.A0T) {
                IL5 il5 = (IL5) AbstractC001800i.A0O(c3xg2.A01().A0B, 0);
                if (il5 != null) {
                    A02 = il5.A00();
                } else {
                    return;
                }
            } else {
                A02 = C3XH.A02(c3xg2.A05);
            }
            if (A02 != null) {
                C31C.A05(A02, c31c, c82373m0, num);
                if (c1xv2 == C1XV.A0l) {
                    IL6 A003 = I23.A00(c31c.A00);
                    Integer num3 = c3xg2.A07;
                    if (num3 != null) {
                        i2 = num3.intValue();
                    }
                    c31c.A03.A0G(A003.A00(A02, i2));
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0B(obj, 0);
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession2 = this.A02;
        C31A c31a = this.A08;
        String AUH = c31a.AUH(obj);
        if (AUH == null) {
            AUH = "";
        }
        String AUe = c31a.AUe(obj);
        if (AUe == null) {
            AUe = "";
        }
        String ATy = c31a.ATy(obj);
        if (ATy == null) {
            ATy = "";
        }
        String AUV = c31a.AUV(obj);
        if (AUV == null) {
            AUV = "";
        }
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A00;
        String AU4 = c31a.AU4(obj);
        if (AU4 == null) {
            AU4 = "";
        }
        Boolean AUD = c31a.AUD(obj);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession2);
        InterfaceC02590Ai A004 = A01.A00(A01.A00, "instagram_ad_delivery");
        if (A004.isSampled()) {
            A004.AAP("m_pk", AUH);
            A004.AAP("tracking_token", AUe);
            A004.AAP("ad_id", ATy);
            A004.AAP("source_of_action", interfaceC60442pS.getModuleName());
            A004.AAP("container_module", interfaceC60442pS.getModuleName());
            A004.AAP("tray_session_id", str2);
            A004.AAP("viewer_session_id", str);
            A004.AAP("ad_client_delivery_session_id", str3);
            A004.AAP(TraceFieldType.RequestID, AUV);
            A004.AAP("request_uuid", "");
            A004.AAP("delivery_flags", AU4);
            A004.A7v("is_demo", AUD);
            A004.AAP("afs_enablement_status", C32V.A00(userSession2));
            if (AbstractC61652rS.A02(userSession2)) {
                A004.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession2)).toString());
                A004.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession2).toString());
            }
            A004.Cht();
        }
    }

    @Override // X.C31E
    public void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        Integer num;
        if (this instanceof C31C) {
            C1PZ c1pz = (C1PZ) obj;
            C14360o3.A0B(interfaceC42381xS, 0);
            C14360o3.A0B(c1pz, 1);
            C31C.A08((C31C) this, interfaceC42381xS, c1pz);
            return;
        }
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C1PZ c1pz2 = (C1PZ) obj;
            C14360o3.A0B(interfaceC42381xS, 0);
            C14360o3.A0B(c1pz2, 1);
            UserSession userSession = c3gq.A02;
            List A0U = C1OU.A04(userSession).A0U(false);
            InterfaceC114805Gn interfaceC114805Gn = c3gq.A07;
            if (interfaceC114805Gn != null) {
                num = Integer.valueOf(interfaceC114805Gn.getCount());
            } else {
                num = null;
            }
            InterfaceC60442pS interfaceC60442pS = c3gq.A04;
            C41551w4 c41551w4 = (C41551w4) interfaceC42381xS.BUM();
            int i = c3gq.A00;
            int BoB = interfaceC42381xS.BoB();
            Integer Byg = interfaceC42381xS.Byg();
            String str = ((C31D) c3gq).A00;
            AnonymousClass318 anonymousClass318 = c3gq.A03;
            boolean CVy = interfaceC42381xS.CVy();
            ArrayList arrayList = new ArrayList();
            Iterator it = A0U.iterator();
            while (it.hasNext()) {
                User A0D = ((Reel) it.next()).A0D();
                if (A0D != null) {
                    arrayList.add(A0D.getId());
                }
            }
            C3R6.A01(userSession, anonymousClass318, interfaceC60442pS, c41551w4, c1pz2, Byg, Integer.valueOf(A0U.size()), num, "invalidation", str, c3gq.A01, arrayList, i, BoB, CVy, c3gq.A0B);
            return;
        }
        C14360o3.A0B(interfaceC42381xS, 0);
        C14360o3.A0B(obj, 1);
        Object BUM = interfaceC42381xS.BUM();
        InterfaceC60442pS interfaceC60442pS2 = this.A04;
        UserSession userSession2 = this.A02;
        C31A c31a = this.A08;
        String str2 = "";
        String AUe = c31a.AUe(BUM);
        if (AUe == null) {
            AUe = "";
        }
        String ATy = c31a.ATy(BUM);
        if (ATy != null) {
            str2 = ATy;
        }
        String str3 = this.A06;
        String str4 = this.A07;
        String str5 = this.A00;
        C1PZ c1pz3 = (C1PZ) obj;
        C14360o3.A0B(c1pz3, 0);
        String str6 = (String) AbstractC001800i.A0O(c1pz3.A00(), 0);
        Long valueOf = Long.valueOf(c1pz3.A03);
        List A0a = AbstractC001800i.A0a(c31a.AUR(obj));
        Boolean AUD = c31a.AUD(BUM);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS2, userSession2);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_insertion_failure");
        if (!A00.isSampled()) {
            return;
        }
        A00.AAP("tracking_token", AUe);
        A00.AAP("ad_id", str2);
        A00.AAP("viewer_session_id", str3);
        A00.AAP("tray_session_id", str4);
        A00.AAP(TraceFieldType.FailureReason, str6);
        A00.AAP("brand_safe_organic_id", null);
        A00.A9K("desired_insertion_position", valueOf);
        A00.AAk("adjacent_organic_media_ids", A0a);
        A00.AAP("container_module", interfaceC60442pS2.getModuleName());
        A00.AAP("ad_client_delivery_session_id", str5);
        A00.A7v("is_demo", AUD);
        A00.Cht();
    }

    @Override // X.C31E
    public final void CiB(Iterable iterable, String str, String str2) {
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C14360o3.A0B("hp0_unavailable", 0);
            C14360o3.A0B(iterable, 2);
            InterfaceC60442pS interfaceC60442pS = c3gq.A04;
            C82713mZ c82713mZ = new C82713mZ(null, interfaceC60442pS, "instagram_ad_peek_failure");
            c82713mZ.A6i = AnonymousClass001.A0R("story_", "hp0_unavailable");
            c82713mZ.A7B = str2;
            c82713mZ.A4y = interfaceC60442pS.getModuleName();
            c82713mZ.A70 = c3gq.A09;
            c82713mZ.A4W = C3GQ.A00(c3gq, iterable);
            C32U.A0H(c3gq.A02, c82713mZ, interfaceC60442pS);
        }
    }

    @Override // X.C31I
    public void CiC(C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        List list4;
        int i2;
        ArrayList arrayList;
        C38321qM A02;
        BrandSafetyContentBlocklistBitmapQLObj AiW;
        List Ag9;
        Integer A0j;
        C38321qM A022;
        BrandSafetyContentBlocklistBitmapQLObj AiW2;
        List Ag92;
        Integer A0j2;
        if (this instanceof C31C) {
            C31C c31c = (C31C) this;
            C14360o3.A0B(list, 0);
            C14360o3.A0B(list2, 1);
            C14360o3.A0B(list3, 2);
            C14360o3.A0B(str, 3);
            C14360o3.A0B(str2, 5);
            C14360o3.A0B(str3, 7);
            C14360o3.A0B(hashMap, 8);
            UserSession userSession = c31c.A00;
            InterfaceC60442pS interfaceC60442pS = c31c.A01;
            String str6 = ((C31D) c31c).A00;
            ArrayList arrayList2 = null;
            if (c38321qM != null) {
                list4 = c38321qM.A3b();
            } else {
                list4 = null;
            }
            C65192xH c65192xH = c31c.A02;
            List A08 = c65192xH.A08();
            String str7 = (String) AbstractC001800i.A0O(list3, 0);
            int i3 = -1;
            if (str7 != null && (A0j2 = AbstractC003100w.A0j(str7, 10)) != null) {
                i2 = A0j2.intValue() - 1;
            } else {
                i2 = -1;
            }
            C3XG c3xg = (C3XG) AbstractC001800i.A0O(A08, i2);
            if (c3xg != null && (A022 = C3XH.A02(c3xg.A05)) != null && (AiW2 = A022.A0C.AiW()) != null && (Ag92 = AiW2.Ag9()) != null) {
                arrayList = C5IK.A00.A01(Ag92);
            } else {
                arrayList = null;
            }
            List A082 = c65192xH.A08();
            String str8 = (String) AbstractC001800i.A0O(list3, 0);
            if (str8 != null && (A0j = AbstractC003100w.A0j(str8, 10)) != null) {
                i3 = A0j.intValue();
            }
            C3XG c3xg2 = (C3XG) AbstractC001800i.A0O(A082, i3);
            if (c3xg2 != null && (A02 = C3XH.A02(c3xg2.A05)) != null && (AiW = A02.A0C.AiW()) != null && (Ag9 = AiW.Ag9()) != null) {
                arrayList2 = C5IK.A00.A01(Ag9);
            }
            C32U.A0R(userSession, c38321qM, interfaceC60442pS, num, num2, num3, num4, str, str2, str3, str6, str4, str5, hashMap, list, list2, list3, list4, arrayList, arrayList2, f, i);
            return;
        }
        C14360o3.A0B(list, 0);
        C14360o3.A0B(list2, 1);
        C14360o3.A0B(list3, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 7);
        C14360o3.A0B(hashMap, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0076, code lost:
    
        if (r4 > r6) goto L8;
     */
    @Override // X.C31G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CiE(java.lang.String r14, int r15, long r16, boolean r18) {
        /*
            r13 = this;
            X.2pS r7 = r13.A04
            com.instagram.common.session.UserSession r10 = r13.A02
            r2 = r16
            double r0 = (double) r2
            long r4 = (long) r15
            java.lang.String r9 = r13.A06
            java.lang.String r8 = r13.A07
            java.lang.String r6 = r13.A00
            X.318 r3 = r13.A03
            r11 = 0
            X.0wW r12 = X.AbstractC12220kQ.A01(r7, r10)
            java.lang.String r10 = "instagram_ad_request_failure"
            X.0kM r2 = r12.A00
            X.0Ai r2 = r12.A00(r2, r10)
            boolean r10 = r2.isSampled()
            if (r10 == 0) goto Lf3
            java.lang.String r10 = "organic_ids"
            r2.AAk(r10, r11)
            java.lang.String r10 = "ads_ids"
            r2.AAk(r10, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            java.lang.String r10 = "first_request"
            r2.A7v(r10, r11)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "latency"
            r2.A8I(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "status_code"
            r2.A9K(r0, r1)
            java.lang.String r0 = "viewer_session_id"
            r2.AAP(r0, r9)
            java.lang.String r0 = "tray_session_id"
            r2.AAP(r0, r8)
            java.lang.String r1 = r7.getModuleName()
            java.lang.String r0 = "container_module"
            r2.AAP(r0, r1)
            java.lang.String r0 = "ad_client_delivery_session_id"
            r2.AAP(r0, r6)
            java.lang.String r1 = r3.A0Z
            java.lang.String r0 = "request_id"
            r2.AAP(r0, r1)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r3.A0N
            if (r0 == 0) goto L78
            long r4 = r0.longValue()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L79
        L78:
            r0 = 0
        L79:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "was_target_surface_visible_upon_delivery"
            r2.A7v(r0, r1)
            java.lang.Long r1 = r3.A0J
            java.lang.String r0 = "num_content_delivered"
            r2.A9K(r0, r1)
            java.lang.Boolean r1 = r3.A01
            java.lang.String r0 = "is_first_page"
            r2.A7v(r0, r1)
            java.lang.Boolean r1 = r3.A02
            java.lang.String r0 = "is_prefetch"
            r2.A7v(r0, r1)
            java.lang.Boolean r1 = r3.A00
            java.lang.String r0 = "is_carry_over_first_page"
            r2.A7v(r0, r1)
            java.lang.String r1 = r3.A0S
            java.lang.String r0 = "previous_injection_tray_session_id"
            r2.AAP(r0, r1)
            java.lang.Long r0 = r3.A0N
            java.lang.Double r1 = X.C32U.A02(r0)
            java.lang.String r0 = "time_since_user_entered_session_millis"
            r2.A8I(r0, r1)
            java.lang.Long r0 = r3.A0M
            java.lang.Double r1 = X.C32U.A02(r0)
            java.lang.String r0 = "time_since_request_start_millis"
            r2.A8I(r0, r1)
            long r4 = X.C1CC.A02()
            double r0 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_since_app_start_millis"
            r2.A8I(r0, r1)
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = "reason"
            r2.AAP(r0, r1)
            java.lang.String r1 = r3.A0c
            java.lang.String r0 = "sub_reason"
            r2.AAP(r0, r1)
            java.lang.Long r0 = r3.A00()
            java.lang.Double r1 = X.C32U.A02(r0)
            java.lang.String r0 = "time_since_previous_injection_millis"
            r2.A8I(r0, r1)
            java.lang.String r1 = r3.A0b
            java.lang.String r0 = "request_uuid"
            r2.AAP(r0, r1)
            java.lang.String r0 = "network_response_error_message"
            r2.AAP(r0, r14)
            r2.Cht()
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31D.CiE(java.lang.String, int, long, boolean):void");
    }

    @Override // X.C31G
    public final void CiF(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        String str5 = this.A01;
        String str6 = this.A06;
        String str7 = this.A07;
        String str8 = this.A00;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_request_skipped");
        if (A00.isSampled()) {
            A00.AAP("chaining_session_id", str5);
            A00.AAP("viewer_session_id", str6);
            A00.AAP("tray_session_id", str7);
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("ad_client_delivery_session_id", str8);
            A00.AAP("seed_ad_id", str);
            A00.A7v("is_headload", Boolean.valueOf(z));
            A00.A7v("is_refresh", Boolean.valueOf(z2));
            A00.AAP("refresh_trigger", str2);
            A00.AAP("refresh_trigger_signal", str3);
            A00.AAP("reason", str4);
            A00.Cht();
        }
    }

    @Override // X.C31E
    public void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
        String str2;
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C1PZ c1pz = (C1PZ) obj;
            C14360o3.A0B(interfaceC42381xS, 0);
            C14360o3.A0B(c1pz, 1);
            UserSession userSession = c3gq.A02;
            InterfaceC60442pS interfaceC60442pS = c3gq.A04;
            C41551w4 c41551w4 = (C41551w4) interfaceC42381xS.BUM();
            String str3 = c3gq.A09;
            String str4 = c3gq.A0A;
            int i = c1pz.A02;
            int i2 = c1pz.A01;
            int i3 = c1pz.A04;
            int i4 = c1pz.A09;
            int i5 = c1pz.A0A;
            String str5 = ((C31D) c3gq).A00;
            C14360o3.A0B(c41551w4, 2);
            Reel reel = c41551w4.A0H;
            C130915ve c130915ve = new C130915ve(userSession, reel, str3, str4, c41551w4.A01, c41551w4.A0E);
            if (reel.A0m()) {
                str2 = "netego_exit_pool";
            } else if (c41551w4.A0N) {
                str2 = "ad_exit_pool";
            } else {
                throw new IllegalArgumentException(MSV.A00(18));
            }
            C82713mZ c82713mZ = new C82713mZ(c130915ve, interfaceC60442pS, str2);
            C40861ut c40861ut = reel.A0b;
            if (c40861ut != null) {
                c82713mZ.A0O(c40861ut);
                c82713mZ.A4E = Long.valueOf(i);
                c82713mZ.A4A = Long.valueOf(c41551w4.A01);
                c82713mZ.A06(i2);
                c82713mZ.A0A(i3);
                c82713mZ.A48 = Long.valueOf(i4);
                c82713mZ.A49 = Long.valueOf(i5);
                c82713mZ.A4S = str5;
                c82713mZ.A6i = str;
                C37881pR c37881pR = reel.A0X;
                if (c37881pR != null) {
                    String str6 = c37881pR.A02;
                    int i6 = c37881pR.A00;
                    c82713mZ.A4V = str6;
                    c82713mZ.A3h = Long.valueOf(i6);
                }
                C32U.A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (!(this instanceof C31C)) {
            return;
        }
        ((C31C) this).A0A(interfaceC42381xS);
    }

    @Override // X.C31E
    public void CkJ(InterfaceC42381xS interfaceC42381xS) {
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C14360o3.A0B(interfaceC42381xS, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("mViewerSource:");
            sb.append(c3gq.A05.A00);
            sb.append("mViewerSessionId: ");
            sb.append(c3gq.A0A);
            sb.append(" || mTraySessionId: ");
            sb.append(c3gq.A09);
            sb.append(" || Reel ID: ");
            String id = ((C41551w4) interfaceC42381xS.BUM()).A0H.getId();
            C14360o3.A07(id);
            sb.append(id);
            sb.append(" || adClientDeliverySessionId: ");
            sb.append(((C31D) c3gq).A00);
            C0w9.A03("processInsertionAction: Reel is not ad or netego", sb.toString());
        }
    }

    @Override // X.C31E
    public final void Cke(Object obj) {
        if (this instanceof C31C) {
            C31C c31c = (C31C) this;
            C82373m0 c82373m0 = (C82373m0) obj;
            C14360o3.A0B(c82373m0, 0);
            C5I6.A00(c31c.A00, c82373m0.A01, c31c.A01, c82373m0.A00.A03);
            return;
        }
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C41551w4 c41551w4 = (C41551w4) obj;
            C14360o3.A0B(c41551w4, 0);
            UserSession userSession = c3gq.A02;
            InterfaceC60442pS interfaceC60442pS = c3gq.A04;
            C82713mZ c82713mZ = new C82713mZ(C130905vd.A00(userSession, c41551w4, c3gq.A09, c3gq.A0A), interfaceC60442pS, "instagram_netego_delivery");
            C3R6.A06(c82713mZ, c41551w4.A0H);
            C32U.A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
            return;
        }
        C14360o3.A0B(obj, 0);
        InterfaceC60442pS interfaceC60442pS2 = this.A04;
        UserSession userSession2 = this.A02;
        C31A c31a = this.A08;
        String AUH = c31a.AUH(obj);
        if (AUH == null) {
            AUH = "";
        }
        String AUe = c31a.AUe(obj);
        if (AUe == null) {
            AUe = "";
        }
        String str = this.A06;
        String str2 = this.A07;
        String ATy = c31a.ATy(obj);
        String AUP = c31a.AUP(obj);
        c31a.AUQ(obj);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS2, userSession2);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_netego_delivery");
        if (!A00.isSampled()) {
            return;
        }
        A00.AAP("m_pk", AUH);
        A00.AAP("tracking_token", AUe);
        A00.AAP("source_of_action", interfaceC60442pS2.getModuleName());
        A00.AAP("tray_session_id", str2);
        A00.AAP("viewer_session_id", str);
        A00.AAP("ad_id", ATy);
        A00.AAP("netego_id", AUP);
        A00.Cht();
    }

    @Override // X.C31E
    public final void Ckf(InterfaceC42381xS interfaceC42381xS, Object obj) {
        if (this instanceof C31C) {
            C1PZ c1pz = (C1PZ) obj;
            C14360o3.A0B(c1pz, 1);
            C31C.A08((C31C) this, interfaceC42381xS, c1pz);
            return;
        }
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C1PZ c1pz2 = (C1PZ) obj;
            C14360o3.A0B(c1pz2, 1);
            C145846hh.A07.A01(c3gq.A02, c3gq.A04, (C41551w4) interfaceC42381xS.BUM(), c1pz2, interfaceC42381xS.Byg(), "invalidation", c3gq.A09, c3gq.A0A, c3gq.A00, interfaceC42381xS.BoB(), interfaceC42381xS.CVy());
            return;
        }
        Object BUM = interfaceC42381xS.BUM();
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        C31A c31a = this.A08;
        String AUe = c31a.AUe(BUM);
        if (AUe == null) {
            AUe = "";
        }
        String str = this.A06;
        String str2 = this.A07;
        String ATy = c31a.ATy(BUM);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_netego_insertion_failure");
        if (!A00.isSampled()) {
            return;
        }
        A00.AAP("tracking_token", AUe);
        A00.AAP("viewer_session_id", str);
        A00.AAP("tray_session_id", str2);
        A00.AAP(TraceFieldType.FailureReason, null);
        A00.AAP("brand_safe_organic_id", null);
        A00.AAP("container_module", interfaceC60442pS.getModuleName());
        A00.AAP("ad_id", ATy);
        A00.Cht();
    }

    @Override // X.C31E
    public final void Ckg(InterfaceC42381xS interfaceC42381xS, Object obj) {
        Long l;
        Long l2;
        int i;
        if (this instanceof C31C) {
            C31C c31c = (C31C) this;
            C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
            C82713mZ c82713mZ = new C82713mZ(c31c.A01, "instagram_netego_insertion_success");
            C3XG c3xg = c82373m0.A01;
            c82713mZ.A7Q = c3xg.A05.CAR();
            C671831j c671831j = c82373m0.A03;
            c82713mZ.A0G = c671831j.A09();
            Integer num = c3xg.A07;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            c82713mZ.A09 = i;
            Long valueOf = Long.valueOf(c671831j.A02());
            c82713mZ.A3n = valueOf;
            c82713mZ.A3g = Long.valueOf(c671831j.A03());
            c82713mZ.A3q = Long.valueOf(c671831j.A06());
            c82713mZ.A2a = Double.valueOf(c671831j.A00());
            c82713mZ.A3t = valueOf;
            c82713mZ.A6D = c3xg.A09;
            C19280xC A00 = c82713mZ.A00();
            UserSession userSession = c31c.A00;
            AbstractC11060iN.A00(userSession).EIu(A00);
            C9CB c9cb = c82373m0.A00;
            int A09 = c671831j.A09();
            C14360o3.A0B(c9cb, 0);
            C74493Wh.A05(c9cb, userSession, c3xg, A09);
            return;
        }
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C1PZ c1pz = (C1PZ) obj;
            C14360o3.A0B(c1pz, 1);
            AnonymousClass318 anonymousClass318 = c3gq.A03;
            anonymousClass318.A00();
            anonymousClass318.A0S = anonymousClass318.A0d;
            C145846hh.A07.A01(c3gq.A02, c3gq.A04, (C41551w4) interfaceC42381xS.BUM(), c1pz, interfaceC42381xS.Byg(), "insertion_success", c3gq.A09, c3gq.A0A, c3gq.A00, interfaceC42381xS.BoB(), interfaceC42381xS.CVy());
            return;
        }
        C14360o3.A0B(obj, 1);
        Object BUM = interfaceC42381xS.BUM();
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession2 = this.A02;
        C31A c31a = this.A08;
        String str = "";
        String AUe = c31a.AUe(BUM);
        if (AUe == null) {
            AUe = "";
        }
        String AUH = c31a.AUH(BUM);
        if (AUH != null) {
            str = AUH;
        }
        String str2 = this.A06;
        String str3 = this.A07;
        Long valueOf2 = Long.valueOf(c31a.AU9(BUM));
        Long valueOf3 = Long.valueOf(c31a.ATx(obj));
        Long valueOf4 = Long.valueOf(c31a.AUO(obj));
        Long valueOf5 = Long.valueOf(c31a.AUK(BUM));
        Long valueOf6 = Long.valueOf(c31a.AUL(BUM));
        Long valueOf7 = Long.valueOf(c31a.AUM(BUM));
        Long valueOf8 = Long.valueOf(c31a.AUN(BUM));
        String ATy = c31a.ATy(BUM);
        if (ATy != null) {
            l = AbstractC003100w.A0k(10, ATy);
        } else {
            l = null;
        }
        String AUP = c31a.AUP(BUM);
        if (AUP != null) {
            l2 = AbstractC003100w.A0k(10, AUP);
        } else {
            l2 = null;
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession2);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_netego_insertion_success");
        if (!A002.isSampled()) {
            return;
        }
        A002.AAP("tracking_token", AUe);
        A002.AAP("viewer_session_id", str2);
        A002.AAP("tray_session_id", str3);
        A002.AAP("source_of_action", interfaceC60442pS.getModuleName());
        A002.AAP("m_pk", str);
        A002.A9K("gap_to_last_ad", null);
        A002.A9K("gap_to_last_netego", null);
        A002.A9K("highest_position_rule", valueOf2);
        A002.A9K("ad_consumed_media_gap", valueOf3);
        A002.A9K(AbstractC111324zv.A00(4951), valueOf4);
        A002.A9K("min_consumed_media_gap_to_previous_ad", valueOf5);
        A002.A9K("min_consumed_media_gap_to_previous_netego", valueOf6);
        A002.A9K("min_consumed_reel_gap_to_previous_ad", valueOf7);
        A002.A9K("min_consumed_reel_gap_to_previous_netego", valueOf8);
        A002.A9K("netego_id", l2);
        A002.A9K("ad_id", l);
        A002.Cht();
    }

    @Override // X.C31F
    public final void Ckh(Object obj, String str, Collection collection) {
        Long l;
        if (this instanceof C3GQ) {
            C3GQ c3gq = (C3GQ) this;
            C41551w4 c41551w4 = (C41551w4) obj;
            C14360o3.A0B(c41551w4, 0);
            C14360o3.A0B(collection, 2);
            UserSession userSession = c3gq.A02;
            InterfaceC60442pS interfaceC60442pS = c3gq.A04;
            String str2 = c3gq.A09;
            String str3 = c3gq.A0A;
            ArrayList arrayList = new ArrayList(collection);
            C82713mZ c82713mZ = new C82713mZ(C130905vd.A00(userSession, c41551w4, str2, str3), interfaceC60442pS, "instagram_netego_invalidation");
            C3R6.A06(c82713mZ, c41551w4.A0H);
            c82713mZ.A84 = arrayList;
            c82713mZ.A6v = (String) arrayList.get(0);
            C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
            return;
        }
        if (this instanceof C31C) {
            C82373m0 c82373m0 = (C82373m0) obj;
            C14360o3.A0B(c82373m0, 0);
            C14360o3.A0B(str, 1);
            C14360o3.A0B(collection, 2);
            C31C.A07((C31C) this, c82373m0, null, str, null, null, null, null, collection, false);
            return;
        }
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(collection, 2);
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        int i = 0;
        for (Object obj2 : collection) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            arrayList2.add(new C09530e4(Long.valueOf(i), obj2));
            i = i2;
        }
        Map A08 = AbstractC06930Yk.A08(arrayList2);
        InterfaceC60442pS interfaceC60442pS2 = this.A04;
        UserSession userSession2 = this.A02;
        C31A c31a = this.A08;
        String AUe = c31a.AUe(obj);
        if (AUe == null) {
            AUe = "";
        }
        String str4 = this.A06;
        String str5 = this.A07;
        Long l2 = null;
        Long valueOf = Long.valueOf(c31a.AUK(obj));
        Long valueOf2 = Long.valueOf(c31a.AUL(obj));
        Long valueOf3 = Long.valueOf(c31a.AUM(obj));
        Long valueOf4 = Long.valueOf(c31a.AUN(obj));
        c31a.AUQ(obj);
        String AUP = c31a.AUP(obj);
        if (AUP != null) {
            l = AbstractC003100w.A0k(10, AUP);
        } else {
            l = null;
        }
        String ATy = c31a.ATy(obj);
        if (ATy != null) {
            l2 = AbstractC003100w.A0k(10, ATy);
        }
        C32U.A07(interfaceC60442pS2, userSession2, valueOf, valueOf2, valueOf3, valueOf4, l, l2, AUe, str4, str5, A08);
    }

    @Override // X.C31H
    public final void Ckx(Integer num, Object obj, String str, List list) {
        InterfaceC02590Ai A00;
        String moduleName;
        String str2;
        Long l;
        C3XG c3xg;
        String str3;
        C671831j c671831j;
        C671831j c671831j2;
        if (this instanceof C31C) {
            C31C c31c = (C31C) this;
            C82373m0 c82373m0 = (C82373m0) obj;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(list, 1);
            UserSession userSession = c31c.A00;
            InterfaceC60442pS interfaceC60442pS = c31c.A01;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            A00 = A01.A00(A01.A00, "instagram_ad_push_up_failure");
            if (A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("surface", "feed");
                Long l2 = null;
                if (c82373m0 != null && (c671831j2 = c82373m0.A03) != null) {
                    l = Long.valueOf(c671831j2.A05());
                } else {
                    l = null;
                }
                c0Zx.A05("min_gap", l);
                if (c82373m0 != null && (c671831j = c82373m0.A03) != null) {
                    l2 = Long.valueOf(c671831j.A09());
                }
                c0Zx.A05("target_position", l2);
                if (c82373m0 != null && (c3xg = c82373m0.A01) != null && (str3 = c3xg.A09) != null) {
                    c0Zx.A05("current_position", Long.valueOf(c31c.A02.BK6(str3)));
                }
                A00.AAP("reason", str);
                A00.AAP("sub_reason", (String) AbstractC001800i.A0O(list, 0));
                A00.AAP("container_module", interfaceC60442pS.getModuleName());
                A00.AAP("ad_client_delivery_session_id", ((C31D) c31c).A00);
                A00.AAQ(c0Zx, "moat_info");
                if (c82373m0 != null) {
                    C31A c31a = c31c.A05;
                    A00.AAP("ad_id", c31a.ATy(c82373m0));
                    A00.AAP("tracking_token", c31a.AUe(c82373m0));
                    moduleName = c82373m0.A03.A08;
                    str2 = AbstractC111324zv.A00(5447);
                }
                A00.Cht();
            }
            return;
        }
        C14360o3.A0B(str, 0);
        C14360o3.A0B(list, 1);
        UserSession userSession2 = this.A02;
        InterfaceC60442pS interfaceC60442pS2 = this.A04;
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC60442pS2, userSession2);
        A00 = A012.A00(A012.A00, "instagram_ad_push_up_failure");
        if (!A00.isSampled()) {
            return;
        }
        A00.AAP("reason", str);
        A00.AAP("sub_reason", (String) list.get(0));
        moduleName = interfaceC60442pS2.getModuleName();
        str2 = "container_module";
        A00.AAP(str2, moduleName);
        A00.Cht();
    }

    @Override // X.C31H
    public final void Cky(C9B3 c9b3, String str, long j, long j2, long j3) {
        C14360o3.A0B(c9b3, 3);
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_push_up_failure");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A05(AbstractC111324zv.A00(2884), Long.valueOf(c9b3.A04));
            c0Zx.A05("is_time_rule_paused", Long.valueOf(c9b3.A01));
            c0Zx.A05(AbstractC111324zv.A00(2756), Long.valueOf(c9b3.A03));
            c0Zx.A05("next_sponsored_item_position_invalid", Long.valueOf(c9b3.A02));
            c0Zx.A05(AbstractC111324zv.A00(3279), Long.valueOf(c9b3.A06));
            c0Zx.A05("time_gap_not_satisfied", Long.valueOf(c9b3.A05));
            c0Zx.A05(AbstractC111324zv.A00(2420), Long.valueOf(c9b3.A00));
            A00.AAP("reason", "feed_tbi");
            A00.A9K("gre_not_start_count", Long.valueOf(j3));
            A00.A9K("push_up_failure_count", 0L);
            A00.AAQ(c0Zx, "push_up_failure_reasons_count_map");
            A00.A9K("push_up_hit_count", Long.valueOf(j));
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.Cht();
        }
    }

    @Override // X.C31E
    public void ETt(int i) {
        String str;
        InterfaceC114715Gb interfaceC114715Gb = this.A05;
        if (interfaceC114715Gb != null) {
            str = interfaceC114715Gb.Amq();
        } else {
            str = null;
        }
        this.A01 = str;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C32U.A09(this.A02, this.A03, interfaceC60442pS, this.A06, this.A07, this.A00, str);
    }

    public C31D(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, InterfaceC114715Gb interfaceC114715Gb, C31A c31a, String str, String str2) {
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A06 = str;
        this.A03 = anonymousClass318;
        this.A07 = str2;
        this.A08 = c31a;
        this.A05 = interfaceC114715Gb;
    }
}
