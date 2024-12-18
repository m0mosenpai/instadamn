package X;

/* renamed from: X.Ar7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24364Ar7 implements Runnable {
    public final /* synthetic */ C8JJ A00;

    public RunnableC24364Ar7(C8JJ c8jj) {
        this.A00 = c8jj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JJ c8jj = this.A00;
        AnonymousClass835.A00(c8jj.A01);
        AnonymousClass880 anonymousClass880 = c8jj.A02;
        anonymousClass880.A00().CIw();
        C8FG c8fg = c8jj.A03;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.ARe();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (c8jj.A00 != null) {
            anonymousClass880.A00().EMI(c8jj.A00, true);
            c8jj.A00 = null;
        }
    }
}
