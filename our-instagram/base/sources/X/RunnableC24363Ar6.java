package X;

/* renamed from: X.Ar6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24363Ar6 implements Runnable {
    public final /* synthetic */ C8JJ A00;

    public RunnableC24363Ar6(C8JJ c8jj) {
        this.A00 = c8jj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JJ c8jj = this.A00;
        AnonymousClass835.A00(c8jj.A01);
        c8jj.A02.A00().CIw();
        C8FG c8fg = c8jj.A03;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.APS();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
