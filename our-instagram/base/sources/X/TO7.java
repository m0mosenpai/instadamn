package X;

import java.util.EnumSet;

/* loaded from: classes10.dex */
public final class TO7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C63364SiN A01;

    public TO7(C63364SiN c63364SiN, int i) {
        this.A01 = c63364SiN;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C63364SiN c63364SiN = this.A01;
            EnumSet enumSet = C63364SiN.A0c;
            C63293Sgt c63293Sgt = c63364SiN.A0E;
            int i = this.A00;
            try {
                synchronized (c63293Sgt) {
                    SOJ soj = c63293Sgt.A0I;
                    if (soj.A00.A0Y.equals(C05F.A0C)) {
                        C63293Sgt.A02(c63293Sgt, new C62671SLj(new C63146Sds(EnumC61172RgY.PUBACK), new SKU(i), null), c63293Sgt.A01);
                    }
                }
            } catch (Throwable th) {
                SOJ soj2 = c63293Sgt.A0I;
                RhR A00 = RhR.A00(th);
                EnumC61139Rft enumC61139Rft = EnumC61139Rft.PUBACK;
                C63364SiN c63364SiN2 = soj2.A00;
                if (c63364SiN2.A0Y != C05F.A0N) {
                    C63364SiN.A03(c63364SiN2, enumC61139Rft, A00, th);
                }
                th.getMessage();
            }
        } catch (Throwable th2) {
            C63364SiN c63364SiN3 = this.A01;
            EnumSet enumSet2 = C63364SiN.A0c;
            c63364SiN3.A0F.A02(th2);
            C63364SiN.A03(c63364SiN3, EnumC61139Rft.PUBACK, RhR.A00(th2), th2);
        }
    }
}
