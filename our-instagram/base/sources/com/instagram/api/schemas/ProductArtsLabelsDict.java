package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import X.HrZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ProductArtsLabelsDict extends C0T6 implements Parcelable, ProductArtsLabelsDictIntf {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(41);
    public final List A00;

    @Override // com.instagram.api.schemas.ProductArtsLabelsDictIntf
    public final ProductArtsLabelsDict EyI() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductArtsLabelsDict) && C14360o3.A0K(this.A00, ((ProductArtsLabelsDict) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelsDictIntf
    public final List BL3() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelsDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductArtsLabelsDict", HrZ.A00(this));
    }

    public ProductArtsLabelsDict(List list) {
        this.A00 = list;
    }
}
