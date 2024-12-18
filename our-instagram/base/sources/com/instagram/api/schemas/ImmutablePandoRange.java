package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40201HsQ;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoRange extends C17T implements RangeIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(70);

    @Override // com.instagram.api.schemas.RangeIntf
    public final Entity B2H() {
        return (Entity) A05(-1298275357, ImmutablePandoEntity.class);
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40201HsQ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final Integer BN2() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final Integer BYa() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    @Override // com.instagram.api.schemas.RangeIntf
    public final Range Eyy() {
        EntityImpl entityImpl;
        Entity B2H = B2H();
        if (B2H != null) {
            entityImpl = B2H.EtC();
        } else {
            entityImpl = null;
        }
        return new Range(entityImpl, getOptionalIntValueByHashCode(-1106363674), getOptionalIntValueByHashCode(-1019779949));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
