package com.instagram.model.rtc.cowatch;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AbstractC31181DnP;
import X.AbstractC54059NvJ;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.IR8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class RtcStartCoWatchPlaybackArguments extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(6);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public RtcStartCoWatchPlaybackArguments(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        AbstractC167027dH.A0a(1, str, num, num2, num3);
        this.A04 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A05 = str2;
        this.A00 = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcStartCoWatchPlaybackArguments) {
                RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = (RtcStartCoWatchPlaybackArguments) obj;
                if (!C14360o3.A0K(this.A04, rtcStartCoWatchPlaybackArguments.A04) || this.A01 != rtcStartCoWatchPlaybackArguments.A01 || this.A02 != rtcStartCoWatchPlaybackArguments.A02 || this.A03 != rtcStartCoWatchPlaybackArguments.A03 || !C14360o3.A0K(this.A05, rtcStartCoWatchPlaybackArguments.A05) || !C14360o3.A0K(this.A00, rtcStartCoWatchPlaybackArguments.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        switch (this.A01.intValue()) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "MESSAGING";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(AbstractC54059NvJ.A00(this.A02));
        parcel.writeString(IR8.A01(this.A03));
        parcel.writeString(this.A05);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166987dD.A0J(this.A04);
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "MESSAGING";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        int A0H = AbstractC25231BEo.A0H(str, intValue, A0J);
        Integer num = this.A02;
        int A0L = AbstractC167017dG.A0L(num, AbstractC54059NvJ.A00(num), A0H);
        Integer num2 = this.A03;
        return ((AbstractC167017dG.A0L(num2, IR8.A01(num2), A0L) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
