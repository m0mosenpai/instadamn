package X;

/* loaded from: classes10.dex */
public final class TY7 extends Thread {
    public final /* synthetic */ C2S1 A00;
    public final /* synthetic */ C2SH A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TY7(C2S1 c2s1, C2SH c2sh) {
        super("MemoryDumpCleaner");
        this.A01 = c2sh;
        this.A00 = c2s1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C2S1 c2s1 = this.A00;
        C2SF.A00(c2s1.A02().A0C, false);
        c2s1.A08().A00();
    }
}
