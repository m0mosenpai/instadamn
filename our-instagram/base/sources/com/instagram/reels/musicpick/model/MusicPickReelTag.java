package com.instagram.reels.musicpick.model;

import X.C14360o3;
import X.C37324GcR;
import X.InterfaceC84833qX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class MusicPickReelTag implements Parcelable, InterfaceC84833qX {
    public static final Parcelable.Creator CREATOR = new C37324GcR(28);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    @Override // X.InterfaceC84833qX
    public final float BDQ() {
        return this.A02;
    }

    @Override // X.InterfaceC84833qX
    public final float BpY() {
        return this.A01;
    }

    @Override // X.InterfaceC84833qX
    public final float CHe() {
        return this.A03;
    }

    @Override // X.InterfaceC84833qX
    public final float CI0() {
        return this.A04;
    }

    @Override // X.InterfaceC84833qX
    public final float CIZ() {
        return this.A05;
    }

    public MusicPickReelTag(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.A04 = f;
        this.A05 = f2;
        this.A06 = i;
        this.A03 = f3;
        this.A02 = f4;
        this.A01 = f5;
        this.A00 = f6;
    }
}
