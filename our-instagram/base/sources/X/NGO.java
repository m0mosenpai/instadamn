package X;

import java.net.InetAddress;

/* loaded from: classes9.dex */
public final class NGO extends AbstractRunnableC14200nk {
    public final /* synthetic */ C212111x A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGO(C212111x c212111x, String str) {
        super(1498268459, 3, true, true);
        this.A00 = c212111x;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object A1D;
        String str = this.A01;
        try {
            long nanoTime = System.nanoTime() - C84303pN.A00;
            InetAddress.getByName(str);
            C36J.A07(C84303pN.A01.A00(nanoTime));
            A1D = C0eB.A00;
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            C0K8.A0G("DnsInitializer", "dns check got error", A00);
        }
    }
}
