package X;

/* renamed from: X.Wve, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71529Wve implements Runnable {
    public final /* synthetic */ RunnableC71200Wpp A00;
    public final /* synthetic */ C02N A01;
    public final /* synthetic */ Object A02;

    public RunnableC71529Wve(RunnableC71200Wpp runnableC71200Wpp, C02N c02n, Object obj) {
        this.A00 = runnableC71200Wpp;
        this.A01 = c02n;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.accept(this.A02);
    }
}
