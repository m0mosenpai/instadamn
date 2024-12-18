package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Hei, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39624Hei {
    CENTER_BUTTON("CENTER_BUTTON"),
    BOTTOM_BUTTON("BOTTOM_BUTTON"),
    POST_REVEAL_SECONDARY_CTA("POST_REVEAL_SECONDARY_CTA"),
    OVERFLOW_MENU("OVERFLOW_MENU"),
    MEDIA_GRID("MEDIA_GRID"),
    BANNER("BANNER"),
    COMMENT_INFORM("BANNER"),
    OTHER("OTHER");

    public static final Map A01;
    public String A00;

    static {
        EnumC39624Hei enumC39624Hei = CENTER_BUTTON;
        EnumC39624Hei enumC39624Hei2 = BOTTOM_BUTTON;
        EnumC39624Hei enumC39624Hei3 = POST_REVEAL_SECONDARY_CTA;
        EnumC39624Hei enumC39624Hei4 = OVERFLOW_MENU;
        EnumC39624Hei enumC39624Hei5 = MEDIA_GRID;
        EnumC39624Hei enumC39624Hei6 = BANNER;
        HashMap A1G = AbstractC166987dD.A1G();
        A01 = A1G;
        A1G.put(enumC39624Hei, "center_button");
        A1G.put(enumC39624Hei2, "bottom_button");
        A1G.put(enumC39624Hei3, "post_reveal_cta");
        A1G.put(enumC39624Hei4, "overflow_menu");
        A1G.put(enumC39624Hei5, "media_grid");
        A1G.put(enumC39624Hei6, "banner");
    }

    EnumC39624Hei(String str) {
        this.A00 = str;
    }

    public static EnumC39624Hei A00(InterfaceC109864xE interfaceC109864xE) {
        Integer A022 = AbstractC28293Cdf.A02(interfaceC109864xE);
        if (A022 != null) {
            int intValue = A022.intValue();
            if (intValue != 3) {
                if (intValue != 2) {
                    if (intValue != 1) {
                        if (intValue == 0) {
                            return BANNER;
                        }
                    } else {
                        return POST_REVEAL_SECONDARY_CTA;
                    }
                } else {
                    return BOTTOM_BUTTON;
                }
            } else {
                return CENTER_BUTTON;
            }
        }
        return OTHER;
    }
}
