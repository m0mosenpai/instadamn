package com.instagram.wonderwall.model;

import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public interface Destination extends Parcelable {

    /* loaded from: classes6.dex */
    public final class Preview implements Destination {
        public static final Parcelable.Creator CREATOR = new C55344OhA(33);
        public final String A00;

        public Preview(String str) {
            C14360o3.A0B(str, 1);
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
        }
    }

    /* loaded from: classes6.dex */
    public final class Composer implements Destination {
        public static final Parcelable.Creator CREATOR = new C55344OhA(32);
        public final String A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
        }

        public Composer(String str) {
            this.A00 = str;
        }

        public Composer() {
            this(null);
        }
    }
}
