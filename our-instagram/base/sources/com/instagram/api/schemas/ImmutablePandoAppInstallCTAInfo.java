package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39743HkF;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoAppInstallCTAInfo extends C17T implements AppInstallCTAInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(5);

    @Override // com.instagram.api.schemas.AppInstallCTAInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39743HkF.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AppInstallCTAInfoIntf
    public final String Abn() {
        return A0h(-1171049866);
    }

    @Override // com.instagram.api.schemas.AppInstallCTAInfoIntf
    public final String BJX() {
        return A0k(-734535149);
    }

    @Override // com.instagram.api.schemas.AppInstallCTAInfoIntf
    public final AppInstallCTAInfo Eqq() {
        return new AppInstallCTAInfo(A0h(-1171049866), A0k(-734535149));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
