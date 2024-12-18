package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class BrandSafetyContentBlocklistBitmapQLObjImpl extends C0T6 implements Parcelable, BrandSafetyContentBlocklistBitmapQLObj {
    public static final Parcelable.Creator CREATOR = new C206149Aw(54);
    public final List A00;

    @Override // com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj
    public final BrandSafetyContentBlocklistBitmapQLObjImpl ErL() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrandSafetyContentBlocklistBitmapQLObjImpl) && C14360o3.A0K(this.A00, ((BrandSafetyContentBlocklistBitmapQLObjImpl) obj).A00));
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
            parcel.writeInt(((Number) it.next()).intValue());
        }
    }

    @Override // com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj
    public final List Ag9() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = this.A00;
        if (list != null) {
            linkedHashMap.put("bitmap_array", list);
        }
        return new TreeUpdaterJNI("XDTBrandSafetyContentBlocklistBitmapQLObj", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public BrandSafetyContentBlocklistBitmapQLObjImpl(List list) {
        this.A00 = list;
    }
}
