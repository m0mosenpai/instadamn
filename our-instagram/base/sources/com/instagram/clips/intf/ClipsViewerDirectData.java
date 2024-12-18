package com.instagram.clips.intf;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ClipsViewerDirectData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(47);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
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

    public ClipsViewerDirectData(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A0D = z;
        this.A00 = str2;
        this.A02 = str3;
        this.A0C = z2;
        this.A08 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A0A = z6;
        this.A0B = z7;
        this.A09 = z8;
        this.A04 = z9;
        this.A05 = z10;
        this.A03 = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsViewerDirectData) {
                ClipsViewerDirectData clipsViewerDirectData = (ClipsViewerDirectData) obj;
                if (!C14360o3.A0K(this.A01, clipsViewerDirectData.A01) || this.A0D != clipsViewerDirectData.A0D || !C14360o3.A0K(this.A00, clipsViewerDirectData.A00) || !C14360o3.A0K(this.A02, clipsViewerDirectData.A02) || this.A0C != clipsViewerDirectData.A0C || this.A08 != clipsViewerDirectData.A08 || this.A06 != clipsViewerDirectData.A06 || this.A07 != clipsViewerDirectData.A07 || this.A0A != clipsViewerDirectData.A0A || this.A0B != clipsViewerDirectData.A0B || this.A09 != clipsViewerDirectData.A09 || this.A04 != clipsViewerDirectData.A04 || this.A05 != clipsViewerDirectData.A05 || this.A03 != clipsViewerDirectData.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClipsViewerDirectData(messageId=");
        sb.append(this.A01);
        sb.append(", isMessageFromMe=");
        sb.append(this.A0D);
        sb.append(", clientContext=");
        sb.append(this.A00);
        sb.append(MSV.A00(136));
        sb.append(this.A02);
        sb.append(", isThreadWithRestrictedUser=");
        sb.append(this.A0C);
        sb.append(", isOneOnOneThreadWithBlockedUser=");
        sb.append(this.A08);
        sb.append(", isInPendingInbox=");
        sb.append(this.A06);
        sb.append(", isMsysThread=");
        sb.append(this.A07);
        sb.append(", isPublicChat=");
        sb.append(this.A0A);
        sb.append(", isQuotedReply=");
        sb.append(this.A0B);
        sb.append(", isPlayPile=");
        sb.append(this.A09);
        sb.append(", isCachedThread=");
        sb.append(this.A04);
        sb.append(", isCutoverOrDm=");
        sb.append(this.A05);
        sb.append(", isAiAgentThread=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.A00;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i5 = (i4 + i3) * 31;
        int i6 = 1237;
        if (this.A0C) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A08) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A06) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A07) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A0A) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0B) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A09) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A04) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A05) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A03) {
            i24 = 1231;
        }
        return i23 + i24;
    }
}
