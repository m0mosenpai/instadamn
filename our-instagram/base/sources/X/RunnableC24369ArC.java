package X;

/* renamed from: X.ArC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24369ArC implements Runnable {
    public final /* synthetic */ C8JN A00;

    public RunnableC24369ArC(C8JN c8jn) {
        this.A00 = c8jn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass835 B6y;
        C8JN c8jn = this.A00;
        C8HI c8hi = c8jn.A09;
        AnonymousClass835.A00(c8hi);
        AnonymousClass880 anonymousClass880 = c8jn.A0A;
        anonymousClass880.A00().CIw();
        C8FG c8fg = c8jn.A0B;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.ARe();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (c8jn.A03 != null) {
            anonymousClass880.A00().EMI(c8jn.A03, true);
            c8jn.A03 = null;
        }
        if (!c8hi.A0Y() && (B6y = c8hi.A19.A00().B6y()) != null) {
            B6y.getView().setVisibility(0);
        }
    }
}
