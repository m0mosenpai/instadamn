package com.instagram.model.direct;

import X.AbstractC31173DnH;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class DirectMessageSearchThread implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(62);
    public long A00;
    public long A01;
    public long A02;
    public ImmutableList A03;
    public ImageUrl A04;
    public ImageUrl A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeList(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        return AbstractC31173DnH.A0r("| %-30s | title: %-50s | thread id: %-100s|", "DirectMessageSearchThread", this.A09, this.A08);
    }
}
