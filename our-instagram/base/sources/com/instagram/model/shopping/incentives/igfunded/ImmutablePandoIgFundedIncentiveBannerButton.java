package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40720I3a;
import X.C17T;
import X.C39305HXw;
import X.JDG;
import X.JDH;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgFundedIncentiveBannerButton extends C17T implements IgFundedIncentiveBannerButtonIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(57);

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final IgFundedIncentiveButtonDestinationType Awy() {
        return (IgFundedIncentiveButtonDestinationType) A0M(-1429847026, JDG.A00);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final IgFundedIncentiveBannerButtonStyleType C38() {
        return (IgFundedIncentiveBannerButtonStyleType) A0M(109780401, JDH.A00);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40720I3a.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final IgFundedIncentiveBannerButton F67() {
        return new IgFundedIncentiveBannerButton(C38(), Awy(), A0P());
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
