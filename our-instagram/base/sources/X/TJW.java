package X;

/* loaded from: classes10.dex */
public final class TJW implements Runnable {
    public final /* synthetic */ SM9 A00;

    public TJW(SM9 sm9) {
        this.A00 = sm9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SM9 sm9 = this.A00;
        while (true) {
            try {
                C64881TYh c64881TYh = (C64881TYh) sm9.A01.remove();
                synchronized (sm9) {
                    sm9.A02.remove(c64881TYh.A00);
                }
            } catch (InterruptedException unused) {
                AbstractC58318PtA.A18();
            }
        }
    }
}
