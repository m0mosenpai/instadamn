package com.instagram.comments.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class ChannelCommentsData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(10);
    public final MessageIdentifier A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelCommentsData) {
                ChannelCommentsData channelCommentsData = (ChannelCommentsData) obj;
                if (!C14360o3.A0K(this.A03, channelCommentsData.A03) || !C14360o3.A0K(this.A00, channelCommentsData.A00) || !C14360o3.A0K(this.A01, channelCommentsData.A01) || this.A04 != channelCommentsData.A04 || !C14360o3.A0K(this.A02, channelCommentsData.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public ChannelCommentsData(MessageIdentifier messageIdentifier, String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1P(str, messageIdentifier);
        this.A03 = str;
        this.A00 = messageIdentifier;
        this.A01 = str2;
        this.A04 = z;
        this.A02 = str3;
    }
}
