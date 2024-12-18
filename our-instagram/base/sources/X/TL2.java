package X;

import java.util.EnumSet;

/* loaded from: classes10.dex */
public final class TL2 implements Runnable {
    public final /* synthetic */ C63364SiN A00;

    public TL2(C63364SiN c63364SiN) {
        this.A00 = c63364SiN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C63364SiN c63364SiN = this.A00;
            EnumSet enumSet = C63364SiN.A0c;
            C3Uj c3Uj = c63364SiN.A03;
            c63364SiN.A0C.A03();
            if (!c3Uj.A00) {
                C63293Sgt c63293Sgt = c63364SiN.A0E;
                synchronized (c63293Sgt) {
                    C63293Sgt.A02(c63293Sgt, new C62671SLj(new C63146Sds(EnumC61172RgY.PINGRESP), null, null), c63293Sgt.A01);
                }
            }
        } catch (Throwable th) {
            C63364SiN.A03(this.A00, EnumC61139Rft.PINGRESP, RhR.A00(th), th);
        }
    }
}
