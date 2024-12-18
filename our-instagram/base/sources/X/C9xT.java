package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9xT, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9xT {
    public static StoryTemplateFillableGalleryStickerDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(958).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyTemplateFillableGalleryStickerShapes = (StoryTemplateFillableGalleryStickerShapes) StoryTemplateFillableGalleryStickerShapes.A01.get(A1P);
                    if (storyTemplateFillableGalleryStickerShapes == null) {
                        storyTemplateFillableGalleryStickerShapes = StoryTemplateFillableGalleryStickerShapes.A0F;
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("rotation".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("x".equals(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                } else if ("y".equals(A0s)) {
                    f5 = AbstractC167007dF.A0a(c16l);
                } else if ("z_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return new StoryTemplateFillableGalleryStickerDictImpl(storyTemplateFillableGalleryStickerShapes, f, f2, f3, f4, f5, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
