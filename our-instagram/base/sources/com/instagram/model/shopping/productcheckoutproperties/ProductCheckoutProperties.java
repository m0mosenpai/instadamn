package com.instagram.model.shopping.productcheckoutproperties;

import X.AbstractC40725I3f;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;

/* loaded from: classes3.dex */
public final class ProductCheckoutProperties extends C0T6 implements ProductCheckoutPropertiesIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(35);
    public final CurrencyAmountInfo A00;
    public final ShippingAndReturnsMetadata A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final ProductCheckoutProperties F69() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCheckoutProperties) {
                ProductCheckoutProperties productCheckoutProperties = (ProductCheckoutProperties) obj;
                if (!C14360o3.A0K(this.A02, productCheckoutProperties.A02) || !C14360o3.A0K(this.A03, productCheckoutProperties.A03) || !C14360o3.A0K(this.A04, productCheckoutProperties.A04) || !C14360o3.A0K(this.A00, productCheckoutProperties.A00) || !C14360o3.A0K(this.A0B, productCheckoutProperties.A0B) || !C14360o3.A0K(this.A05, productCheckoutProperties.A05) || !C14360o3.A0K(this.A06, productCheckoutProperties.A06) || !C14360o3.A0K(this.A0G, productCheckoutProperties.A0G) || !C14360o3.A0K(this.A0C, productCheckoutProperties.A0C) || !C14360o3.A0K(this.A07, productCheckoutProperties.A07) || !C14360o3.A0K(this.A08, productCheckoutProperties.A08) || !C14360o3.A0K(this.A09, productCheckoutProperties.A09) || !C14360o3.A0K(this.A0F, productCheckoutProperties.A0F) || !C14360o3.A0K(this.A0A, productCheckoutProperties.A0A) || !C14360o3.A0K(this.A0H, productCheckoutProperties.A0H) || !C14360o3.A0K(this.A01, productCheckoutProperties.A01) || !C14360o3.A0K(this.A0D, productCheckoutProperties.A0D) || !C14360o3.A0K(this.A0E, productCheckoutProperties.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A02;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A03;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A04;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        CurrencyAmountInfo currencyAmountInfo = this.A00;
        int hashCode4 = (hashCode3 + (currencyAmountInfo == null ? 0 : currencyAmountInfo.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.A05;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A06;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.A0G;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A0C;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool6 = this.A07;
        int hashCode10 = (hashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A08;
        int hashCode11 = (hashCode10 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A09;
        int hashCode12 = (hashCode11 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Long l = this.A0F;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool9 = this.A0A;
        int hashCode14 = (hashCode13 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str2 = this.A0H;
        int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingAndReturnsMetadata shippingAndReturnsMetadata = this.A01;
        int hashCode16 = (hashCode15 + (shippingAndReturnsMetadata == null ? 0 : shippingAndReturnsMetadata.hashCode())) * 31;
        Integer num3 = this.A0D;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0E;
        return hashCode17 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A04;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        Integer num = this.A0B;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool4 = this.A05;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.A06;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0G);
        Integer num2 = this.A0C;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool6 = this.A07;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.A08;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.A09;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Long l = this.A0F;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool9 = this.A0A;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0H);
        ShippingAndReturnsMetadata shippingAndReturnsMetadata = this.A01;
        if (shippingAndReturnsMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingAndReturnsMetadata.writeToParcel(parcel, i);
        }
        Integer num3 = this.A0D;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.A0E;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean AkE() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean AkQ() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean Al0() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final CurrencyAmountInfo Au6() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer B8u() {
        return this.A0B;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean BBk() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean BBl() {
        return this.A06;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer BJM() {
        return this.A0C;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Long BfH() {
        return this.A0F;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean Bh1() {
        return this.A0A;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final /* bridge */ /* synthetic */ ShippingAndReturnsMetadataIntf Bub() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer CBH() {
        return this.A0D;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Integer CGE() {
        return this.A0E;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean CX5() {
        return this.A07;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean CbM() {
        return this.A08;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final Boolean Cd7() {
        return this.A09;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductCheckoutPropertiesDict", AbstractC40725I3f.A00(this));
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final String getIgReferrerFbid() {
        return this.A0G;
    }

    @Override // com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf
    public final String getReceiverId() {
        return this.A0H;
    }

    public ProductCheckoutProperties(CurrencyAmountInfo currencyAmountInfo, ShippingAndReturnsMetadata shippingAndReturnsMetadata, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2) {
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A00 = currencyAmountInfo;
        this.A0B = num;
        this.A05 = bool4;
        this.A06 = bool5;
        this.A0G = str;
        this.A0C = num2;
        this.A07 = bool6;
        this.A08 = bool7;
        this.A09 = bool8;
        this.A0F = l;
        this.A0A = bool9;
        this.A0H = str2;
        this.A01 = shippingAndReturnsMetadata;
        this.A0D = num3;
        this.A0E = num4;
    }
}
