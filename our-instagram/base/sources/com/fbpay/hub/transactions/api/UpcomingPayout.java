package com.fbpay.hub.transactions.api;

import X.AbstractC25235BEs;
import X.AbstractC58321PtD;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class UpcomingPayout implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(42);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingPayout) {
                UpcomingPayout upcomingPayout = (UpcomingPayout) obj;
                if (!C14360o3.A0K(this.A00, upcomingPayout.A00) || !C14360o3.A0K(this.A01, upcomingPayout.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public UpcomingPayout(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
