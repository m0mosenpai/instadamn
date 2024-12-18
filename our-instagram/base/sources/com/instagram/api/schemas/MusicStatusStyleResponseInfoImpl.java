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

/* loaded from: classes8.dex */
public final class MusicStatusStyleResponseInfoImpl extends C0T6 implements Parcelable, MusicStatusStyleResponseInfo {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(9);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.MusicStatusStyleResponseInfo
    public final MusicStatusStyleResponseInfoImpl Ex3() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicStatusStyleResponseInfoImpl) {
                MusicStatusStyleResponseInfoImpl musicStatusStyleResponseInfoImpl = (MusicStatusStyleResponseInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, musicStatusStyleResponseInfoImpl.A00) || !C14360o3.A0K(this.A01, musicStatusStyleResponseInfoImpl.A01) || !C14360o3.A0K(this.A02, musicStatusStyleResponseInfoImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public MusicStatusStyleResponseInfoImpl(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
