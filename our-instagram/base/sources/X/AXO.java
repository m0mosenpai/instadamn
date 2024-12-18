package X;

/* loaded from: classes4.dex */
public final class AXO implements InterfaceC220315d {
    public final /* synthetic */ C22935A9f A00;

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        C14360o3.A0B(c1kj, 0);
        C22935A9f c22935A9f = this.A00;
        if (c22935A9f.A05) {
            int ordinal = c1kj.ordinal();
            if (ordinal != 3 && ordinal != 2) {
                return;
            }
            c22935A9f.A01.markerPoint(47654742, "unbind_memory_pressure");
            synchronized (c22935A9f.A02) {
            }
        }
    }

    public AXO(C22935A9f c22935A9f) {
        this.A00 = c22935A9f;
    }
}
