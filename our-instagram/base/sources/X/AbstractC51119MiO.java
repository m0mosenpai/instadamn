package X;

import java.util.List;

/* renamed from: X.MiO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51119MiO extends C2UU {
    public List A00 = C16930sl.A00;
    public final InterfaceC16660sJ A01;

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A00;
        this.A00 = list;
        AbstractC66552zX.A00(new C66247U5r(1, list2, list)).A03(this);
    }

    public AbstractC51119MiO(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(203199185);
        int size = this.A00.size();
        C0f9.A0A(1657695386, A03);
        return size;
    }
}
