package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.StoryTemplateCaptionDictIntf;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hub, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40331Hub {
    public static Map A00(StoryTemplateDictIntf storyTemplateDictIntf) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (storyTemplateDictIntf.B6N() != null) {
            StoryTemplateFillableStickersDict B6N = storyTemplateDictIntf.B6N();
            if (B6N != null) {
                treeUpdaterJNI3 = B6N.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("fillable_stickers", treeUpdaterJNI3);
        }
        if (storyTemplateDictIntf.CTR() != null) {
            A1I.put(AbstractC111324zv.A00(1041), storyTemplateDictIntf.CTR());
        }
        if (storyTemplateDictIntf.CVB() != null) {
            A1I.put("is_from_discovery_surface", storyTemplateDictIntf.CVB());
        }
        if (storyTemplateDictIntf.BVo() != null) {
            StoryTemplateMusicStickerDictIntf BVo = storyTemplateDictIntf.BVo();
            if (BVo != null) {
                treeUpdaterJNI2 = BVo.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("music_sticker", treeUpdaterJNI2);
        }
        if (storyTemplateDictIntf.BoP() != null) {
            StoryTemplateReshareMediaDict BoP = storyTemplateDictIntf.BoP();
            if (BoP != null) {
                treeUpdaterJNI = BoP.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1235), treeUpdaterJNI);
        }
        if (storyTemplateDictIntf.C1C() != null) {
            List<StoryTemplateAvatarStickerOverlayDict> C1C = storyTemplateDictIntf.C1C();
            if (C1C != null) {
                arrayList3 = AbstractC166987dD.A1E();
                for (StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict : C1C) {
                    if (storyTemplateAvatarStickerOverlayDict != null) {
                        arrayList3.add(storyTemplateAvatarStickerOverlayDict.F7o());
                    }
                }
            } else {
                arrayList3 = null;
            }
            A1I.put(AbstractC111324zv.A00(1283), arrayList3);
        }
        if (storyTemplateDictIntf.C1H() != null) {
            List<StoryTemplateCaptionDictIntf> C1H = storyTemplateDictIntf.C1H();
            if (C1H != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (StoryTemplateCaptionDictIntf storyTemplateCaptionDictIntf : C1H) {
                    if (storyTemplateCaptionDictIntf != null) {
                        arrayList2.add(storyTemplateCaptionDictIntf.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("story_captions", arrayList2);
        }
        if (storyTemplateDictIntf.C2J() != null) {
            List<StoryTemplateStaticOverlayDictIntf> C2J = storyTemplateDictIntf.C2J();
            if (C2J != null) {
                arrayList = AbstractC166987dD.A1E();
                for (StoryTemplateStaticOverlayDictIntf storyTemplateStaticOverlayDictIntf : C2J) {
                    if (storyTemplateStaticOverlayDictIntf != null) {
                        arrayList.add(storyTemplateStaticOverlayDictIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(1310), arrayList);
        }
        if (storyTemplateDictIntf.C5d() != null) {
            StoryTemplateAssetDictIntf C5d = storyTemplateDictIntf.C5d();
            if (C5d != null) {
                treeUpdaterJNI4 = C5d.F7o();
            }
            A1I.put("template_asset", treeUpdaterJNI4);
        }
        if (storyTemplateDictIntf.C5k() != null) {
            A1I.put(AbstractC111324zv.A00(1330), storyTemplateDictIntf.C5k());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
