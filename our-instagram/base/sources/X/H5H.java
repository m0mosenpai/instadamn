package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;

/* loaded from: classes7.dex */
public final class H5H extends C0T6 implements InterfaceC43571JMf {
    public final int A00;
    public final long A01;
    public final FundraiserVisibilityOnProfileStatus A02;
    public final UserRoleOnFundraiser A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public H5H(FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus, UserRoleOnFundraiser userRoleOnFundraiser, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, boolean z) {
        AbstractC25234BEr.A0k(4, str2, str3, str4, str5);
        AbstractC167007dF.A1J(fundraiserVisibilityOnProfileStatus, 8, str6);
        C14360o3.A0B(userRoleOnFundraiser, 11);
        this.A0A = z;
        this.A04 = str;
        this.A01 = j;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = fundraiserVisibilityOnProfileStatus;
        this.A09 = str6;
        this.A00 = i;
        this.A03 = userRoleOnFundraiser;
    }

    @Override // X.InterfaceC43571JMf
    public final H5H Ezq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5H) {
                H5H h5h = (H5H) obj;
                if (this.A0A != h5h.A0A || !C14360o3.A0K(this.A04, h5h.A04) || this.A01 != h5h.A01 || !C14360o3.A0K(this.A05, h5h.A05) || !C14360o3.A0K(this.A06, h5h.A06) || !C14360o3.A0K(this.A07, h5h.A07) || !C14360o3.A0K(this.A08, h5h.A08) || this.A02 != h5h.A02 || !C14360o3.A0K(this.A09, h5h.A09) || this.A00 != h5h.A00 || this.A03 != h5h.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43571JMf
    public final String AnD() {
        return this.A04;
    }

    @Override // X.InterfaceC43571JMf
    public final FundraiserVisibilityOnProfileStatus B9E() {
        return this.A02;
    }

    @Override // X.InterfaceC43571JMf
    public final int BcN() {
        return this.A00;
    }

    @Override // X.InterfaceC43571JMf
    public final UserRoleOnFundraiser CE2() {
        return this.A03;
    }

    @Override // X.InterfaceC43571JMf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStandaloneFundraiserDictV2", AbstractC40259HtP.A00(this));
    }

    @Override // X.InterfaceC43571JMf
    public final boolean getCanViewerDonate() {
        return this.A0A;
    }

    @Override // X.InterfaceC43571JMf
    public final long getEndTime() {
        return this.A01;
    }

    @Override // X.InterfaceC43571JMf
    public final String getFormattedFundraiserProgressInfoText() {
        return this.A05;
    }

    @Override // X.InterfaceC43571JMf
    public final String getFormattedGoalAmount() {
        return this.A06;
    }

    @Override // X.InterfaceC43571JMf
    public final String getFundraiserId() {
        return this.A07;
    }

    @Override // X.InterfaceC43571JMf
    public final String getFundraiserTitle() {
        return this.A08;
    }

    @Override // X.InterfaceC43571JMf
    public final String getOwnerUsername() {
        return this.A09;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC25236BEt.A01(this.A01, (AbstractC25225BEi.A08(this.A0A) + AbstractC167017dG.A0O(this.A04)) * 31))))))) + this.A00) * 31);
    }
}
