package com.instagram.creation.capture.assetpicker.model;

import X.AbstractC25225BEi;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class ShoppingMultiProductConfig extends C0T6 implements Parcelable {
    public static final LNM CREATOR = LNM.A00(40);
    public final int A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingMultiProductConfig) {
                ShoppingMultiProductConfig shoppingMultiProductConfig = (ShoppingMultiProductConfig) obj;
                if (this.A01 != shoppingMultiProductConfig.A01 || this.A00 != shoppingMultiProductConfig.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + this.A00;
    }

    public ShoppingMultiProductConfig(Parcel parcel) {
        boolean A1X = AbstractC37304Gc5.A1X(parcel);
        int readInt = parcel.readInt();
        this.A01 = A1X;
        this.A00 = readInt;
    }
}
