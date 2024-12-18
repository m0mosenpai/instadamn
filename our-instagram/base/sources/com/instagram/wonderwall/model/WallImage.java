package com.instagram.wonderwall.model;

import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public interface WallImage extends Parcelable {

    /* loaded from: classes5.dex */
    public final class CircularAvatar implements WallImage {
        public static final Parcelable.Creator CREATOR = new C55344OhA(35);
        public final User A00;
        public final User A01;

        public CircularAvatar(User user, User user2) {
            C14360o3.A0B(user, 1);
            this.A01 = user;
            this.A00 = user2;
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
        }
    }

    /* loaded from: classes5.dex */
    public final class Drawable implements WallImage {
        public static final Parcelable.Creator CREATOR = new C55344OhA(36);
        public final int A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public Drawable(int i) {
            this.A00 = i;
        }
    }
}
