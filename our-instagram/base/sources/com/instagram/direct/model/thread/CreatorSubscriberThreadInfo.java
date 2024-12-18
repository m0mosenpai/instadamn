package com.instagram.direct.model.thread;

import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes3.dex */
public final class CreatorSubscriberThreadInfo implements Parcelable {
    public static final C206139Av CREATOR = new C206139Av(85);
    public ImageUrl A00;
    public Long A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        C14360o3.A0B(parcel, 0);
        Long l = this.A01;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
