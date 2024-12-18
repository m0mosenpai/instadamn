package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40722I3c;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IgFundedIncentive extends C0T6 implements IgFundedIncentiveIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(27);
    public final IgFundedIncentiveBannerButton A00;
    public final IgFundedIncentiveBannerButton A01;
    public final IgFundedIncentiveBannerIconType A02;
    public final IgFundedIncentiveNuxDisplayStyle A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public IgFundedIncentive(IgFundedIncentiveBannerButton igFundedIncentiveBannerButton, IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2, IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType, IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1I(str, 4, str2);
        AbstractC25229BEm.A1O(igFundedIncentiveNuxDisplayStyle, 12, str5);
        this.A02 = igFundedIncentiveBannerIconType;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = str;
        this.A0B = list;
        this.A00 = igFundedIncentiveBannerButton;
        this.A0C = z;
        this.A07 = str2;
        this.A0D = z2;
        this.A08 = str3;
        this.A09 = str4;
        this.A03 = igFundedIncentiveNuxDisplayStyle;
        this.A01 = igFundedIncentiveBannerButton2;
        this.A0E = z3;
        this.A0A = str5;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentive F66() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgFundedIncentive) {
                IgFundedIncentive igFundedIncentive = (IgFundedIncentive) obj;
                if (this.A02 != igFundedIncentive.A02 || !C14360o3.A0K(this.A04, igFundedIncentive.A04) || !C14360o3.A0K(this.A05, igFundedIncentive.A05) || !C14360o3.A0K(this.A06, igFundedIncentive.A06) || !C14360o3.A0K(this.A0B, igFundedIncentive.A0B) || !C14360o3.A0K(this.A00, igFundedIncentive.A00) || this.A0C != igFundedIncentive.A0C || !C14360o3.A0K(this.A07, igFundedIncentive.A07) || this.A0D != igFundedIncentive.A0D || !C14360o3.A0K(this.A08, igFundedIncentive.A08) || !C14360o3.A0K(this.A09, igFundedIncentive.A09) || this.A03 != igFundedIncentive.A03 || !C14360o3.A0K(this.A01, igFundedIncentive.A01) || this.A0E != igFundedIncentive.A0E || !C14360o3.A0K(this.A0A, igFundedIncentive.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = this.A02;
        if (igFundedIncentiveBannerIconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igFundedIncentiveBannerIconType.writeToParcel(parcel, i);
        }
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        parcel.writeString(this.A06);
        List list = this.A0B;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = this.A00;
        if (igFundedIncentiveBannerButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igFundedIncentiveBannerButton.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        this.A03.writeToParcel(parcel, i);
        IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = this.A01;
        if (igFundedIncentiveBannerButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igFundedIncentiveBannerButton2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A0A);
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentiveBannerIconType AfO() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final Integer As1() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final Integer As2() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final List AxB() {
        return this.A0B;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final /* bridge */ /* synthetic */ IgFundedIncentiveBannerButtonIntf B6Z() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final boolean BC3() {
        return this.A0C;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String BHK() {
        return this.A07;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String BYL() {
        return this.A08;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String BYM() {
        return this.A09;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final IgFundedIncentiveNuxDisplayStyle BYN() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final /* bridge */ /* synthetic */ IgFundedIncentiveBannerButtonIntf BrK() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final boolean Bvi() {
        return this.A0E;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final boolean CZJ() {
        return this.A0D;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingIGFundedIncentiveBanner", AbstractC40722I3c.A00(this));
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String getDescription() {
        return this.A06;
    }

    @Override // com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf
    public final String getTitle() {
        return this.A0A;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0A, AbstractC167007dF.A0D(this.A0E, (AbstractC166997dE.A0J(this.A03, (((AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0K(this.A07, AbstractC167007dF.A0D(this.A0C, (((AbstractC166997dE.A0K(this.A06, ((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }
}
