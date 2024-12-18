package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class Availability extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(99);
    public final boolean A00;
    public final List A01;

    public Availability(List list, boolean z) {
        C14360o3.A0B(list, 2);
        this.A00 = z;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Availability) {
                Availability availability = (Availability) obj;
                if (this.A00 != availability.A00 || !C14360o3.A0K(this.A01, availability.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeStringList(this.A01);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return AbstractC166987dD.A0I(this.A01, i * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Availability(isAvailable=");
        A1C.append(this.A00);
        A1C.append(", availabilityConditions=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
