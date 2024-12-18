package X;

/* renamed from: X.WvS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71523WvS implements Runnable {
    public final /* synthetic */ C71160Wov A00;
    public final /* synthetic */ Exception A01;

    public RunnableC71523WvS(C71160Wov c71160Wov, Exception exc) {
        this.A00 = c71160Wov;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A04.DEF(this.A01);
    }
}
