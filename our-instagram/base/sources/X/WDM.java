package X;

/* loaded from: classes11.dex */
public final class WDM {
    public Boolean A00;
    public boolean A01;
    public final boolean A02;

    public final void A01(InterfaceC16820sZ interfaceC16820sZ) {
        interfaceC16820sZ.invoke();
        this.A00 = false;
    }

    public static C09530e4 A00(Object obj, boolean z) {
        return new C09530e4(obj, new WDM(z));
    }

    public final void A02(InterfaceC16820sZ interfaceC16820sZ) {
        if (!this.A01) {
            this.A01 = true;
            interfaceC16820sZ.invoke();
        }
    }

    public final void A03(InterfaceC16660sJ interfaceC16660sJ) {
        boolean z = true;
        if (!C14360o3.A0K(this.A00, true) || this.A02) {
            if (this.A00 == null) {
                z = false;
            }
            AbstractC25227BEk.A1Q(interfaceC16660sJ, z);
            this.A00 = true;
        }
    }

    public WDM(boolean z) {
        this.A02 = z;
    }

    public WDM() {
        this(false);
    }
}
