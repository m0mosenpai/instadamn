package com.facebook.locationsharing.core.models;

import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC58461Pvm;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class LiveLocationSharer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(36);
    public final long A00;
    public final Location A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveLocationSharer) {
                LiveLocationSharer liveLocationSharer = (LiveLocationSharer) obj;
                if (this.A00 != liveLocationSharer.A00 || !C14360o3.A0K(this.A02, liveLocationSharer.A02) || !C14360o3.A0K(this.A01, liveLocationSharer.A01) || !C14360o3.A0K(this.A03, liveLocationSharer.A03) || !C14360o3.A0K(this.A04, liveLocationSharer.A04) || !C14360o3.A0K(this.A05, liveLocationSharer.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public LiveLocationSharer(Location location, String str, long j) {
        String A00 = AbstractC58461Pvm.A00(19, 8, 29);
        this.A00 = j;
        this.A02 = "";
        this.A01 = location;
        this.A03 = null;
        AbstractC63311ShH.A04(str, "userId");
        this.A04 = str;
        AbstractC63311ShH.A04(A00, "userName");
        this.A05 = A00;
    }

    public final int hashCode() {
        return ((((((((((AbstractC25228BEl.A03(this.A00) + 31) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        String str = this.A03;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public LiveLocationSharer(Parcel parcel) {
        String readString;
        ClassLoader classLoader = getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A01 = (Location) parcel.readParcelable(classLoader);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A03 = readString;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }
}
