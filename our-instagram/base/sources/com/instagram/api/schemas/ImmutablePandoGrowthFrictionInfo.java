package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37404Gdk;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoGrowthFrictionInfo extends C17T implements GrowthFrictionInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(81);

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final GrowthFrictionInterventionCategories BJE() {
        return (GrowthFrictionInterventionCategories) A05(-2079327108, ImmutablePandoGrowthFrictionInterventionCategories.class);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37404Gdk.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final boolean BB4() {
        return getBooleanValueByHashCode(-815097976);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInfo
    public final GrowthFrictionInfoImpl Eu0() {
        GrowthFrictionInterventionCategoriesImpl growthFrictionInterventionCategoriesImpl;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-815097976);
        GrowthFrictionInterventionCategories BJE = BJE();
        if (BJE != null) {
            growthFrictionInterventionCategoriesImpl = BJE.Eu2();
        } else {
            growthFrictionInterventionCategoriesImpl = null;
        }
        return new GrowthFrictionInfoImpl(growthFrictionInterventionCategoriesImpl, booleanValueByHashCode);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
