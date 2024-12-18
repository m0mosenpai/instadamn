package com.facebook.videolite.transcoder.base;

import X.AbstractC1126356r;
import X.AbstractC167007dF;
import X.AbstractC37301Gc2;
import X.AnonymousClass001;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class SphericalMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(80);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        SphericalMetadata sphericalMetadata;
        String str;
        String str2;
        String str3;
        String str4;
        return this == obj || ((obj instanceof SphericalMetadata) && (((str = this.A00) == (str2 = (sphericalMetadata = (SphericalMetadata) obj).A00) || (str != null && str.equals(str2))) && ((str3 = this.A01) == (str4 = sphericalMetadata.A01) || (str3 != null && str3.equals(str4)))));
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A11("SphericalMetadata{projectionType=", this.A00, ", stereoMode=", this.A01, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public SphericalMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public SphericalMetadata(String str, String str2) {
        AbstractC1126356r.A07(AbstractC167007dF.A1W(str), "projectionType is null");
        this.A00 = str;
        AbstractC1126356r.A07(str2 != null, "stereoMode is null");
        this.A01 = str2;
    }
}
