package X;

/* renamed from: X.Avl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24651Avl implements Runnable {
    public final /* synthetic */ C8NW A00;
    public final /* synthetic */ boolean A01;

    public RunnableC24651Avl(C8NW c8nw, boolean z) {
        this.A01 = z;
        this.A00 = c8nw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0F = true;
        c23108AGw.A0Q = this.A01;
        this.A00.A1G(null, C148276lx.A10, c23108AGw);
    }
}
