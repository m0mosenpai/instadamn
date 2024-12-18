package com.facebookpay.paymentmethod.model;

import X.C14360o3;
import X.C63470SlB;
import X.EnumC72407Xcu;
import X.QWM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class PayPalCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(20);
    public final QWM A00;
    public final String A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String AtA() {
        String A07;
        QWM qwm = this.A00;
        if (qwm == null || (A07 = qwm.A07("credential_id")) == null) {
            String str = this.A01;
            if (str == null) {
                return "";
            }
            return str;
        }
        return A07;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final EnumC72407Xcu AtB() {
        return EnumC72407Xcu.A08;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String BEy() {
        String A0A;
        QWM qwm = this.A00;
        if (qwm == null || (A0A = qwm.A0A("icon_url")) == null) {
            return "";
        }
        return A0A;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String getSubtitle() {
        String A09;
        QWM qwm = this.A00;
        if (qwm == null || (A09 = qwm.A09("pp_subtitle")) == null) {
            return "";
        }
        return A09;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public final String getTitle() {
        String A08;
        QWM qwm = this.A00;
        if (qwm == null || (A08 = qwm.A08("pp_title")) == null) {
            return "";
        }
        return A08;
    }

    public PayPalCredential(QWM qwm, String str, boolean z) {
        this.A00 = qwm;
        this.A02 = z;
        this.A01 = str;
    }

    public PayPalCredential() {
        this(null, null, false);
    }
}
