package com.instagram.clips.audio.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37302Gc3;
import X.C14360o3;
import X.C70220WId;
import X.InterfaceC09390do;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.AudioType;

/* loaded from: classes7.dex */
public final class AudioPageAssetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(99);
    public final AudioType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final InterfaceC09390do A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public AudioPageAssetModel(AudioType audioType, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(audioType, str);
        this.A00 = audioType;
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = AbstractC37302Gc3.A0m(this, 14);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("audio_page_");
        A1C.append(str);
        A1C.append('_');
        A1C.append(str3);
        A1C.append('_');
        this.A02 = AbstractC166997dE.A0x(str4, A1C);
    }
}
