package X;

/* renamed from: X.Wte, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71416Wte implements Runnable {
    public final /* synthetic */ WUD A00;
    public final /* synthetic */ Object A01;

    public RunnableC71416Wte(WUD wud, Object obj) {
        this.A00 = wud;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.onSuccess(this.A01);
    }
}
