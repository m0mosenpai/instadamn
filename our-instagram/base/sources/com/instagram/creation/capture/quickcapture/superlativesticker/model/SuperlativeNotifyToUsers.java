package com.instagram.creation.capture.quickcapture.superlativesticker.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class SuperlativeNotifyToUsers implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(65);
    public final User A00;

    public SuperlativeNotifyToUsers(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
