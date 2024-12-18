package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IABBwPayPalExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(7);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public IABBwPayPalExtension(String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str, 3);
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABBwPayPalExtension) {
                IABBwPayPalExtension iABBwPayPalExtension = (IABBwPayPalExtension) obj;
                if (this.A02 != iABBwPayPalExtension.A02 || this.A03 != iABBwPayPalExtension.A03 || !C14360o3.A0K(this.A01, iABBwPayPalExtension.A01) || !C14360o3.A0K(this.A00, iABBwPayPalExtension.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A03, i * 31)) + AbstractC167017dG.A0O(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IABBwPayPalExtension(acceleratePayPalLogin=");
        A1C.append(this.A02);
        A1C.append(", enableCta=");
        A1C.append(this.A03);
        A1C.append(", testVariant=");
        A1C.append(this.A01);
        A1C.append(", signedExternalOfferId=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
