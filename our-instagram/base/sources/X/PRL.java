package X;

/* loaded from: classes9.dex */
public final class PRL implements Runnable {
    public final /* synthetic */ C55177Odh A00;
    public final /* synthetic */ InterfaceC57854PlK A01;

    public PRL(C55177Odh c55177Odh, InterfaceC57854PlK interfaceC57854PlK) {
        this.A00 = c55177Odh;
        this.A01 = interfaceC57854PlK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03(this.A01);
    }
}
