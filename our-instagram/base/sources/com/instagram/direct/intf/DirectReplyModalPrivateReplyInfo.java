package com.instagram.direct.intf;

import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public class DirectReplyModalPrivateReplyInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(14);
    public final long A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
    }

    public DirectReplyModalPrivateReplyInfo(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A06 = parcel.readString();
    }

    public DirectReplyModalPrivateReplyInfo(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        this.A04 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A00 = j;
        this.A07 = str5;
        this.A08 = str6;
        this.A01 = imageUrl;
        this.A06 = str7;
    }
}
