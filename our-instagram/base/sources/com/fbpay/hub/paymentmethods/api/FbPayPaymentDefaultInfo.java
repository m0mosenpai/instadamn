package com.fbpay.hub.paymentmethods.api;

import X.AbstractC167007dF;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FbPayPaymentDefaultInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(38);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentDefaultInfo) {
                FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = (FbPayPaymentDefaultInfo) obj;
                if (this.A00 != fbPayPaymentDefaultInfo.A00 || this.A01 != fbPayPaymentDefaultInfo.A01 || this.A02 != fbPayPaymentDefaultInfo.A02 || this.A03 != fbPayPaymentDefaultInfo.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC58322PtE.A02(this.A00 ? 1 : 0) + 31) * 31) + AbstractC58322PtE.A02(this.A01 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A02 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A03 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public FbPayPaymentDefaultInfo(Parcel parcel) {
        this.A00 = AbstractC167007dF.A1P(AbstractC58322PtE.A07(parcel, this), 1);
        this.A01 = AbstractC58320PtC.A1U(parcel);
        this.A02 = AbstractC58320PtC.A1U(parcel);
        this.A03 = AbstractC58320PtC.A1V(parcel);
    }
}
