package X;

/* renamed from: X.XRj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72175XRj extends C197938p4 {
    public int A00;
    public AbstractC70118W4q A01;

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void DrC() {
        super.DrC();
        AbstractC70118W4q abstractC70118W4q = this.A01;
        if (abstractC70118W4q != null) {
            if (!AbstractC66019TyH.A02(abstractC70118W4q, ((C197938p4) this).A01, ((C197938p4) this).A00)) {
                int i = this.A00 + 1;
                this.A00 = i;
                if (i < 3) {
                    return;
                }
            }
            this.A01 = null;
        }
    }
}
