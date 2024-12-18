package com.instagram.api.schemas;

import X.AbstractC37404Gdk;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class GrowthFrictionInfoImpl extends C0T6 implements Parcelable, GrowthFrictionInfo {
    public static final Parcelable.Creator CREATOR = new C206149Aw(95);
    public final GrowthFrictionInterventionCategories A00;
    public final boolean A01;

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final GrowthFrictionInfoImpl Eu0() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInfoImpl) {
                GrowthFrictionInfoImpl growthFrictionInfoImpl = (GrowthFrictionInfoImpl) obj;
                if (this.A01 != growthFrictionInfoImpl.A01 || !C14360o3.A0K(this.A00, growthFrictionInfoImpl.A00)) {
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
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final boolean BB4() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final GrowthFrictionInterventionCategories BJE() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGrowthFrictionInfo", AbstractC37404Gdk.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        GrowthFrictionInterventionCategories growthFrictionInterventionCategories = this.A00;
        if (growthFrictionInterventionCategories == null) {
            hashCode = 0;
        } else {
            hashCode = growthFrictionInterventionCategories.hashCode();
        }
        return i2 + hashCode;
    }

    public GrowthFrictionInfoImpl(GrowthFrictionInterventionCategories growthFrictionInterventionCategories, boolean z) {
        this.A01 = z;
        this.A00 = growthFrictionInterventionCategories;
    }
}
