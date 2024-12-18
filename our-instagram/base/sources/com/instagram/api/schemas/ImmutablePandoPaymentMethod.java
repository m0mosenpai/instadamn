package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.JAU;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoPaymentMethod extends C17T implements PaymentMethod {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(40);

    @Override // com.instagram.api.schemas.PaymentMethod
    public final FundingSourceType Bbq() {
        return (FundingSourceType) A0M(-652242145, JAU.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
