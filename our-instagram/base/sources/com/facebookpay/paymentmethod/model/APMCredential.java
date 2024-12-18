package com.facebookpay.paymentmethod.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63470SlB;
import X.EnumC72407Xcu;
import X.QQe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class APMCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(18);
    public final EnumC72407Xcu A00;
    public final QQe A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeValue(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        AbstractC166997dE.A1I(parcel, this.A00);
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String AtA() {
        String A08 = this.A01.A08("credential_id");
        if (A08 == null) {
            return "";
        }
        return A08;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final EnumC72407Xcu AtB() {
        return this.A00;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String BEy() {
        String A09 = this.A01.A09("icon_url");
        if (A09 == null) {
            return "";
        }
        return A09;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String getSubtitle() {
        String A0A = this.A01.A0A("email_address");
        if (A0A == null) {
            return "";
        }
        return A0A;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String getTitle() {
        String A07 = this.A01.A07("credential_display_name");
        if (A07 == null) {
            return "";
        }
        return A07;
    }

    public APMCredential(QQe qQe, EnumC72407Xcu enumC72407Xcu, boolean z) {
        AbstractC167017dG.A1Q(qQe, enumC72407Xcu);
        this.A01 = qQe;
        this.A02 = z;
        this.A00 = enumC72407Xcu;
    }
}
