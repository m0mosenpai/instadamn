package com.instagram.direct.model.channels;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class BroadcastChannelXpostingChannelInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(23);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BroadcastChannelXpostingChannelInfo) {
                BroadcastChannelXpostingChannelInfo broadcastChannelXpostingChannelInfo = (BroadcastChannelXpostingChannelInfo) obj;
                if (!C14360o3.A0K(this.A02, broadcastChannelXpostingChannelInfo.A02) || !C14360o3.A0K(this.A03, broadcastChannelXpostingChannelInfo.A03) || !C14360o3.A0K(this.A01, broadcastChannelXpostingChannelInfo.A01) || !C14360o3.A0K(this.A00, broadcastChannelXpostingChannelInfo.A00) || this.A05 != broadcastChannelXpostingChannelInfo.A05 || this.A04 != broadcastChannelXpostingChannelInfo.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31));
    }

    public BroadcastChannelXpostingChannelInfo(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
    }
}
