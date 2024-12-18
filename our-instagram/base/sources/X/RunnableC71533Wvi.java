package X;

/* renamed from: X.Wvi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71533Wvi implements Runnable {
    public final /* synthetic */ WUC A00;
    public final /* synthetic */ C7CX A01;
    public final /* synthetic */ String A02;

    public RunnableC71533Wvi(WUC wuc, C7CX c7cx, String str) {
        this.A01 = c7cx;
        this.A02 = str;
        this.A00 = wuc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7CX c7cx = this.A01;
        c7cx.A00.AYs(new C66540ULv(this.A00, c7cx.A01), this.A02);
    }
}
