package com.instagram.reels.channelchallenge.model;

import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class ChannelChallengeStickerWinnerModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(23);
    public final ImageUrl A00;
    public final User A01;
    public final String A02;

    public ChannelChallengeStickerWinnerModel(ImageUrl imageUrl, User user, String str) {
        C14360o3.A0B(imageUrl, 2);
        this.A01 = user;
        this.A00 = imageUrl;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
