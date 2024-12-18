package com.instagram.friendmap.data;

import X.C14360o3;
import X.C47887LDh;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public interface MapText extends Parcelable {
    public static final C47887LDh A00 = C47887LDh.A00;

    /* loaded from: classes8.dex */
    public final class Raw implements MapText {
        public static final Parcelable.Creator CREATOR = LNL.A00(85);
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

    /* loaded from: classes8.dex */
    public final class Res implements MapText {
        public static final Parcelable.Creator CREATOR = LNL.A00(86);
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
