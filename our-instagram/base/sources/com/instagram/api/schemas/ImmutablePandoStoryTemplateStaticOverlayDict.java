package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.C9xY;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.tigon.tigonhuc.HucClient;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateStaticOverlayDict extends C17T implements StoryTemplateStaticOverlayDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(4);

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final StoryTemplateGiphyStickerDictIntf B9t() {
        return (StoryTemplateGiphyStickerDictIntf) A05(682612812, ImmutablePandoStoryTemplateGiphyStickerDict.class);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final float CI0() {
        return A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final float CIZ() {
        return A02(121);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xY.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final float BDQ() {
        return A02(-1221029593);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final float BpY() {
        return A02(-40300674);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final String C0o() {
        return A0h(-2030994180);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final String C2W() {
        return A0h(-891995671);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final float CHe() {
        return A02(113126854);
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final StoryTemplateStaticOverlayDict F2B() {
        StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict;
        StoryTemplateGiphyStickerDictIntf B9t = B9t();
        if (B9t != null) {
            storyTemplateGiphyStickerDict = B9t.F26();
        } else {
            storyTemplateGiphyStickerDict = null;
        }
        return new StoryTemplateStaticOverlayDict(storyTemplateGiphyStickerDict, A0h(-2030994180), A0h(-891995671), A02(-1221029593), A02(-40300674), A02(113126854), A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A02(121), getIntValueByHashCode(-573585203));
    }

    @Override // com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf
    public final int getZIndex() {
        return getIntValueByHashCode(-573585203);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
