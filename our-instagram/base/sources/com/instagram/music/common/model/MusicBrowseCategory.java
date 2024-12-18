package com.instagram.music.common.model;

import X.C00O;
import X.C14360o3;
import X.C41856IgA;
import X.C50535MSo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class MusicBrowseCategory implements Parcelable {
    public static final C50535MSo A08 = new Object();
    public static final Parcelable.Creator CREATOR = new C41856IgA(79);
    public Bundle A00;
    public MusicSearchPlaylistType A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(A00());
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A00);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public final String A00() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("category");
        throw C00O.createAndThrow();
    }
}
