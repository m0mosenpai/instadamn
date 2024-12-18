package X;

import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Ho2 {
    public static IGAdCreativeStory9x16CaptionDataImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            Float f = null;
            Float f2 = null;
            String str3 = null;
            Integer num2 = null;
            CaptionTextFontStyle captionTextFontStyle = null;
            Integer num3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2029).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(2030).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("caption_box_width_pct".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("caption_center_x_pct".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("caption_center_y_pct".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("caption_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("caption_font_size".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("caption_font_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    captionTextFontStyle = (CaptionTextFontStyle) CaptionTextFontStyle.A01.get(A1P);
                    if (captionTextFontStyle == null) {
                        captionTextFontStyle = CaptionTextFontStyle.A06;
                    }
                } else if ("caption_num_lines".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("caption_tap_area_more_present".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else {
                    bool2 = AbstractC37303Gc4.A0K(c16l, bool2, A0s, "caption_tap_area_underline_present");
                }
                c16l.A0z();
            }
            return new IGAdCreativeStory9x16CaptionDataImpl(captionTextFontStyle, bool, bool2, f, f2, num, num2, num3, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
