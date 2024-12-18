package com.instagram.leadgen.core.model.disclaimer;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadGenCustomDisclaimerBodyUrlRanges extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(23);
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimerBodyUrlRanges) {
                LeadGenCustomDisclaimerBodyUrlRanges leadGenCustomDisclaimerBodyUrlRanges = (LeadGenCustomDisclaimerBodyUrlRanges) obj;
                if (this.A01 != leadGenCustomDisclaimerBodyUrlRanges.A01 || this.A00 != leadGenCustomDisclaimerBodyUrlRanges.A00 || !C14360o3.A0K(this.A02, leadGenCustomDisclaimerBodyUrlRanges.A02)) {
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

    public LeadGenCustomDisclaimerBodyUrlRanges(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }
}
