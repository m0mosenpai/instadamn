package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40331Hub;
import X.C17T;
import X.C39307HXy;
import X.IMW;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateDict extends C17T implements StoryTemplateDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(95);

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final /* synthetic */ IMW AKb() {
        return new IMW(this);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateFillableStickersDict B6N() {
        return (StoryTemplateFillableStickersDict) A05(-1099860104, ImmutablePandoStoryTemplateFillableStickersDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateMusicStickerDictIntf BVo() {
        return (StoryTemplateMusicStickerDictIntf) A05(-1724798685, ImmutablePandoStoryTemplateMusicStickerDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateReshareMediaDict BoP() {
        return (StoryTemplateReshareMediaDict) A05(1465295729, ImmutablePandoStoryTemplateReshareMediaDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C1C() {
        return A08(-2044334337, ImmutablePandoStoryTemplateAvatarStickerOverlayDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C1H() {
        return A08(-1493295273, ImmutablePandoStoryTemplateCaptionDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C2J() {
        return A08(1789905290, ImmutablePandoStoryTemplateStaticOverlayDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateAssetDictIntf C5d() {
        return (StoryTemplateAssetDictIntf) A05(-1303161109, ImmutablePandoStoryTemplateAssetDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40331Hub.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final List C5k() {
        return getOptionalStringListByHashCode(-134796175);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final Boolean CTR() {
        return getOptionalBooleanValueByHashCode(1850495666);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final Boolean CVB() {
        return getOptionalBooleanValueByHashCode(-1966983554);
    }

    @Override // com.instagram.api.schemas.StoryTemplateDictIntf
    public final StoryTemplateDict F22() {
        StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl;
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict;
        StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        StoryTemplateFillableStickersDict B6N = B6N();
        StoryTemplateAssetDict storyTemplateAssetDict = null;
        if (B6N != null) {
            storyTemplateFillableStickersDictImpl = B6N.F25();
        } else {
            storyTemplateFillableStickersDictImpl = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1850495666);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1966983554);
        StoryTemplateMusicStickerDictIntf BVo = BVo();
        if (BVo != null) {
            storyTemplateMusicStickerDict = BVo.F29();
        } else {
            storyTemplateMusicStickerDict = null;
        }
        StoryTemplateReshareMediaDict BoP = BoP();
        if (BoP != null) {
            storyTemplateReshareMediaDictImpl = BoP.F2A();
        } else {
            storyTemplateReshareMediaDictImpl = null;
        }
        List C1C = C1C();
        if (C1C != null) {
            arrayList = AbstractC167007dF.A0i(C1C);
            Iterator it = C1C.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoryTemplateAvatarStickerOverlayDict) it.next()).F20());
            }
        } else {
            arrayList = null;
        }
        List C1H = C1H();
        if (C1H != null) {
            arrayList2 = AbstractC167007dF.A0i(C1H);
            Iterator it2 = C1H.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((StoryTemplateCaptionDictIntf) it2.next()).F21());
            }
        } else {
            arrayList2 = null;
        }
        List C2J = C2J();
        if (C2J != null) {
            arrayList3 = AbstractC167007dF.A0i(C2J);
            Iterator it3 = C2J.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((StoryTemplateStaticOverlayDictIntf) it3.next()).F2B());
            }
        } else {
            arrayList3 = null;
        }
        StoryTemplateAssetDictIntf C5d = C5d();
        if (C5d != null) {
            storyTemplateAssetDict = C5d.F1z();
        }
        return new StoryTemplateDict(storyTemplateAssetDict, storyTemplateFillableStickersDictImpl, storyTemplateMusicStickerDict, storyTemplateReshareMediaDictImpl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, arrayList, arrayList2, arrayList3, getOptionalStringListByHashCode(-134796175));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
