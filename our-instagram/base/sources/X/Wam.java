package X;

import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes11.dex */
public final class Wam implements XCD {
    public static final Wam A00 = new Object();

    @Override // X.XCD
    public final void AC9(ECPIncentive eCPIncentive, UFP ufp, Integer num) {
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            C2GS c2gs = ufp.A0C;
            List A03 = WF5.A03(c2gs);
            if (A03 == null) {
                A03 = C16930sl.A00;
            }
            String str = ((ECPOnsiteOffer) eCPIncentive).A01;
            if (!A03.contains(str)) {
                Collection A032 = WF5.A03(c2gs);
                if (A032 == null) {
                    A032 = C16930sl.A00;
                }
                C63406Sjd.A0C(c2gs, new C69074VhP(C05F.A01, new IncentiveCredentialList(AbstractC001800i.A0T(str, A032)), null));
            }
        }
    }

    @Override // X.XCD
    public final void EFP(ECPIncentive eCPIncentive, UFP ufp) {
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            C2GS c2gs = ufp.A0C;
            Iterable A03 = WF5.A03(c2gs);
            if (A03 == null) {
                A03 = C16930sl.A00;
            }
            C63406Sjd.A0C(c2gs, new C69074VhP(C05F.A01, new IncentiveCredentialList(AbstractC001800i.A0f(A03, ((ECPOnsiteOffer) eCPIncentive).A01)), null));
        }
    }
}
