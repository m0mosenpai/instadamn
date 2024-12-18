package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.util.List;

/* renamed from: X.1s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39261s3 {
    public static C1s4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C106384qs c106384qs = null;
            C106384qs c106384qs2 = null;
            H2C h2c = null;
            H2G h2g = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C37409Gdp c37409Gdp = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("adtaxon_i18n_top1_l7_prediction".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("feed_dwell_afi_info".equals(A0q)) {
                    c106384qs = AbstractC87523vK.parseFromJson(c16l);
                } else if ("feed_post_click_afi_info".equals(A0q)) {
                    c106384qs2 = AbstractC87523vK.parseFromJson(c16l);
                } else if ("feed_repetition_info".equals(A0q)) {
                    h2c = AbstractC87543vM.parseFromJson(c16l);
                } else if ("interests_reco_info".equals(A0q)) {
                    h2g = AbstractC87533vL.parseFromJson(c16l);
                } else if ("is_feed_dwell_afi_eligible".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_feed_post_click_afi_eligible".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_reels_dwell_afi_eligible".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("story_dwell_ini_info".equals(A0q)) {
                    c37409Gdp = AbstractC115045Hz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C1s4(c106384qs, c106384qs2, h2c, h2g, c37409Gdp, bool, bool2, bool3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1s4 c1s4) {
        anonymousClass182.A0d();
        String str = c1s4.A08;
        if (str != null) {
            anonymousClass182.A0S("adtaxon_i18n_top1_l7_prediction", str);
        }
        InterfaceC106394qt interfaceC106394qt = c1s4.A00;
        if (interfaceC106394qt != null) {
            anonymousClass182.A0r("feed_dwell_afi_info");
            AbstractC87523vK.A00(anonymousClass182, interfaceC106394qt.Eqh());
        }
        InterfaceC106394qt interfaceC106394qt2 = c1s4.A01;
        if (interfaceC106394qt2 != null) {
            anonymousClass182.A0r("feed_post_click_afi_info");
            AbstractC87523vK.A00(anonymousClass182, interfaceC106394qt2.Eqh());
        }
        C5FS c5fs = c1s4.A02;
        if (c5fs != null) {
            anonymousClass182.A0r("feed_repetition_info");
            H2C Eqi = c5fs.Eqi();
            anonymousClass182.A0d();
            String str2 = Eqi.A02;
            if (str2 != null) {
                anonymousClass182.A0S("dismiss_icon_resource_name", str2);
            }
            List<InterfaceC106374qr> list = Eqi.A04;
            if (list != null) {
                C16V.A03(anonymousClass182, "questions");
                for (InterfaceC106374qr interfaceC106374qr : list) {
                    if (interfaceC106374qr != null) {
                        AbstractC106324qm.A00(anonymousClass182, interfaceC106374qr.Eqe());
                    }
                }
                anonymousClass182.A0Z();
            }
            REPETITION_UI_TYPE repetition_ui_type = Eqi.A01;
            if (repetition_ui_type != null) {
                anonymousClass182.A0S("render_mode", repetition_ui_type.A00);
            }
            String str3 = Eqi.A03;
            if (str3 != null) {
                anonymousClass182.A0S("repetition_target_type", str3);
            }
            InterfaceC106354qp interfaceC106354qp = Eqi.A00;
            if (interfaceC106354qp != null) {
                anonymousClass182.A0r("undo_button");
                AbstractC106334qn.A00(anonymousClass182, interfaceC106354qp.Eqd());
            }
            anonymousClass182.A0a();
        }
        C5FT c5ft = c1s4.A03;
        if (c5ft != null) {
            anonymousClass182.A0r("interests_reco_info");
            H2G Eqn = c5ft.Eqn();
            anonymousClass182.A0d();
            String str4 = Eqn.A04;
            if (str4 != null) {
                anonymousClass182.A0S("expand_button_label", str4);
            }
            Integer num = Eqn.A02;
            if (num != null) {
                anonymousClass182.A0Q("expanded_num_rows", num.intValue());
            }
            List<JMH> list2 = Eqn.A07;
            if (list2 != null) {
                C16V.A03(anonymousClass182, "interests");
                for (JMH jmh : list2) {
                    if (jmh != null) {
                        H2D Eqk = jmh.Eqk();
                        anonymousClass182.A0d();
                        String str5 = Eqk.A00;
                        if (str5 != null) {
                            anonymousClass182.A0S("display_name", str5);
                        }
                        String str6 = Eqk.A01;
                        if (str6 != null) {
                            anonymousClass182.A0S("emoji", str6);
                        }
                        String str7 = Eqk.A02;
                        if (str7 != null) {
                            anonymousClass182.A0S("icon_asset_filled", str7);
                        }
                        String str8 = Eqk.A03;
                        if (str8 != null) {
                            anonymousClass182.A0S("icon_asset_outline", str8);
                        }
                        String str9 = Eqk.A04;
                        if (str9 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
                        }
                        String str10 = Eqk.A05;
                        if (str10 != null) {
                            anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, str10);
                        }
                        String str11 = Eqk.A06;
                        if (str11 != null) {
                            anonymousClass182.A0S("version", str11);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            Integer num2 = Eqn.A03;
            if (num2 != null) {
                anonymousClass182.A0Q("num_rows", num2.intValue());
            }
            JK7 jk7 = Eqn.A00;
            if (jk7 != null) {
                anonymousClass182.A0r("post_selection_cta");
                H2E Eqm = jk7.Eqm();
                anonymousClass182.A0d();
                InterfaceC43499JJl interfaceC43499JJl = Eqm.A01;
                if (interfaceC43499JJl != null) {
                    anonymousClass182.A0r("extra_data");
                    H2F Eql = interfaceC43499JJl.Eql();
                    anonymousClass182.A0d();
                    String str12 = Eql.A00;
                    if (str12 != null) {
                        anonymousClass182.A0S("contextual_feed_title", str12);
                    }
                    anonymousClass182.A0a();
                }
                InterfaceC106354qp interfaceC106354qp2 = Eqm.A00;
                if (interfaceC106354qp2 != null) {
                    anonymousClass182.A0r("primary_button");
                    AbstractC106334qn.A00(anonymousClass182, interfaceC106354qp2.Eqd());
                }
                anonymousClass182.A0a();
            }
            AfiInterestsRecoStyle afiInterestsRecoStyle = Eqn.A01;
            if (afiInterestsRecoStyle != null) {
                anonymousClass182.A0S("style", afiInterestsRecoStyle.A00);
            }
            String str13 = Eqn.A05;
            if (str13 != null) {
                anonymousClass182.A0S("subtitle", str13);
            }
            String str14 = Eqn.A06;
            if (str14 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str14);
            }
            anonymousClass182.A0a();
        }
        Boolean bool = c1s4.A05;
        if (bool != null) {
            anonymousClass182.A0T("is_feed_dwell_afi_eligible", bool.booleanValue());
        }
        Boolean bool2 = c1s4.A06;
        if (bool2 != null) {
            anonymousClass182.A0T("is_feed_post_click_afi_eligible", bool2.booleanValue());
        }
        Boolean bool3 = c1s4.A07;
        if (bool3 != null) {
            anonymousClass182.A0T("is_reels_dwell_afi_eligible", bool3.booleanValue());
        }
        C5FU c5fu = c1s4.A04;
        if (c5fu != null) {
            anonymousClass182.A0r("story_dwell_ini_info");
            C37409Gdp Eqo = c5fu.Eqo();
            anonymousClass182.A0d();
            String str15 = Eqo.A00;
            if (str15 != null) {
                anonymousClass182.A0S("see_less_button_confirmation_text", str15);
            }
            String str16 = Eqo.A01;
            if (str16 != null) {
                anonymousClass182.A0S("see_less_button_confirmation_text_icon", str16);
            }
            String str17 = Eqo.A02;
            if (str17 != null) {
                anonymousClass182.A0S("see_less_button_icon", str17);
            }
            String str18 = Eqo.A03;
            if (str18 != null) {
                anonymousClass182.A0S("see_less_button_text", str18);
            }
            String str19 = Eqo.A04;
            if (str19 != null) {
                anonymousClass182.A0S("see_more_button_confirmation_text", str19);
            }
            String str20 = Eqo.A05;
            if (str20 != null) {
                anonymousClass182.A0S("see_more_button_confirmation_text_icon", str20);
            }
            String str21 = Eqo.A06;
            if (str21 != null) {
                anonymousClass182.A0S("see_more_button_icon", str21);
            }
            String str22 = Eqo.A07;
            if (str22 != null) {
                anonymousClass182.A0S("see_more_button_text", str22);
            }
            String str23 = Eqo.A08;
            if (str23 != null) {
                anonymousClass182.A0S("undo_button_confirmation_text", str23);
            }
            String str24 = Eqo.A09;
            if (str24 != null) {
                anonymousClass182.A0S("undo_button_text", str24);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
