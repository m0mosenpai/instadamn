package com.facebook.push.constants;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C63473SlE;
import X.EnumC61143Rfy;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class PushProperty implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(52);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final EnumC61143Rfy A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A03);
        parcel.writeByte(this.A0G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A05);
        parcel.writeLong(this.A01);
    }

    public PushProperty(Parcel parcel) {
        Serializable readSerializable = parcel.readSerializable();
        C14360o3.A0C(readSerializable, "null cannot be cast to non-null type com.facebook.push.constants.PushSource");
        this.A04 = (EnumC61143Rfy) readSerializable;
        this.A0A = parcel.readString();
        this.A02 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0E = parcel.readString();
        this.A03 = parcel.readLong();
        this.A0G = AbstractC37304Gc5.A1X(parcel);
        this.A06 = parcel.readString();
        this.A0C = parcel.readString();
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0F = parcel.readString();
        this.A0D = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = (Integer) AbstractC58321PtD.A0n(parcel, Integer.TYPE);
        this.A01 = parcel.readLong();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PushProperty{source=");
        A1C.append(this.A04);
        A1C.append(", notifId='");
        A1C.append(this.A0A);
        A1C.append("', deliveryId='");
        A1C.append(this.A06);
        A1C.append("', receivedTime=");
        A1C.append(this.A02);
        A1C.append(", msgId='");
        A1C.append(this.A08);
        A1C.append("', notifType='");
        A1C.append(this.A0B);
        A1C.append("', senderId='");
        A1C.append(this.A0E);
        A1C.append("', serverPushTime=");
        A1C.append(this.A03);
        A1C.append(", isLoggedOutPush=");
        A1C.append(this.A0G);
        A1C.append(", pnid='");
        A1C.append(this.A0C);
        A1C.append("', priorityDiff='");
        A1C.append(this.A05);
        return AbstractC166997dE.A0x("'}", A1C);
    }
}
