package com.instagram.api.schemas;

import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ShoppingBrandWithProductsSubtitle extends C0T6 implements Parcelable, ShoppingBrandWithProductsSubtitleIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(0);
    public final String A00;
    public final boolean A01;

    public ShoppingBrandWithProductsSubtitle(boolean z, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = z;
        this.A00 = str;
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProductsSubtitleIntf
    public final ShoppingBrandWithProductsSubtitle EzV() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingBrandWithProductsSubtitle) {
                ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = (ShoppingBrandWithProductsSubtitle) obj;
                if (this.A01 != shoppingBrandWithProductsSubtitle.A01 || !C14360o3.A0K(this.A00, shoppingBrandWithProductsSubtitle.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC25225BEi.A08(this.A01));
    }
}
