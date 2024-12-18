package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.C43295JBo;
import X.C9xW;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateMusicAssetInfoDict extends C17T implements StoryTemplateMusicAssetInfoDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(1);

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final MusicCanonicalType Ae6() {
        return (MusicCanonicalType) A0N(1549378051, C43295JBo.A00);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, C9xW.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final Integer Azi() {
        return getOptionalIntValueByHashCode(55068821);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final Boolean BC4() {
        return getOptionalBooleanValueByHashCode(1988432185);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final Boolean CU4() {
        return getOptionalBooleanValueByHashCode(1630845353);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final StoryTemplateMusicAssetInfoDict F28() {
        MusicCanonicalType Ae6 = Ae6();
        String A0i = A0i(-22609914);
        String A0i2 = A0i(-45086183);
        return new StoryTemplateMusicAssetInfoDict(Ae6, getOptionalBooleanValueByHashCode(1988432185), getOptionalBooleanValueByHashCode(1630845353), getOptionalIntValueByHashCode(55068821), A0i, A0i2, A0i(1436807532), A0Y());
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getCoverArtworkThumbnailUri() {
        return A0i(-22609914);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getCoverArtworkUri() {
        return A0i(-45086183);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getProgressiveDownloadUrl() {
        return A0i(1436807532);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
