package com.instagram.creation.channels.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class AddChannelsRowChannelInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(67);
    public final int A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddChannelsRowChannelInfo) {
                AddChannelsRowChannelInfo addChannelsRowChannelInfo = (AddChannelsRowChannelInfo) obj;
                if (!C14360o3.A0K(this.A01, addChannelsRowChannelInfo.A01) || !C14360o3.A0K(this.A02, addChannelsRowChannelInfo.A02) || this.A00 != addChannelsRowChannelInfo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)) + this.A00;
    }

    public AddChannelsRowChannelInfo(String str, String str2, int i) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
