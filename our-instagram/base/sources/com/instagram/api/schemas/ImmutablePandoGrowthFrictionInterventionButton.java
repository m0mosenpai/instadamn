package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39949Hne;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoGrowthFrictionInterventionButton extends C17T implements GrowthFrictionInterventionButton {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(82);

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39949Hne.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final String AYR() {
        return A0i(-1422950858);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final Boolean Cb0() {
        return getOptionalBooleanValueByHashCode(1185544173);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final GrowthFrictionInterventionButtonImpl Eu1() {
        return new GrowthFrictionInterventionButtonImpl(getOptionalBooleanValueByHashCode(1185544173), A0i(-1422950858), A0X(), A0V());
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final String getText() {
        return A0X();
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
