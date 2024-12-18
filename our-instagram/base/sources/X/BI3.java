package X;

/* loaded from: classes5.dex */
public final class BI3 extends C0T6 {
    public static final BI3 A03 = new BI3(new C1333560c(16.0f, 0.0f, 16.0f, 0.0f), BI1.A00, 72.0f);
    public static final BI3 A04 = new BI3(new C1333560c(16.0f, 0.0f, 16.0f, 0.0f), BGE.A00, 60.0f);
    public final float A00;
    public final InterfaceC1333460b A01;
    public final InterfaceC31127DmA A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI3) {
                BI3 bi3 = (BI3) obj;
                if (!C14360o3.A0K(this.A01, bi3.A01) || !C119145aW.A01(this.A00, bi3.A00) || !C14360o3.A0K(this.A02, bi3.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A01), this.A00));
    }

    public BI3(InterfaceC1333460b interfaceC1333460b, InterfaceC31127DmA interfaceC31127DmA, float f) {
        this.A01 = interfaceC1333460b;
        this.A00 = f;
        this.A02 = interfaceC31127DmA;
    }
}
