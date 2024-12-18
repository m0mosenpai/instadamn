package com.instagram.music.common.model;

import X.C14360o3;
import X.C41856IgA;
import X.H2I;
import X.InterfaceC58212PrI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class MusicSearchArtist implements Parcelable {
    public static final C41856IgA CREATOR = C41856IgA.A00(82);
    public String A00 = null;
    public final InterfaceC58212PrI A01;

    public MusicSearchArtist(InterfaceC58212PrI interfaceC58212PrI) {
        this.A01 = interfaceC58212PrI;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        H2I h2i = (H2I) this.A01;
        parcel.writeParcelable(h2i.A00, i);
        parcel.writeString(h2i.A03);
        parcel.writeString(h2i.A01);
        parcel.writeString(h2i.A02);
        parcel.writeString(this.A00);
    }
}
