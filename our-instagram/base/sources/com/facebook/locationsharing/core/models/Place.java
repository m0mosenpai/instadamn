package com.facebook.locationsharing.core.models;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public class Place implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(39);
    public final String A00;
    public final String A01;
    public final Location A02;

    public Place(Location location, String str, String str2) {
        AbstractC63311ShH.A04(str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A00 = str;
        AbstractC63311ShH.A04(location, "location");
        this.A02 = location;
        AbstractC63311ShH.A04(str2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Place) {
                Place place = (Place) obj;
                if (!C14360o3.A0K(this.A00, place.A00) || !C14360o3.A0K(this.A02, place.A02) || !C14360o3.A0K(this.A01, place.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A01);
    }

    public Place(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        this.A00 = parcel.readString();
        this.A02 = (Location) parcel.readParcelable(A0g);
        this.A01 = parcel.readString();
    }
}
