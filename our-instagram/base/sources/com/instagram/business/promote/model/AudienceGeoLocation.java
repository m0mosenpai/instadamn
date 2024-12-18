package com.instagram.business.promote.model;

import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AdGeoLocationType;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class AudienceGeoLocation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(46);
    public double A00;
    public double A01;
    public int A02;
    public AdGeoLocationType A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !AbstractC167017dG.A1Z(obj, this)) {
            return false;
        }
        AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) obj;
        if (this.A03 == audienceGeoLocation.A03) {
            return AbstractC25231BEo.A1Z(this.A06, audienceGeoLocation.A06, false);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A03, i);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A05, this.A03, Double.valueOf(this.A00), Double.valueOf(this.A01), Integer.valueOf(this.A02), this.A04, this.A08, this.A07});
    }
}
