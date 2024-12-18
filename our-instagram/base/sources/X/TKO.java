package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final /* synthetic */ class TKO implements Runnable {
    public final /* synthetic */ SO7 A00;

    public /* synthetic */ TKO(SO7 so7) {
        this.A00 = so7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SO7 so7 = this.A00;
        if (so7.A02.A00 instanceof InterfaceC65208Tfw) {
            SWL swl = so7.A05;
            try {
                C63166SeQ c63166SeQ = swl.A00;
                String A00 = swl.A02.A01.A02.A00();
                try {
                    try {
                        try {
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putString("package_name", A00);
                            C63166SeQ.A00(A0b, c63166SeQ, "cancel");
                        } catch (IllegalArgumentException | UnsupportedOperationException e) {
                        }
                    } catch (IllegalStateException e2) {
                        throw new RkF(EnumC61155RgG.UNKNOWN, e2);
                    }
                } catch (RkF e3) {
                    throw e3;
                } catch (Exception e4) {
                }
            } catch (RkF e5) {
                swl.A01.EmQ("OxygenInstallSDK_UNEXPECTED_CANCEL_EXCEPTION", e5);
                swl.A02.A01(SWL.A00(e5, swl));
            }
        }
    }
}
