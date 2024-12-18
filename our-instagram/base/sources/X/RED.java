package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;

/* loaded from: classes10.dex */
public final class RED extends Q8X {
    public FBPayLoggerData A00;
    public final C2GT A01;
    public final C2GC A02;

    public RED(C2GC c2gc, SE7 se7) {
        this.A02 = c2gc;
        Q8J A00 = REU.A00(new C63581Spo(se7, 11), se7.A00);
        C14360o3.A07(A00);
        this.A01 = TW3.A00(A00, this, 18);
        C63627SqZ.A02(A00, this.A03, this, 12);
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        this.A00 = AbstractC58320PtC.A0Z(bundle);
    }
}
