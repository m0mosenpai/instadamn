package X;

/* loaded from: classes10.dex */
public final class Rc3 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C60915RbU A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc3(C60915RbU c60915RbU) {
        super(1537081393, 3, false, false);
        this.A00 = c60915RbU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C60915RbU c60915RbU = this.A00;
        synchronized (c60915RbU) {
            if (!c60915RbU.A00) {
                c60915RbU.A00 = true;
                c60915RbU.A01.cancel();
            }
        }
    }
}
