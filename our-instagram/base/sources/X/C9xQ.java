package X;

import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xQ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xQ {
    public static Map A00(StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateAvatarStickerOverlayDict.B3Q() != null) {
            A1I.put("expression_id", storyTemplateAvatarStickerOverlayDict.B3Q());
        }
        if (storyTemplateAvatarStickerOverlayDict.BDR() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0f(storyTemplateAvatarStickerOverlayDict.BDR()));
        }
        if (storyTemplateAvatarStickerOverlayDict.BIf() != null) {
            A1I.put(AbstractC111324zv.A00(122), storyTemplateAvatarStickerOverlayDict.BIf());
        }
        if (storyTemplateAvatarStickerOverlayDict.getMediaType() != null) {
            A1I.put("media_type", storyTemplateAvatarStickerOverlayDict.getMediaType());
        }
        if (storyTemplateAvatarStickerOverlayDict.Bpa() != null) {
            A1I.put("rotation", AbstractC166997dE.A0f(storyTemplateAvatarStickerOverlayDict.Bpa()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CHf() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0f(storyTemplateAvatarStickerOverlayDict.CHf()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CI1() != null) {
            A1I.put("x", AbstractC166997dE.A0f(storyTemplateAvatarStickerOverlayDict.CI1()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CIa() != null) {
            A1I.put("y", AbstractC166997dE.A0f(storyTemplateAvatarStickerOverlayDict.CIa()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CIi() != null) {
            A1I.put("z_index", storyTemplateAvatarStickerOverlayDict.CIi());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
