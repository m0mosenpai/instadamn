package com.facebook.video.heroplayer.ipc;

import X.C206149Aw;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class SubtitleConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(26);
    public final Uri A00;
    public final String A01;
    public final boolean A02;

    public SubtitleConfiguration(Uri uri, String str, boolean z) {
        this.A00 = uri;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }

    public SubtitleConfiguration(Parcel parcel) {
        this.A00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A01 = parcel.readString();
        this.A02 = parcel.readByte() == 1;
    }
}
