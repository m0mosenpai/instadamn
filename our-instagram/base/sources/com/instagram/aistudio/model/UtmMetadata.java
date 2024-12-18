package com.instagram.aistudio.model;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class UtmMetadata extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(23);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UtmMetadata) {
                UtmMetadata utmMetadata = (UtmMetadata) obj;
                if (!C14360o3.A0K(this.A03, utmMetadata.A03) || !C14360o3.A0K(this.A02, utmMetadata.A02) || !C14360o3.A0K(this.A00, utmMetadata.A00) || !C14360o3.A0K(this.A01, utmMetadata.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A17("UtmMetadata(source=", this.A03, ", medium=", this.A02, ", campaign=", this.A00, ", content=", this.A01, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public UtmMetadata(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }

    public UtmMetadata() {
        this(null, null, null, null);
    }
}
