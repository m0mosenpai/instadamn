package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39907Hmu;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoEntity extends C17T implements Entity {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(63);

    @Override // com.instagram.api.schemas.Entity
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39907Hmu.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.Entity
    public final String CBy() {
        return A0h(-675554107);
    }

    @Override // com.instagram.api.schemas.Entity
    public final EntityImpl EtC() {
        return new EntityImpl(A0e(), A0h(-675554107), A0V());
    }

    @Override // com.instagram.api.schemas.Entity
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.api.schemas.Entity
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
