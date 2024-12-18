package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.32U, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C32U {
    public static void A0E(UserSession userSession, C82713mZ c82713mZ, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, int i) {
        A0F(userSession, c82713mZ, interfaceC38371qR, interfaceC60442pS, C05F.A00, i, false);
    }

    public static void A0K(UserSession userSession, C5H9 c5h9, C65 c65, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, Integer num, String str, boolean z) {
        A0J(userSession, c5h9, c65, c1ni, interfaceC60442pS, c1m1, null, null, num, null, str, null, null, null, 0, z, false);
    }

    public static void A0O(UserSession userSession, C5H9 c5h9, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, List list, List list2) {
        A0M(userSession, c5h9, c1ni, interfaceC60442pS, num, null, str, null, null, null, null, null, null, str2, null, list, list2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r21.equals(r0) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0P(com.instagram.common.session.UserSession r12, X.C38321qM r13, X.InterfaceC60442pS r14, com.instagram.search.common.analytics.SearchContext r15, X.C1M1 r16, java.lang.Boolean r17, java.lang.Double r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.ArrayList r24, java.util.HashMap r25, int r26) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32U.A0P(com.instagram.common.session.UserSession, X.1qM, X.2pS, com.instagram.search.common.analytics.SearchContext, X.1M1, java.lang.Boolean, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.HashMap, int):void");
    }

    public static void A0Q(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, Integer num, Integer num2, String str, int i) {
        A0P(userSession, c38321qM, interfaceC60442pS, null, c1m1, null, null, num, num2, str, null, null, null, null, i);
    }

    public static void A0S(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3, int i) {
        A0P(userSession, c38321qM, interfaceC60442pS, null, null, null, null, num, null, str, str2, str3, null, null, i);
    }

    public static Double A02(Long l) {
        if (l == null) {
            return null;
        }
        return Double.valueOf(System.currentTimeMillis() - l.longValue());
    }

    public static void A0A(UserSession userSession, C82713mZ c82713mZ, C1NI c1ni) {
        if (c1ni instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) c1ni;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(c38321qM, 1);
            if (!c38321qM.A5N() && !c38321qM.A5M()) {
                C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
                if (A00 != null) {
                    if (!A00.A0z || AbstractC41071vF.A0T(userSession, c38321qM)) {
                        return;
                    }
                } else {
                    InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                    if (injected == null || !C14360o3.A0K(injected.Caw(), true)) {
                        return;
                    }
                }
                c82713mZ.A1o = true;
            }
        }
    }

    public static void A0B(UserSession userSession, C82713mZ c82713mZ, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Integer num) {
        Integer num2;
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c82713mZ.A0E(((AnonymousClass309) interfaceC60442pS).E6P());
        }
        if (!AbstractC75423a9.A02(c1ni, interfaceC60442pS) && num != C05F.A01) {
            if (AbstractC75423a9.A01(c1ni, interfaceC60442pS) || c1ni.CW9()) {
                num2 = C05F.A00;
            } else {
                return;
            }
        } else {
            num2 = C05F.A01;
        }
        A0I(userSession, c82713mZ, interfaceC60442pS, num2);
    }

    public static void A0C(UserSession userSession, C82713mZ c82713mZ, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Integer num) {
        if (num == null) {
            if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
        }
        A0I(userSession, c82713mZ, interfaceC60442pS, num);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0D(com.instagram.common.session.UserSession r1, X.C82713mZ r2, X.C1NI r3, java.lang.String r4) {
        /*
            boolean r0 = r3 instanceof X.C38321qM
            if (r0 == 0) goto La
            boolean r0 = r3.CdW()
            if (r0 != 0) goto Lf
        La:
            boolean r0 = r3 instanceof X.C40971v4
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1298939544: goto L1a;
                case 120623625: goto L17;
                case 823466996: goto L23;
                default: goto L16;
            }
        L16:
            return
        L17:
            java.lang.String r0 = "impression"
            goto L25
        L1a:
            java.lang.String r0 = "sub_impression"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L31
            return
        L23:
            java.lang.String r0 = "delivery"
        L25:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = X.C32V.A00(r1)
            r2.A4Y = r0
        L31:
            boolean r0 = X.AbstractC61652rS.A02(r1)
            if (r0 == 0) goto Le
            X.1Ai r0 = X.AbstractC23021Ah.A00(r1)
            X.1Aj r0 = X.AbstractC61652rS.A01(r0)
            java.lang.String r0 = r0.toString()
            r2.A4d = r0
            X.1Aj r0 = X.AbstractC61652rS.A00(r1)
            java.lang.String r0 = r0.toString()
            r2.A4e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32U.A0D(com.instagram.common.session.UserSession, X.3mZ, X.1NI, java.lang.String):void");
    }

    public static void A0G(UserSession userSession, C82713mZ c82713mZ, InterfaceC38371qR interfaceC38371qR, Boolean bool) {
        C4o9 c4o9;
        C11520jB A01;
        if ((interfaceC38371qR instanceof C40971v4) && (c4o9 = ((C40971v4) interfaceC38371qR).A0N) != null && (A01 = BTP.A01(userSession, c4o9, c82713mZ.A76)) != null) {
            A01.A05(C5I8.A7A, bool);
            c82713mZ.A0q = A01;
        }
    }

    public static void A0H(UserSession userSession, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
    }

    public static void A0L(UserSession userSession, C5H9 c5h9, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6) {
        A04(null, null, null, null, userSession, c5h9, c1ni, interfaceC60442pS, null, null, f, f2, null, null, null, null, null, null, null, str, str2, str3, null, str4, null, str5, str6, 0);
    }

    public static void A0M(UserSession userSession, C5H9 c5h9, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HashMap hashMap, List list, List list2, boolean z) {
        C82713mZ A01 = A01(c5h9, c1ni, interfaceC60442pS, "invalidation");
        A01.A1X = Boolean.valueOf(z);
        A01.A6U = str2;
        A01.A44 = l;
        A01.A66 = str3;
        A01.A6I = str4;
        A01.A6v = str;
        A01.A84 = list2;
        A01.A1G = Boolean.valueOf(AbstractC23021Ah.A00(userSession).A1k());
        A01.A4Y = C32V.A00(userSession);
        if (str5 != null) {
            A01.A4S = str5;
        }
        if (c1ni instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) c1ni;
            A01.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            String A00 = AbstractC77343dK.A00(c38321qM.A0e);
            if (A00 != null) {
                A01.A57 = A00;
            }
        }
        C3YO A002 = C3YM.A00(userSession);
        A01.A88 = A002.A04(interfaceC60442pS, list);
        A01.A0V(A002.A03(interfaceC60442pS));
        A01.A31 = A002.A01(interfaceC60442pS);
        A01.A32 = A002.A02(interfaceC60442pS);
        if (AbstractC61652rS.A02(userSession)) {
            A01.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
            A01.A4e = AbstractC61652rS.A00(userSession).toString();
        }
        if (hashMap != null) {
            A01.A7w = (List) hashMap.get("in_pool_ad_ids");
            A01.A7x = (List) hashMap.get("inserted_ad_ids");
            A01.A86 = (List) hashMap.get("seen_ad_ids");
        }
        A01.A5r = str6;
        if (str7 != null) {
            A01.A69 = str7;
            A01.A6B = str7;
        }
        if (num != null) {
            A01.A2q = Integer.valueOf(num.intValue());
        }
        if (str8 != null) {
            A01.A6J = str8;
        }
        A0I(userSession, A01, interfaceC60442pS, C05F.A01);
    }

    public static void A0R(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, List list, List list2, List list3, List list4, List list5, List list6, float f, int i) {
        C82713mZ c82713mZ = new C82713mZ(null, interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", "position_change"));
        c82713mZ.A7p = list;
        c82713mZ.A82 = list2;
        c82713mZ.A83 = list3;
        c82713mZ.A6i = str;
        c82713mZ.A03 = f;
        c82713mZ.A6V = str2;
        c82713mZ.A0O = i;
        c82713mZ.A7E = str3;
        c82713mZ.A4S = str4;
        c82713mZ.A0B = Integer.parseInt((String) list2.get(list2.size() - 1));
        c82713mZ.A7n = hashMap;
        c82713mZ.A4Y = C32V.A00(userSession);
        C3YO A00 = C3YM.A00(userSession);
        Integer A01 = A00.A01(interfaceC60442pS);
        Integer A02 = A00.A02(interfaceC60442pS);
        c82713mZ.A88 = A00.A04(interfaceC60442pS, null);
        c82713mZ.A0V(A00.A03(interfaceC60442pS));
        c82713mZ.A31 = A01;
        c82713mZ.A32 = A02;
        c82713mZ.A7B = str5;
        c82713mZ.A3B = num;
        c82713mZ.A3C = num2;
        c82713mZ.A39 = num3;
        c82713mZ.A3A = num4;
        c82713mZ.A6Y = str6;
        if (c38321qM != null) {
            c82713mZ.A0Q(c38321qM.A0K);
            c82713mZ.A0S(c38321qM.A0L);
        }
        if (AbstractC61652rS.A02(userSession)) {
            c82713mZ.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
            c82713mZ.A4e = AbstractC61652rS.A00(userSession).toString();
        }
        if (list4 != null) {
            c82713mZ.A7o = list4;
        }
        if (list5 != null) {
            c82713mZ.A7t = list5;
        }
        if (list6 != null) {
            c82713mZ.A7s = list6;
        }
        A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
    }

    public static void A0V(C82713mZ c82713mZ, C1NI c1ni) {
        C38576Gxf c38576Gxf;
        if ((c1ni instanceof C38321qM) && (c38576Gxf = ((C38321qM) c1ni).A0B) != null) {
            c82713mZ.A1h = true;
            c82713mZ.A3s = Long.valueOf(c38576Gxf.A00);
            String str = c38576Gxf.A01;
            c82713mZ.A69 = str;
            c82713mZ.A6B = str;
            if (c38576Gxf.A04) {
                c82713mZ.A5i = c38576Gxf.A03;
                c82713mZ.A5h = c38576Gxf.A02;
            } else {
                c82713mZ.A5g = c38576Gxf.A03;
            }
        }
    }

    public static void A0W(C82713mZ c82713mZ, C1NI c1ni, Integer num) {
        String str;
        if ((c1ni instanceof C38321qM) && num != null) {
            C38321qM c38321qM = (C38321qM) c1ni;
            int intValue = num.intValue();
            c82713mZ.A5H = c38321qM.A3B(intValue);
            C38321qM A1e = c38321qM.A1e(intValue);
            if (A1e != null) {
                str = A1e.A0C.Azz();
            } else {
                str = null;
            }
            c82713mZ.A5G = str;
        }
    }

    public static void A0X(C82713mZ c82713mZ, C38321qM c38321qM, int i) {
        if (c38321qM != null && c38321qM.A5M() && i != -1 && c38321qM.A1e(i) != null) {
            C38321qM A1e = c38321qM.A1e(i);
            c82713mZ.A08(i);
            c82713mZ.A4l = A1e.getId();
            C38321qM A1e2 = c38321qM.A1e(0);
            A1e2.getClass();
            c82713mZ.A4k = A1e2.getId();
            c82713mZ.A3U = Long.valueOf(c38321qM.A0p());
            c82713mZ.A3S = Long.valueOf(A1e.BRp().A00);
            c82713mZ.A60 = c38321qM.A0C.BPW();
            c82713mZ.A3V = AbstractC82733mb.A00(c38321qM.A0C.BPW());
            c82713mZ.A3R = AbstractC82733mb.A00(c38321qM.A2u());
            if (A1e.A5a()) {
                List A3h = A1e.A3h();
                ArrayList arrayList = new ArrayList();
                if (A3h != null) {
                    Iterator it = A3h.iterator();
                    while (it.hasNext()) {
                        String A2u = ((C38321qM) it.next()).A2u();
                        if (A2u != null) {
                            arrayList.add(A2u);
                        }
                    }
                }
                c82713mZ.A81 = arrayList;
            }
        }
    }

    public static int A00(Map map) {
        int i = 0;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                i += ((Number) ((Map.Entry) it.next()).getValue()).intValue();
            }
        }
        return i;
    }

    public static C82713mZ A01(C5H9 c5h9, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, String str) {
        String str2;
        if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
            str2 = "instagram_ad_";
        } else {
            str2 = "instagram_organic_";
        }
        return new C82713mZ(c5h9, interfaceC60442pS, AnonymousClass001.A0R(str2, str));
    }

    public static String A03(C38321qM c38321qM) {
        if (c38321qM.A5P() && c38321qM.A0C.getClipsMetadata() != null && c38321qM.A0C.getClipsMetadata().Buh() != null && c38321qM.A0C.getClipsMetadata().Buh().Ap9() != null) {
            return c38321qM.A0C.getClipsMetadata().Buh().Ap9().Ap3();
        }
        return null;
    }

    public static void A04(InterfaceC104784ni interfaceC104784ni, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, C11520jB c11520jB, C11520jB c11520jB2, UserSession userSession, C5H9 c5h9, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9;
        String str10;
        AbstractC11060iN.A00(userSession);
        C82713mZ A01 = A01(c5h9, c1ni, interfaceC60442pS, "action");
        A01.A4P = str2;
        A01.A5R = str;
        A01.A6Z = str6;
        A01.A7U = str3;
        A01.A6b = str4;
        A01.A70 = str5;
        if (f != null) {
            A01.A05 = f.floatValue();
        }
        if (f2 != null) {
            A01.A06 = f2.floatValue();
        }
        A01.A0P(f3, f4);
        A01.A0o = c11520jB;
        A01.A0k = c11520jB2;
        if (f5 != null && f6 != null) {
            A01.A2h = f5;
            A01.A2g = f6;
        }
        if (bool2 != null) {
            A01.A1R = bool2;
        }
        if (str7 != null) {
            A01.A5B = str7;
        }
        A01.A34 = num3;
        A01.A54 = str8;
        if (bool != null) {
            if (bool.booleanValue()) {
                str10 = "midscene_cta_tap";
            } else {
                str10 = "cta_tap";
            }
            A01.A76 = str10;
        }
        String str11 = C1QM.A00.A02.A00;
        if (str11 != null) {
            A01.A6C = str11;
        }
        C3KL A00 = C3KL.A00(userSession);
        C114845Gu c114845Gu = A00.A00;
        if (c114845Gu != null && C3KL.A03(A00, c114845Gu.A00) && (str9 = c114845Gu.A03) != null) {
            A01.A5K = str9;
        }
        if (interfaceC104784ni != null && interfaceC104784ni.BHK() != null) {
            A01.A0h = interfaceC104784ni;
        }
        A0A(userSession, A01, c1ni);
        if (c1ni instanceof C38321qM) {
            A01.A1i = Boolean.valueOf(AbstractC41071vF.A0O(userSession, (C38321qM) c1ni));
        }
        if (intentAwareAdsInfoIntf != null) {
            A05(intentAwareAdsInfoIntf, A01, num2, i);
        } else {
            A0V(A01, c1ni);
        }
        A0W(A01, c1ni, num);
        A0I(userSession, A01, interfaceC60442pS, C05F.A01);
    }

    public static void A05(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, C82713mZ c82713mZ, Integer num, int i) {
        Integer BVJ = intentAwareAdsInfoIntf.BVJ();
        String BVL = intentAwareAdsInfoIntf.BVL();
        String Brx = intentAwareAdsInfoIntf.Brx();
        c82713mZ.A1h = true;
        c82713mZ.A3W = Long.valueOf(i);
        if (BVJ != null) {
            c82713mZ.A3s = Long.valueOf(BVJ.intValue());
        }
        if (BVL != null) {
            c82713mZ.A69 = BVL;
            c82713mZ.A6B = BVL;
        }
        if (Brx != null) {
            c82713mZ.A5g = Brx;
        }
        if (num != null) {
            c82713mZ.A43 = Long.valueOf(num.intValue());
        }
    }

    public static void A06(C120985dq c120985dq, C82713mZ c82713mZ, int i) {
        A05((IntentAwareAdsInfoIntf) c120985dq.A03().A01.A01, c82713mZ, c120985dq.A0B(), i);
    }

    public static void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, String str3, Map map) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_netego_invalidation");
        if (A00.isSampled()) {
            A00.AAP("tracking_token", str);
            A00.AAP("viewer_session_id", str2);
            A00.AAP("tray_session_id", str3);
            A00.A9M("reasons", map);
            A00.A9M("invalidation_reason", map);
            A00.AAP("source_of_action", interfaceC11380iw.getModuleName());
            A00.A9K("min_consumed_media_gap_to_previous_ad", l);
            A00.A9K("min_consumed_media_gap_to_previous_netego", l2);
            A00.A9K("min_consumed_reel_gap_to_previous_ad", l3);
            A00.A9K("min_consumed_reel_gap_to_previous_netego", l4);
            A00.A9K("netego_id", l5);
            A00.A9K("ad_id", l6);
            A00.Cht();
        }
    }

    public static void A08(UserSession userSession, AnonymousClass318 anonymousClass318, C3ZB c3zb, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_client_delivery_funnel_end");
        if (A00.isSampled()) {
            A00.A9K("netego_slots", Long.valueOf(c3zb.A0C));
            A00.A9K("ad_slots", Long.valueOf(c3zb.A01));
            long j = c3zb.A06;
            Long valueOf = Long.valueOf(j);
            A00.A9K("inserted_ads", valueOf);
            long j2 = c3zb.A07;
            A00.A9K("inserted_netegos", Long.valueOf(j2));
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("viewer_session_id", str);
            A00.AAP("tray_session_id", str2);
            A00.A9K("brand_safe_slot_count", -1L);
            A00.A9K("brand_unsafe_slot_count", -1L);
            A00.AAP("ad_client_delivery_session_id", str3);
            A00.A7v("did_cancel_pending_request", Boolean.valueOf(c3zb.A0K));
            A00.A9K("num_content_carried_over", Long.valueOf(c3zb.A02));
            A00.A9K("reel_viewer_position", Long.valueOf(c3zb.A0H));
            A00.A9K("reel_viewer_entry_position", Long.valueOf(c3zb.A0G));
            A00.A9K("session_items_count", Long.valueOf(c3zb.A0D));
            A00.A9K("num_ads_injected", valueOf);
            long j3 = c3zb.A04;
            A00.A9K("num_ads_delivered", Long.valueOf(j3));
            A00.A9K("num_ads_in_pool", Long.valueOf(c3zb.A00));
            A00.A9K("num_ads_invalidated", Long.valueOf(c3zb.A08));
            A00.A9K("num_content_consumed", Long.valueOf(c3zb.A03));
            A00.AAP("ranking_session_id", c3zb.A0J);
            A00.A9K("num_sponsored_items_injected", Long.valueOf(j + j2));
            Long valueOf2 = Long.valueOf(c3zb.A05 + j3);
            A00.A9K("num_sponsored_items_delivered", valueOf2);
            A00.A9K("num_sponsored_items_in_pool", Long.valueOf(c3zb.A0E));
            A00.A9K("num_sponsored_items_invalidated", valueOf2);
            A00.A9K("last_injected_sponsored_content_position", Long.valueOf(c3zb.A09));
            A00.A9K("last_seen_sponsored_content_position", Long.valueOf(c3zb.A0B));
            A00.A9K("last_seen_organic_item_position", Long.valueOf(c3zb.A0A));
            A00.AAP("afs_enablement_status", C32V.A00(userSession));
            A00.AAP("previous_viewer_session_id", c3zb.A0I);
            A00.A9K("time_gap_to_previous_session_in_sec", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(c3zb.A0F)));
            if (str4 != null) {
                A00.AAP("chaining_session_id", str4);
            }
            if (AbstractC61652rS.A02(userSession)) {
                A00.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString());
                A00.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession).toString());
            }
            String str5 = anonymousClass318.A0R;
            if (str5 != null) {
                A00.AAP("ad_pool_snapshot", str5);
            }
            Boolean bool = anonymousClass318.A05;
            if (bool != null) {
                A00.A7v("is_self_pog_chaining", bool);
            }
            A00.Cht();
        }
    }

    public static void A09(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_client_delivery_funnel_start");
        if (A00.isSampled()) {
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.AAP("viewer_session_id", str);
            A00.AAP("tray_session_id", str2);
            A00.AAP("ad_client_delivery_session_id", str3);
            A00.AAP("afs_enablement_status", C32V.A00(userSession));
            if (str4 != null) {
                A00.AAP("chaining_session_id", str4);
            }
            if (AbstractC61652rS.A02(userSession)) {
                A00.AAP("basic_ads_graphql_tier", AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString());
                A00.AAP("basic_ads_launcher_tier", AbstractC61652rS.A00(userSession).toString());
            }
            String str5 = anonymousClass318.A0R;
            if (str5 != null) {
                A00.AAP("ad_pool_snapshot", str5);
            }
            Boolean bool = anonymousClass318.A05;
            if (bool != null) {
                A00.A7v("is_self_pog_chaining", bool);
            }
            A00.Cht();
        }
    }

    public static void A0F(UserSession userSession, C82713mZ c82713mZ, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, Integer num, int i, boolean z) {
        A0X(c82713mZ, interfaceC38371qR.BQN(), i);
        if (z) {
            A0Y(c82713mZ, interfaceC38371qR.BQN(), i);
        }
        if (!(interfaceC38371qR instanceof C38321qM) && !(interfaceC38371qR instanceof C40971v4)) {
            throw new IllegalArgumentException("Unsupported type of ModelWithMedia");
        }
        A0B(userSession, c82713mZ, interfaceC38371qR, interfaceC60442pS, num);
    }

    public static void A0I(UserSession userSession, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, Integer num) {
        if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, num)) {
            c82713mZ.A0F(userSession);
            C19280xC A00 = c82713mZ.A00();
            AbstractC19330xH A002 = AbstractC11060iN.A00(userSession);
            if (num == C05F.A01) {
                A002.EIu(A00);
            } else {
                A002.EHW(A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
    
        if (r0.A01.A04 == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0J(com.instagram.common.session.UserSession r7, X.C5H9 r8, X.C65 r9, X.C1NI r10, X.InterfaceC60442pS r11, X.C1M1 r12, java.lang.Float r13, java.lang.Float r14, java.lang.Integer r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32U.A0J(com.instagram.common.session.UserSession, X.5H9, X.C65, X.1NI, X.2pS, X.1M1, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    public static void A0N(UserSession userSession, C5H9 c5h9, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, Integer num, String str) {
        if (AbstractC75423a9.A00(c1ni, interfaceC60442pS)) {
            C82713mZ A01 = A01(c5h9, c1ni, interfaceC60442pS, str);
            if (c1ni instanceof C38321qM) {
                A01.A8J = AbstractC41071vF.A0R(userSession, (C38321qM) c1ni);
            }
            A0D(userSession, A01, c1ni, str);
            A0C(userSession, A01, c1ni, interfaceC60442pS, num);
        }
    }

    public static void A0T(UserSession userSession, InterfaceC60442pS interfaceC60442pS, Boolean bool, String str, String str2, String str3, String str4, int i) {
        AbstractC11060iN.A00(userSession);
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", AbstractC111324zv.A00(2448)));
        c82713mZ.A7Q = str2;
        c82713mZ.A6v = str3;
        c82713mZ.A76 = str4;
        c82713mZ.A0m = new C11520jB();
        if (bool != null) {
            c82713mZ.A1d = bool;
        }
        A0X(c82713mZ, C1DW.A00(userSession).A02(str), i);
        A0A(userSession, c82713mZ, C1DW.A00(userSession).A02(str));
        A0H(userSession, c82713mZ, interfaceC60442pS);
    }

    public static void A0U(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, List list, int i, long j, long j2, boolean z) {
        AbstractC11060iN.A00(userSession);
        C82713mZ c82713mZ = new C82713mZ(null, interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", "reel_request_finish"));
        c82713mZ.A6n = str;
        c82713mZ.A7X = str2;
        c82713mZ.A1T = Boolean.valueOf(z);
        c82713mZ.A7p = list;
        c82713mZ.A0b = j;
        c82713mZ.A0c = j2;
        c82713mZ.A0a = i;
        A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
    }

    public static void A0Y(C82713mZ c82713mZ, C38321qM c38321qM, int i) {
        if (c38321qM.A5M() && i != -1 && c38321qM.A1e(i) != null) {
            C38321qM A1e = c38321qM.A1e(i);
            ArrayList arrayList = new ArrayList();
            ArrayList A3O = A1e.A3O();
            if (!AbstractC83893oY.A00(A3O)) {
                Iterator it = A3O.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC38048Gob.A01(((ProductTag) it.next()).A02));
                }
            }
            if (AbstractC83893oY.A00(arrayList)) {
                arrayList = null;
            }
            c82713mZ.A7j = arrayList;
            c82713mZ.A8B = arrayList;
            c82713mZ.A8F = AbstractC82733mb.A01(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0Z(C82713mZ c82713mZ, C40971v4 c40971v4, int i) {
        if (c40971v4.A05() && i != -1 && c40971v4.A01() != null) {
            ImmutableList A01 = c40971v4.A01();
            if (i >= 0 && i < A01.size()) {
                C38321qM c38321qM = (C38321qM) A01.get(i);
                c82713mZ.A08(i);
                c82713mZ.A4l = c38321qM.getId();
                c82713mZ.A4k = ((C38321qM) A01.get(0)).getId();
                c82713mZ.A3U = Long.valueOf(A01.size());
                c82713mZ.A3S = Long.valueOf(c38321qM.BRp().A00);
            }
        }
    }
}
