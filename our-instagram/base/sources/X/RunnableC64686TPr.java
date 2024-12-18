package X;

import android.os.Bundle;

/* renamed from: X.TPr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC64686TPr implements Runnable {
    public final /* synthetic */ SZC A00;
    public final /* synthetic */ SO7 A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ RunnableC64686TPr(SZC szc, SO7 so7, boolean z) {
        this.A01 = so7;
        this.A02 = z;
        this.A00 = szc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SO7 so7 = this.A01;
        boolean z = this.A02;
        SZC szc = this.A00;
        InterfaceC65210Tfy interfaceC65210Tfy = so7.A02.A00;
        if (interfaceC65210Tfy instanceof InterfaceC65209Tfx) {
            if (interfaceC65210Tfy instanceof InterfaceC65654TqT) {
                so7.A04.A01(!r2.A01.isEmpty());
            }
            SWL swl = so7.A05;
            try {
                C63166SeQ c63166SeQ = swl.A00;
                String A00 = swl.A02.A01.A02.A00();
                try {
                    try {
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("package_name", A00);
                        A0b.putBoolean("allow_download_over_metered_network", z);
                        A0b.putBundle("utm", szc.A01());
                        C63166SeQ.A00(A0b, c63166SeQ, "install");
                    } catch (IllegalStateException e) {
                        throw new RkF(EnumC61155RgG.UNKNOWN, e);
                    } catch (Exception e2) {
                    }
                } catch (RkF e3) {
                    throw e3;
                } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                }
            } catch (RkF e5) {
                swl.A01.EmQ("OxygenInstallSDK_UNEXPECTED_INSTALL_EXCEPTION", e5);
                swl.A02.A01(SWL.A00(e5, swl));
            }
        }
    }
}
