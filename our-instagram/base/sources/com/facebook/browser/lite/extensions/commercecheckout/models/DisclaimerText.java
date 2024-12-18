package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class DisclaimerText extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(19);
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerText) {
                DisclaimerText disclaimerText = (DisclaimerText) obj;
                if (!C14360o3.A0K(this.A02, disclaimerText.A02) || this.A00 != disclaimerText.A00 || this.A01 != disclaimerText.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public DisclaimerText(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DisclaimerText(text=");
        A1C.append(this.A02);
        A1C.append(", ctaBegin=");
        A1C.append(this.A00);
        A1C.append(", ctaEnd=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
