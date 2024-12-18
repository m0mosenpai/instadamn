package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.model.mediasize.ImageInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xP, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xP {
    public static Map A00(StoryTemplateAssetDictIntf storyTemplateAssetDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateAssetDictIntf.Af3() != null) {
            A1I.put("background_pk", storyTemplateAssetDictIntf.Af3());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (storyTemplateAssetDictIntf.Af9() != null) {
            ImageInfo Af9 = storyTemplateAssetDictIntf.Af9();
            if (Af9 != null) {
                treeUpdaterJNI = Af9.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1968), treeUpdaterJNI);
        }
        if (storyTemplateAssetDictIntf.BGx() != null) {
            ImageInfo BGx = storyTemplateAssetDictIntf.BGx();
            if (BGx != null) {
                treeUpdaterJNI2 = BGx.F7o();
            }
            A1I.put("image_versions2", treeUpdaterJNI2);
        }
        if (storyTemplateAssetDictIntf.CaM() != null) {
            A1I.put(AbstractC111324zv.A00(2626), storyTemplateAssetDictIntf.CaM());
        }
        if (storyTemplateAssetDictIntf.BdG() != null) {
            A1I.put(AbstractC111324zv.A00(5057), storyTemplateAssetDictIntf.BdG());
        }
        if (storyTemplateAssetDictIntf.getPk() != null) {
            A1I.put("pk", storyTemplateAssetDictIntf.getPk());
        }
        if (storyTemplateAssetDictIntf.C5j() != null) {
            A1I.put(AbstractC111324zv.A00(1329), storyTemplateAssetDictIntf.C5j());
        }
        if (storyTemplateAssetDictIntf.CIi() != null) {
            A1I.put("z_index", storyTemplateAssetDictIntf.CIi());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
