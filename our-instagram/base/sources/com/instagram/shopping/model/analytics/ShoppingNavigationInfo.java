package com.instagram.shopping.model.analytics;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.C0T6;
import X.C0Zx;
import X.C14360o3;
import X.C37324GcR;
import X.C38B;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ShoppingNavigationInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(76);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingNavigationInfo) {
                ShoppingNavigationInfo shoppingNavigationInfo = (ShoppingNavigationInfo) obj;
                if (!C14360o3.A0K(this.A03, shoppingNavigationInfo.A03) || !C14360o3.A0K(this.A00, shoppingNavigationInfo.A00) || !C14360o3.A0K(this.A01, shoppingNavigationInfo.A01) || !C14360o3.A0K(this.A02, shoppingNavigationInfo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public final C38B A00() {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("submodule", this.A03);
        AbstractC37300Gc1.A0v(c0Zx, this.A00);
        AbstractC37300Gc1.A0w(c0Zx, this.A01);
        AbstractC37303Gc4.A0z(c0Zx, "shopping_session_id", this.A02);
        return c0Zx;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public ShoppingNavigationInfo(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public ShoppingNavigationInfo() {
        this(null, null, null, null);
    }
}
