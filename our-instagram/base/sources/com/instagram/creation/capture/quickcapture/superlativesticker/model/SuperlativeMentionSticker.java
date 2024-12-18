package com.instagram.creation.capture.quickcapture.superlativesticker.model;

import X.AbstractC167017dG;
import X.C14360o3;
import X.LNM;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class SuperlativeMentionSticker implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(64);
    public final float A00;
    public final float A01;
    public final int A02;
    public final Rect A03;
    public final User A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A02);
    }

    public SuperlativeMentionSticker(Rect rect, User user, float f, float f2, int i) {
        AbstractC167017dG.A1P(user, rect);
        this.A04 = user;
        this.A03 = rect;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }
}
