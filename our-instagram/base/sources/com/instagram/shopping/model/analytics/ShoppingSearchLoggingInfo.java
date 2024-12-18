package com.instagram.shopping.model.analytics;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class ShoppingSearchLoggingInfo extends C0T6 implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(77);
    public final String A00;
    public final String A01;
    public final HashMap A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingSearchLoggingInfo) {
                ShoppingSearchLoggingInfo shoppingSearchLoggingInfo = (ShoppingSearchLoggingInfo) obj;
                if (!C14360o3.A0K(this.A01, shoppingSearchLoggingInfo.A01) || !C14360o3.A0K(this.A02, shoppingSearchLoggingInfo.A02) || !C14360o3.A0K(this.A00, shoppingSearchLoggingInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public ShoppingSearchLoggingInfo(String str, String str2, HashMap hashMap) {
        this.A01 = str;
        this.A02 = hashMap;
        this.A00 = str2;
    }
}
