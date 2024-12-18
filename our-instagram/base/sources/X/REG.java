package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class REG extends Q8X {
    public FBPayLoggerData A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GC A03;
    public final UserSession A04;

    public REG(C2GC c2gc, SE6 se6, UserSession userSession) {
        this.A03 = c2gc;
        Q8J A00 = REU.A00(new C63581Spo(se6, 10), se6.A00);
        C14360o3.A07(A00);
        this.A01 = TW3.A00(A00, this, 16);
        C63627SqZ.A02(A00, super.A03, this, 11);
        this.A02 = TW3.A00(A00, this, 17);
        this.A04 = userSession;
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A00 = AbstractC58320PtC.A0Z(bundle);
    }
}
