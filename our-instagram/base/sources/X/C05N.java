package X;

/* renamed from: X.05N, reason: invalid class name */
/* loaded from: classes.dex */
public class C05N extends C0UG {
    public final InterfaceC16620sF A00;

    @Override // X.C0UG
    public Object A00(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        Object invoke = this.A00.invoke(interfaceC71543Iw, interfaceC23621Ds);
        if (invoke != C1JX.A02) {
            return C0eB.A00;
        }
        return invoke;
    }

    @Override // X.C0UG
    public C0UG A04(Integer num, C12W c12w, int i) {
        return new C05N(num, c12w, this.A00, i);
    }

    @Override // X.C0UG
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("block[");
        sb.append(this.A00);
        sb.append("] -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    public C05N(Integer num, C12W c12w, InterfaceC16620sF interfaceC16620sF, int i) {
        super(num, c12w, i);
        this.A00 = interfaceC16620sF;
    }
}
