package com.instagram.clips.model;

import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes3.dex */
public final class ClipsReplyBarData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(50);
    public final int A00;
    public final int A01;
    public final DirectShareTarget A02;
    public final DirectThreadKey A03;
    public final MsysThreadId A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
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

    public ClipsReplyBarData(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, MsysThreadId msysThreadId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C14360o3.A0B(str4, 6);
        C14360o3.A0B(directShareTarget, 9);
        this.A03 = directThreadKey;
        this.A04 = msysThreadId;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A0A = str4;
        this.A0C = str5;
        this.A0B = str6;
        this.A02 = directShareTarget;
        this.A0I = z;
        this.A0H = z2;
        this.A0K = z3;
        this.A0F = z4;
        this.A09 = str7;
        this.A0M = z5;
        this.A0L = z6;
        this.A01 = i;
        this.A00 = i2;
        this.A0J = z7;
        this.A0G = z8;
        this.A0E = z9;
        this.A0D = z10;
        this.A05 = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A05);
    }
}
