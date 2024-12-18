package com.instagram.video.common.events;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class IgRtcEventHeader extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(28);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Long A06;
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgRtcEventHeader) {
                IgRtcEventHeader igRtcEventHeader = (IgRtcEventHeader) obj;
                if (!C14360o3.A0K(this.A06, igRtcEventHeader.A06) || !C14360o3.A0K(this.A04, igRtcEventHeader.A04) || !C14360o3.A0K(this.A07, igRtcEventHeader.A07) || !C14360o3.A0K(this.A01, igRtcEventHeader.A01) || !C14360o3.A0K(this.A05, igRtcEventHeader.A05) || !C14360o3.A0K(this.A03, igRtcEventHeader.A03) || !C14360o3.A0K(this.A00, igRtcEventHeader.A00) || !C14360o3.A0K(this.A02, igRtcEventHeader.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Long l = this.A06;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A06) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public IgRtcEventHeader(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4) {
        this.A06 = l;
        this.A04 = str;
        this.A07 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A03 = str4;
        this.A00 = num2;
        this.A02 = num3;
    }
}
