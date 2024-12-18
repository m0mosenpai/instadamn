package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* loaded from: classes7.dex */
public final class IL1 {
    public final UserSession A00;

    public final JFT A00(C38321qM c38321qM) {
        String fundraiserId;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC39031rc B99 = c38321qM.A0C.B99();
        if (B99 != null && (fundraiserId = B99.getFundraiserId()) != null) {
            String beneficiaryName = B99.getBeneficiaryName();
            String progressStr = B99.getProgressStr();
            String fundraiserTitle = B99.getFundraiserTitle();
            FundraiserCampaignTypeEnum B9C = B99.B9C();
            String id = c38321qM.getId();
            if (id != null) {
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    return new H7L(B9C, B99.BwP(), beneficiaryName, fundraiserId, progressStr, fundraiserTitle, id, A2u, AbstractC37303Gc4.A0T(this.A00, c38321qM));
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return C42465Ir6.A00;
    }

    public IL1(UserSession userSession) {
        this.A00 = userSession;
    }
}
