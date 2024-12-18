package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC40720I3a;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IgFundedIncentiveBannerButton extends C0T6 implements Parcelable, IgFundedIncentiveBannerButtonIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(28);
    public final IgFundedIncentiveBannerButtonStyleType A00;
    public final IgFundedIncentiveButtonDestinationType A01;
    public final String A02;

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final IgFundedIncentiveBannerButton F67() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgFundedIncentiveBannerButton) {
                IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = (IgFundedIncentiveBannerButton) obj;
                if (this.A01 != igFundedIncentiveBannerButton.A01 || this.A00 != igFundedIncentiveBannerButton.A00 || !C14360o3.A0K(this.A02, igFundedIncentiveBannerButton.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final IgFundedIncentiveButtonDestinationType Awy() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final IgFundedIncentiveBannerButtonStyleType C38() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingIGFundedIncentiveBannerButtonStyle", AbstractC40720I3a.A00(this));
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public IgFundedIncentiveBannerButton(IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType, IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType, String str) {
        AbstractC167027dH.A13(igFundedIncentiveButtonDestinationType, igFundedIncentiveBannerButtonStyleType, str);
        this.A01 = igFundedIncentiveButtonDestinationType;
        this.A00 = igFundedIncentiveBannerButtonStyleType;
        this.A02 = str;
    }
}
