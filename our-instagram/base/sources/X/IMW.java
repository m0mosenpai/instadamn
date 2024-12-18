package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.StoryTemplateCaptionDictIntf;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class IMW {
    public StoryTemplateAssetDictIntf A00;
    public StoryTemplateFillableStickersDict A01;
    public StoryTemplateMusicStickerDictIntf A02;
    public StoryTemplateReshareMediaDict A03;
    public Boolean A04;
    public Boolean A05;
    public List A06;
    public List A07;
    public List A08;
    public List A09;
    public final StoryTemplateDictIntf A0A;

    public final StoryTemplateDictIntf A00() {
        StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl;
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict;
        StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object storyTemplateDict;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        StoryTemplateDictIntf storyTemplateDictIntf = this.A0A;
        if (storyTemplateDictIntf instanceof ImmutablePandoStoryTemplateDict) {
            StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = this.A01;
            TreeUpdaterJNI treeUpdaterJNI4 = null;
            if (storyTemplateFillableStickersDict != null) {
                treeUpdaterJNI = storyTemplateFillableStickersDict.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L = AbstractC166987dD.A1L("fillable_stickers", treeUpdaterJNI);
            C09530e4 A1L2 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1041), this.A04);
            C09530e4 A1L3 = AbstractC166987dD.A1L("is_from_discovery_surface", this.A05);
            StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf = this.A02;
            if (storyTemplateMusicStickerDictIntf != null) {
                treeUpdaterJNI2 = storyTemplateMusicStickerDictIntf.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 A1L4 = AbstractC166987dD.A1L("music_sticker", treeUpdaterJNI2);
            StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = this.A03;
            if (storyTemplateReshareMediaDict != null) {
                treeUpdaterJNI3 = storyTemplateReshareMediaDict.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            C09530e4 A1L5 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1235), treeUpdaterJNI3);
            List<StoryTemplateAvatarStickerOverlayDict> list = this.A06;
            if (list != null) {
                arrayList4 = AbstractC166987dD.A1E();
                for (StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict : list) {
                    if (storyTemplateAvatarStickerOverlayDict != null) {
                        arrayList4.add(storyTemplateAvatarStickerOverlayDict.F7o());
                    }
                }
            } else {
                arrayList4 = null;
            }
            C09530e4 A1L6 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1283), arrayList4);
            List<StoryTemplateCaptionDictIntf> list2 = this.A07;
            if (list2 != null) {
                arrayList5 = AbstractC166987dD.A1E();
                for (StoryTemplateCaptionDictIntf storyTemplateCaptionDictIntf : list2) {
                    if (storyTemplateCaptionDictIntf != null) {
                        arrayList5.add(storyTemplateCaptionDictIntf.F7o());
                    }
                }
            } else {
                arrayList5 = null;
            }
            C09530e4 A1L7 = AbstractC166987dD.A1L("story_captions", arrayList5);
            List<StoryTemplateStaticOverlayDictIntf> list3 = this.A08;
            if (list3 != null) {
                arrayList6 = AbstractC166987dD.A1E();
                for (StoryTemplateStaticOverlayDictIntf storyTemplateStaticOverlayDictIntf : list3) {
                    if (storyTemplateStaticOverlayDictIntf != null) {
                        arrayList6.add(storyTemplateStaticOverlayDictIntf.F7o());
                    }
                }
            } else {
                arrayList6 = null;
            }
            C09530e4 A1L8 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1310), arrayList6);
            StoryTemplateAssetDictIntf storyTemplateAssetDictIntf = this.A00;
            if (storyTemplateAssetDictIntf != null) {
                treeUpdaterJNI4 = storyTemplateAssetDictIntf.F7o();
            }
            storyTemplateDict = AbstractC37303Gc4.A06(storyTemplateDictIntf, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AbstractC166987dD.A1L("template_asset", treeUpdaterJNI4), AbstractC166987dD.A1L(AbstractC111324zv.A00(1330), this.A09)});
        } else {
            StoryTemplateFillableStickersDict storyTemplateFillableStickersDict2 = this.A01;
            StoryTemplateAssetDict storyTemplateAssetDict = null;
            if (storyTemplateFillableStickersDict2 != null) {
                storyTemplateFillableStickersDictImpl = storyTemplateFillableStickersDict2.F25();
            } else {
                storyTemplateFillableStickersDictImpl = null;
            }
            Boolean bool = this.A04;
            Boolean bool2 = this.A05;
            StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf2 = this.A02;
            if (storyTemplateMusicStickerDictIntf2 != null) {
                storyTemplateMusicStickerDict = storyTemplateMusicStickerDictIntf2.F29();
            } else {
                storyTemplateMusicStickerDict = null;
            }
            StoryTemplateReshareMediaDict storyTemplateReshareMediaDict2 = this.A03;
            if (storyTemplateReshareMediaDict2 != null) {
                storyTemplateReshareMediaDictImpl = storyTemplateReshareMediaDict2.F2A();
            } else {
                storyTemplateReshareMediaDictImpl = null;
            }
            List list4 = this.A06;
            if (list4 != null) {
                arrayList = AbstractC167007dF.A0i(list4);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StoryTemplateAvatarStickerOverlayDict) it.next()).F20());
                }
            } else {
                arrayList = null;
            }
            List list5 = this.A07;
            if (list5 != null) {
                arrayList2 = AbstractC167007dF.A0i(list5);
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((StoryTemplateCaptionDictIntf) it2.next()).F21());
                }
            } else {
                arrayList2 = null;
            }
            List list6 = this.A08;
            if (list6 != null) {
                arrayList3 = AbstractC167007dF.A0i(list6);
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((StoryTemplateStaticOverlayDictIntf) it3.next()).F2B());
                }
            } else {
                arrayList3 = null;
            }
            StoryTemplateAssetDictIntf storyTemplateAssetDictIntf2 = this.A00;
            if (storyTemplateAssetDictIntf2 != null) {
                storyTemplateAssetDict = storyTemplateAssetDictIntf2.F1z();
            }
            storyTemplateDict = new StoryTemplateDict(storyTemplateAssetDict, storyTemplateFillableStickersDictImpl, storyTemplateMusicStickerDict, storyTemplateReshareMediaDictImpl, bool, bool2, arrayList, arrayList2, arrayList3, this.A09);
        }
        return (StoryTemplateDictIntf) storyTemplateDict;
    }

    public IMW(StoryTemplateDictIntf storyTemplateDictIntf) {
        this.A0A = storyTemplateDictIntf;
        this.A01 = storyTemplateDictIntf.B6N();
        this.A04 = storyTemplateDictIntf.CTR();
        this.A05 = storyTemplateDictIntf.CVB();
        this.A02 = storyTemplateDictIntf.BVo();
        this.A03 = storyTemplateDictIntf.BoP();
        this.A06 = storyTemplateDictIntf.C1C();
        this.A07 = storyTemplateDictIntf.C1H();
        this.A08 = storyTemplateDictIntf.C2J();
        this.A00 = storyTemplateDictIntf.C5d();
        this.A09 = storyTemplateDictIntf.C5k();
    }
}
