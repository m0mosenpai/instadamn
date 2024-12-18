package com.instagram.wonderwall.model;

import X.C14360o3;
import X.C28154Cb1;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public interface WallText extends Parcelable {
    public static final C28154Cb1 A00 = C28154Cb1.A01;

    /* loaded from: classes5.dex */
    public final class Raw implements WallText {
        public static final Parcelable.Creator CREATOR = new C55344OhA(44);
        public final String A00;

        public Raw(String str) {
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

    /* loaded from: classes5.dex */
    public final class Res implements WallText {
        public static final Parcelable.Creator CREATOR = new C55344OhA(45);
        public final int A00;
        public final String[] A01;

        public Res(int i, String[] strArr) {
            C14360o3.A0B(strArr, 2);
            this.A00 = i;
            this.A01 = strArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(this.A00);
            parcel.writeStringArray(this.A01);
        }
    }
}
