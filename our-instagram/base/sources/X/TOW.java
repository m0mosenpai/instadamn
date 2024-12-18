package X;

/* loaded from: classes10.dex */
public final class TOW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69C A01;

    public TOW(C69C c69c, int i) {
        this.A01 = c69c;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69C.A06(this.A01, this.A00);
    }
}
