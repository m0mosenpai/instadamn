package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.VOE;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoElectionAddYoursInfoDict extends C17T implements ElectionAddYoursInfoDictIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(62);

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, VOE.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final Boolean Axo() {
        return getOptionalBooleanValueByHashCode(809963074);
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final List C91() {
        return getOptionalStringListByHashCode(-2098301001);
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final String CAs() {
        return A0i(-1114294257);
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final ElectionAddYoursInfoDict EtB() {
        return new ElectionAddYoursInfoDict(getOptionalBooleanValueByHashCode(809963074), A0i(-1114294257), getOptionalStringListByHashCode(-2098301001));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
