package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC33661EuB;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoAudienceList extends C17T implements AudienceListIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(8);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33661EuB.A00(this));
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final String BNl() {
        return A0k(181965916);
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final boolean CSR() {
        return getBooleanValueByHashCode(-1249853396);
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final boolean CXV() {
        return getBooleanValueByHashCode(254374641);
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final boolean CXW() {
        return getBooleanValueByHashCode(-1287076211);
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final AudienceList Er0() {
        return new AudienceList(A0k(181965916), A0Q(), getBooleanValueByHashCode(-1249853396), getBooleanValueByHashCode(254374641), getBooleanValueByHashCode(-1287076211));
    }

    @Override // com.instagram.api.schemas.AudienceListIntf
    public final String getName() {
        return A0Q();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
