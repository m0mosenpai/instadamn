package com.instagram.model.rtc;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class RtcCallAudience extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(99);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcCallAudience) {
                RtcCallAudience rtcCallAudience = (RtcCallAudience) obj;
                if (!C14360o3.A0K(this.A04, rtcCallAudience.A04) || this.A06 != rtcCallAudience.A06 || !C14360o3.A0K(this.A01, rtcCallAudience.A01) || !C14360o3.A0K(this.A02, rtcCallAudience.A02) || !C14360o3.A0K(this.A00, rtcCallAudience.A00) || !C14360o3.A0K(this.A03, rtcCallAudience.A03) || !C14360o3.A0K(this.A05, rtcCallAudience.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A05);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A06, AbstractC166987dD.A0G(this.A04)))))));
    }

    public RtcCallAudience(ImageUrl imageUrl, String str, String str2, String str3, List list, List list2, boolean z) {
        AbstractC167017dG.A1Q(list, str);
        AbstractC25234BEr.A0k(4, str2, imageUrl, str3, list2);
        this.A04 = list;
        this.A06 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
        this.A03 = str3;
        this.A05 = list2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallAudience(avatarUrls=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(1426));
        A1C.append(this.A06);
        A1C.append(", callTarget=");
        A1C.append(this.A01);
        A1C.append(", caller=");
        A1C.append(this.A02);
        A1C.append(", callerAvatarUrl=");
        A1C.append(this.A00);
        A1C.append(", callerUserId=");
        A1C.append(this.A03);
        A1C.append(", callParticipantIds=");
        return AbstractC167017dG.A0o(this.A05, A1C);
    }
}
