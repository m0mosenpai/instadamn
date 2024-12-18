package X;

import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.StoryTemplateCaptionDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.8wT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201968wT {
    public static StoryTemplateCaptionDict parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f4 = null;
            ClipsTextFormatType clipsTextFormatType = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            String str6 = null;
            String str7 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("alignment".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("animation".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("colors".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("effects".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("font_size".equals(A0q)) {
                    f = Float.valueOf((float) c16l.A0U());
                } else if ("format_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsTextFormatType = AbstractC93084Fj.A00(A1P);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = Float.valueOf((float) c16l.A0U());
                } else if ("rotation".equals(A0q)) {
                    f3 = Float.valueOf((float) c16l.A0U());
                } else if ("scale".equals(A0q)) {
                    f4 = Float.valueOf((float) c16l.A0U());
                } else if ("secondary_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f5 = Float.valueOf((float) c16l.A0U());
                } else if ("x".equals(A0q)) {
                    f6 = Float.valueOf((float) c16l.A0U());
                } else if ("y".equals(A0q)) {
                    f7 = Float.valueOf((float) c16l.A0U());
                } else if ("z_index".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("alignment", "StoryTemplateCaptionDict");
            } else if (str3 != null || !(c16l instanceof C07950bF)) {
                if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("colors", "StoryTemplateCaptionDict");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("effects", "StoryTemplateCaptionDict");
                } else if (f == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("font_size", "StoryTemplateCaptionDict");
                } else if (clipsTextFormatType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("format_type", "StoryTemplateCaptionDict");
                } else if (f2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "StoryTemplateCaptionDict");
                } else if (f3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("rotation", "StoryTemplateCaptionDict");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("scale", "StoryTemplateCaptionDict");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("text", "StoryTemplateCaptionDict");
                } else if (f5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "StoryTemplateCaptionDict");
                } else if (f6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("x", "StoryTemplateCaptionDict");
                } else {
                    if (f7 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "y";
                    } else if (num == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "z_index";
                    } else {
                        return new StoryTemplateCaptionDict(clipsTextFormatType, str2, str3, str4, str5, str6, str7, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), f6.floatValue(), f7.floatValue(), num.intValue());
                    }
                    c0kx.A00(str, "StoryTemplateCaptionDict");
                }
            } else {
                ((C07950bF) c16l).A03.A00("animation", "StoryTemplateCaptionDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
