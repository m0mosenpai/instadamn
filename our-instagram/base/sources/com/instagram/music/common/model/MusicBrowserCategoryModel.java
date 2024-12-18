package com.instagram.music.common.model;

import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class MusicBrowserCategoryModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(80);
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
