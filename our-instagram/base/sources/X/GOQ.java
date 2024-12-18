package X;

/* loaded from: classes6.dex */
public final class GOQ implements Runnable {
    public final /* synthetic */ C32658EZh A00;
    public final /* synthetic */ boolean A01;

    public GOQ(C32658EZh c32658EZh, boolean z) {
        this.A00 = c32658EZh;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01.getLifecycle().A09(new C35759Fqw(this, 1));
    }
}
