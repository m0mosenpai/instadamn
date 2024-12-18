package X;

/* renamed from: X.M4a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49959M4a implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C44436Jks A01;

    public RunnableC49959M4a(C44436Jks c44436Jks, int i) {
        this.A01 = c44436Jks;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44436Jks c44436Jks = this.A01;
        C44436Jks.A00(c44436Jks, 1.0f, c44436Jks.A01, this.A00);
        c44436Jks.A01 = c44436Jks.A02;
        c44436Jks.A01();
    }
}
