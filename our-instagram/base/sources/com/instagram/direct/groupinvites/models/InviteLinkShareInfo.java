package com.instagram.direct.groupinvites.models;

import X.C14360o3;
import X.LNL;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class InviteLinkShareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(5);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0A);
    }

    public InviteLinkShareInfo(Uri uri, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, boolean z, boolean z2) {
        this.A06 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A0C = z;
        this.A05 = str4;
        this.A08 = str5;
        this.A04 = imageUrl;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A0B = z2;
        this.A03 = uri;
        this.A0A = str6;
    }
}
