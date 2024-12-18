package com.instagram.model.shopping.reels;

import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class ProductShareConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(58);
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductShareConfig) {
                ProductShareConfig productShareConfig = (ProductShareConfig) obj;
                if (!C14360o3.A0K(this.A01, productShareConfig.A01) || this.A00 != productShareConfig.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public ProductShareConfig(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        this.A01 = readString;
        this.A00 = readInt;
    }
}
