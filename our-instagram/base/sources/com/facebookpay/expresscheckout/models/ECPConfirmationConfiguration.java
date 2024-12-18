package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;

/* loaded from: classes11.dex */
public final class ECPConfirmationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(44);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;

    public ECPConfirmationConfiguration(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public ECPConfirmationConfiguration() {
        this(null, "CLOSE");
    }
}
