package com.instagram.sponsored.signals.model;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40878I9c;
import X.C17T;
import X.C39305HXw;
import X.JE3;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoAdsIAWRatingInfo extends C17T implements AdsIAWRatingInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(88);

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final List BkM() {
        return A0p(-1057513340, JE3.A00);
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40878I9c.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final String AfN() {
        return A0i(-1218051907);
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final Float BkR() {
        return A0K(-316741264);
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final Integer BpC() {
        return getOptionalIntValueByHashCode(-807286424);
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final Boolean CSY() {
        return getOptionalBooleanValueByHashCode(414389290);
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final AdsIAWRatingInfo F7I() {
        String A0i = A0i(-1218051907);
        return new AdsIAWRatingInfo(getOptionalBooleanValueByHashCode(414389290), A0K(-316741264), getOptionalIntValueByHashCode(-807286424), A0i, BkM());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
