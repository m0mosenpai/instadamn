package X;

/* loaded from: classes10.dex */
public final class TL6 implements Runnable {
    public final /* synthetic */ C63962Swn A00;

    public TL6(C63962Swn c63962Swn) {
        this.A00 = c63962Swn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63962Swn c63962Swn = this.A00;
        int size = AbstractC31172DnG.A19(c63962Swn.A0I.A03).size();
        int i = c63962Swn.A03;
        if (i < size - 1) {
            c63962Swn.A03 = i + 1;
            C63962Swn.A00(c63962Swn);
        }
        InterfaceC65372Tj4 interfaceC65372Tj4 = (InterfaceC65372Tj4) c63962Swn.A0P.get();
        if (interfaceC65372Tj4 != null) {
            interfaceC65372Tj4.DoS(c63962Swn.A02());
        }
        Q3d q3d = c63962Swn.A09;
        if (q3d != null) {
            q3d.A00 = true;
        }
    }
}
