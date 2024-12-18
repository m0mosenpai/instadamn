package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.model.shopping.sizechart.SizeChart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductVariantDimension implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(18);
    public ProductVariantVisualStyle A00;
    public SizeChart A01;
    public String A02;
    public String A03;
    public List A04;
    public final List A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductVariantDimension) {
            ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj;
            if (this.A02.equals(productVariantDimension.A02) && this.A03.equals(productVariantDimension.A03) && this.A00 == productVariantDimension.A00) {
                return this.A05.equals(productVariantDimension.A05);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))) + this.A05.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A05);
        parcel.writeSerializable(this.A00);
    }

    public ProductVariantDimension(Parcel parcel) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A05 = A1E;
        String readString = parcel.readString();
        readString.getClass();
        this.A02 = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A03 = readString2;
        parcel.readStringList(A1E);
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.A00 = (ProductVariantVisualStyle) readSerializable;
    }

    public ProductVariantDimension() {
        this.A05 = AbstractC166987dD.A1E();
    }
}
