package X;

import android.os.Bundle;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class T32 implements InterfaceC65380TjD {
    public final C62962SZf A00;

    @Override // X.InterfaceC65380TjD
    public final C58252li Emw(Bundle bundle, InterfaceC65506Tlb interfaceC65506Tlb, C63152Se0 c63152Se0) {
        C62962SZf c62962SZf = this.A00;
        String string = bundle.getString("PAYMENT_TYPE");
        C63346Si2 A01 = C63174SeZ.A01();
        Object obj = new Object();
        java.util.Set singleton = Collections.singleton(c63152Se0);
        SXG A00 = SXG.A0A.A00(A01, obj, "ENABLE_FBPAY_PIN", SSA.A01(bundle), singleton);
        return TW3.A00(AbstractC63245Sfz.A00(new C63582Spp(c62962SZf, A00, string, 9), c62962SZf, c62962SZf.A01, A00), this, 8);
    }

    public T32(C62962SZf c62962SZf) {
        this.A00 = c62962SZf;
    }
}
