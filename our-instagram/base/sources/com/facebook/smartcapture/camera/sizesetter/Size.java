package com.facebook.smartcapture.camera.sizesetter;

import X.AnonymousClass001;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class Size implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(59);
    public final int A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Size) {
                Size size = (Size) obj;
                if (this.A01 != size.A01 || this.A00 != size.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("Size(width=", ", height=", ')', this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public Size(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
