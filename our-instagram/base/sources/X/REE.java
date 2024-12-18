package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;

/* loaded from: classes10.dex */
public final class REE extends Q8X {
    public FBPayLoggerData A00;
    public final C2GT A01;
    public final C2GC A02;
    public final C62580SHf A03;

    public REE(C2GC c2gc, C62580SHf c62580SHf) {
        this.A03 = c62580SHf;
        this.A02 = c2gc;
        this.A01 = TW3.A00(c62580SHf.A01, this, 14);
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A00 = AbstractC58320PtC.A0Z(bundle);
    }
}
