package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.16b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC222516b {
    public static C223216l parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            SimpleImageUrl simpleImageUrl = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            SimpleImageUrl simpleImageUrl2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("available_theme_colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Integer valueOf = Integer.valueOf(c16l.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("background_image_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("emoji".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("emoji_color".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("gradient".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_background_image_blurred".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (DatePickerDialogModule.ARG_MODE.equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("selected_theme_color".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("selfie_sticker".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("selfie_url".equals(A0q)) {
                    simpleImageUrl2 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return new C223216l(simpleImageUrl, simpleImageUrl2, bool, num, num2, num3, num4, num5, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C223216l c223216l) {
        anonymousClass182.A0d();
        List<Number> list = c223216l.A09;
        if (list != null) {
            C16V.A03(anonymousClass182, "available_theme_colors");
            for (Number number : list) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        ImageUrl imageUrl = c223216l.A00;
        if (imageUrl != null) {
            anonymousClass182.A0r("background_image_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        String str = c223216l.A08;
        if (str != null) {
            anonymousClass182.A0S("emoji", str);
        }
        Integer num = c223216l.A03;
        if (num != null) {
            anonymousClass182.A0Q("emoji_color", num.intValue());
        }
        Integer num2 = c223216l.A04;
        if (num2 != null) {
            anonymousClass182.A0Q("gradient", num2.intValue());
        }
        Boolean bool = c223216l.A02;
        if (bool != null) {
            anonymousClass182.A0T("is_background_image_blurred", bool.booleanValue());
        }
        Integer num3 = c223216l.A05;
        if (num3 != null) {
            anonymousClass182.A0Q(DatePickerDialogModule.ARG_MODE, num3.intValue());
        }
        Integer num4 = c223216l.A06;
        if (num4 != null) {
            anonymousClass182.A0Q("selected_theme_color", num4.intValue());
        }
        Integer num5 = c223216l.A07;
        if (num5 != null) {
            anonymousClass182.A0Q("selfie_sticker", num5.intValue());
        }
        ImageUrl imageUrl2 = c223216l.A01;
        if (imageUrl2 != null) {
            anonymousClass182.A0r("selfie_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl2);
        }
        anonymousClass182.A0a();
    }
}
