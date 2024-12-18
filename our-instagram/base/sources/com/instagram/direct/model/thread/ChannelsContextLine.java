package com.instagram.direct.model.thread;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ChannelsContextLine extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(83);
    public String A01 = null;
    public String A00 = null;
    public String A02 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelsContextLine) {
                ChannelsContextLine channelsContextLine = (ChannelsContextLine) obj;
                if (!C14360o3.A0K(this.A01, channelsContextLine.A01) || !C14360o3.A0K(this.A00, channelsContextLine.A00) || !C14360o3.A0K(this.A02, channelsContextLine.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A00;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }
}
