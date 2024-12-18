package com.instagram.user.model;

import X.AbstractC152566tj;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CreatorShoppingInfoImpl extends C0T6 implements Parcelable, CreatorShoppingInfo {
    public static final Parcelable.Creator CREATOR = new C9Ay(67);
    public final List A00;

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final CreatorShoppingInfoImpl F7L(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final CreatorShoppingInfoImpl F7M(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CreatorShoppingInfoImpl) && C14360o3.A0K(this.A00, ((CreatorShoppingInfoImpl) obj).A00));
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
            ((User) it.next()).writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final List BNf() {
        return this.A00;
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreatorShoppingInfoDict", AbstractC152566tj.A00(this));
    }

    public CreatorShoppingInfoImpl(List list) {
        this.A00 = list;
    }
}
