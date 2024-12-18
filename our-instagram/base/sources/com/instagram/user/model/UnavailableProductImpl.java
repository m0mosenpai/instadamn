package com.instagram.user.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class UnavailableProductImpl extends C0T6 implements Parcelable, UnavailableProduct {
    public static final Parcelable.Creator CREATOR = new C55344OhA(21);
    public final User A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnavailableProductImpl) {
                UnavailableProductImpl unavailableProductImpl = (UnavailableProductImpl) obj;
                if (!C14360o3.A0K(this.A02, unavailableProductImpl.A02) || !C14360o3.A0K(this.A00, unavailableProductImpl.A00) || !C14360o3.A0K(this.A01, unavailableProductImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.user.model.UnavailableProduct
    public final User BSW() {
        return this.A00;
    }

    @Override // com.instagram.user.model.UnavailableProduct
    public final String getProductId() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0O(this.A02) * 31));
    }

    public UnavailableProductImpl(User user, String str, String str2) {
        AbstractC167017dG.A1R(user, str2);
        this.A02 = str;
        this.A00 = user;
        this.A01 = str2;
    }
}
