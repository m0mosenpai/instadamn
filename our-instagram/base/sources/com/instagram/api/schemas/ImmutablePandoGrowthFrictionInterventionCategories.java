package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37405Gdl;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoGrowthFrictionInterventionCategories extends C17T implements GrowthFrictionInterventionCategories {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(83);

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionDetail B7F() {
        return (GrowthFrictionInterventionDetail) A05(-1268958287, ImmutablePandoGrowthFrictionInterventionDetail.class);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionDetail BSJ() {
        return (GrowthFrictionInterventionDetail) A05(950345194, ImmutablePandoGrowthFrictionInterventionDetail.class);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionDetail C4w() {
        return (GrowthFrictionInterventionDetail) A05(114586, ImmutablePandoGrowthFrictionInterventionDetail.class);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37405Gdl.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionCategories
    public final GrowthFrictionInterventionCategoriesImpl Eu2() {
        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl;
        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl2;
        GrowthFrictionInterventionDetail B7F = B7F();
        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl3 = null;
        if (B7F != null) {
            growthFrictionInterventionDetailImpl = B7F.Eu3();
        } else {
            growthFrictionInterventionDetailImpl = null;
        }
        GrowthFrictionInterventionDetail BSJ = BSJ();
        if (BSJ != null) {
            growthFrictionInterventionDetailImpl2 = BSJ.Eu3();
        } else {
            growthFrictionInterventionDetailImpl2 = null;
        }
        GrowthFrictionInterventionDetail C4w = C4w();
        if (C4w != null) {
            growthFrictionInterventionDetailImpl3 = C4w.Eu3();
        }
        return new GrowthFrictionInterventionCategoriesImpl(growthFrictionInterventionDetailImpl, growthFrictionInterventionDetailImpl2, growthFrictionInterventionDetailImpl3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
