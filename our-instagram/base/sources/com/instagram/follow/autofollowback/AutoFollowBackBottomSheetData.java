package com.instagram.follow.autofollowback;

import X.AbstractC167017dG;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class AutoFollowBackBottomSheetData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(81);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public AutoFollowBackBottomSheetData(ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC167017dG.A1Q(str, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }
}
