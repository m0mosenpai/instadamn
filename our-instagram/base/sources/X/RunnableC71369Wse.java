package X;

/* renamed from: X.Wse, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71369Wse implements Runnable {
    public final /* synthetic */ C67883V0o A00;

    public RunnableC71369Wse(C67883V0o c67883V0o) {
        this.A00 = c67883V0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67883V0o c67883V0o = this.A00;
        if (c67883V0o.isVisible() && !c67883V0o.A09) {
            AbstractC10360h2 abstractC10360h2 = c67883V0o.mFragmentManager;
            if (abstractC10360h2 != null) {
                abstractC10360h2.A0b();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        c67883V0o.A0A = true;
    }
}
