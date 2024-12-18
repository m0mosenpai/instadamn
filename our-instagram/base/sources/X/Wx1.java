package X;

/* loaded from: classes11.dex */
public final class Wx1 implements Runnable {
    public final /* synthetic */ C66239U5j A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ Q08 A02;
    public final /* synthetic */ U5Y A03;

    public Wx1(C66239U5j c66239U5j, C6FQ c6fq, Q08 q08, U5Y u5y) {
        this.A00 = c66239U5j;
        this.A03 = u5y;
        this.A02 = q08;
        this.A01 = c6fq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66239U5j c66239U5j = this.A00;
        Object obj = c66239U5j.A03;
        U5Y u5y = this.A03;
        Q08 q08 = this.A02;
        C6FQ c6fq = this.A01;
        synchronized (obj) {
            for (C69747Vuh c69747Vuh : C66239U5j.A00(c66239U5j, c6fq, q08, u5y, C05F.A01)) {
                AnonymousClass630 anonymousClass630 = c66239U5j.A01;
                anonymousClass630.A0E(c69747Vuh.A00);
                C69757Vuu c69757Vuu = c69747Vuh.A01;
                if (c69757Vuu != null) {
                    String A00 = AbstractC111324zv.A00(1825);
                    AbstractC79383gk.A02(A00);
                    C1338462s c1338462s = c69757Vuu.A00;
                    if (!anonymousClass630.A0O) {
                        AbstractC79383gk.A02(A00);
                        anonymousClass630.A0H.add(c1338462s);
                        AnonymousClass630.A02(anonymousClass630);
                    }
                    anonymousClass630.A0G(c69757Vuu.A01, c69757Vuu.A02);
                }
            }
        }
    }
}
