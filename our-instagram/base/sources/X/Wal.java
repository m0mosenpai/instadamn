package X;

import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import java.util.Collection;
import java.util.List;

/* loaded from: classes11.dex */
public final class Wal implements XCD {
    public static final Wal A00 = new Object();

    @Override // X.XCD
    public final void AC9(ECPIncentive eCPIncentive, UFP ufp, Integer num) {
        C14360o3.A0B(num, 2);
        if (eCPIncentive instanceof ECPOffsiteOffer) {
            C2GS c2gs = ufp.A0D;
            List A04 = WF5.A04(c2gs);
            if (A04 == null) {
                A04 = C16930sl.A00;
            }
            String str = ((ECPOffsiteOffer) eCPIncentive).A01;
            if (!A04.contains(str)) {
                Collection A042 = WF5.A04(c2gs);
                if (A042 == null) {
                    A042 = C16930sl.A00;
                }
                C63406Sjd.A0C(c2gs, new C69074VhP(num, new PromoCodeList(AbstractC001800i.A0T(str, A042)), null));
            }
        }
    }

    @Override // X.XCD
    public final void EFP(ECPIncentive eCPIncentive, UFP ufp) {
        if (eCPIncentive instanceof ECPOffsiteOffer) {
            C2GS c2gs = ufp.A0D;
            Iterable A04 = WF5.A04(c2gs);
            if (A04 == null) {
                A04 = C16930sl.A00;
            }
            C63406Sjd.A0C(c2gs, new C69074VhP(C05F.A01, new PromoCodeList(AbstractC001800i.A0f(A04, ((ECPOffsiteOffer) eCPIncentive).A01)), null));
        }
    }
}
