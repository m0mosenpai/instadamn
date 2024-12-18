package com.instagram.rtc.statemodel;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes9.dex */
public final class RtcSettingsParticipant extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(47);
    public final int A00;
    public final ImageUrl A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public RtcSettingsParticipant(ImageUrl imageUrl, Long l, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A0k(1, str, str3, str4, imageUrl);
        C14360o3.A0B(list, 8);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = l;
        this.A00 = i;
        this.A06 = str3;
        this.A03 = str4;
        this.A01 = imageUrl;
        this.A07 = list;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcSettingsParticipant) {
                RtcSettingsParticipant rtcSettingsParticipant = (RtcSettingsParticipant) obj;
                if (!C14360o3.A0K(this.A04, rtcSettingsParticipant.A04) || !C14360o3.A0K(this.A05, rtcSettingsParticipant.A05) || !C14360o3.A0K(this.A02, rtcSettingsParticipant.A02) || this.A00 != rtcSettingsParticipant.A00 || !C14360o3.A0K(this.A06, rtcSettingsParticipant.A06) || !C14360o3.A0K(this.A03, rtcSettingsParticipant.A03) || !C14360o3.A0K(this.A01, rtcSettingsParticipant.A01) || !C14360o3.A0K(this.A07, rtcSettingsParticipant.A07) || this.A09 != rtcSettingsParticipant.A09 || this.A0A != rtcSettingsParticipant.A0A || this.A08 != rtcSettingsParticipant.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeStringList(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A06, (((((AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A00) * 31)))))));
    }
}
