package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.5p1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127235p1 {
    public static void A00(AnonymousClass182 anonymousClass182, DirectThreadThemeInfo directThreadThemeInfo) {
        int i;
        anonymousClass182.A0d();
        String str = directThreadThemeInfo.A0b;
        if (str != null) {
            anonymousClass182.A0S("fallback_color", str);
        }
        String str2 = directThreadThemeInfo.A0M;
        if (str2 != null) {
            anonymousClass182.A0S("dark_fallback_color", str2);
        }
        String str3 = directThreadThemeInfo.A0o;
        if (str3 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
        }
        String str4 = directThreadThemeInfo.A0f;
        if (str4 != null) {
            anonymousClass182.A0S("accessibility_label", str4);
        }
        if (directThreadThemeInfo.A0s != null) {
            C16V.A03(anonymousClass182, "gradient_colors");
            for (String str5 : directThreadThemeInfo.A0s) {
                if (str5 != null) {
                    anonymousClass182.A0u(str5);
                }
            }
            anonymousClass182.A0Z();
        }
        if (directThreadThemeInfo.A0q != null) {
            C16V.A03(anonymousClass182, "dark_gradient_colors");
            for (String str6 : directThreadThemeInfo.A0q) {
                if (str6 != null) {
                    anonymousClass182.A0u(str6);
                }
            }
            anonymousClass182.A0Z();
        }
        String str7 = directThreadThemeInfo.A0Z;
        if (str7 != null) {
            anonymousClass182.A0S("background_color", str7);
        }
        String str8 = directThreadThemeInfo.A0K;
        if (str8 != null) {
            anonymousClass182.A0S("dark_background_color", str8);
        }
        Integer num = directThreadThemeInfo.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                default:
                    i = 1;
                    break;
            }
            anonymousClass182.A0Q("thread_view_mode", i);
        }
        String str9 = directThreadThemeInfo.A0l;
        if (str9 != null) {
            anonymousClass182.A0S("light_large_background_image_uri", str9);
        }
        String str10 = directThreadThemeInfo.A0i;
        if (str10 != null) {
            anonymousClass182.A0S("dark_large_background_image_uri", str10);
        }
        anonymousClass182.A0Q("accessibility_label_id", directThreadThemeInfo.A00);
        String str11 = directThreadThemeInfo.A0a;
        if (str11 != null) {
            anonymousClass182.A0S("composer_color", str11);
        }
        String str12 = directThreadThemeInfo.A0L;
        if (str12 != null) {
            anonymousClass182.A0S("dark_composer_color", str12);
        }
        anonymousClass182.A0Q("light_theme_background_drawable_resource_id", directThreadThemeInfo.A06);
        anonymousClass182.A0Q("dark_theme_background_drawable_resource_id", directThreadThemeInfo.A02);
        anonymousClass182.A0Q("light_preview_icon_drawable_resource_id", directThreadThemeInfo.A07);
        anonymousClass182.A0Q("dark_preview_icon_drawable_resource_id", directThreadThemeInfo.A03);
        String str13 = directThreadThemeInfo.A0n;
        if (str13 != null) {
            anonymousClass182.A0S("light_preview_icon_uri", str13);
        }
        String str14 = directThreadThemeInfo.A0j;
        if (str14 != null) {
            anonymousClass182.A0S("dark_preview_icon_uri", str14);
        }
        String str15 = directThreadThemeInfo.A0m;
        if (str15 != null) {
            anonymousClass182.A0S("light_background_preview_uri", str15);
        }
        String str16 = directThreadThemeInfo.A0h;
        if (str16 != null) {
            anonymousClass182.A0S("dark_background_preview_uri", str16);
        }
        String str17 = directThreadThemeInfo.A0c;
        if (str17 != null) {
            anonymousClass182.A0S("light_theme_incoming_message_bubble_color", str17);
        }
        String str18 = directThreadThemeInfo.A0N;
        if (str18 != null) {
            anonymousClass182.A0S("dark_theme_incoming_message_bubble_color", str18);
        }
        anonymousClass182.A0Q("bubble_border_width", directThreadThemeInfo.A01);
        anonymousClass182.A0Q("ungroupable_bubble_corner_radius", directThreadThemeInfo.A08);
        anonymousClass182.A0Q("groupable_bubble_corner_radius", directThreadThemeInfo.A05);
        String str19 = directThreadThemeInfo.A0d;
        if (str19 != null) {
            anonymousClass182.A0S("light_theme_nav_bar_color", str19);
        }
        String str20 = directThreadThemeInfo.A0O;
        if (str20 != null) {
            anonymousClass182.A0S("dark_theme_nav_bar_color", str20);
        }
        String str21 = directThreadThemeInfo.A0e;
        if (str21 != null) {
            anonymousClass182.A0S("light_theme_nav_bar_subtitle_color", str21);
        }
        String str22 = directThreadThemeInfo.A0P;
        if (str22 != null) {
            anonymousClass182.A0S("dark_theme_nav_bar_subtitle_color", str22);
        }
        String str23 = directThreadThemeInfo.A0Y;
        if (str23 != null) {
            anonymousClass182.A0S("light_primary_text_message_from_me_color", str23);
        }
        String str24 = directThreadThemeInfo.A0J;
        if (str24 != null) {
            anonymousClass182.A0S("dark_primary_text_message_from_me_color", str24);
        }
        String str25 = directThreadThemeInfo.A0S;
        if (str25 != null) {
            anonymousClass182.A0S("light_composer_border_color", str25);
        }
        String str26 = directThreadThemeInfo.A0D;
        if (str26 != null) {
            anonymousClass182.A0S("dark_composer_border_color", str26);
        }
        if (directThreadThemeInfo.A0r != null) {
            C16V.A03(anonymousClass182, "light_composer_icon_background_colors");
            for (String str27 : directThreadThemeInfo.A0r) {
                if (str27 != null) {
                    anonymousClass182.A0u(str27);
                }
            }
            anonymousClass182.A0Z();
        }
        if (directThreadThemeInfo.A0p != null) {
            C16V.A03(anonymousClass182, "dark_composer_icon_background_colors");
            for (String str28 : directThreadThemeInfo.A0p) {
                if (str28 != null) {
                    anonymousClass182.A0u(str28);
                }
            }
            anonymousClass182.A0Z();
        }
        String str29 = directThreadThemeInfo.A0T;
        if (str29 != null) {
            anonymousClass182.A0S("light_composer_icon_color", str29);
        }
        String str30 = directThreadThemeInfo.A0E;
        if (str30 != null) {
            anonymousClass182.A0S("dark_composer_icon_color", str30);
        }
        String str31 = directThreadThemeInfo.A0Q;
        if (str31 != null) {
            anonymousClass182.A0S("light_action_bar_badge_color", str31);
        }
        String str32 = directThreadThemeInfo.A0B;
        if (str32 != null) {
            anonymousClass182.A0S("dark_action_bar_badge_color", str32);
        }
        String str33 = directThreadThemeInfo.A0V;
        if (str33 != null) {
            anonymousClass182.A0S("light_message_attribution_color", str33);
        }
        String str34 = directThreadThemeInfo.A0G;
        if (str34 != null) {
            anonymousClass182.A0S("dark_message_attribution_color", str34);
        }
        String str35 = directThreadThemeInfo.A0W;
        if (str35 != null) {
            anonymousClass182.A0S("light_message_context_line_color", str35);
        }
        String str36 = directThreadThemeInfo.A0H;
        if (str36 != null) {
            anonymousClass182.A0S("dark_message_context_line_color", str36);
        }
        anonymousClass182.A0Q("extra_theme_info", directThreadThemeInfo.A04);
        String str37 = directThreadThemeInfo.A0k;
        if (str37 != null) {
            anonymousClass182.A0S("extra_theme_info_string", str37);
        }
        String str38 = directThreadThemeInfo.A0X;
        if (str38 != null) {
            anonymousClass182.A0S("light_primary_button_text_color", str38);
        }
        String str39 = directThreadThemeInfo.A0I;
        if (str39 != null) {
            anonymousClass182.A0S("dark_primary_button_text_color", str39);
        }
        anonymousClass182.A0T("force_dark_naviation_bar", directThreadThemeInfo.A0t);
        String str40 = directThreadThemeInfo.A0U;
        if (str40 != null) {
            anonymousClass182.A0S("light_input_placeholder_text_color", str40);
        }
        String str41 = directThreadThemeInfo.A0F;
        if (str41 != null) {
            anonymousClass182.A0S("dark_input_placeholder_text_color", str41);
        }
        String str42 = directThreadThemeInfo.A0g;
        if (str42 != null) {
            anonymousClass182.A0S("custom_background_drawable_url", str42);
        }
        String str43 = directThreadThemeInfo.A0R;
        if (str43 != null) {
            anonymousClass182.A0S("light_bottom_gradient_color", str43);
        }
        String str44 = directThreadThemeInfo.A0C;
        if (str44 != null) {
            anonymousClass182.A0S("dark_bottom_gradient_color", str44);
        }
        anonymousClass182.A0a();
    }
}
