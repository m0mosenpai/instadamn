package X;

/* renamed from: X.Avm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24652Avm implements Runnable {
    public final /* synthetic */ C8NW A00;
    public final /* synthetic */ boolean A01;

    public RunnableC24652Avm(C8NW c8nw, boolean z) {
        this.A00 = c8nw;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8NW c8nw = this.A00;
        c8nw.A1l.post(new RunnableC24651Avl(c8nw, this.A01));
    }
}
