package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39970Hnz;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGAdCreativeOptimizationConfigByTypeDictImpl extends C0T6 implements Parcelable, IGAdCreativeOptimizationConfigByTypeDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(15);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final IGAdCreativeOptimizationConfigByTypeDictImpl EuF() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdCreativeOptimizationConfigByTypeDictImpl) {
                IGAdCreativeOptimizationConfigByTypeDictImpl iGAdCreativeOptimizationConfigByTypeDictImpl = (IGAdCreativeOptimizationConfigByTypeDictImpl) obj;
                if (!C14360o3.A0K(this.A00, iGAdCreativeOptimizationConfigByTypeDictImpl.A00) || !C14360o3.A0K(this.A01, iGAdCreativeOptimizationConfigByTypeDictImpl.A01)) {
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

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final String BZJ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final String BZM() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGAdCreativeOptimizationConfigByTypeDict", AbstractC39970Hnz.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public IGAdCreativeOptimizationConfigByTypeDictImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
