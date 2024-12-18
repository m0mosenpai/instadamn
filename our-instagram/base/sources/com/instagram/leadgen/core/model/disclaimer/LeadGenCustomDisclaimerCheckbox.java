package com.instagram.leadgen.core.model.disclaimer;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadGenCustomDisclaimerCheckbox extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(24);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public LeadGenCustomDisclaimerCheckbox(String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimerCheckbox) {
                LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox = (LeadGenCustomDisclaimerCheckbox) obj;
                if (!C14360o3.A0K(this.A01, leadGenCustomDisclaimerCheckbox.A01) || !C14360o3.A0K(this.A00, leadGenCustomDisclaimerCheckbox.A00) || this.A02 != leadGenCustomDisclaimerCheckbox.A02 || this.A03 != leadGenCustomDisclaimerCheckbox.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A00, AbstractC167017dG.A0O(this.A01) * 31)));
    }
}
