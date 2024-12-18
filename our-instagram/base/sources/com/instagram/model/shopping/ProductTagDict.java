package com.instagram.model.shopping;

import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C9Ay;
import X.I3L;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ProductTagDict extends C0T6 implements Parcelable, ProductTagDictIntf {
    public static final Parcelable.Creator CREATOR = new C9Ay(32);
    public final ProductDetailsProductItemDict A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final List A04;

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final ProductTagDictIntf EBm(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final ProductTagDict F5x(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTagDict) {
                ProductTagDict productTagDict = (ProductTagDict) obj;
                if (!C14360o3.A0K(this.A02, productTagDict.A02) || !C14360o3.A0K(this.A03, productTagDict.A03) || !C14360o3.A0K(this.A01, productTagDict.A01) || !C14360o3.A0K(this.A04, productTagDict.A04) || !C14360o3.A0K(this.A00, productTagDict.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A03;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A04;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A00;
        return hashCode4 + (productDetailsProductItemDict != null ? productDetailsProductItemDict.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A03;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeFloat(((Number) it.next()).floatValue());
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final Integer Awz() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final Integer BDq() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final List Bec() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgl() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final Boolean Cbq() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedItemProductTagDict", I3L.A00(this));
    }

    public ProductTagDict(ProductDetailsProductItemDict productDetailsProductItemDict, Boolean bool, Integer num, Integer num2, List list) {
        this.A02 = num;
        this.A03 = num2;
        this.A01 = bool;
        this.A04 = list;
        this.A00 = productDetailsProductItemDict;
    }
}
