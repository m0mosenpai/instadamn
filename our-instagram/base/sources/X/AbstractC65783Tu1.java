package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AppColorMode;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.ThreadThemeType;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Tu1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65783Tu1 {
    public static C66618UPf parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            ArrayList arrayList = null;
            AppColorMode appColorMode = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num2 = null;
            ArrayList arrayList2 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            ArrayList arrayList3 = null;
            UQo uQo = null;
            ArrayList arrayList4 = null;
            String str11 = null;
            String str12 = null;
            ArrayList arrayList5 = null;
            URS urs = null;
            String str13 = null;
            String str14 = null;
            Boolean bool2 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            Long l = null;
            ThreadThemeType threadThemeType = null;
            C45123Jxs c45123Jxs = null;
            String str32 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_bar_badge_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("alternative_themes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C66618UPf parseFromJson = parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("app_color_mode".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P6 = null;
                    } else {
                        A1P6 = c16l.A1P();
                    }
                    appColorMode = (AppColorMode) AppColorMode.A01.get(A1P6);
                    if (appColorMode == null) {
                        appColorMode = AppColorMode.A06;
                    }
                } else if ("blurred_composer_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("blurred_composer_border_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("blurred_composer_opaque_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("bottom_gradient_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("bubble_border_width".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("can_display_border_on_visual_message_tombstones".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("composer_circle_button_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                arrayList2.add(A1P5);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("composer_icon_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("composer_icon_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("composer_input_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("composer_placeholder_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("composer_secondary_button_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("composer_send_button_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                arrayList3.add(A1P4);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("corner_radius".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("customized_theme_asset".equals(A0q)) {
                    uQo = VOB.parseFromJson(c16l);
                } else if ("emphasis_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList4.add(A1P3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("emphasized_action_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("fallback_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("gradient_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList5.add(A1P2);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("icon_asset".equals(A0q)) {
                    urs = VPI.parseFromJson(c16l);
                } else if ("inbound_message_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("incoming_message_bubble_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("is_deprecated".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("loading_message_bubble_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("message_context_line_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("navigation_bar_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("navigation_bar_icon_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str19 = null;
                    } else {
                        str19 = c16l.A1P();
                    }
                } else if ("navigation_bar_subtitle_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str20 = null;
                    } else {
                        str20 = c16l.A1P();
                    }
                } else if ("navigation_bar_title_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str21 = null;
                    } else {
                        str21 = c16l.A1P();
                    }
                } else if ("outbound_message_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str22 = null;
                    } else {
                        str22 = c16l.A1P();
                    }
                } else if ("primary_button_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str23 = null;
                    } else {
                        str23 = c16l.A1P();
                    }
                } else if ("quoted_incoming_message_bubble_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str24 = null;
                    } else {
                        str24 = c16l.A1P();
                    }
                } else if ("reaction_pill_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str25 = null;
                    } else {
                        str25 = c16l.A1P();
                    }
                } else if ("secondary_text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str26 = null;
                    } else {
                        str26 = c16l.A1P();
                    }
                } else if ("shh_mode_interleaved_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str27 = null;
                    } else {
                        str27 = c16l.A1P();
                    }
                } else if ("should_show_incoming_message_bubble_border".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("should_use_diagonal_gradient_for_composer_circle_button".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("solid_composer_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str28 = null;
                    } else {
                        str28 = c16l.A1P();
                    }
                } else if ("solid_composer_border_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str29 = null;
                    } else {
                        str29 = c16l.A1P();
                    }
                } else if ("solid_separator_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str30 = null;
                    } else {
                        str30 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str31 = null;
                    } else {
                        str31 = c16l.A1P();
                    }
                } else if ("theme_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("theme_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    threadThemeType = (ThreadThemeType) ThreadThemeType.A01.get(A1P);
                    if (threadThemeType == null) {
                        threadThemeType = ThreadThemeType.A09;
                    }
                } else if ("thread_background_asset".equals(A0q)) {
                    c45123Jxs = VPH.parseFromJson(c16l);
                } else if ("thread_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str32 = null;
                    } else {
                        str32 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("alternative_themes", c16l, "LoadableThreadTheme");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("corner_radius", c16l, "LoadableThreadTheme");
                } else if (arrayList5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("gradient_colors", c16l, "LoadableThreadTheme");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_deprecated", c16l, "LoadableThreadTheme");
                } else if (str17 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "LoadableThreadTheme");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_show_incoming_message_bubble_border", c16l, "LoadableThreadTheme");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_use_diagonal_gradient_for_composer_circle_button", c16l, "LoadableThreadTheme");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("theme_id", c16l, "LoadableThreadTheme");
                } else if (threadThemeType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("theme_type", c16l, "LoadableThreadTheme");
                } else {
                    return new C66618UPf(c45123Jxs, appColorMode, uQo, urs, threadThemeType, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("can_display_border_on_visual_message_tombstones", c16l, "LoadableThreadTheme");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C66618UPf c66618UPf) {
        anonymousClass182.A0d();
        String str = c66618UPf.A08;
        if (str != null) {
            anonymousClass182.A0S("action_bar_badge_color", str);
        }
        List list = c66618UPf.A0e;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "alternative_themes", list);
            while (A0q.hasNext()) {
                C66618UPf c66618UPf2 = (C66618UPf) A0q.next();
                if (c66618UPf2 != null) {
                    A00(anonymousClass182, c66618UPf2);
                }
            }
            anonymousClass182.A0Z();
        }
        AppColorMode appColorMode = c66618UPf.A03;
        if (appColorMode != null) {
            anonymousClass182.A0S("app_color_mode", appColorMode.A00);
        }
        String str2 = c66618UPf.A09;
        if (str2 != null) {
            anonymousClass182.A0S("blurred_composer_background_color", str2);
        }
        String str3 = c66618UPf.A0A;
        if (str3 != null) {
            anonymousClass182.A0S("blurred_composer_border_color", str3);
        }
        String str4 = c66618UPf.A0B;
        if (str4 != null) {
            anonymousClass182.A0S("blurred_composer_opaque_background_color", str4);
        }
        String str5 = c66618UPf.A0C;
        if (str5 != null) {
            anonymousClass182.A0S("bottom_gradient_color", str5);
        }
        Integer num = c66618UPf.A07;
        if (num != null) {
            anonymousClass182.A0Q("bubble_border_width", num.intValue());
        }
        anonymousClass182.A0T("can_display_border_on_visual_message_tombstones", c66618UPf.A0j);
        List list2 = c66618UPf.A0f;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "composer_circle_button_colors", list2);
            while (A0q2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q2);
            }
            anonymousClass182.A0Z();
        }
        String str6 = c66618UPf.A0D;
        if (str6 != null) {
            anonymousClass182.A0S("composer_icon_background_color", str6);
        }
        String str7 = c66618UPf.A0E;
        if (str7 != null) {
            anonymousClass182.A0S("composer_icon_color", str7);
        }
        String str8 = c66618UPf.A0F;
        if (str8 != null) {
            anonymousClass182.A0S("composer_input_background_color", str8);
        }
        String str9 = c66618UPf.A0G;
        if (str9 != null) {
            anonymousClass182.A0S("composer_placeholder_text_color", str9);
        }
        String str10 = c66618UPf.A0H;
        if (str10 != null) {
            anonymousClass182.A0S("composer_secondary_button_color", str10);
        }
        List list3 = c66618UPf.A0g;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "composer_send_button_colors", list3);
            while (A0q3.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q3);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("corner_radius", c66618UPf.A00);
        XFC xfc = c66618UPf.A04;
        if (xfc != null) {
            anonymousClass182.A0r("customized_theme_asset");
            anonymousClass182.A0d();
            String str11 = ((UQo) xfc).A00;
            if (str11 != null) {
                anonymousClass182.A0S("theme_image_url", str11);
            }
            anonymousClass182.A0a();
        }
        List list4 = c66618UPf.A0h;
        if (list4 != null) {
            Iterator A0q4 = AbstractC37301Gc2.A0q(anonymousClass182, "emphasis_colors", list4);
            while (A0q4.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q4);
            }
            anonymousClass182.A0Z();
        }
        String str12 = c66618UPf.A0I;
        if (str12 != null) {
            anonymousClass182.A0S("emphasized_action_color", str12);
        }
        String str13 = c66618UPf.A0J;
        if (str13 != null) {
            anonymousClass182.A0S("fallback_color", str13);
        }
        List list5 = c66618UPf.A0i;
        if (list5 != null) {
            Iterator A0q5 = AbstractC37301Gc2.A0q(anonymousClass182, "gradient_colors", list5);
            while (A0q5.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q5);
            }
            anonymousClass182.A0Z();
        }
        XFV xfv = c66618UPf.A05;
        if (xfv != null) {
            anonymousClass182.A0r("icon_asset");
            URS urs = (URS) xfv;
            anonymousClass182.A0d();
            String str14 = urs.A00;
            if (str14 != null) {
                anonymousClass182.A0S("fifty", str14);
            }
            List list6 = urs.A04;
            if (list6 != null) {
                Iterator A0q6 = AbstractC37301Gc2.A0q(anonymousClass182, "icon_images", list6);
                while (A0q6.hasNext()) {
                    ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) A0q6.next();
                    if (extendedImageUrl != null) {
                        C17Y.A00(anonymousClass182, extendedImageUrl);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str15 = urs.A01;
            if (str15 != null) {
                anonymousClass182.A0S("one_hundred", str15);
            }
            String str16 = urs.A02;
            if (str16 != null) {
                anonymousClass182.A0S("seventy_five", str16);
            }
            String str17 = urs.A03;
            if (str17 != null) {
                anonymousClass182.A0S("two_hundred", str17);
            }
            anonymousClass182.A0a();
        }
        String str18 = c66618UPf.A0K;
        if (str18 != null) {
            anonymousClass182.A0S("inbound_message_text_color", str18);
        }
        String str19 = c66618UPf.A0L;
        if (str19 != null) {
            anonymousClass182.A0S("incoming_message_bubble_color", str19);
        }
        anonymousClass182.A0T("is_deprecated", c66618UPf.A0k);
        String str20 = c66618UPf.A0M;
        if (str20 != null) {
            anonymousClass182.A0S("loading_message_bubble_color", str20);
        }
        String str21 = c66618UPf.A0N;
        if (str21 != null) {
            anonymousClass182.A0S("message_context_line_color", str21);
        }
        String str22 = c66618UPf.A0O;
        if (str22 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str22);
        }
        String str23 = c66618UPf.A0P;
        if (str23 != null) {
            anonymousClass182.A0S("navigation_bar_color", str23);
        }
        String str24 = c66618UPf.A0Q;
        if (str24 != null) {
            anonymousClass182.A0S("navigation_bar_icon_color", str24);
        }
        String str25 = c66618UPf.A0R;
        if (str25 != null) {
            anonymousClass182.A0S("navigation_bar_subtitle_color", str25);
        }
        String str26 = c66618UPf.A0S;
        if (str26 != null) {
            anonymousClass182.A0S("navigation_bar_title_color", str26);
        }
        String str27 = c66618UPf.A0T;
        if (str27 != null) {
            anonymousClass182.A0S("outbound_message_text_color", str27);
        }
        String str28 = c66618UPf.A0U;
        if (str28 != null) {
            anonymousClass182.A0S("primary_button_text_color", str28);
        }
        String str29 = c66618UPf.A0V;
        if (str29 != null) {
            anonymousClass182.A0S("quoted_incoming_message_bubble_color", str29);
        }
        String str30 = c66618UPf.A0W;
        if (str30 != null) {
            anonymousClass182.A0S("reaction_pill_color", str30);
        }
        String str31 = c66618UPf.A0X;
        if (str31 != null) {
            anonymousClass182.A0S("secondary_text_color", str31);
        }
        String str32 = c66618UPf.A0Y;
        if (str32 != null) {
            anonymousClass182.A0S("shh_mode_interleaved_background_color", str32);
        }
        anonymousClass182.A0T("should_show_incoming_message_bubble_border", c66618UPf.A0l);
        anonymousClass182.A0T("should_use_diagonal_gradient_for_composer_circle_button", c66618UPf.A0m);
        String str33 = c66618UPf.A0Z;
        if (str33 != null) {
            anonymousClass182.A0S("solid_composer_background_color", str33);
        }
        String str34 = c66618UPf.A0a;
        if (str34 != null) {
            anonymousClass182.A0S("solid_composer_border_color", str34);
        }
        String str35 = c66618UPf.A0b;
        if (str35 != null) {
            anonymousClass182.A0S("solid_separator_color", str35);
        }
        String str36 = c66618UPf.A0c;
        if (str36 != null) {
            anonymousClass182.A0S("subtitle", str36);
        }
        anonymousClass182.A0R("theme_id", c66618UPf.A01);
        ThreadThemeType threadThemeType = c66618UPf.A06;
        if (threadThemeType != null) {
            anonymousClass182.A0S("theme_type", threadThemeType.A00);
        }
        C45123Jxs c45123Jxs = c66618UPf.A02;
        if (c45123Jxs != null) {
            anonymousClass182.A0r("thread_background_asset");
            anonymousClass182.A0d();
            List list7 = (List) c45123Jxs.A00;
            if (list7 != null) {
                Iterator A0q7 = AbstractC37301Gc2.A0q(anonymousClass182, "background_images", list7);
                while (A0q7.hasNext()) {
                    ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) A0q7.next();
                    if (extendedImageUrl2 != null) {
                        C17Y.A00(anonymousClass182, extendedImageUrl2);
                    }
                }
                anonymousClass182.A0Z();
            }
            UPJ upj = (UPJ) c45123Jxs.A01;
            if (upj != null) {
                anonymousClass182.A0r("background_video");
                anonymousClass182.A0d();
                AbstractC37301Gc2.A1D(anonymousClass182, upj.A05);
                ImageInfo imageInfo = upj.A04;
                if (imageInfo != null) {
                    anonymousClass182.A0r("image_versions2");
                    AbstractC39101rj.A00(anonymousClass182, imageInfo.F5B());
                }
                anonymousClass182.A0Q("media_type", upj.A01);
                anonymousClass182.A0Q("original_height", upj.A02);
                anonymousClass182.A0Q("original_width", upj.A03);
                anonymousClass182.A0P("video_duration", upj.A00);
                List list8 = upj.A06;
                if (list8 != null) {
                    Iterator A0q8 = AbstractC37301Gc2.A0q(anonymousClass182, "video_versions", list8);
                    while (A0q8.hasNext()) {
                        XFW xfw = (XFW) A0q8.next();
                        if (xfw != null) {
                            URT urt = (URT) xfw;
                            anonymousClass182.A0d();
                            DirectMediaFallbackUrl directMediaFallbackUrl = urt.A00;
                            if (directMediaFallbackUrl != null) {
                                anonymousClass182.A0r("fallback");
                                anonymousClass182.A0d();
                                String str37 = directMediaFallbackUrl.A00;
                                if (str37 != null) {
                                    anonymousClass182.A0S("url", str37);
                                }
                                anonymousClass182.A0a();
                            }
                            Integer num2 = urt.A01;
                            if (num2 != null) {
                                anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
                            }
                            AbstractC37301Gc2.A1D(anonymousClass182, urt.A05);
                            Integer num3 = urt.A02;
                            if (num3 != null) {
                                anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num3.intValue());
                            }
                            String str38 = urt.A06;
                            if (str38 != null) {
                                anonymousClass182.A0S("url", str38);
                            }
                            Long l = urt.A04;
                            if (l != null) {
                                anonymousClass182.A0R(AbstractC111324zv.A00(139), l.longValue());
                            }
                            Integer num4 = urt.A03;
                            if (num4 != null) {
                                anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num4.intValue());
                            }
                            anonymousClass182.A0a();
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0a();
            }
            String str39 = c45123Jxs.A02;
            if (str39 != null) {
                anonymousClass182.A0S("four_hundred_eighty", str39);
            }
            String str40 = c45123Jxs.A03;
            if (str40 != null) {
                anonymousClass182.A0S("one_thousand_twenty_four", str40);
            }
            String str41 = c45123Jxs.A04;
            if (str41 != null) {
                anonymousClass182.A0S("seven_hundred_twenty", str41);
            }
            String str42 = c45123Jxs.A05;
            if (str42 != null) {
                anonymousClass182.A0S("two_thousand_forty_eight", str42);
            }
            anonymousClass182.A0a();
        }
        String str43 = c66618UPf.A0d;
        if (str43 != null) {
            anonymousClass182.A0S("thread_background_color", str43);
        }
        anonymousClass182.A0a();
    }
}
