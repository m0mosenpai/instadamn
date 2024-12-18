package com.instagram.ui.swipenavigation;

import X.C14360o3;
import X.C5GJ;
import X.C9Ay;
import X.EnumC76383bi;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* loaded from: classes2.dex */
public final class PositionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(61);
    public final float A00;
    public final int A01;
    public final C5GJ A02;
    public final CameraConfiguration A03;
    public final EnumC76383bi A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A09);
        C5GJ c5gj = this.A02;
        if (c5gj == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c5gj.name());
        }
        parcel.writeString(this.A08);
        EnumC76383bi enumC76383bi = this.A04;
        if (enumC76383bi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC76383bi.name());
        }
    }

    public PositionConfig(C5GJ c5gj, CameraConfiguration cameraConfiguration, EnumC76383bi enumC76383bi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, float f, int i, boolean z) {
        this.A00 = f;
        this.A0F = z;
        this.A0D = str;
        this.A03 = cameraConfiguration;
        this.A05 = str2;
        this.A0B = str3;
        this.A0C = str4;
        this.A0A = str5;
        this.A01 = i;
        this.A06 = str6;
        this.A07 = str7;
        this.A0E = str8;
        this.A09 = str9;
        this.A02 = c5gj;
        this.A08 = str10;
        this.A04 = enumC76383bi;
    }
}
