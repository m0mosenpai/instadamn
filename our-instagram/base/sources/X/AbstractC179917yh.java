package X;

/* renamed from: X.7yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC179917yh extends AbstractC178807ws implements InterfaceC179927yi {
    public int A00;
    public final C1814082s A01;

    public AbstractC179917yh(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        this.A01 = new C1814082s();
    }

    public final AbstractC176767tY A0A() {
        InterfaceC175067qg Ak3 = Ak3();
        if (Ak3 != null && Ak3.isConnected()) {
            try {
                return Ak3.AlU();
            } catch (C6M2 unused) {
                return null;
            }
        }
        return null;
    }
}
