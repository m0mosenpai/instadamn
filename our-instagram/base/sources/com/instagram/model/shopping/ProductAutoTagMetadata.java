package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ProductAutoTagMetadata extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(11);
    public final PointF A00;
    public final Float A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductAutoTagMetadata) {
                ProductAutoTagMetadata productAutoTagMetadata = (ProductAutoTagMetadata) obj;
                if (!C14360o3.A0K(this.A01, productAutoTagMetadata.A01) || !C14360o3.A0K(this.A00, productAutoTagMetadata.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public ProductAutoTagMetadata(PointF pointF, Float f) {
        this.A01 = f;
        this.A00 = pointF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductAutoTagMetadata(confidenceLevel=");
        A1C.append(this.A01);
        A1C.append(", originalCoordinates=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
