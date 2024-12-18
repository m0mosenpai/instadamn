package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import com.instagram.ui.text.TextColorScheme;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ADe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23022ADe {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.81M, java.lang.Object] */
    public static C81M parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alignment".equals(A0s)) {
                    obj.A05 = Layout.Alignment.valueOf(c16l.A1Q());
                } else if ("text_size_px".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("transform".equals(A0s)) {
                    obj.A08 = AbstractC203328yp.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("text_color_schemes".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                TextColorScheme parseFromJson = A2W.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0A = arrayList;
                    } else if ("show_background_gradient_button".equals(A0s)) {
                        obj.A0E = c16l.A0d();
                    } else if ("color_scheme_index".equals(A0s)) {
                        obj.A01 = c16l.A1D();
                    } else if ("color_scheme_solid_background_index".equals(A0s)) {
                        obj.A03 = c16l.A1D();
                    } else if ("color_scheme_solid_background_colour".equals(A0s)) {
                        obj.A02 = c16l.A1D();
                    } else if ("analytics_source".equals(A0s)) {
                        obj.A06 = AbstractC225759xu.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("reel_template_id".equals(A0s)) {
                        obj.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("should_overlay_media".equals(A0s)) {
                        obj.A0D = c16l.A0d();
                    } else if ("show_draw_button".equals(A0s)) {
                        obj.A0F = c16l.A0d();
                    } else if ("should_enable_free_transform".equals(A0s)) {
                        obj.A0C = c16l.A0d();
                    } else if ("is_mixed_text_mode".equals(A0s)) {
                        obj.A0B = c16l.A0d();
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C81M c81m) {
        anonymousClass182.A0d();
        Layout.Alignment alignment = c81m.A05;
        if (alignment != null) {
            anonymousClass182.A0S("alignment", alignment.name());
        }
        anonymousClass182.A0P("text_size_px", c81m.A00);
        if (c81m.A08 != null) {
            anonymousClass182.A0r("transform");
            AbstractC203328yp.A00(anonymousClass182, c81m.A08);
        }
        if (c81m.A0A != null) {
            C16V.A03(anonymousClass182, "text_color_schemes");
            for (TextColorScheme textColorScheme : c81m.A0A) {
                if (textColorScheme != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("text_colors", textColorScheme.A02);
                    if (textColorScheme.A04 != null) {
                        anonymousClass182.A0r("hint_text_colors");
                        AEY.A00(anonymousClass182, textColorScheme.A04);
                    }
                    anonymousClass182.A0Q("emphasis_color", textColorScheme.A01);
                    if (textColorScheme.A07 != null) {
                        C16V.A03(anonymousClass182, AbstractC111324zv.A00(176));
                        for (Number number : textColorScheme.A07) {
                            if (number != null) {
                                anonymousClass182.A0h(number.intValue());
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    Integer num = textColorScheme.A05;
                    if (num != null) {
                        anonymousClass182.A0S("background_gradient_enum", AEX.A01(num));
                    }
                    anonymousClass182.A0P("background_opacity", textColorScheme.A00);
                    GradientDrawable.Orientation orientation = textColorScheme.A03;
                    if (orientation != null) {
                        anonymousClass182.A0S("orientation", orientation.name());
                    }
                    String str = textColorScheme.A06;
                    if (str != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(350), str);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("show_background_gradient_button", c81m.A0E);
        anonymousClass182.A0Q("color_scheme_index", c81m.A01);
        anonymousClass182.A0Q("color_scheme_solid_background_index", c81m.A03);
        anonymousClass182.A0Q("color_scheme_solid_background_colour", c81m.A02);
        C88Z c88z = c81m.A06;
        if (c88z != null) {
            anonymousClass182.A0S("analytics_source", c88z.A00);
        }
        String str2 = c81m.A09;
        if (str2 != null) {
            anonymousClass182.A0S("reel_template_id", str2);
        }
        anonymousClass182.A0T("should_overlay_media", c81m.A0D);
        anonymousClass182.A0T("show_draw_button", c81m.A0F);
        anonymousClass182.A0T("should_enable_free_transform", c81m.A0C);
        anonymousClass182.A0T("is_mixed_text_mode", c81m.A0B);
        anonymousClass182.A0a();
    }
}
