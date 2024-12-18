package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.C43294JBn;
import X.C9xR;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.tigon.tigonhuc.HucClient;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateCaptionDict extends C17T implements StoryTemplateCaptionDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(94);

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final ClipsTextFormatType B83() {
        return (ClipsTextFormatType) A0M(1458614914, C43294JBn.A00);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float CI0() {
        return A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float CIZ() {
        return A02(121);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xR.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final String Aau() {
        return A0h(1767875043);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final String Abs() {
        return A0h(1118509956);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final String ApP() {
        return A0h(-1354842768);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final String B0j() {
        return A0h(-1833928446);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float B7f() {
        return A02(-1539906063);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float BDQ() {
        return A02(-1221029593);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float BpY() {
        return A02(-40300674);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float BqP() {
        return A02(109250890);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final String BrU() {
        return A0i(-1937629992);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final float CHe() {
        return A02(113126854);
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final StoryTemplateCaptionDict F21() {
        String A0h = A0h(1767875043);
        String A0h2 = A0h(1118509956);
        String A0h3 = A0h(-1354842768);
        String A0h4 = A0h(-1833928446);
        float A02 = A02(-1539906063);
        return new StoryTemplateCaptionDict(B83(), A0h, A0h2, A0h3, A0h4, A0i(-1937629992), A0P(), A02, A02(-1221029593), A02(-40300674), A02(109250890), A02(113126854), A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A02(121), getIntValueByHashCode(-573585203));
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final String getText() {
        return A0P();
    }

    @Override // com.instagram.api.schemas.StoryTemplateCaptionDictIntf
    public final int getZIndex() {
        return getIntValueByHashCode(-573585203);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
