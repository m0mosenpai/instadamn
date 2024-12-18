package com.instagram.model.hashtag.response;

import X.C40781ul;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes11.dex */
public final class HashtagCollection extends C40781ul implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(85);
    public List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.A00);
        }
    }
}
