package com.instagram.comments.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class ChannelRepliesNotifData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(11);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ChannelRepliesNotifData(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelRepliesNotifData) {
                ChannelRepliesNotifData channelRepliesNotifData = (ChannelRepliesNotifData) obj;
                if (!C14360o3.A0K(this.A00, channelRepliesNotifData.A00) || !C14360o3.A0K(this.A03, channelRepliesNotifData.A03) || !C14360o3.A0K(this.A02, channelRepliesNotifData.A02) || !C14360o3.A0K(this.A01, channelRepliesNotifData.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
