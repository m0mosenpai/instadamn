package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.C43237J9i;
import X.Ho1;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGAdCreativeStory9x16CaptionData extends C17T implements IGAdCreativeStory9x16CaptionData {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(91);

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final CaptionTextFontStyle Alm() {
        return (CaptionTextFontStyle) A0N(2091550138, C43237J9i.A00);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Ho1.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final String Alf() {
        return A0i(781639243);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final String Alg() {
        return A0i(881970794);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Integer Alh() {
        return getOptionalIntValueByHashCode(355848923);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Float Ali() {
        return A0K(714298857);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Float Alj() {
        return A0K(715222378);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final String Alk() {
        return A0i(968206282);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Integer All() {
        return getOptionalIntValueByHashCode(-1040919848);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Integer Alp() {
        return getOptionalIntValueByHashCode(2069237229);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Boolean Alq() {
        return getOptionalBooleanValueByHashCode(-127283954);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Boolean Alr() {
        return getOptionalBooleanValueByHashCode(1424998699);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final IGAdCreativeStory9x16CaptionDataImpl EuG() {
        String A0i = A0i(781639243);
        String A0i2 = A0i(881970794);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(355848923);
        Float A0K = A0K(714298857);
        Float A0K2 = A0K(715222378);
        String A0i3 = A0i(968206282);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1040919848);
        return new IGAdCreativeStory9x16CaptionDataImpl(Alm(), getOptionalBooleanValueByHashCode(-127283954), getOptionalBooleanValueByHashCode(1424998699), A0K, A0K2, optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(2069237229), A0i, A0i2, A0i3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
