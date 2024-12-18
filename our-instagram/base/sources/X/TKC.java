package X;

/* loaded from: classes10.dex */
public final class TKC implements Runnable {
    public final /* synthetic */ T1S A00;

    public TKC(T1S t1s) {
        this.A00 = t1s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C4Q9) this.A00.A02).onFailure();
    }
}
