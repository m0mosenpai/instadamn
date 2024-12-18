package com.instagram.direct.request.response;

import X.AbstractC167007dF;
import X.AbstractC25233BEq;
import X.AbstractC31179DnN;
import X.C14360o3;
import X.GWg;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class GroupLinkPreviewResponse$Success implements Parcelable, GWg {
    public static final Parcelable.Creator CREATOR = new LNL(39);
    public final int A00;
    public final int A01;
    public final GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo A02;
    public final GroupLinkPreviewResponse$SharedThreadContentInfo A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
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

    public GroupLinkPreviewResponse$Success(GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo, GroupLinkPreviewResponse$SharedThreadContentInfo groupLinkPreviewResponse$SharedThreadContentInfo, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        AbstractC25233BEq.A0x(1, str, str2, str3);
        AbstractC167007dF.A1I(str4, 6, str5);
        this.A0B = str;
        this.A0G = z;
        this.A00 = i;
        this.A06 = str2;
        this.A09 = str3;
        this.A05 = str4;
        this.A0F = z2;
        this.A07 = str5;
        this.A08 = str6;
        this.A0L = z3;
        this.A0I = z4;
        this.A04 = l;
        this.A0H = z5;
        this.A0D = z6;
        this.A0C = z7;
        this.A0E = z8;
        this.A0A = str7;
        this.A0K = z9;
        this.A0J = z10;
        this.A02 = groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo;
        this.A03 = groupLinkPreviewResponse$SharedThreadContentInfo;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        AbstractC31179DnN.A0q(parcel, this.A04);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo = this.A02;
        if (groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo.writeToParcel(parcel, i);
        }
        GroupLinkPreviewResponse$SharedThreadContentInfo groupLinkPreviewResponse$SharedThreadContentInfo = this.A03;
        if (groupLinkPreviewResponse$SharedThreadContentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupLinkPreviewResponse$SharedThreadContentInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
    }
}
