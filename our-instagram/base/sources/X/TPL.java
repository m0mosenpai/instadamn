package X;

/* loaded from: classes10.dex */
public final class TPL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62663SKx A01;
    public final /* synthetic */ AbstractC2051896j A02;

    public TPL(C62663SKx c62663SKx, AbstractC2051896j abstractC2051896j, int i) {
        this.A01 = c62663SKx;
        this.A02 = abstractC2051896j;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A00(this.A00);
    }
}
