package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ibf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41647Ibf {
    public static void A01(EnumC39628Hem enumC39628Hem, EnumC39624Hei enumC39624Hei, InterfaceC38401qU interfaceC38401qU, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        if (interfaceC38401qU instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) interfaceC38401qU;
            String A1A = AbstractC166987dD.A1A(enumC39624Hei, EnumC39624Hei.A01);
            if (A1A == null) {
                A1A = "other";
            }
            String A1A2 = AbstractC166987dD.A1A(enumC39628Hem, EnumC39628Hem.A02);
            if (A1A2 == null) {
                A1A2 = "other";
            }
            C14360o3.A0B(c38321qM, 1);
            C82713mZ A00 = I1R.A00(c38321qM, interfaceC60442pS, "igtv_sensitivity_screen_action");
            A00.A74 = A1A;
            A00.A4P = A1A2;
            C32U.A0I(userSession, A00, interfaceC60442pS, C05F.A00);
        }
        A00(enumC39628Hem, enumC39624Hei, interfaceC38401qU, interfaceC60442pS, userSession, C05F.A0j);
    }

    public static void A00(EnumC39628Hem enumC39628Hem, EnumC39624Hei enumC39624Hei, InterfaceC38401qU interfaceC38401qU, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        EnumC39634HiP enumC39634HiP;
        EnumC39648Hid enumC39648Hid;
        InterfaceC109094vY BRN = interfaceC38401qU.BRN();
        if (BRN != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_media_overlay");
            if (A0f.isSampled()) {
                A0f.AAP("client_event_name", "action");
                AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
                A0f.A9K("entity_id", AbstractC25228BEl.A13(interfaceC38401qU.Biw()));
                A0f.AAP("overlay_type", BRN.getOverlayType());
                Integer A03 = BFB.A03(BRN);
                A03.getClass();
                A0f.AAP("overlay_layout_type", AbstractC40462Hwr.A00(A03));
                A0f.AAP("action", enumC39628Hem.A01);
                A0f.AAP("source_of_action", enumC39624Hei.A00);
                A0f.AAP("action_url", enumC39628Hem.A00);
                A0f.AAP("ixt_session_id", BRN.getSessionId());
                A0f.AAP("subcategory", BRN.getSubCategory());
                A0f.Cht();
            }
            if (BFB.A04(BRN)) {
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cix_warning_screens");
                if (A0f2.isSampled()) {
                    A0f2.AAP("event", "action");
                    A0f2.A8R(null, "integrity_ui_element");
                    int ordinal = enumC39628Hem.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            enumC39634HiP = null;
                        } else {
                            enumC39634HiP = EnumC39634HiP.OPEN_MISINFO_SEE_WHY_DIALOG;
                        }
                    } else {
                        enumC39634HiP = EnumC39634HiP.SHOW_CONTENT;
                    }
                    A0f2.A8R(enumC39634HiP, "action");
                    String overlayType = BRN.getOverlayType();
                    if ("MISINFORMATION".equals(overlayType)) {
                        enumC39648Hid = EnumC39648Hid.A02;
                    } else if ("SENSITIVITY".equals(overlayType)) {
                        enumC39648Hid = EnumC39648Hid.A03;
                    } else {
                        enumC39648Hid = null;
                    }
                    A0f2.A8R(enumC39648Hid, "top_warning_screen_category");
                    A0f2.A9K("ig_content_igid", AbstractC25228BEl.A13(interfaceC38401qU.Biw()));
                    A0f2.A8R(AbstractC72585XhP.A00(num), "surface");
                    A0f2.AAP("endpoint", interfaceC11380iw.getModuleName());
                    A0f2.Cht();
                }
            }
        }
    }

    public static void A02(InterfaceC38401qU interfaceC38401qU, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        EnumC39648Hid enumC39648Hid;
        InterfaceC109094vY BRN = interfaceC38401qU.BRN();
        if (BRN != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_media_overlay");
            if (A0f.isSampled()) {
                A0f.AAP("client_event_name", "impression");
                AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
                A0f.A9K("entity_id", AbstractC25228BEl.A13(interfaceC38401qU.Biw()));
                A0f.AAP("overlay_type", BRN.getOverlayType());
                Integer A03 = BFB.A03(BRN);
                A03.getClass();
                A0f.AAP("overlay_layout_type", AbstractC40462Hwr.A00(A03));
                A0f.AAP("ixt_session_id", BRN.getSessionId());
                A0f.AAP("subcategory", BRN.getSubCategory());
                A0f.Cht();
            }
            if (BFB.A04(BRN)) {
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "cix_warning_screens");
                if (A0f2.isSampled()) {
                    A0f2.AAP("event", AbstractC43591JPw.A00(176));
                    String overlayType = BRN.getOverlayType();
                    if ("MISINFORMATION".equals(overlayType)) {
                        enumC39648Hid = EnumC39648Hid.A02;
                    } else if ("SENSITIVITY".equals(overlayType)) {
                        enumC39648Hid = EnumC39648Hid.A03;
                    } else {
                        enumC39648Hid = null;
                    }
                    A0f2.A8R(enumC39648Hid, "top_warning_screen_category");
                    A0f2.A9K("ig_content_igid", AbstractC25228BEl.A13(interfaceC38401qU.Biw()));
                    A0f2.A8R(AbstractC72585XhP.A00(num), "surface");
                    A0f2.AAP("endpoint", interfaceC11380iw.getModuleName());
                    A0f2.Cht();
                }
            }
        }
    }
}
