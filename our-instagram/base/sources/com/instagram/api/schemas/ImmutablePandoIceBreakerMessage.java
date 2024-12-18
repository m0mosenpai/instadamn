package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40026HpC;
import X.C17T;
import X.C39307HXy;
import X.C41089IHg;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIceBreakerMessage extends C17T implements IceBreakerMessageIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(5);

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final /* synthetic */ C41089IHg AKO() {
        return new C41089IHg(this);
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40026HpC.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final String BSz() {
        return A0i(-1690741544);
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final IceBreakerMessage Evc() {
        return new IceBreakerMessage(A0i(198286169), A0i(954925063), A0i(-1690741544));
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final String getActionUrl() {
        return A0i(198286169);
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final String getMessage() {
        return A0i(954925063);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
