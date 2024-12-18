package X;

import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xV, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xV {
    public static Map A00(StoryTemplateGiphyStickerImageDictIntf storyTemplateGiphyStickerImageDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateGiphyStickerImageDictIntf.BDT() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateGiphyStickerImageDictIntf.BDT());
        }
        if (storyTemplateGiphyStickerImageDictIntf.BV6() != null) {
            A1I.put("mp4_url", storyTemplateGiphyStickerImageDictIntf.BV6());
        }
        if (storyTemplateGiphyStickerImageDictIntf.getUrl() != null) {
            A1I.put("url", storyTemplateGiphyStickerImageDictIntf.getUrl());
        }
        if (storyTemplateGiphyStickerImageDictIntf.CHh() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, storyTemplateGiphyStickerImageDictIntf.CHh());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
