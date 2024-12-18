package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.CDD;
import X.CSO;
import X.DKY;
import X.J9M;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes5.dex */
public final class ImmutablePandoClipsTrialDict extends C17T implements ClipsTrialDict {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(31);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final /* synthetic */ CSO AKH() {
        return new CSO(this);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final MediaTrialGraduationStrategy BAG() {
        return (MediaTrialGraduationStrategy) A0N(-837452508, J9M.A00);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final MediaTrialStatus C0I() {
        return (MediaTrialStatus) A0N(-892481550, DKY.A00);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDD.A00(this));
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final Boolean Al7() {
        return getOptionalBooleanValueByHashCode(-1813816707);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final Boolean Cc9() {
        return getOptionalBooleanValueByHashCode(-1000044383);
    }

    @Override // com.instagram.api.schemas.ClipsTrialDict
    public final ClipsTrialDictImpl EsH() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1813816707);
        return new ClipsTrialDictImpl(BAG(), C0I(), optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(-1000044383));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
