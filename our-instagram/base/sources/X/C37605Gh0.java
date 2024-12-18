package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONObject;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Gh0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37605Gh0 {
    public JI9 A00;
    public C5H9 A01;
    public InterfaceC38371qR A02;
    public C75113Zb A03;
    public C141596ac A04;
    public String A05;
    public final Activity A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final InterfaceC61432r6 A09;
    public final JIE A0A;
    public final EnumC37745GjK A0B;
    public final String A0C;
    public final C37606Gh1 A0D;

    public final void A0N(C5H9 c5h9, InterfaceC38371qR interfaceC38371qR, C41173IKm c41173IKm) {
        A0M(c5h9, interfaceC38371qR, null, null, c41173IKm, null, null);
    }

    private final int A00(EnumC39627Hel enumC39627Hel) {
        if (!C18U.A06(C06090Tz.A05, this.A07, 36312170371875774L)) {
            return -1;
        }
        return enumC39627Hel.A00;
    }

    private final Integer A01() {
        String A04 = C18U.A04(C06090Tz.A05, this.A07, 36882310100156861L);
        try {
            Locale locale = Locale.ROOT;
            C14360o3.A08(locale);
            String A10 = AbstractC166997dE.A10(locale, A04);
            if (A10.equals("MORE_LESS")) {
                return C05F.A00;
            }
            if (A10.equals("I9")) {
                return C05F.A01;
            }
            throw AbstractC166987dD.A12(A10);
        } catch (IllegalArgumentException e) {
            C0K8.A0G("AdsOverflowMenuHelper", AnonymousClass001.A0R("Invalid AFI button variation passed: ", A04), e);
            return C05F.A00;
        }
    }

    private final void A02(C82713mZ c82713mZ, C75113Zb c75113Zb) {
        C11520jB A0B;
        C11500j9 c11500j9;
        double d;
        C141596ac c141596ac;
        int ordinal = this.A0B.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 && (c141596ac = this.A04) != null) {
                A0B = AbstractC37300Gc1.A0B();
                AbstractC37300Gc1.A0z(C5I8.A24, A0B, c141596ac.A0r);
                AbstractC37300Gc1.A0z(C5I8.A23, A0B, AbstractC167007dF.A1O(c141596ac.A0K));
                c11500j9 = C5I8.A25;
                d = c141596ac.A0K;
            } else {
                return;
            }
        } else {
            if (c75113Zb == null) {
                return;
            }
            A0B = AbstractC37300Gc1.A0B();
            AbstractC37300Gc1.A0z(C5I8.A24, A0B, c75113Zb.A2r);
            AbstractC37300Gc1.A0z(C5I8.A23, A0B, AbstractC167007dF.A1O((c75113Zb.A0b > 0L ? 1 : (c75113Zb.A0b == 0L ? 0 : -1))));
            c11500j9 = C5I8.A25;
            d = c75113Zb.A0b;
        }
        A0B.A04(c11500j9, Double.valueOf(d));
        c82713mZ.A0k = A0B;
    }

    public static final void A03(C38321qM c38321qM, C37605Gh0 c37605Gh0) {
        UserSession userSession = c37605Gh0.A07;
        Activity activity = c37605Gh0.A06;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR != null) {
            int A0p = interfaceC38371qR.BQN().A0p();
            InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
            if (interfaceC38371qR2 != null) {
                new C75113Zb(A0p, interfaceC38371qR2.BQN().A4w());
                boolean A1U = AbstractC167007dF.A1U(c38321qM);
                C38915HBm c38915HBm = new C38915HBm();
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A1J = A1U;
                AbstractC31173DnH.A0w(activity, c38915HBm, A0y);
                return;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A04(C75113Zb c75113Zb, C37605Gh0 c37605Gh0) {
        c37605Gh0.A09(c75113Zb, EnumC39619HeT.A04, "hide_button", AbstractC166997dE.A0p(c37605Gh0.A06, 2131963528));
    }

    public static final void A05(C75113Zb c75113Zb, C37605Gh0 c37605Gh0) {
        String str = c37605Gh0.A05;
        Activity activity = c37605Gh0.A06;
        if (str != null) {
            String A0p = AbstractC166997dE.A0p(activity, 2131972369);
            EnumC39619HeT enumC39619HeT = EnumC39619HeT.A05;
            String str2 = c37605Gh0.A05;
            A07(null, c37605Gh0, "report_button");
            WEz A01 = AbstractC69993VzD.A01(activity, c37605Gh0.A08, c37605Gh0.A07, c37605Gh0.A0B.A00, VG2.A03, str2);
            A01.A07 = A0p;
            A01.A07(enumC39619HeT);
            A01.A08(new C39456Hbi(2, c75113Zb, enumC39619HeT, c37605Gh0));
            WEz.A00(null, A01);
            return;
        }
        c37605Gh0.A09(c75113Zb, EnumC39619HeT.A05, "report_button", AbstractC166997dE.A0p(activity, 2131972369));
    }

    public static final void A06(C75113Zb c75113Zb, C37605Gh0 c37605Gh0) {
        UserSession userSession = c37605Gh0.A07;
        if (!C18U.A06(C06090Tz.A05, userSession, 2342162369360501966L)) {
            A04(c75113Zb, c37605Gh0);
            return;
        }
        JI9 ji9 = c37605Gh0.A00;
        if (ji9 != null) {
            C37734Gj9 c37734Gj9 = new C37734Gj9(ji9, userSession);
            Activity activity = c37605Gh0.A06;
            C146106i8 A0H = AbstractC37304Gc5.A0H();
            AbstractC25226BEj.A1N(activity, A0H, 2131973192);
            A0H.A02();
            A0H.A0L = true;
            A0H.A0R = true;
            AbstractC31175DnJ.A0l(activity, A0H, 2131976066);
            A0H.A0A(new C42695Iuq(0, activity, c37734Gj9, ji9));
            Drawable drawable = activity.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
            if (drawable != null) {
                AbstractC37304Gc5.A0p(activity, drawable, A0H);
                AbstractC31178DnM.A1S(A0H);
                ji9.ClL("see_less");
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A07(C75113Zb c75113Zb, C37605Gh0 c37605Gh0, String str) {
        Serializable A01;
        String obj;
        C0Zx c0Zx;
        InterfaceC60442pS interfaceC60442pS = c37605Gh0.A08;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        String str2 = "model";
        if (interfaceC38371qR != null) {
            C5H9 c5h9 = c37605Gh0.A01;
            if (c5h9 == null) {
                str2 = "insightsProcessor";
            } else {
                C82713mZ A012 = C32U.A01(c5h9, interfaceC38371qR, interfaceC60442pS, str);
                UserSession userSession = c37605Gh0.A07;
                InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
                if (interfaceC38371qR2 != null) {
                    A012.A0J(userSession, interfaceC38371qR2);
                    c37605Gh0.A02(A012, c75113Zb);
                    if (str.equals("waist_button")) {
                        C37606Gh1 c37606Gh1 = c37605Gh0.A0D;
                        UserSession userSession2 = c37606Gh1.A00;
                        InterfaceC60442pS interfaceC60442pS2 = c37606Gh1.A01;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS2, userSession2), "instagram_ad_waist_button");
                        if (A0f.isSampled()) {
                            C11520jB A013 = A012.A01();
                            Long l = (Long) A013.A01(C5I8.A0C);
                            if (l != null && (A01 = A013.A01(C5I8.A0Z)) != null && (obj = A01.toString()) != null) {
                                AbstractC37300Gc1.A0g(A0f, l);
                                AbstractC37300Gc1.A0o(A0f, AbstractC37300Gc1.A0R(C5I8.A9R, A013));
                                AbstractC37300Gc1.A0l(A0f, AbstractC37300Gc1.A0R(C5I8.A5K, A013));
                                A0f.AAP("a_pk", obj);
                                A0f.AAP("carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A013));
                                A0f.AAP("module_name", interfaceC60442pS2.getModuleName());
                                A0f.AAP("inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A013));
                                AbstractC37300Gc1.A0h(A0f, (Long) A013.A01(C5I8.A5M));
                                AbstractC37300Gc1.A0k(A0f, (Long) A013.A01(C5I8.A5G));
                                A0f.AAP("delivery_flags", AbstractC37300Gc1.A0R(C5I8.A27, A013));
                                C11520jB c11520jB = (C11520jB) A013.A01(C5I8.A21);
                                if (c11520jB != null) {
                                    c0Zx = new C0Zx();
                                    c0Zx.A03("is_delayed_skip_ad", (Boolean) c11520jB.A01(C5I8.A24));
                                    c0Zx.A03("is_action_on_unskippable", (Boolean) c11520jB.A01(C5I8.A23));
                                    c0Zx.A04("remaining_time", (Double) c11520jB.A01(C5I8.A25));
                                } else {
                                    c0Zx = null;
                                }
                                A0f.AAQ(c0Zx, AbstractC111324zv.A00(203));
                                A0f.Cht();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    InterfaceC38371qR interfaceC38371qR3 = c37605Gh0.A02;
                    if (interfaceC38371qR3 != null) {
                        C32U.A0C(userSession, A012, interfaceC38371qR3, interfaceC60442pS, null);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A0A(C37605Gh0 c37605Gh0) {
        String A07;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR != null) {
            if (interfaceC38371qR instanceof C40971v4) {
                A07 = ((C40971v4) interfaceC38371qR).A0S;
            } else {
                A07 = AbstractC41071vF.A07(c37605Gh0.A07, interfaceC38371qR.BQN());
            }
            if (A07 != null) {
                InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
                if (interfaceC38371qR2 != null) {
                    C38321qM BQN = interfaceC38371qR2.BQN();
                    UserSession userSession = c37605Gh0.A07;
                    IDW idw = new IDW(c37605Gh0);
                    C14360o3.A0B(BQN, 2);
                    Long A0j = AbstractC166997dE.A0j(A07);
                    if (A0j != null) {
                        C19270xB A0D = AbstractC31171DnF.A0D("remove_from_ad_activity_helper");
                        EnumC39633HiO enumC39633HiO = EnumC39633HiO.DELETE_CLICK_CLIENT;
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A05("timestamp", Long.valueOf(AbstractC31177DnL.A06()));
                        c0Zx.A05("ad_id", A0j);
                        AbstractC40766I4u.A00(enumC39633HiO, A0D, userSession, "remove_from_ad_activity_helper", "remove", AbstractC166987dD.A1J(c0Zx));
                    }
                    C42753Ivr c42753Ivr = new C42753Ivr(userSession, BQN, idw, A07);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    C0CA A02 = GraphQlCallInput.A02.A02();
                    C0CA.A00(A02, A07, "ad_id");
                    AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, A0b, "input"), "AdActivityRemoveMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59606QiV.class, true, null, 96, null, "xfb_delete_recent_ad_activity", AbstractC166987dD.A1E()), new C32539EUp(c42753Ivr, 36));
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A0B(C37605Gh0 c37605Gh0) {
        A07(null, c37605Gh0, MSV.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI));
        AbstractC31175DnJ.A1M(c37605Gh0.A08, new C63397SjR(c37605Gh0.A06, c37605Gh0.A07, C2Fb.A0X, MSV.A00(213), false));
    }

    public static final void A0C(C37605Gh0 c37605Gh0) {
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR == null) {
            C14360o3.A0F("model");
            throw C00O.createAndThrow();
        }
        C38321qM BQN = interfaceC38371qR.BQN();
        UserSession userSession = c37605Gh0.A07;
        User A2E = BQN.A2E(userSession);
        if (A2E != null) {
            AbstractC41669Ic1.A01(c37605Gh0.A06, userSession, A2E.getId(), c37605Gh0.A0B.A01);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0D(C37605Gh0 c37605Gh0) {
        UserSession userSession = c37605Gh0.A07;
        Activity activity = c37605Gh0.A06;
        InterfaceC60442pS interfaceC60442pS = c37605Gh0.A08;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR != null) {
            WEz A01 = AbstractC69993VzD.A01(activity, interfaceC60442pS, userSession, c37605Gh0.A0B.A00, VG2.A0d, interfaceC38371qR.BQN().getId());
            InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
            if (interfaceC38371qR2 != null) {
                A01.A01 = interfaceC38371qR2.BQN().A2E(userSession);
                AbstractC37301Gc2.A1R(A01, new C33312Eo7(c37605Gh0, 10));
                return;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A0E(C37605Gh0 c37605Gh0) {
        Activity activity = c37605Gh0.A06;
        UserSession userSession = c37605Gh0.A07;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR == null) {
            C14360o3.A0F("model");
            throw C00O.createAndThrow();
        }
        AbstractC55199Oe9.A05(activity, userSession, interfaceC38371qR.BQN(), C37605Gh0.class, c37605Gh0.A08.getModuleName());
    }

    public static final void A0F(C37605Gh0 c37605Gh0) {
        JI9 ji9 = c37605Gh0.A00;
        if (ji9 != null) {
            C37734Gj9 c37734Gj9 = new C37734Gj9(ji9, c37605Gh0.A07);
            Activity activity = c37605Gh0.A06;
            C146106i8 A0H = AbstractC37304Gc5.A0H();
            AbstractC25226BEj.A1N(activity, A0H, 2131973199);
            A0H.A02();
            A0H.A0L = true;
            A0H.A0R = true;
            AbstractC31175DnJ.A0l(activity, A0H, 2131976066);
            A0H.A0A(new C42695Iuq(1, activity, c37734Gj9, ji9));
            Drawable drawable = activity.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
            if (drawable != null) {
                AbstractC37304Gc5.A0p(activity, drawable, A0H);
                AbstractC31178DnM.A1S(A0H);
                ji9.ClL("see_more");
                c37605Gh0.A0A.Cvz();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0G(C37605Gh0 c37605Gh0) {
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR != null) {
            String id = interfaceC38371qR.getId();
            if (id != null) {
                InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
                if (interfaceC38371qR2 != null) {
                    UserSession userSession = c37605Gh0.A07;
                    String BzL = interfaceC38371qR2.BzL(userSession);
                    if (BzL != null) {
                        String A0R = AnonymousClass001.A0R("instagram_ad_", "hide_all_polls_button");
                        InterfaceC60442pS interfaceC60442pS = c37605Gh0.A08;
                        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, A0R);
                        c82713mZ.A7F = id;
                        c82713mZ.A7Q = BzL;
                        C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
                    }
                }
            }
            Activity activity = c37605Gh0.A06;
            Drawable drawable = activity.getDrawable(R.drawable.instagram_eye_off_pano_outline_24);
            if (drawable != null) {
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(activity, A0K, 2131954141);
                A0K.A02();
                A0K.A08(drawable, AbstractC167007dF.A09(activity, R.attr.igds_color_creation_tools_grey_03));
                AbstractC25233BEq.A1F(A0K);
            }
            AbstractC167007dF.A0J().postDelayed(RunnableC43162J5z.A00, 2000L);
            return;
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A0H(C37605Gh0 c37605Gh0) {
        String A07;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR != null) {
            if (interfaceC38371qR instanceof C40971v4) {
                A07 = ((C40971v4) interfaceC38371qR).A0S;
            } else {
                A07 = AbstractC41071vF.A07(c37605Gh0.A07, interfaceC38371qR.BQN());
            }
            UserSession userSession = c37605Gh0.A07;
            InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
            if (interfaceC38371qR2 != null) {
                String A0F = AbstractC41071vF.A0F(userSession, interfaceC38371qR2.BQN());
                A07(c37605Gh0.A03, c37605Gh0, "waist_button");
                AbstractC41669Ic1.A00(c37605Gh0.A06, userSession, new IDX(c37605Gh0), A07, A0F, c37605Gh0.A0B.A02);
                return;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A0I(C37605Gh0 c37605Gh0, String str, String str2) {
        C40971v4 c40971v4;
        InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
        if (interfaceC38371qR != null) {
            if (interfaceC38371qR instanceof C40971v4) {
                c40971v4 = (C40971v4) interfaceC38371qR;
            } else {
                c40971v4 = null;
            }
            if (c40971v4 != null && c40971v4.A0x) {
                UserSession userSession = c37605Gh0.A07;
                C25462BOb c25462BOb = (C25462BOb) userSession.A01(C25462BOb.class, new DGY(userSession, 49));
                InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
                if (interfaceC38371qR2 != null) {
                    c25462BOb.A00(((C40971v4) interfaceC38371qR2).A0S);
                    c37605Gh0.A0A.CvC(str, str2);
                    return;
                }
            } else {
                C3YT A00 = C3YS.A00(c37605Gh0.A07);
                InterfaceC38371qR interfaceC38371qR3 = c37605Gh0.A02;
                if (interfaceC38371qR3 != null) {
                    A00.A02(interfaceC38371qR3.BQN(), true);
                    c37605Gh0.A0A.CvC(str, str2);
                    return;
                }
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    private final boolean A0J() {
        C40971v4 c40971v4;
        UserSession userSession = this.A07;
        InterfaceC38371qR interfaceC38371qR = this.A02;
        if (interfaceC38371qR != null) {
            if (AbstractC41071vF.A0H(userSession, interfaceC38371qR.BQN().getId()) == null) {
                InterfaceC38371qR interfaceC38371qR2 = this.A02;
                if (interfaceC38371qR2 != null) {
                    if ((interfaceC38371qR2 instanceof C40971v4) && (c40971v4 = (C40971v4) interfaceC38371qR2) != null && c40971v4.A0c != null) {
                        return true;
                    }
                    return false;
                }
            } else {
                return true;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    private final boolean A0K() {
        InterfaceC38371qR interfaceC38371qR = this.A02;
        if (interfaceC38371qR == null) {
            C14360o3.A0F("model");
            throw C00O.createAndThrow();
        }
        boolean A5v = interfaceC38371qR.BQN().A5v();
        UserSession userSession = this.A07;
        boolean A07 = AbstractC61652rS.A07(userSession, AbstractC23021Ah.A00(userSession));
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36319360147004625L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36319360147070162L);
        if ((A5v && !A062) || ((A07 && !A06) || !C18U.A06(c06090Tz, userSession, 36319360146939088L))) {
            return false;
        }
        return true;
    }

    public final void A0L() {
        Activity activity = this.A06;
        IgdsHeadline igdsHeadline = new IgdsHeadline(activity, null, 0, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(activity.getString(2131977060));
        igdsHeadline.setBody(activity.getString(2131977061));
        igdsHeadline.EW2(R.drawable.lift_products_igbrandsurveysicon, false);
        igdsHeadline.EPC(ViewOnClickListenerC42035Ik4.A00(this, 17), 2131954145);
        C50674MYs c50674MYs = new C50674MYs(activity, this.A07);
        c50674MYs.A03 = new C42684Iuf(2);
        c50674MYs.A01 = igdsHeadline;
        c50674MYs.A03(ViewOnClickListenerC42025Iju.A00, 2131977062);
        C31727DwY.A00(activity, c50674MYs);
    }

    public C37605Gh0(Activity activity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC61432r6 interfaceC61432r6, JIE jie, EnumC37745GjK enumC37745GjK, String str) {
        AbstractC167017dG.A1P(activity, userSession);
        this.A06 = activity;
        this.A07 = userSession;
        this.A08 = interfaceC60442pS;
        this.A0B = enumC37745GjK;
        this.A0A = jie;
        this.A0C = str;
        this.A09 = interfaceC61432r6;
        this.A0D = new C37606Gh1(userSession, interfaceC60442pS);
    }

    public static final void A08(C75113Zb c75113Zb, C37605Gh0 c37605Gh0, String str, String str2) {
        A0I(c37605Gh0, str, str2);
        if (str2 != null) {
            InterfaceC60442pS interfaceC60442pS = c37605Gh0.A08;
            InterfaceC38371qR interfaceC38371qR = c37605Gh0.A02;
            String str3 = "model";
            if (interfaceC38371qR != null) {
                C5H9 c5h9 = c37605Gh0.A01;
                if (c5h9 == null) {
                    str3 = "insightsProcessor";
                } else {
                    C82713mZ A01 = C32U.A01(c5h9, interfaceC38371qR, interfaceC60442pS, "hide_response");
                    A01.A6v = str2;
                    A01.A76 = str;
                    AbstractC37302Gc3.A1R(A01);
                    UserSession userSession = c37605Gh0.A07;
                    InterfaceC38371qR interfaceC38371qR2 = c37605Gh0.A02;
                    if (interfaceC38371qR2 != null) {
                        A01.A0J(userSession, interfaceC38371qR2);
                        c37605Gh0.A02(A01, c75113Zb);
                        InterfaceC38371qR interfaceC38371qR3 = c37605Gh0.A02;
                        if (interfaceC38371qR3 != null) {
                            C32U.A0C(userSession, A01, interfaceC38371qR3, interfaceC60442pS, null);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
    }

    private final void A09(C75113Zb c75113Zb, EnumC39619HeT enumC39619HeT, String str, String str2) {
        String A07;
        A07(c75113Zb, this, str);
        UserSession userSession = this.A07;
        InterfaceC38371qR interfaceC38371qR = this.A02;
        String str3 = null;
        if (interfaceC38371qR != null) {
            Integer A05 = AbstractC41071vF.A05(userSession, interfaceC38371qR.BQN());
            JSONObject jSONObject = new JSONObject();
            if (A05 != null) {
                str3 = A05.toString();
            }
            jSONObject.put(AbstractC111324zv.A00(717), str3);
            InterfaceC38371qR interfaceC38371qR2 = this.A02;
            if (interfaceC38371qR2 != null) {
                if (interfaceC38371qR2 instanceof C40971v4) {
                    A07 = ((C40971v4) interfaceC38371qR2).A0S;
                } else {
                    A07 = AbstractC41071vF.A07(userSession, interfaceC38371qR2.BQN());
                }
                if (A07 != null) {
                    WEz A01 = AbstractC69993VzD.A01(this.A06, this.A08, userSession, this.A0B.A00, VG2.A03, A07);
                    A01.A07 = str2;
                    InterfaceC38371qR interfaceC38371qR3 = this.A02;
                    if (interfaceC38371qR3 != null) {
                        A01.A01 = interfaceC38371qR3.BQN().A2E(userSession);
                        A01.A02 = enumC39619HeT;
                        A01.A09(AbstractC111324zv.A00(2683), jSONObject.toString());
                        A01.A03 = new C39455Hbh(c75113Zb, this, enumC39619HeT, str);
                        WEz.A00(null, A01);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r1.A0x != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0609, code lost:
    
        if (A0K() == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r23.A07, 36315808212258398L) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0199, code lost:
    
        if (A0K() == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.C5H9 r24, X.InterfaceC38371qR r25, X.C75113Zb r26, X.C141596ac r27, X.C41173IKm r28, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37605Gh0.A0M(X.5H9, X.1qR, X.3Zb, X.6ac, X.IKm, java.lang.String, java.lang.String):void");
    }
}
