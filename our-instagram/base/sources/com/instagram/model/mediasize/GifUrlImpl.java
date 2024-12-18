package com.instagram.model.mediasize;

import X.C9Ay;
import X.InterfaceC224217b;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.GifUrlLoggingExtras;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class GifUrlImpl implements Parcelable, InterfaceC224217b {
    public static final Parcelable.Creator CREATOR = new C9Ay(16);
    public GifUrlLoggingExtras A00;
    public GifUrlImpl A01;
    public Float A02;
    public Float A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC224217b
    public final Long B39() {
        Long l = this.A07;
        if (l != null) {
            return Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
        }
        return null;
    }

    @Override // X.InterfaceC224217b
    public final /* bridge */ /* synthetic */ Object B4F() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A03.floatValue());
        parcel.writeFloat(this.A02.floatValue());
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        int i2 = 0;
        if (this.A07 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Long l = this.A07;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public GifUrlImpl(String str, float f, float f2) {
        this.A09 = str;
        this.A03 = Float.valueOf(f);
        this.A02 = Float.valueOf(f2);
    }

    public GifUrlImpl(String str, String str2, float f, float f2) {
        this.A09 = str;
        this.A0A = str2;
        this.A03 = Float.valueOf(f);
        this.A02 = Float.valueOf(f2);
    }

    public GifUrlImpl() {
    }
}
