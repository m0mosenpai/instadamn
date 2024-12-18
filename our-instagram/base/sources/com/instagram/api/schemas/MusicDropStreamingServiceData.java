package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class MusicDropStreamingServiceData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(5);
    public final MusicDropStreamingServiceEnum A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicDropStreamingServiceData) {
                MusicDropStreamingServiceData musicDropStreamingServiceData = (MusicDropStreamingServiceData) obj;
                if (!C14360o3.A0K(this.A01, musicDropStreamingServiceData.A01) || this.A00 != musicDropStreamingServiceData.A00 || !C14360o3.A0K(this.A02, musicDropStreamingServiceData.A02)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public MusicDropStreamingServiceData(MusicDropStreamingServiceEnum musicDropStreamingServiceEnum, String str, String str2) {
        AbstractC167027dH.A13(str, musicDropStreamingServiceEnum, str2);
        this.A01 = str;
        this.A00 = musicDropStreamingServiceEnum;
        this.A02 = str2;
    }
}
