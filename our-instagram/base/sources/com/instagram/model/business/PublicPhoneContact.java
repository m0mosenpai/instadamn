package com.instagram.model.business;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class PublicPhoneContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(55);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            PublicPhoneContact publicPhoneContact = (PublicPhoneContact) obj;
            if (!C14360o3.A0K(this.A03, publicPhoneContact.A03) || !C14360o3.A0K(this.A00, publicPhoneContact.A00) || !C14360o3.A0K(this.A01, publicPhoneContact.A01) || !C14360o3.A0K(this.A02, publicPhoneContact.A02)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A01, this.A02});
    }
}
