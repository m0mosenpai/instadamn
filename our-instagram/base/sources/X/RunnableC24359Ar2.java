package X;

/* renamed from: X.Ar2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24359Ar2 implements Runnable {
    public final /* synthetic */ C8FG A00;

    public RunnableC24359Ar2(C8FG c8fg) {
        this.A00 = c8fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8FG c8fg = this.A00;
        c8fg.A0I.A00.A00(new C9CJ(C8FG.__redex_internal_original_name, "effectRenderingStarted"));
        C8HJ c8hj = c8fg.A05;
        if (c8hj != null) {
            c8hj.Dl0(true);
        }
    }
}
