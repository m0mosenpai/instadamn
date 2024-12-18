package com.instagram.model.rtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.EnumC46283KeF;
import X.EnumC53137Neq;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class RtcCreateCallArgs extends C0T6 implements RtcEnterCallArgs {
    public static final Parcelable.Creator CREATOR = new C41856IgA(2);
    public final int A00;
    public final EnumC46283KeF A01;
    public final EnumC53137Neq A02;
    public final RtcCallAudience A03;
    public final RtcCallFunnelSessionId A04;
    public final RtcCallSource A05;
    public final RtcIgNotification A06;
    public final RtcStartCoWatchPlaybackArguments A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcCreateCallArgs) {
                RtcCreateCallArgs rtcCreateCallArgs = (RtcCreateCallArgs) obj;
                if (this.A02 != rtcCreateCallArgs.A02 || !C14360o3.A0K(this.A03, rtcCreateCallArgs.A03) || !C14360o3.A0K(this.A05, rtcCreateCallArgs.A05) || this.A0B != rtcCreateCallArgs.A0B || !C14360o3.A0K(this.A07, rtcCreateCallArgs.A07) || this.A0A != rtcCreateCallArgs.A0A || this.A09 != rtcCreateCallArgs.A09 || this.A00 != rtcCreateCallArgs.A00 || !C14360o3.A0K(this.A06, rtcCreateCallArgs.A06) || !C14360o3.A0K(this.A08, rtcCreateCallArgs.A08) || !C14360o3.A0K(this.A04, rtcCreateCallArgs.A04) || this.A01 != rtcCreateCallArgs.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A02);
        this.A03.writeToParcel(parcel, i);
        this.A05.writeToParcel(parcel, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A00);
        RtcIgNotification rtcIgNotification = this.A06;
        if (rtcIgNotification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rtcIgNotification.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        EnumC46283KeF enumC46283KeF = this.A01;
        if (enumC46283KeF == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC46283KeF);
        }
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final RtcCallAudience AdT() {
        return this.A03;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final RtcCallFunnelSessionId Ajl() {
        return this.A04;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final EnumC53137Neq B06() {
        return this.A02;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final String BXR() {
        return this.A08;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final RtcCallSource Bye() {
        return this.A05;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final boolean CHn() {
        return this.A0B;
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, (AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)))) + AbstractC167017dG.A0M(this.A07)) * 31)) + this.A00) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public RtcCreateCallArgs(EnumC46283KeF enumC46283KeF, EnumC53137Neq enumC53137Neq, RtcCallAudience rtcCallAudience, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallSource rtcCallSource, RtcIgNotification rtcIgNotification, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str, int i, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A13(enumC53137Neq, rtcCallAudience, rtcCallSource);
        this.A02 = enumC53137Neq;
        this.A03 = rtcCallAudience;
        this.A05 = rtcCallSource;
        this.A0B = z;
        this.A07 = rtcStartCoWatchPlaybackArguments;
        this.A0A = z2;
        this.A09 = z3;
        this.A00 = i;
        this.A06 = rtcIgNotification;
        this.A08 = str;
        this.A04 = rtcCallFunnelSessionId;
        this.A01 = enumC46283KeF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCreateCallArgs(e2eeCallType=");
        A1C.append(this.A02);
        A1C.append(", audience=");
        A1C.append(this.A03);
        A1C.append(", source=");
        A1C.append(this.A05);
        A1C.append(", withVideo=");
        A1C.append(this.A0B);
        A1C.append(", coWatchArguments=");
        A1C.append(this.A07);
        A1C.append(", startedInShhMode=");
        A1C.append(this.A0A);
        A1C.append(", isRedial=");
        A1C.append(this.A09);
        A1C.append(", notificationId=");
        A1C.append(this.A00);
        A1C.append(", igNotification=");
        A1C.append(this.A06);
        A1C.append(", notificationTag=");
        A1C.append(this.A08);
        A1C.append(", callFunnelSessionId=");
        A1C.append(this.A04);
        A1C.append(", xmaType=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
