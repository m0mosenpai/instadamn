package com.instagram.api.schemas;

import X.AbstractC37405Gdl;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class GrowthFrictionInterventionCategoriesImpl extends C0T6 implements Parcelable, GrowthFrictionInterventionCategories {
    public static final Parcelable.Creator CREATOR = new C206149Aw(96);
    public final GrowthFrictionInterventionDetail A00;
    public final GrowthFrictionInterventionDetail A01;
    public final GrowthFrictionInterventionDetail A02;

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionCategoriesImpl Eu2() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionCategoriesImpl) {
                GrowthFrictionInterventionCategoriesImpl growthFrictionInterventionCategoriesImpl = (GrowthFrictionInterventionCategoriesImpl) obj;
                if (!C14360o3.A0K(this.A00, growthFrictionInterventionCategoriesImpl.A00) || !C14360o3.A0K(this.A01, growthFrictionInterventionCategoriesImpl.A01) || !C14360o3.A0K(this.A02, growthFrictionInterventionCategoriesImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail = this.A00;
        int hashCode = (growthFrictionInterventionDetail == null ? 0 : growthFrictionInterventionDetail.hashCode()) * 31;
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail2 = this.A01;
        int hashCode2 = (hashCode + (growthFrictionInterventionDetail2 == null ? 0 : growthFrictionInterventionDetail2.hashCode())) * 31;
        GrowthFrictionInterventionDetail growthFrictionInterventionDetail3 = this.A02;
        return hashCode2 + (growthFrictionInterventionDetail3 != null ? growthFrictionInterventionDetail3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionDetail B7F() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionDetail BSJ() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionDetail C4w() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGrowthFrictionInterventionCategories", AbstractC37405Gdl.A00(this));
    }

    public GrowthFrictionInterventionCategoriesImpl(GrowthFrictionInterventionDetail growthFrictionInterventionDetail, GrowthFrictionInterventionDetail growthFrictionInterventionDetail2, GrowthFrictionInterventionDetail growthFrictionInterventionDetail3) {
        this.A00 = growthFrictionInterventionDetail;
        this.A01 = growthFrictionInterventionDetail2;
        this.A02 = growthFrictionInterventionDetail3;
    }
}
