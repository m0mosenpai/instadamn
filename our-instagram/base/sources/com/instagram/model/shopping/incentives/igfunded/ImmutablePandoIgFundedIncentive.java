package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40722I3c;
import X.C17T;
import X.C39305HXw;
import X.JDE;
import X.JDF;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgFundedIncentive extends C17T implements IgFundedIncentiveIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(56);

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentiveBannerIconType AfO() {
        return (IgFundedIncentiveBannerIconType) A0N(-1907158612, JDE.A00);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final List AxB() {
        return A08(1557721666, ImmutablePandoIgFundedIncentiveDetail.class);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentiveBannerButtonIntf B6Z() {
        return (IgFundedIncentiveBannerButtonIntf) A05(-413013087, ImmutablePandoIgFundedIncentiveBannerButton.class);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentiveNuxDisplayStyle BYN() {
        return (IgFundedIncentiveNuxDisplayStyle) A0M(1499655110, JDF.A00);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentiveBannerButtonIntf BrK() {
        return (IgFundedIncentiveBannerButtonIntf) A05(1189786973, ImmutablePandoIgFundedIncentiveBannerButton.class);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentive F66() {
        ArrayList arrayList;
        IgFundedIncentiveBannerButton igFundedIncentiveBannerButton;
        IgFundedIncentiveBannerIconType AfO = AfO();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1653358671);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(513507190);
        String A0h = A0h(-1724546052);
        List AxB = AxB();
        IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = null;
        if (AxB != null) {
            arrayList = AbstractC167017dG.A0q(AxB);
            Iterator it = AxB.iterator();
            while (it.hasNext()) {
                arrayList.add(((IgFundedIncentiveDetail) it.next()).F68());
            }
        } else {
            arrayList = null;
        }
        IgFundedIncentiveBannerButtonIntf B6Z = B6Z();
        if (B6Z != null) {
            igFundedIncentiveBannerButton = B6Z.F67();
        } else {
            igFundedIncentiveBannerButton = null;
        }
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-540695623);
        String A0k = A0k(1853315183);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(-613728513);
        String A0i = A0i(2050142337);
        String A0i2 = A0i(-1939587441);
        IgFundedIncentiveNuxDisplayStyle BYN = BYN();
        IgFundedIncentiveBannerButtonIntf BrK = BrK();
        if (BrK != null) {
            igFundedIncentiveBannerButton2 = BrK.F67();
        }
        return new IgFundedIncentive(igFundedIncentiveBannerButton, igFundedIncentiveBannerButton2, AfO, BYN, optionalIntValueByHashCode, optionalIntValueByHashCode2, A0h, A0k, A0i, A0i2, A0S(), arrayList, booleanValueByHashCode, booleanValueByHashCode2, getBooleanValueByHashCode(-978473626));
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40722I3c.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final Integer As1() {
        return getOptionalIntValueByHashCode(1653358671);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final Integer As2() {
        return getOptionalIntValueByHashCode(513507190);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final boolean BC3() {
        return getBooleanValueByHashCode(-540695623);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String BHK() {
        return A0k(1853315183);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String BYL() {
        return A0i(2050142337);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String BYM() {
        return A0i(-1939587441);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final boolean Bvi() {
        return getBooleanValueByHashCode(-978473626);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final boolean CZJ() {
        return getBooleanValueByHashCode(-613728513);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String getDescription() {
        return A0h(-1724546052);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String getTitle() {
        return A0S();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
