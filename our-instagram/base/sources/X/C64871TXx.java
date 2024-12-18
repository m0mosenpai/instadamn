package X;

/* renamed from: X.TXx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64871TXx extends Thread {
    public C64871TXx() {
        super("MemoryDumpCleaner");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C2S1 A00 = C2S1.A00();
        C2SF.A00(A00.A02().A0C, false);
        A00.A08().A00();
    }
}
