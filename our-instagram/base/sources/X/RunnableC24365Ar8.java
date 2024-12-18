package X;

/* renamed from: X.Ar8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24365Ar8 implements Runnable {
    public final /* synthetic */ C8JM A00;

    public RunnableC24365Ar8(C8JM c8jm) {
        this.A00 = c8jm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JM c8jm = this.A00;
        AnonymousClass835.A00(c8jm.A00);
        c8jm.A01.A00().CIw();
        C8FG c8fg = c8jm.A02;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.ARe();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
