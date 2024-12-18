package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64062vR {
    public InterfaceC61782rf A00;
    public C33P A01;
    public C64072vS A02;
    public C64082vT A03;
    public final UserSession A04;
    public final C57112jm A05;
    public final C64052vQ A06;
    public final C64152va A07;
    public final C64042vP A08;
    public final C64142vZ A09;
    public final C64282vn A0A;
    public final C64182vd A0B;
    public final C64132vY A0C;
    public final C64112vW A0D;
    public final C64302vp A0E;
    public final C64272vm A0F;
    public final C64092vU A0G;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2vS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2vo, X.2vn] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.2vp] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2vY] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2vZ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.2vW] */
    public C64062vR(final UserSession userSession, C57112jm c57112jm, final InterfaceC60442pS interfaceC60442pS, C64052vQ c64052vQ, final C64042vP c64042vP, C1M1 c1m1) {
        C14360o3.A0B(c1m1, 2);
        this.A04 = userSession;
        this.A08 = c64042vP;
        this.A06 = c64052vQ;
        this.A05 = c57112jm;
        this.A02 = new Object();
        this.A03 = new C64082vT();
        final C64092vU c64092vU = new C64092vU(AbstractC11060iN.A00(userSession), false);
        this.A0G = c64092vU;
        final ?? r1 = new InterfaceC64122vX(c64042vP) { // from class: X.2vW
            public final C64042vP A00;

            @Override // X.InterfaceC64122vX
            public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
                IntentAwareAdPivotState intentAwareAdPivotState;
                C38626GyT c38626GyT = (C38626GyT) obj;
                Integer num = (Integer) obj2;
                C64042vP c64042vP2 = this.A00;
                HBC hbc = null;
                if (c38626GyT != null) {
                    hbc = c38626GyT.A03;
                }
                if (hbc != null) {
                    if (c38626GyT != null && (intentAwareAdPivotState = c38626GyT.A01) != null) {
                        if (num != null) {
                            int intValue = num.intValue();
                            if (c82383m1 != null) {
                                C38321qM A00 = ((IL5) hbc.A0B.get(intValue)).A00();
                                C19280xC A002 = C19280xC.A00(c64042vP2.A03, "instagram_ad_vpvd_imp");
                                A002.A0C(AbstractC31182DnR.A05(374, 10, 34), c64042vP2.A04.getSessionId());
                                A002.A0C("m_pk", A00.getId());
                                A002.A08(Integer.valueOf(A00.BRp().A00), "m_t");
                                A002.A0B("max_duration_ms", Long.valueOf(c82383m1.A04));
                                UserSession userSession2 = c64042vP2.A02;
                                A002.A0C("ad_id", AbstractC41071vF.A07(userSession2, A00));
                                A002.A0C("tracking_token", AbstractC41071vF.A0F(userSession2, A00));
                                A002.A0C("container_module", "feed_timeline");
                                A002.A0C("first_hscroll_item_ad_id", AbstractC41071vF.A07(userSession2, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00()));
                                A002.A0B("sum_duration_ms", Long.valueOf(c82383m1.A05));
                                A002.A0B("hscroll_seed_ad_id", c64042vP2.A08(hbc));
                                A002.A0B("hscroll_seed_media_id", C64042vP.A04(hbc));
                                A002.A0B("hscroll_seed_media_author_igid", C64042vP.A03(hbc));
                                A002.A0C("chaining_session_id", intentAwareAdPivotState.A0E);
                                A002.A09("is_multi_ads", true);
                                A002.A08(Integer.valueOf(hbc.A00), "multi_ads_type");
                                A002.A0C("multi_ads_id", hbc.getId());
                                A002.A08(num, "position_in_multi_ads_unit");
                                A002.A0C(AbstractC111324zv.A00(4938), AbstractC41071vF.A07(userSession2, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00()));
                                return A002;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.InterfaceC64122vX
            public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
                C19280xC c19280xC = (C19280xC) obj;
                C14360o3.A0B(c19280xC, 0);
                return c19280xC;
            }

            {
                this.A00 = c64042vP;
            }
        };
        this.A0D = r1;
        this.A0C = new InterfaceC43071ya(r1, c64092vU) { // from class: X.2vY
            public final C64112vW A00;
            public final C64092vU A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                List list = ((C38626GyT) obj).A03.A0B;
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                C38321qM A00 = ((IL5) list.get(((Number) obj2).intValue())).A00();
                C64092vU c64092vU2 = this.A01;
                String id = A00.getId();
                if (id != null) {
                    C82383m1 A002 = c64092vU2.A00(id);
                    interfaceC57162jr.CGk(c59062n7);
                    int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                    if (intValue != 0 && intValue != 1) {
                        A002.A04(interfaceC57162jr);
                        c64092vU2.A01(this.A00, A002, obj, obj2);
                        return;
                    } else {
                        A002.A03(c59062n7, interfaceC57162jr);
                        return;
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }

            {
                this.A01 = c64092vU;
                this.A00 = r1;
            }
        };
        this.A09 = new InterfaceC43071ya(userSession, c64042vP, c64092vU) { // from class: X.2vZ
            public final Handler A00 = new Handler(Looper.getMainLooper());
            public final UserSession A01;
            public final C64042vP A02;
            public final C64092vU A03;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                IntentAwareAdPivotState intentAwareAdPivotState;
                C06090Tz c06090Tz;
                long j;
                IntentAwareAdPivotState intentAwareAdPivotState2;
                String str;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C38626GyT c38626GyT = (C38626GyT) c59062n7.A03;
                HBC hbc = c38626GyT.A03;
                C82383m1 A00 = this.A03.A00(hbc.getId());
                float CGk = interfaceC57162jr.CGk(c59062n7);
                C64072vS c64072vS = c38626GyT.A04;
                C64082vT c64082vT = c38626GyT.A05;
                C64052vQ c64052vQ2 = c38626GyT.A02;
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 0 && intValue != 1) {
                    A00.A04(interfaceC57162jr);
                    long j2 = A00.A05;
                    if (j2 >= 250) {
                        C64042vP c64042vP2 = this.A02;
                        IntentAwareAdPivotState intentAwareAdPivotState3 = c38626GyT.A01;
                        C14360o3.A0B(intentAwareAdPivotState3, 1);
                        C18920wW c18920wW = c64042vP2.A01;
                        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2555));
                        if (A002.isSampled()) {
                            A002.A9K("chaining_position", Long.valueOf(C64042vP.A00(hbc, c64042vP2)));
                            A002.AAP("chaining_session_id", intentAwareAdPivotState3.A0E);
                            A002.AAP("client_session_id", c64042vP2.A04.getSessionId());
                            A002.A9K("sum_duration_ms", Long.valueOf(j2));
                            A002.AAk("ad_ids", C64042vP.A06(hbc, c64042vP2));
                            UserSession userSession2 = c64042vP2.A02;
                            String A07 = AbstractC41071vF.A07(userSession2, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00());
                            if (A07 != null) {
                                A002.A9K("first_hscroll_item_ad_id", AbstractC003100w.A0k(10, A07));
                                A002.AAP("container_module", "feed_timeline");
                                A002.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
                                A002.AAP("multi_ads_unit_id", hbc.getId());
                                A002.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
                                Integer A02 = hbc.A02();
                                if (A02 != null) {
                                    str = AbstractC40675I1h.A00(A02);
                                } else {
                                    str = null;
                                }
                                A002.AAP("insertion_mechanism", str);
                                A002.A9K("hscroll_seed_ad_id", c64042vP2.A08(hbc));
                                A002.A9K("hscroll_seed_media_id", C64042vP.A04(hbc));
                                A002.A9K("hscroll_seed_media_author_igid", C64042vP.A03(hbc));
                                A002.A7v("is_seed_ad_multi_ads_eligible", C64042vP.A02(userSession2, hbc.A04));
                                A002.AAP("hscroll_seed_ad_tracking_token", C64042vP.A05(userSession2, hbc.A04));
                                A002.AAP("ad_request_id", hbc.A08);
                                A002.Cht();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    if (c64072vS != null) {
                        c64072vS.A01 = null;
                    }
                    if (c64082vT != null) {
                        c64082vT.A02 = false;
                        c64082vT.A03.removeCallbacksAndMessages(null);
                    }
                    if (c64052vQ2 != null) {
                        if (c64052vQ2.A01.intValue() == 1) {
                            c64052vQ2.A01 = C05F.A0C;
                        }
                        Runnable runnable = c64052vQ2.A03;
                        if (runnable != null) {
                            c64052vQ2.A08.removeCallbacks(runnable);
                            c64052vQ2.A07 = false;
                        }
                    }
                    A00.A02();
                    return;
                }
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                Integer num = C05F.A00;
                if (CFq == num) {
                    if (c64082vT != null) {
                        c64082vT.A00 = c38626GyT.A01;
                    }
                    if (c64052vQ2 != null) {
                        c64052vQ2.A00(c38626GyT.A01.A02);
                    }
                }
                UserSession userSession3 = this.A01;
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if ((C18U.A06(c06090Tz2, userSession3, 36312874751886756L) || C18U.A06(c06090Tz2, userSession3, 36312874752935343L)) && c64072vS != null && (intentAwareAdPivotState = c64072vS.A00) != null) {
                    if (!intentAwareAdPivotState.A08) {
                        double d = CGk;
                        C06090Tz c06090Tz3 = C06090Tz.A06;
                        if (d >= C18U.A00(c06090Tz3, userSession3, 37157299682148397L)) {
                            intentAwareAdPivotState.A08 = true;
                            this.A00.postDelayed(new J3B(c64072vS), C18U.A01(c06090Tz3, userSession3, 36594349728794302L));
                        }
                    }
                    if (intentAwareAdPivotState.A08 && !intentAwareAdPivotState.A09 && CGk < C18U.A00(C06090Tz.A06, userSession3, 37157299682148397L)) {
                        intentAwareAdPivotState.A09 = true;
                        c64072vS.A01 = null;
                        this.A00.removeCallbacksAndMessages(null);
                    }
                }
                int i = hbc.A00;
                C71113Gx c71113Gx = C5MB.A00;
                Integer valueOf = Integer.valueOf(i);
                if (c71113Gx.A02(valueOf)) {
                    c06090Tz = C06090Tz.A06;
                    j = 36312874757653997L;
                } else {
                    if (c71113Gx.A01(valueOf)) {
                        c06090Tz = C06090Tz.A06;
                        j = 36312874757522923L;
                    }
                    if (c71113Gx.A02(Integer.valueOf(hbc.A00)) && C18U.A06(c06090Tz2, userSession3, 36312874760013325L) && c64052vQ2 != null && c64052vQ2.A01 == num && CGk >= 1.0d) {
                        c64052vQ2.A02(hbc.getId(), "3765512437054769");
                    }
                    A00.A03(c59062n7, interfaceC57162jr);
                }
                boolean A06 = C18U.A06(c06090Tz, userSession3, j);
                C14360o3.A0A(Boolean.valueOf(A06));
                if (A06 && c64082vT != null && CGk >= 0.8d && (intentAwareAdPivotState2 = c64082vT.A00) != null && !intentAwareAdPivotState2.A0B && !c64082vT.A02 && c64082vT.A01 != null) {
                    c64082vT.A02 = true;
                    c64082vT.A03.postDelayed(new J3D(c64082vT), C18U.A01(c06090Tz, userSession3, 36594349734495940L));
                }
                if (c71113Gx.A02(Integer.valueOf(hbc.A00))) {
                    c64052vQ2.A02(hbc.getId(), "3765512437054769");
                }
                A00.A03(c59062n7, interfaceC57162jr);
            }

            {
                this.A01 = userSession;
                this.A03 = c64092vU;
                this.A02 = c64042vP;
            }
        };
        this.A07 = new C64152va(userSession, c64042vP);
        this.A0B = new C64182vd(userSession, c64042vP);
        final String sessionId = c1m1.getSessionId();
        final String moduleName = interfaceC60442pS.getModuleName();
        this.A0F = new C64272vm(userSession, new C64252vk(userSession, new InterfaceC64212vg() { // from class: X.2vf
            @Override // X.InterfaceC64212vg
            public final /* bridge */ /* synthetic */ C9CQ AUX(Object obj, Object obj2) {
                C38626GyT c38626GyT = (C38626GyT) obj;
                int intValue = ((Number) obj2).intValue();
                C14360o3.A0B(c38626GyT, 0);
                return AbstractC82563mK.A01(((IL5) c38626GyT.A03.A0B.get(intValue)).A00());
            }

            @Override // X.InterfaceC64212vg
            public final /* bridge */ /* synthetic */ C82573mL AUY(EnumC64262vl enumC64262vl, Object obj, Object obj2, float f, long j, long j2) {
                String id;
                C38626GyT c38626GyT = (C38626GyT) obj;
                int intValue = ((Number) obj2).intValue();
                C14360o3.A0B(c38626GyT, 0);
                C14360o3.A0B(enumC64262vl, 2);
                HBC hbc = c38626GyT.A03;
                C38321qM A00 = ((IL5) hbc.A0B.get(intValue)).A00();
                UserSession userSession2 = UserSession.this;
                if (!C18U.A06(C06090Tz.A06, userSession2, 36312874753000880L) || (id = AbstractC41071vF.A07(userSession2, A00)) == null) {
                    id = A00.getId();
                }
                if (id != null) {
                    String str = sessionId;
                    String id2 = A00.getId();
                    if (id2 != null) {
                        return new C82573mL(enumC64262vl, id, str, id2, moduleName, AbstractC111324zv.A00(1026), "", f, hbc.A00, -1, -1, -1, -1, -1, -1, -1, j, j2);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }, new C64232vi(), EnumC64222vh.A06), EnumC64262vl.A05);
        this.A0A = new AbstractC64292vo(userSession);
        this.A0E = new AbstractC64292vo(userSession, interfaceC60442pS) { // from class: X.2vp
            public final UserSession A00;
            public final InterfaceC60442pS A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                String str;
                C14360o3.A0B(c59062n7, 0);
                Object obj = c59062n7.A03;
                HBC hbc = ((C38626GyT) obj).A03;
                List list = hbc.A0B;
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                String id = ((IL5) list.get(((Number) obj2).intValue())).A00().getId();
                if (id != null && interfaceC57162jr != null) {
                    int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                    if (intValue != 0) {
                        if (intValue == 2) {
                            C14360o3.A06(obj);
                            for (IL5 il5 : hbc.A0B) {
                                if (C14360o3.A0K(il5.A00().getId(), id)) {
                                    C38321qM A00 = il5.A00();
                                    LinkedHashMap A02 = AbstractC77703du.A02(hbc.getId());
                                    LinkedHashMap A022 = AbstractC77703du.A02(id);
                                    EnumC77673dr enumC77673dr = EnumC77673dr.A0S;
                                    Object obj3 = A02.get(enumC77673dr);
                                    if (obj3 == null) {
                                        obj3 = new ArrayList();
                                    }
                                    A022.put(enumC77673dr, obj3);
                                    EnumC77673dr enumC77673dr2 = EnumC77673dr.A0P;
                                    Object obj4 = A02.get(enumC77673dr2);
                                    if (obj4 == null) {
                                        obj4 = new ArrayList();
                                    }
                                    A022.put(enumC77673dr2, obj4);
                                    if (!A022.isEmpty()) {
                                        UserSession userSession2 = this.A00;
                                        InterfaceC60442pS interfaceC60442pS2 = this.A01;
                                        C18920wW A002 = AbstractC12220kQ.A00(interfaceC60442pS2, C12180kM.A05, userSession2);
                                        InterfaceC02590Ai A003 = A002.A00(A002.A00, "ig_rendering_validation_automatic");
                                        if (A003.isSampled()) {
                                            String A07 = AbstractC41071vF.A07(userSession2, A00);
                                            String str2 = "";
                                            if (A07 == null) {
                                                A07 = "";
                                            }
                                            A003.AAP("ad_id", A07);
                                            User CDj = A00.A0C.CDj();
                                            if (CDj == null) {
                                                str = "";
                                            } else {
                                                str = CDj.getId();
                                            }
                                            A003.AAP("a_pk", str);
                                            A003.AAP("m_pk", id);
                                            String A0F = AbstractC41071vF.A0F(userSession2, A00);
                                            if (A0F != null) {
                                                str2 = A0F;
                                            }
                                            A003.AAP("tracking_token", str2);
                                            A003.AAP("source_of_action", interfaceC60442pS2.getModuleName());
                                            A003.AAP("locale", C1Q2.A02().toString());
                                            A003.AAP("media_type", A00.BRp().name());
                                            String id2 = hbc.getId();
                                            C14360o3.A0B(id2, 0);
                                            C0Zx c0Zx = (C0Zx) C115775Lq.A05.get(id2);
                                            if (c0Zx == null) {
                                                c0Zx = new C0Zx();
                                            }
                                            A003.AAQ(c0Zx, "multi_ads_info");
                                            A003.A9M("pc_component_dict_new", A022);
                                            A003.A7v("is_dark_mode", Boolean.valueOf(C1H6.A03()));
                                            A003.Cht();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    A02(c59062n7, interfaceC57162jr, id, false);
                }
            }

            {
                super(userSession);
                this.A00 = userSession;
                this.A01 = interfaceC60442pS;
            }
        };
    }

    public final void A00(View view, IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, int i, boolean z) {
        String str;
        C38626GyT c38626GyT = new C38626GyT(intentAwareAdPivotState, null, hbc, null, null, i);
        C64302vp c64302vp = this.A0E;
        ((AbstractC64292vo) c64302vp).A00.put(c38626GyT, view);
        Integer valueOf = Integer.valueOf(i);
        String id = ((IL5) c38626GyT.A03.A0B.get(i)).A00().getId();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(c38626GyT, valueOf, id);
        c59072n8.A00(this.A0B);
        c59072n8.A00(this.A0C);
        c59072n8.A00(this.A0F);
        if (z) {
            if (C18U.A06(C06090Tz.A05, this.A04, 36315133899312175L)) {
                c59072n8.A00(c64302vp);
            }
        }
        C38321qM A00 = ((IL5) hbc.A0B.get(i)).A00();
        if ((!A00.A5M() || (A00 = A00.A1e(0)) != null) && A00.Cff()) {
            C33P c33p = this.A01;
            if (c33p == null) {
                str = "feedVideoModule";
            } else {
                InterfaceC61782rf interfaceC61782rf = this.A00;
                if (interfaceC61782rf == null) {
                    str = "mediaStateProvider";
                } else {
                    c59072n8.A00(new C42386Ipn(interfaceC61782rf, c33p));
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        this.A05.A05(view, c59072n8.A01());
    }
}
