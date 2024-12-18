package X;

/* renamed from: X.WvW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71527WvW implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C69596Vrz A01;

    public RunnableC71527WvW(C69596Vrz c69596Vrz, float f) {
        this.A01 = c69596Vrz;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A03.setX(this.A00);
    }
}
