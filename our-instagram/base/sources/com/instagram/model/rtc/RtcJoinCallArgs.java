package com.instagram.model.rtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.EnumC53137Neq;
import X.EnumC53138Ner;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class RtcJoinCallArgs extends C0T6 implements RtcEnterCallArgs {
    public static final Parcelable.Creator CREATOR = new C41856IgA(4);
    public final int A00;
    public final EnumC53138Ner A01;
    public final RtcCallKey A02;
    public final RtcIgNotification A03;
    public final String A04;
    public final String A05;
    public final EnumC53137Neq A06;
    public final RtcCallAudience A07;
    public final RtcCallFunnelSessionId A08;
    public final RtcCallSource A09;
    public final boolean A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcJoinCallArgs) {
                RtcJoinCallArgs rtcJoinCallArgs = (RtcJoinCallArgs) obj;
                if (this.A06 != rtcJoinCallArgs.A06 || !C14360o3.A0K(this.A07, rtcJoinCallArgs.A07) || !C14360o3.A0K(this.A09, rtcJoinCallArgs.A09) || this.A0A != rtcJoinCallArgs.A0A || !C14360o3.A0K(this.A02, rtcJoinCallArgs.A02) || !C14360o3.A0K(this.A05, rtcJoinCallArgs.A05) || this.A00 != rtcJoinCallArgs.A00 || !C14360o3.A0K(this.A03, rtcJoinCallArgs.A03) || !C14360o3.A0K(this.A04, rtcJoinCallArgs.A04) || !C14360o3.A0K(this.A08, rtcJoinCallArgs.A08) || this.A01 != rtcJoinCallArgs.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A06);
        this.A07.writeToParcel(parcel, i);
        this.A09.writeToParcel(parcel, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        RtcIgNotification rtcIgNotification = this.A03;
        if (rtcIgNotification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rtcIgNotification.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A08, i);
        AbstractC166997dE.A1I(parcel, this.A01);
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final RtcCallAudience AdT() {
        return this.A07;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final RtcCallFunnelSessionId Ajl() {
        return this.A08;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final EnumC53137Neq B06() {
        return this.A06;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final String BXR() {
        return this.A04;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final RtcCallSource Bye() {
        return this.A09;
    }

    @Override // com.instagram.model.rtc.RtcEnterCallArgs
    public final boolean CHn() {
        return this.A0A;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (((((((((AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A07, AbstractC166987dD.A0G(this.A06))))) + AbstractC167017dG.A0O(this.A05)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A08)) * 31);
    }

    public RtcJoinCallArgs(EnumC53137Neq enumC53137Neq, EnumC53138Ner enumC53138Ner, RtcCallAudience rtcCallAudience, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallKey rtcCallKey, RtcCallSource rtcCallSource, RtcIgNotification rtcIgNotification, String str, String str2, int i, boolean z) {
        AbstractC167027dH.A13(enumC53137Neq, rtcCallAudience, rtcCallSource);
        C14360o3.A0B(rtcCallKey, 5);
        C14360o3.A0B(enumC53138Ner, 11);
        this.A06 = enumC53137Neq;
        this.A07 = rtcCallAudience;
        this.A09 = rtcCallSource;
        this.A0A = z;
        this.A02 = rtcCallKey;
        this.A05 = str;
        this.A00 = i;
        this.A03 = rtcIgNotification;
        this.A04 = str2;
        this.A08 = rtcCallFunnelSessionId;
        this.A01 = enumC53138Ner;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcJoinCallArgs(e2eeCallType=");
        A1C.append(this.A06);
        A1C.append(", audience=");
        A1C.append(this.A07);
        A1C.append(", source=");
        A1C.append(this.A09);
        A1C.append(", withVideo=");
        A1C.append(this.A0A);
        A1C.append(", callKey=");
        A1C.append(this.A02);
        A1C.append(", recipientUserId=");
        A1C.append(this.A05);
        A1C.append(", notificationId=");
        A1C.append(this.A00);
        A1C.append(", igNotification=");
        A1C.append(this.A03);
        A1C.append(", notificationTag=");
        A1C.append(this.A04);
        A1C.append(", callFunnelSessionId=");
        A1C.append(this.A08);
        A1C.append(", e2eeInfraOnlyExpGroup=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
