package com.facebook.push.fbpushtokencommon;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class RegisterPushTokenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(53);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A07);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
    }

    public RegisterPushTokenParams(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A0G = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A09 = readString2;
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    this.A0C = readString3;
                    this.A00 = parcel.readInt();
                    this.A02 = parcel.readInt();
                    this.A07 = parcel.readLong();
                    String readString4 = parcel.readString();
                    readString4.getClass();
                    this.A0H = readString4;
                    this.A03 = parcel.readInt();
                    this.A04 = parcel.readInt();
                    this.A01 = parcel.readInt();
                    this.A0B = parcel.readString();
                    this.A06 = parcel.readLong();
                    this.A0A = parcel.readString();
                    this.A05 = parcel.readLong();
                    this.A08 = parcel.readString();
                    this.A0D = parcel.readString();
                    this.A0F = parcel.readString();
                    this.A0E = parcel.readString();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
