package X;

/* renamed from: X.Wrz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71331Wrz implements Runnable {
    public final /* synthetic */ WOD A00;

    public RunnableC71331Wrz(WOD wod) {
        this.A00 = wod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WOD wod = this.A00;
        wod.A02.invoke();
        AbstractC65702TsY.A13(wod.A01, wod);
    }
}
