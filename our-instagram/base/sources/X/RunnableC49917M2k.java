package X;

/* renamed from: X.M2k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49917M2k implements Runnable {
    public final /* synthetic */ C6F7 A00;
    public final /* synthetic */ String A01;

    public RunnableC49917M2k(C6F7 c6f7, String str) {
        this.A01 = str;
        this.A00 = c6f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01.remove(this.A01);
    }
}
