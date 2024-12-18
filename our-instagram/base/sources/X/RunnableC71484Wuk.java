package X;

/* renamed from: X.Wuk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71484Wuk implements Runnable {
    public final /* synthetic */ AbstractC70118W4q A00;
    public final /* synthetic */ Exception A01;

    public RunnableC71484Wuk(AbstractC70118W4q abstractC70118W4q, Exception exc) {
        this.A00 = abstractC70118W4q;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03(this.A01);
    }
}
