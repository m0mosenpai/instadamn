package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xS, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xS {
    public static Map A00(StoryTemplateFillableGalleryStickerDict storyTemplateFillableGalleryStickerDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateFillableGalleryStickerDict.B9Q() != null) {
            StoryTemplateFillableGalleryStickerShapes B9Q = storyTemplateFillableGalleryStickerDict.B9Q();
            if (B9Q != null) {
                str = B9Q.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(958), str);
        }
        if (storyTemplateFillableGalleryStickerDict.BDR() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0f(storyTemplateFillableGalleryStickerDict.BDR()));
        }
        if (storyTemplateFillableGalleryStickerDict.Bpa() != null) {
            A1I.put("rotation", AbstractC166997dE.A0f(storyTemplateFillableGalleryStickerDict.Bpa()));
        }
        if (storyTemplateFillableGalleryStickerDict.CHf() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0f(storyTemplateFillableGalleryStickerDict.CHf()));
        }
        if (storyTemplateFillableGalleryStickerDict.CI1() != null) {
            A1I.put("x", AbstractC166997dE.A0f(storyTemplateFillableGalleryStickerDict.CI1()));
        }
        if (storyTemplateFillableGalleryStickerDict.CIa() != null) {
            A1I.put("y", AbstractC166997dE.A0f(storyTemplateFillableGalleryStickerDict.CIa()));
        }
        if (storyTemplateFillableGalleryStickerDict.CIi() != null) {
            A1I.put("z_index", storyTemplateFillableGalleryStickerDict.CIi());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
