package com.facebookpay.form.cell.address;

import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C70221WIe;
import X.R8P;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;

/* loaded from: classes11.dex */
public final class BriefAddressCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(67);
    public final Country A00;
    public final AddressFormFieldsConfig A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public BriefAddressCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = (Country) AbstractC37304Gc5.A04(parcel, Country.class);
        this.A02 = parcel.readString();
        AddressFormFieldsConfig addressFormFieldsConfig = (AddressFormFieldsConfig) AbstractC37304Gc5.A04(parcel, AddressFormFieldsConfig.class);
        if (addressFormFieldsConfig != null) {
            this.A01 = addressFormFieldsConfig;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public BriefAddressCellParams(R8P r8p) {
        super(r8p);
        this.A00 = r8p.A00;
        this.A02 = r8p.A02;
        this.A01 = r8p.A01;
    }
}
