package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40160HrX;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ProductArtsLabelInformationDictImpl extends C0T6 implements Parcelable, ProductArtsLabelInformationDict {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(40);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final ProductArtsLabelInformationDictImpl EyH() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductArtsLabelInformationDictImpl) {
                ProductArtsLabelInformationDictImpl productArtsLabelInformationDictImpl = (ProductArtsLabelInformationDictImpl) obj;
                if (!C14360o3.A0K(this.A00, productArtsLabelInformationDictImpl.A00) || !C14360o3.A0K(this.A01, productArtsLabelInformationDictImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductArtsLabelInformationDict", AbstractC40160HrX.A00(this));
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final String getLabelDisplayValue() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelInformationDict
    public final String getLabelType() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public ProductArtsLabelInformationDictImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
