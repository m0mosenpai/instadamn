package com.instagram.music.common.model;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class OriginalPartsAttributionModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(84);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public OriginalPartsAttributionModel(ImageUrl imageUrl, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = imageUrl;
    }
}
