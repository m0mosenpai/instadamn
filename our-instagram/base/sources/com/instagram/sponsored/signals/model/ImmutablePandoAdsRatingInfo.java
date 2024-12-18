package com.instagram.sponsored.signals.model;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40879I9d;
import X.C17T;
import X.C39305HXw;
import X.JE4;
import X.JE5;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoAdsRatingInfo extends C17T implements AdsRatingInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(89);

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final AdsRatingAndReviewDisplayFormat BkK() {
        return (AdsRatingAndReviewDisplayFormat) A0N(364443985, JE4.A00);
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final List BkM() {
        return A0p(-1057513340, JE5.A00);
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40879I9d.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final String Ayb() {
        return A0i(1615269514);
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final Float BkR() {
        return A0K(-316741264);
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final Integer BpC() {
        return getOptionalIntValueByHashCode(-807286424);
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final Boolean CW2() {
        return getOptionalBooleanValueByHashCode(-1588561853);
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final AdsRatingInfo F7J() {
        String A0i = A0i(1615269514);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1588561853);
        return new AdsRatingInfo(BkK(), optionalBooleanValueByHashCode, A0K(-316741264), getOptionalIntValueByHashCode(-807286424), A0i, BkM());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
