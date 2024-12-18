package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xY, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xY {
    public static Map A00(StoryTemplateStaticOverlayDictIntf storyTemplateStaticOverlayDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateStaticOverlayDictIntf.B9t() != null) {
            StoryTemplateGiphyStickerDictIntf B9t = storyTemplateStaticOverlayDictIntf.B9t();
            if (B9t != null) {
                treeUpdaterJNI = B9t.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("giphy_sticker_data", treeUpdaterJNI);
        }
        storyTemplateStaticOverlayDictIntf.BDQ();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0e(storyTemplateStaticOverlayDictIntf.BDQ()));
        storyTemplateStaticOverlayDictIntf.BpY();
        A1I.put("rotation", AbstractC166997dE.A0e(storyTemplateStaticOverlayDictIntf.BpY()));
        if (storyTemplateStaticOverlayDictIntf.C0o() != null) {
            A1I.put("sticker_type", storyTemplateStaticOverlayDictIntf.C0o());
        }
        if (storyTemplateStaticOverlayDictIntf.C2W() != null) {
            A1I.put("str_id", storyTemplateStaticOverlayDictIntf.C2W());
        }
        storyTemplateStaticOverlayDictIntf.CHe();
        A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0e(storyTemplateStaticOverlayDictIntf.CHe()));
        storyTemplateStaticOverlayDictIntf.CI0();
        A1I.put("x", AbstractC166997dE.A0e(storyTemplateStaticOverlayDictIntf.CI0()));
        storyTemplateStaticOverlayDictIntf.CIZ();
        A1I.put("y", AbstractC166997dE.A0e(storyTemplateStaticOverlayDictIntf.CIZ()));
        storyTemplateStaticOverlayDictIntf.getZIndex();
        return AbstractC167017dG.A0v(A1I, storyTemplateStaticOverlayDictIntf.getZIndex());
    }
}
