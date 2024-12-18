package X;

/* loaded from: classes10.dex */
public final class TK1 implements Runnable {
    public final /* synthetic */ C64078Syu A00;

    public TK1(C64078Syu c64078Syu) {
        this.A00 = c64078Syu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.onPaused();
    }
}
