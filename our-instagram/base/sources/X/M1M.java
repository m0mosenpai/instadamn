package X;

/* loaded from: classes8.dex */
public final class M1M implements Runnable {
    public final /* synthetic */ C49593Lvm A00;

    public M1M(C49593Lvm c49593Lvm) {
        this.A00 = c49593Lvm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49593Lvm c49593Lvm = this.A00;
        boolean z = c49593Lvm.A0A;
        InterfaceC03960Jm interfaceC03960Jm = c49593Lvm.A05;
        if (z) {
            if (interfaceC03960Jm != null) {
                C49593Lvm.A03(c49593Lvm, interfaceC03960Jm, "Timeout");
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (interfaceC03960Jm != null) {
            C49593Lvm.A02(c49593Lvm, interfaceC03960Jm, "Timeout");
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
