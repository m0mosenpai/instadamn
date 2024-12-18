package X;

/* loaded from: classes7.dex */
public final class J59 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C37556GgC A01;

    public J59(C37556GgC c37556GgC, int i) {
        this.A01 = c37556GgC;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0F(this.A00 - 1, false);
    }
}
