package com.instagram.model.creation;

import X.C14360o3;
import X.C43846JaA;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.config.MusicAttributionConfig;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(0);
    public MusicAttributionConfig A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeByte(this.A0D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A02);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0E ? (byte) 1 : (byte) 0);
    }

    public MediaCaptureConfig(Parcel parcel) {
        this.A0D = parcel.readByte() != 0;
        this.A05 = parcel.readByte() != 0;
        this.A0C = parcel.readByte() != 0;
        this.A03 = parcel.readByte() != 0;
        this.A09 = parcel.readByte() != 0;
        this.A0A = parcel.readByte() != 0;
        this.A06 = parcel.readByte() != 0;
        this.A0F = parcel.readByte() != 0;
        this.A0B = parcel.readByte() != 0;
        this.A00 = (MusicAttributionConfig) parcel.readParcelable(MusicAttributionConfig.class.getClassLoader());
        this.A01 = parcel.readString();
        this.A02 = parcel.createStringArrayList();
        this.A04 = parcel.readByte() != 0;
        this.A07 = parcel.readByte() != 0;
        this.A08 = parcel.readByte() != 0;
        this.A0E = parcel.readByte() != 0;
    }

    public MediaCaptureConfig(C43846JaA c43846JaA) {
        this.A0D = c43846JaA.A05();
        this.A07 = c43846JaA.A0C();
        this.A05 = c43846JaA.A0A();
        this.A0C = c43846JaA.A04();
        this.A03 = c43846JaA.A08();
        this.A09 = c43846JaA.A0E();
        this.A0A = c43846JaA.A0F();
        this.A06 = c43846JaA.A0B();
        this.A0B = c43846JaA.A03();
        this.A00 = c43846JaA.A00();
        this.A01 = c43846JaA.A01();
        this.A02 = c43846JaA.A02();
        this.A04 = c43846JaA.A09();
        this.A0F = c43846JaA.A07();
        this.A08 = c43846JaA.A0D();
        this.A0E = c43846JaA.A06();
    }
}
