package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37304Gc5;
import X.AbstractC40130Hqx;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ImmutablePandoOriginalitySourceMediaInfo extends C17T implements OriginalitySourceMediaInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(38);
    public User A00;

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final User CDj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40130Hqx.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final OriginalitySourceMediaInfo E9X(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final OriginalitySourceMediaInfoImpl Exn(C1DY c1dy) {
        User user;
        User A0N;
        String A0k = AbstractC37301Gc2.A0k(this);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new OriginalitySourceMediaInfoImpl(user, A0k);
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final OriginalitySourceMediaInfoImpl Exo(C1DV c1dv) {
        return Exn(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final String getPk() {
        return AbstractC37301Gc2.A0k(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
