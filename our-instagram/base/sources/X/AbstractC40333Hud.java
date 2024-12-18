package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hud, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40333Hud {
    public static Map A00(StoryTemplateFillableStickersDict storyTemplateFillableStickersDict) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (storyTemplateFillableStickersDict.B6L() != null) {
            List<StoryTemplateFillableGalleryStickerDict> B6L = storyTemplateFillableStickersDict.B6L();
            if (B6L != null) {
                arrayList = AbstractC166987dD.A1E();
                for (StoryTemplateFillableGalleryStickerDict storyTemplateFillableGalleryStickerDict : B6L) {
                    if (storyTemplateFillableGalleryStickerDict != null) {
                        arrayList.add(storyTemplateFillableGalleryStickerDict.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(4460), arrayList);
        }
        if (storyTemplateFillableStickersDict.B6M() != null) {
            StoryTemplateFillableMusicStickerDict B6M = storyTemplateFillableStickersDict.B6M();
            if (B6M != null) {
                treeUpdaterJNI = B6M.F7o();
            }
            A1I.put(AbstractC111324zv.A00(4461), treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
