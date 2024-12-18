package X;

/* renamed from: X.Gqb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38170Gqb implements Runnable {
    public final /* synthetic */ C38P A00;

    public RunnableC38170Gqb(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38P c38p = this.A00;
        if (c38p.isResumed()) {
            AbstractC31178DnM.A0x(c38p);
        }
    }
}
