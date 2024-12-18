package X;

/* renamed from: X.PPq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56975PPq implements Runnable {
    public final /* synthetic */ AbstractC53633Nne A00;
    public final /* synthetic */ Exception A01;

    public RunnableC56975PPq(AbstractC53633Nne abstractC53633Nne, Exception exc) {
        this.A00 = abstractC53633Nne;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01(this.A01);
    }
}
