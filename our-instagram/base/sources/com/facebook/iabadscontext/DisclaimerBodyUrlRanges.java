package com.facebook.iabadscontext;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class DisclaimerBodyUrlRanges extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(1);
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerBodyUrlRanges) {
                DisclaimerBodyUrlRanges disclaimerBodyUrlRanges = (DisclaimerBodyUrlRanges) obj;
                if (this.A01 != disclaimerBodyUrlRanges.A01 || this.A00 != disclaimerBodyUrlRanges.A00 || !C14360o3.A0K(this.A02, disclaimerBodyUrlRanges.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02);
    }

    public DisclaimerBodyUrlRanges(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }
}
