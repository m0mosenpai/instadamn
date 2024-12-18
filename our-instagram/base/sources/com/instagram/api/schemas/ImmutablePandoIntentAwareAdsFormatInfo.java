package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40032HpJ;
import X.C17T;
import X.C39307HXy;
import X.JA1;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIntentAwareAdsFormatInfo extends C17T implements IntentAwareAdsFormatInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(8);

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final IntentAwareAdsFormatType B7y() {
        return (IntentAwareAdsFormatType) A0N(-1268779017, JA1.A00);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40032HpJ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final IntentAwareAdsFormatInfoImpl Evi() {
        return new IntentAwareAdsFormatInfoImpl(B7y(), A0Y());
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
