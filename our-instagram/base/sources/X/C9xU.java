package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xU, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xU {
    public static Map A00(StoryTemplateGiphyStickerDictIntf storyTemplateGiphyStickerDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateGiphyStickerDictIntf.B9l() != null) {
            A1I.put("gif_id", storyTemplateGiphyStickerDictIntf.B9l());
        }
        if (storyTemplateGiphyStickerDictIntf.BGT() != null) {
            StoryTemplateGiphyStickerImageDictIntf BGT = storyTemplateGiphyStickerDictIntf.BGT();
            if (BGT != null) {
                treeUpdaterJNI = BGT.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("image", treeUpdaterJNI);
        }
        if (storyTemplateGiphyStickerDictIntf.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, storyTemplateGiphyStickerDictIntf.getTitle());
        }
        if (storyTemplateGiphyStickerDictIntf.getUsername() != null) {
            A1I.put(AbstractC50531MSk.A00(), storyTemplateGiphyStickerDictIntf.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
