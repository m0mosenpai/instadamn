package X;

/* loaded from: classes9.dex */
public final class PU3 implements Runnable {
    public static final PU3 A00 = new PU3();

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC53633Nne abstractC53633Nne = PJF.A0K;
        if (abstractC53633Nne != null) {
            abstractC53633Nne.A01(new Exception("live swap time out"));
        }
        PJF.A0K = null;
    }
}
