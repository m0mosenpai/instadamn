package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.HrT;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoPrivacyDisclosureInfo extends C17T implements PrivacyDisclosureInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(44);

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HrT.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final String B4W() {
        return A0i(-599624620);
    }

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final String Bgf() {
        return A0i(1629792697);
    }

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final PrivacyDisclosureInfoImpl EyC() {
        return new PrivacyDisclosureInfoImpl(A0i(-599624620), A0i(1629792697));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
