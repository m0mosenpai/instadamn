package X;

/* renamed from: X.M5g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49991M5g implements Runnable {
    public final /* synthetic */ C7S9 A00;
    public final /* synthetic */ C7BR A01;
    public final /* synthetic */ C7P3 A02;

    public RunnableC49991M5g(C7S9 c7s9, C7BR c7br, C7P3 c7p3) {
        this.A00 = c7s9;
        this.A02 = c7p3;
        this.A01 = c7br;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC165467aZ interfaceC165467aZ = (InterfaceC165467aZ) this.A00.A02;
        C7P3 c7p3 = this.A02;
        C7BR c7br = this.A01;
        interfaceC165467aZ.E2n(c7p3, c7br.A07, c7br.A08);
    }
}
