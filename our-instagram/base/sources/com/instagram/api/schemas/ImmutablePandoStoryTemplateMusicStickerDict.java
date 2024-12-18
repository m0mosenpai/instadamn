package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.C9xX;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.tigon.tigonhuc.HucClient;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateMusicStickerDict extends C17T implements StoryTemplateMusicStickerDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(2);

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final LyricsIntf BPT() {
        return (LyricsIntf) A05(-1087772684, ImmutablePandoLyrics.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final StoryTemplateMusicAssetInfoDictIntf BVU() {
        return (StoryTemplateMusicAssetInfoDictIntf) A05(541071095, ImmutablePandoStoryTemplateMusicAssetInfoDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float CI0() {
        return A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float CIZ() {
        return A02(121);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xX.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String AdC() {
        return A0h(-309882753);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int Awo() {
        return getIntValueByHashCode(-747907597);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String Ayd() {
        return A0h(1615288471);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float BDQ() {
        return A02(-1221029593);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float BpY() {
        return A02(-40300674);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float CHe() {
        return A02(113126854);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final StoryTemplateMusicStickerDict F29() {
        Lyrics lyrics;
        String A0h = A0h(-309882753);
        String A0h2 = A0h(-2061768941);
        int intValueByHashCode = getIntValueByHashCode(-615307517);
        String A0h3 = A0h(1025801609);
        String A0h4 = A0h(94842723);
        int intValueByHashCode2 = getIntValueByHashCode(-747907597);
        String A0h5 = A0h(1615288471);
        float A02 = A02(-1221029593);
        LyricsIntf BPT = BPT();
        StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = null;
        if (BPT != null) {
            lyrics = BPT.EwA();
        } else {
            lyrics = null;
        }
        StoryTemplateMusicAssetInfoDictIntf BVU = BVU();
        if (BVU != null) {
            storyTemplateMusicAssetInfoDict = BVU.F28();
        }
        return new StoryTemplateMusicStickerDict(lyrics, storyTemplateMusicAssetInfoDict, A0h, A0h2, A0h3, A0h4, A0h5, A02, A02(-40300674), A02(113126854), A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A02(121), intValueByHashCode, intValueByHashCode2, getIntValueByHashCode(-1532724339), getIntValueByHashCode(-573585203));
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String getAudioAssetId() {
        return A0h(-2061768941);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int getAudioAssetStartTimeInMs() {
        return getIntValueByHashCode(-615307517);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String getAudioClusterId() {
        return A0h(1025801609);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String getColor() {
        return A0h(94842723);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int getOverlapDurationInMs() {
        return getIntValueByHashCode(-1532724339);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int getZIndex() {
        return getIntValueByHashCode(-573585203);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
