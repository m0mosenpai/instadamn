package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC38048Gob;
import X.AbstractC50102Ry;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ProductGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(13);
    public HashMap A00;
    public List A01;
    public List A02;

    /* loaded from: classes7.dex */
    public class VariantKey implements Parcelable {
        public static final Parcelable.Creator CREATOR = C41856IgA.A00(14);
        public String A00;
        public String A01;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                VariantKey variantKey = (VariantKey) obj;
                if (!AbstractC50102Ry.A00(this.A00, variantKey.A00) || !AbstractC50102Ry.A00(this.A01, variantKey.A01)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return AbstractC37301Gc2.A02(this.A00, this.A01);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List A00() {
        return Collections.unmodifiableList(AbstractC38048Gob.A03(this.A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.instagram.model.shopping.ProductGroup$VariantKey] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.instagram.model.shopping.ProductGroup$VariantKey] */
    public final List A01(ProductVariantDimension productVariantDimension, String str) {
        String str2 = productVariantDimension.A02;
        ?? obj = new Object();
        obj.A00 = str2;
        obj.A01 = str;
        if (this.A00 == null) {
            this.A00 = AbstractC166987dD.A1G();
            Iterator it = AbstractC38048Gob.A03(this.A01).iterator();
            while (it.hasNext()) {
                Product A0L = AbstractC37300Gc1.A0L(it);
                List<ProductVariantPossibleValueDictIntf> list = A0L.A0O;
                if (list != null) {
                    for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                        String id = productVariantPossibleValueDictIntf.getId();
                        String value = productVariantPossibleValueDictIntf.getValue();
                        ?? obj2 = new Object();
                        obj2.A00 = id;
                        obj2.A01 = value;
                        List list2 = (List) this.A00.get(obj2);
                        if (list2 == null) {
                            list2 = AbstractC166987dD.A1E();
                            this.A00.put(obj2, list2);
                        }
                        list2.add(A0L);
                    }
                }
            }
        }
        List list3 = (List) this.A00.get(obj);
        if (list3 == null) {
            return Collections.emptyList();
        }
        return list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(this.A00);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            parcel.writeParcelable((Parcelable) A1K.getKey(), i);
            parcel.writeList((List) A1K.getValue());
        }
    }
}
