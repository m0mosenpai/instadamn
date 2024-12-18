package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40407Hvu;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoTextPostAppUserFediverseInfo extends C17T implements TextPostAppUserFediverseInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(11);

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40407Hvu.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final Integer C6S() {
        return getOptionalIntValueByHashCode(1155122860);
    }

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final Integer C6T() {
        return getOptionalIntValueByHashCode(526864360);
    }

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final TextPostAppUserFediverseInfoImpl F3B() {
        return new TextPostAppUserFediverseInfoImpl(getOptionalIntValueByHashCode(1155122860), getOptionalIntValueByHashCode(526864360));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
