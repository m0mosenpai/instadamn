package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40030HpH;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoInlineStyleAtRangeDict extends C17T implements InlineStyleAtRangeDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(7);

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40030HpH.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final Integer BHr() {
        return getOptionalIntValueByHashCode(728566923);
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final Integer BN2() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final Integer BYa() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final InlineStyleAtRangeDict Evh() {
        return new InlineStyleAtRangeDict(getOptionalIntValueByHashCode(728566923), getOptionalIntValueByHashCode(-1106363674), getOptionalIntValueByHashCode(-1019779949));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
