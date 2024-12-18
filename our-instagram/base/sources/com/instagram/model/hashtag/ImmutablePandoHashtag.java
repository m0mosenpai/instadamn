package com.instagram.model.hashtag;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC65955Tx7;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class ImmutablePandoHashtag extends C17T implements Hashtag {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(40);

    @Override // com.instagram.model.hashtag.Hashtag
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC65955Tx7.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean AbF() {
        return getOptionalBooleanValueByHashCode(1446562075);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean AbI() {
        return getOptionalBooleanValueByHashCode(-1948154558);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Integer B7N() {
        return getOptionalIntValueByHashCode(1028143168);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Integer B7W() {
        return getOptionalIntValueByHashCode(765915793);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String B8G() {
        return A0i(1544060401);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean BDt() {
        return getOptionalBooleanValueByHashCode(1767727834);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Integer BQb() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean BXF() {
        return getOptionalBooleanValueByHashCode(342632973);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final ImageUrl Bhu() {
        return A0A(1782139044);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String BrA() {
        return A0i(348451171);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String BrH() {
        return A0i(-1548880689);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean CDb() {
        return getOptionalBooleanValueByHashCode(-875391281);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean CTY() {
        return getOptionalBooleanValueByHashCode(1013486691);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final Boolean CXj() {
        return getOptionalBooleanValueByHashCode(118114326);
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final HashtagImpl F59() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1446562075);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1948154558);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1028143168);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(765915793);
        String A0i = A0i(1544060401);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1767727834);
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(1013486691);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(118114326);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-9393932);
        String A0W = A0W();
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(342632973);
        return new HashtagImpl(A0A(1782139044), optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, getOptionalBooleanValueByHashCode(-875391281), optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, A0i, A0e, A0W, A0i(348451171), A0i(-1548880689));
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.model.hashtag.Hashtag
    public final String getName() {
        return A0W();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
