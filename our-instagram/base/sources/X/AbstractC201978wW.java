package X;

import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.8wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201978wW {
    public static StoryTemplateStaticOverlayDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = null;
            Float f4 = null;
            Float f5 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("giphy_sticker_data".equals(A0q)) {
                    storyTemplateGiphyStickerDict = AbstractC201988wX.parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f = Float.valueOf((float) c16l.A0U());
                } else if ("rotation".equals(A0q)) {
                    f2 = Float.valueOf((float) c16l.A0U());
                } else if ("sticker_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("str_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f3 = Float.valueOf((float) c16l.A0U());
                } else if ("x".equals(A0q)) {
                    f4 = Float.valueOf((float) c16l.A0U());
                } else if ("y".equals(A0q)) {
                    f5 = Float.valueOf((float) c16l.A0U());
                } else if ("z_index".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "StoryTemplateStaticOverlayDict");
            } else if (f2 != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("sticker_type", "StoryTemplateStaticOverlayDict");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("str_id", "StoryTemplateStaticOverlayDict");
                } else if (f3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "StoryTemplateStaticOverlayDict");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("x", "StoryTemplateStaticOverlayDict");
                } else if (f5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("y", "StoryTemplateStaticOverlayDict");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("z_index", "StoryTemplateStaticOverlayDict");
                } else {
                    return new StoryTemplateStaticOverlayDict(storyTemplateGiphyStickerDict, str, str2, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), num.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("rotation", "StoryTemplateStaticOverlayDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
