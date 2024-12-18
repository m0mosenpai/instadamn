package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class PaymentConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(17);
    public final String A00;
    public final List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentConfig) {
                PaymentConfig paymentConfig = (PaymentConfig) obj;
                if (!C14360o3.A0K(this.A01, paymentConfig.A01) || !C14360o3.A0K(this.A00, paymentConfig.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public PaymentConfig(List list, String str) {
        AbstractC167017dG.A1P(list, str);
        this.A01 = list;
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PaymentConfig(supportedContainerTypes=");
        A1C.append(this.A01);
        A1C.append(", paymentMode=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
