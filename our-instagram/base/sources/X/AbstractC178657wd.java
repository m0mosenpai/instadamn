package X;

/* renamed from: X.7wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178657wd extends AbstractC178227vw implements InterfaceC178067vf {
    public final InterfaceC178207vu A00;

    public final InterfaceC178067vf A0A(C178087vh c178087vh) {
        C02R.A07(super.A00, "Component not initialized.");
        return this.A00.Aq0(c178087vh);
    }

    public final Object A0B(C178037vc c178037vc) {
        Object AqG = this.A00.AqG(c178037vc);
        if (AqG != null) {
            return AqG;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration is not available: ");
        sb.append(c178037vc);
        throw new IllegalArgumentException(sb.toString());
    }

    public AbstractC178657wd(InterfaceC178207vu interfaceC178207vu) {
        this.A00 = interfaceC178207vu;
    }
}
