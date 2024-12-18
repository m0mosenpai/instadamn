package com.instagram.model.reels;

import X.C38H;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ReelViewerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(28);
    public final ReelViewerContextButtonType A00;
    public final Integer A01;
    public final List A02;
    public final List A03;
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
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static ReelViewerConfig A00() {
        return new ReelViewerConfig(new C38H());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A02);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0J ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0N);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0O ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeStringList(this.A03);
        parcel.writeByte(this.A0E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0I ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.A01);
    }

    public ReelViewerConfig(Parcel parcel) {
        this.A02 = parcel.readArrayList(ReelHeaderAttributionType.class.getClassLoader());
        this.A08 = parcel.readByte() != 0;
        this.A0C = parcel.readByte() != 0;
        this.A0A = parcel.readByte() != 0;
        this.A0P = parcel.readByte() != 0;
        this.A09 = parcel.readByte() != 0;
        this.A06 = parcel.readByte() != 0;
        this.A07 = parcel.readByte() != 0;
        this.A0H = parcel.readByte() != 0;
        this.A0G = parcel.readByte() != 0;
        this.A0D = parcel.readByte() != 0;
        this.A05 = parcel.readByte() != 0;
        this.A0M = parcel.readByte() != 0;
        this.A0L = parcel.readByte() != 0;
        this.A0J = parcel.readByte() != 0;
        this.A04 = parcel.readByte() != 0;
        this.A0N = parcel.readString();
        this.A0B = parcel.readByte() != 0;
        this.A0K = parcel.readByte() != 0;
        this.A0O = parcel.readByte() != 0;
        this.A00 = (ReelViewerContextButtonType) parcel.readParcelable(ReelViewerContextButtonType.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        parcel.readStringList(arrayList);
        this.A0E = parcel.readByte() != 0;
        this.A0F = parcel.readByte() != 0;
        this.A0I = parcel.readByte() != 0;
        this.A01 = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    public ReelViewerConfig(C38H c38h) {
        this.A02 = c38h.A03;
        this.A08 = false;
        this.A0C = false;
        this.A0A = false;
        this.A0P = false;
        this.A09 = false;
        this.A06 = false;
        this.A07 = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A05 = false;
        this.A0M = false;
        this.A0L = false;
        this.A0J = false;
        this.A04 = false;
        this.A0N = c38h.A02;
        this.A0B = c38h.A05;
        this.A0F = true;
        this.A0K = false;
        this.A0O = false;
        this.A00 = c38h.A00;
        List list = c38h.A04;
        this.A03 = list == null ? new ArrayList() : list;
        this.A0E = c38h.A06;
        this.A0I = c38h.A07;
        this.A01 = c38h.A01;
    }
}
