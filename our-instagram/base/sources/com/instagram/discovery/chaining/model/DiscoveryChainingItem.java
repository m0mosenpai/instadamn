package com.instagram.discovery.chaining.model;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC31179DnN;
import X.C14360o3;
import X.EnumC39592He2;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.videofeed.intf.VideoFeedType;

/* loaded from: classes7.dex */
public final class DiscoveryChainingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(54);
    public final int A00;
    public final EnumC39592He2 A01;
    public final VideoFeedType A02;
    public final Boolean A03;
    public final Integer A04;
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
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0J);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        AbstractC31179DnN.A0p(parcel, this.A03);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0C);
    }

    public DiscoveryChainingItem(EnumC39592He2 enumC39592He2, VideoFeedType videoFeedType, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, boolean z) {
        AbstractC167027dH.A13(str, str2, enumC39592He2);
        this.A0E = str;
        this.A0D = str2;
        this.A01 = enumC39592He2;
        this.A00 = i;
        this.A0K = z;
        this.A0I = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A02 = videoFeedType;
        this.A0B = str8;
        this.A0J = str9;
        this.A04 = num;
        this.A05 = str10;
        this.A06 = str11;
        this.A03 = bool;
        this.A0H = str12;
        this.A0G = str13;
        this.A0F = str14;
        this.A0C = str15;
    }
}
