package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CreditCardAssociation;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.PaymentMethodImpl;
import java.io.IOException;

/* renamed from: X.Hr5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40137Hr5 {
    public static PaymentMethodImpl parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreditCardAssociation creditCardAssociation = null;
            FundingSourceType fundingSourceType = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2859);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("credit_card_association".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    creditCardAssociation = (CreditCardAssociation) CreditCardAssociation.A01.get(A1P2);
                    if (creditCardAssociation == null) {
                        creditCardAssociation = CreditCardAssociation.A0G;
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    fundingSourceType = (FundingSourceType) FundingSourceType.A01.get(A1P);
                    if (fundingSourceType == null) {
                        fundingSourceType = FundingSourceType.A0H;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (creditCardAssociation == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("credit_card_association", c16l, "PaymentMethodImpl");
            } else if (fundingSourceType != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "PaymentMethodImpl");
                } else {
                    return new PaymentMethodImpl(creditCardAssociation, fundingSourceType, str2, str);
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "PaymentMethodImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
