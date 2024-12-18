package X;

import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.4w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109344w1 {
    public static StoryTemplateFillableMusicStickerDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("display_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("rotation".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f3 = new Float(c16l.A0U());
                } else if ("x".equals(A0q)) {
                    f4 = new Float(c16l.A0U());
                } else if ("y".equals(A0q)) {
                    f5 = new Float(c16l.A0U());
                } else if ("z_index".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new StoryTemplateFillableMusicStickerDictImpl(f, f2, f3, f4, f5, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
