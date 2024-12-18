package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC06930Yk;
import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgFundedIncentiveDetail extends C17T implements IgFundedIncentiveDetail {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(58);

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, getDescription());
        }
        if (getName() != null) {
            AbstractC37300Gc1.A14(getName(), A1I);
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final IgFundedIncentiveDetailImpl F68() {
        return new IgFundedIncentiveDetailImpl(A0h(-1724546052), A0Q());
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final String getDescription() {
        return A0h(-1724546052);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final String getName() {
        return A0Q();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
