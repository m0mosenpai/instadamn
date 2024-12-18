package X;

/* renamed from: X.U7f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC66285U7f implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ VDT A01;
    public final /* synthetic */ C66286U7h A02;

    public RunnableC66285U7f(VDT vdt, C66286U7h c66286U7h, float f) {
        this.A02 = c66286U7h;
        this.A01 = vdt;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A00.Dk3(this.A01, this.A00);
    }
}
