package X;

import com.instagram.api.schemas.ContentAppreciationFanOfferType;
import java.io.IOException;

/* renamed from: X.EuS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33678EuS {
    public static C50627MWo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ContentAppreciationFanOfferType contentAppreciationFanOfferType = null;
            E7d e7d = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("gift_progression_info".equals(A0s)) {
                    e7d = AbstractC33679EuT.parseFromJson(c16l);
                } else if ("offer_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    contentAppreciationFanOfferType = (ContentAppreciationFanOfferType) ContentAppreciationFanOfferType.A01.get(A1P);
                    if (contentAppreciationFanOfferType == null) {
                        contentAppreciationFanOfferType = ContentAppreciationFanOfferType.A05;
                    }
                }
                c16l.A0z();
            }
            if (contentAppreciationFanOfferType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("offer_type", c16l, "ContentAppreciationFanOfferInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C50627MWo(contentAppreciationFanOfferType, e7d);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
