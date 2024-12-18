package com.facebook.smartcapture.camera.sizesetter;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class FixedSizes implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(58);
    public final Size A00;
    public final Size A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FixedSizes) {
                FixedSizes fixedSizes = (FixedSizes) obj;
                if (!C14360o3.A0K(this.A00, fixedSizes.A00) || !C14360o3.A0K(this.A01, fixedSizes.A01) || this.A02 != fixedSizes.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00));
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A0J + i;
    }

    public FixedSizes(Size size, Size size2, boolean z) {
        AbstractC167017dG.A1P(size, size2);
        this.A00 = size;
        this.A01 = size2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FixedSizes(photoSize=");
        A1C.append(this.A00);
        A1C.append(", previewSize=");
        A1C.append(this.A01);
        A1C.append(", autoCapture=");
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }
}
