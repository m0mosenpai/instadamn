package X;

import com.instagram.api.schemas.IGNativeSmartTextOverlayBackgroundShape;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import java.io.IOException;

/* renamed from: X.Hoo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40007Hoo {
    public static H3q parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment = null;
            String str = null;
            IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape = null;
            String str2 = null;
            Integer num = null;
            IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle = null;
            Float f = null;
            Integer num2 = null;
            Float f2 = null;
            Integer num3 = null;
            IGNativeSmartTextOverlayTextAlignmentEnum iGNativeSmartTextOverlayTextAlignmentEnum = null;
            IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alignment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P5 = null;
                    } else {
                        A1P5 = c16l.A1P();
                    }
                    iGNativeSmartTextOverlayStylingAlignment = (IGNativeSmartTextOverlayStylingAlignment) IGNativeSmartTextOverlayStylingAlignment.A01.get(A1P5);
                    if (iGNativeSmartTextOverlayStylingAlignment == null) {
                        iGNativeSmartTextOverlayStylingAlignment = IGNativeSmartTextOverlayStylingAlignment.A04;
                    }
                } else if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("background_shape".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    iGNativeSmartTextOverlayBackgroundShape = (IGNativeSmartTextOverlayBackgroundShape) IGNativeSmartTextOverlayBackgroundShape.A01.get(A1P4);
                    if (iGNativeSmartTextOverlayBackgroundShape == null) {
                        iGNativeSmartTextOverlayBackgroundShape = IGNativeSmartTextOverlayBackgroundShape.A05;
                    }
                } else if ("font_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("font_size".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("font_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    iGNativeSmartTextOverlayStylingFontStyle = (IGNativeSmartTextOverlayStylingFontStyle) IGNativeSmartTextOverlayStylingFontStyle.A01.get(A1P3);
                    if (iGNativeSmartTextOverlayStylingFontStyle == null) {
                        iGNativeSmartTextOverlayStylingFontStyle = IGNativeSmartTextOverlayStylingFontStyle.A09;
                    }
                } else if (AbstractC111324zv.A00(1078).equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("max_font_size".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("max_line_height".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("max_number_of_lines".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("text_alignment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGNativeSmartTextOverlayTextAlignmentEnum = (IGNativeSmartTextOverlayTextAlignmentEnum) IGNativeSmartTextOverlayTextAlignmentEnum.A01.get(A1P2);
                    if (iGNativeSmartTextOverlayTextAlignmentEnum == null) {
                        iGNativeSmartTextOverlayTextAlignmentEnum = IGNativeSmartTextOverlayTextAlignmentEnum.A04;
                    }
                } else if ("text_font_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGNativeSmartTextOverlayFontStyleEnum = (IGNativeSmartTextOverlayFontStyleEnum) IGNativeSmartTextOverlayFontStyleEnum.A01.get(A1P);
                    if (iGNativeSmartTextOverlayFontStyleEnum == null) {
                        iGNativeSmartTextOverlayFontStyleEnum = IGNativeSmartTextOverlayFontStyleEnum.A09;
                    }
                }
                c16l.A0z();
            }
            return new H3q(iGNativeSmartTextOverlayBackgroundShape, iGNativeSmartTextOverlayFontStyleEnum, iGNativeSmartTextOverlayStylingAlignment, iGNativeSmartTextOverlayStylingFontStyle, iGNativeSmartTextOverlayTextAlignmentEnum, f, f2, num, num2, num3, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
