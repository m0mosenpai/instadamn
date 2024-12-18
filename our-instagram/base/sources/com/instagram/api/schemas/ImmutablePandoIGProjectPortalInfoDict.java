package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40014Hov;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGProjectPortalInfoDict extends C17T implements IGProjectPortalInfoDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(1);

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40014Hov.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String AhU() {
        return A0i(-634959880);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String Alf() {
        return A0i(-350008305);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String Alg() {
        return A0i(1617667727);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String Alk() {
        return A0i(-1102650083);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String C5f() {
        return A0i(1304010549);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String C9T() {
        return A0i(-992015602);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final IGProjectPortalInfoDictImpl EvQ() {
        return new IGProjectPortalInfoDictImpl(A0i(-634959880), A0i(-350008305), A0i(1617667727), A0i(-1102650083), A0i(1304010549), A0i(-992015602));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
