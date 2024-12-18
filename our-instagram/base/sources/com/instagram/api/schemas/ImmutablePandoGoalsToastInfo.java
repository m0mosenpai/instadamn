package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39944HnZ;
import X.C17T;
import X.C39306HXx;
import X.C43234J9f;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoGoalsToastInfo extends C17T implements GoalsToastInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(77);

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final GoalsToastType C97() {
        return (GoalsToastType) A0N(-434802094, C43234J9f.A00);
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39944HnZ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String Aj7() {
        return AbstractC37304Gc5.A0g(this);
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String Aw9() {
        return A0i(1169975446);
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String BAA() {
        return A0j(194328007);
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String C93() {
        return A0i(-1773366604);
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final GoalsToastInfoImpl Etu() {
        return new GoalsToastInfoImpl(C97(), AbstractC37304Gc5.A0g(this), A0i(1169975446), A0j(194328007), A0i(-1773366604));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
