package com.fbpay.hub.paymentmethods.api;

import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public class FbPayShopPay implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(40);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final long A03;
    public final String A04;

    public FbPayShopPay(long j, String str, String str2, String str3, boolean z) {
        this.A03 = j;
        AbstractC63311ShH.A04(str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A00 = str;
        this.A02 = z;
        AbstractC63311ShH.A04(str2, "shopPayUserId");
        this.A04 = str2;
        AbstractC63311ShH.A04(str3, "shopPayUsername");
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayShopPay) {
                FbPayShopPay fbPayShopPay = (FbPayShopPay) obj;
                if (this.A03 != fbPayShopPay.A03 || !C14360o3.A0K(this.A00, fbPayShopPay.A00) || this.A02 != fbPayShopPay.A02 || !C14360o3.A0K(this.A04, fbPayShopPay.A04) || !C14360o3.A0K(this.A01, fbPayShopPay.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC25228BEl.A03(this.A03) + 31) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC58322PtE.A02(this.A02 ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
    }

    public FbPayShopPay(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A03 = parcel.readLong();
        this.A00 = parcel.readString();
        this.A02 = AbstractC58320PtC.A1T(parcel);
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
