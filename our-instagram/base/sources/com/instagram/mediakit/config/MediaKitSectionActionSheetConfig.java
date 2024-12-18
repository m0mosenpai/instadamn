package com.instagram.mediakit.config;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes9.dex */
public final class MediaKitSectionActionSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(45);
    public final List A00;
    public final String A01;

    public MediaKitSectionActionSheetConfig(String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
    }
}
