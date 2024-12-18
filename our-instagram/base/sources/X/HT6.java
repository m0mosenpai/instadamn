package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;

/* loaded from: classes7.dex */
public final class HT6 extends C17T implements InterfaceC43571JMf {
    @Override // X.InterfaceC43571JMf
    public final FundraiserVisibilityOnProfileStatus B9E() {
        return (FundraiserVisibilityOnProfileStatus) A0M(-482263327, C43278JAx.A00);
    }

    @Override // X.InterfaceC43571JMf
    public final UserRoleOnFundraiser CE2() {
        return (UserRoleOnFundraiser) A0M(339473514, C43279JAy.A00);
    }

    @Override // X.InterfaceC43571JMf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40259HtP.A00(this));
    }

    @Override // X.InterfaceC43571JMf
    public final String AnD() {
        return A0i(-2101705040);
    }

    @Override // X.InterfaceC43571JMf
    public final int BcN() {
        return getIntValueByHashCode(2117142322);
    }

    @Override // X.InterfaceC43571JMf
    public final H5H Ezq() {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-1881840883);
        String A0i = A0i(-2101705040);
        long A03 = A03(1725551537);
        String A0h = A0h(-1122682371);
        String A0h2 = A0h(2123044865);
        String A0k = A0k(-761937713);
        String A0h3 = A0h(26173988);
        return new H5H(B9E(), CE2(), A0i, A0h, A0h2, A0k, A0h3, A0h(-1729814302), getIntValueByHashCode(2117142322), A03, booleanValueByHashCode);
    }

    @Override // X.InterfaceC43571JMf
    public final boolean getCanViewerDonate() {
        return getBooleanValueByHashCode(-1881840883);
    }

    @Override // X.InterfaceC43571JMf
    public final long getEndTime() {
        return A03(1725551537);
    }

    @Override // X.InterfaceC43571JMf
    public final String getFormattedFundraiserProgressInfoText() {
        return A0h(-1122682371);
    }

    @Override // X.InterfaceC43571JMf
    public final String getFormattedGoalAmount() {
        return A0h(2123044865);
    }

    @Override // X.InterfaceC43571JMf
    public final String getFundraiserId() {
        return A0k(-761937713);
    }

    @Override // X.InterfaceC43571JMf
    public final String getFundraiserTitle() {
        return A0h(26173988);
    }

    @Override // X.InterfaceC43571JMf
    public final String getOwnerUsername() {
        return A0h(-1729814302);
    }
}
