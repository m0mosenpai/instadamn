package X;

import java.util.List;

/* renamed from: X.TPv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64690TPv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C63364SiN A01;
    public final /* synthetic */ List A02;

    public RunnableC64690TPv(C63364SiN c63364SiN, List list, int i) {
        this.A01 = c63364SiN;
        this.A02 = list;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63364SiN c63364SiN = this.A01;
        List list = this.A02;
        int i = this.A00;
        try {
            C63364SiN.A02(c63364SiN);
            if (c63364SiN.A0Y == C05F.A0C) {
                C63293Sgt c63293Sgt = c63364SiN.A0E;
                synchronized (c63293Sgt) {
                    C63293Sgt.A02(c63293Sgt, new C62671SLj(new C63146Sds(EnumC61172RgY.SUBSCRIBE), new SKU(i), new SKV(list)), c63293Sgt.A01);
                }
                C62488SDp c62488SDp = c63364SiN.A0X;
                if (c62488SDp != null) {
                    c62488SDp.A01.A05.post(new TL1(c62488SDp));
                }
            }
        } catch (Throwable th) {
            C63364SiN.A03(c63364SiN, EnumC61139Rft.SUBSCRIBE, RhR.A00(th), th);
        }
    }
}
