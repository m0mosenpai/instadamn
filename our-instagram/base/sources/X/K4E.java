package X;

/* loaded from: classes8.dex */
public final class K4E extends AbstractRunnableC94874Os {
    public final /* synthetic */ JZK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4E(JZK jzk) {
        super("MultiInstanceManager.startBackgroundAccountsSync");
        this.A00 = jzk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JZK jzk = this.A00;
        if (jzk.A01 == null && !jzk.A07.getAndSet(true)) {
            JZK.A00(jzk);
        }
    }
}
