package X;

import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Currency;

/* loaded from: classes11.dex */
public final class V53 extends AbstractC61132qb {
    public final int A00;
    public final IGBoostPackagesFlowInfo A01;
    public final UserSession A02;
    public final ProductType A03;
    public final String A04;
    public final String A05;
    public final Currency A06;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        V9j v9j = new V9j(userSession);
        IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo = this.A01;
        Currency currency = this.A06;
        int i = this.A00;
        return new UFQ(iGBoostPackagesFlowInfo.A00, v9j, iGBoostPackagesFlowInfo, userSession, this.A03, this.A04, this.A05, currency, i);
    }

    public V53(IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo, UserSession userSession, ProductType productType, String str, String str2, Currency currency, int i) {
        AbstractC167027dH.A13(userSession, iGBoostPackagesFlowInfo, currency);
        AbstractC167017dG.A1T(str, str2);
        this.A02 = userSession;
        this.A01 = iGBoostPackagesFlowInfo;
        this.A06 = currency;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = productType;
    }
}
