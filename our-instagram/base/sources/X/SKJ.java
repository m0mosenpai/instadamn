package X;

import com.fbpay.w3c.CardDetails;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class SKJ {
    public final /* synthetic */ C63380Siu A00;

    public SKJ(C63380Siu c63380Siu) {
        this.A00 = c63380Siu;
    }

    public final void A00(E72 e72) {
        CardDetails cardDetails;
        String str;
        if (!e72.A01) {
            if (e72.A02 && (cardDetails = (CardDetails) e72.A00) != null && (str = cardDetails.A08) != null) {
                C63380Siu.A05(this.A00, AbstractC166997dE.A0a(), Collections.singletonList(new CardDetails(null, null, null, null, null, null, null, null, str, null, null)));
                return;
            }
            return;
        }
        CardDetails cardDetails2 = (CardDetails) e72.A00;
        if (cardDetails2 == null) {
            return;
        }
        C63380Siu c63380Siu = this.A00;
        c63380Siu.A0Q.A00.A06.A01 = AbstractC61727Rsi.A00(cardDetails2);
        C63380Siu.A03(c63380Siu, cardDetails2);
    }
}
