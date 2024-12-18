package X;

import android.os.Bundle;

/* renamed from: X.T2r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64185T2r implements TmO {
    public final Bundle A00;
    public final Q8V A01;

    @Override // X.TmO
    public final C63152Se0 BLy() {
        return null;
    }

    @Override // X.TmO
    public final void DHb(Bundle bundle, C63152Se0 c63152Se0) {
        if (c63152Se0 != null) {
            C63167SeR.A01(this.A01.A02, new C3AY(c63152Se0, bundle));
        }
    }

    @Override // X.TmO
    public final void DHc(Throwable th) {
        C63167SeR.A01(this.A01.A01, th);
    }

    public C64185T2r(Bundle bundle, Q8V q8v) {
        String str;
        this.A01 = q8v;
        this.A00 = bundle;
        if (!"PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE"))) {
            str = "CSC".equalsIgnoreCase(AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE")) ? "VERIFY_CVV" : "VERIFY_PAYPAL";
            C63167SeR.A01(this.A01.A00, new C3AY("PIN_RESET_BY_CVV_PAYPAL", new Bundle(this.A00)));
        }
        AbstractC63243Sfx.A03(str, bundle);
        C63167SeR.A01(this.A01.A00, new C3AY("PIN_RESET_BY_CVV_PAYPAL", new Bundle(this.A00)));
    }
}
