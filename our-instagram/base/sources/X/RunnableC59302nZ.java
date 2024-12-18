package X;

/* renamed from: X.2nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC59302nZ implements Runnable, InterfaceC59312na {
    public boolean A00;
    public final C59252nR A01;

    @Override // X.InterfaceC59312na
    public final void release() {
        this.A01.A01();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C27511Ve.A07.A01(this.A01);
    }

    public RunnableC59302nZ(C59252nR c59252nR) {
        this.A01 = c59252nR;
    }
}
