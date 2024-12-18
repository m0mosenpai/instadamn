package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class IgFundedIncentiveDetailImpl extends C0T6 implements Parcelable, IgFundedIncentiveDetail {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(32);
    public final String A00;
    public final String A01;

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final IgFundedIncentiveDetailImpl F68() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgFundedIncentiveDetailImpl) {
                IgFundedIncentiveDetailImpl igFundedIncentiveDetailImpl = (IgFundedIncentiveDetailImpl) obj;
                if (!C14360o3.A0K(this.A00, igFundedIncentiveDetailImpl.A00) || !C14360o3.A0K(this.A01, igFundedIncentiveDetailImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

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
        return AbstractC37300Gc1.A05("XDTShoppingIGFundedIncentiveBannerBottomsheetContent", AbstractC06930Yk.A0B(A1I));
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final String getDescription() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail
    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public IgFundedIncentiveDetailImpl(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
