package X;

/* loaded from: classes8.dex */
public final class LRS implements InterfaceC118965aD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LRS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC118965aD
    public final void dispose() {
        C07T A0A;
        Object obj;
        InterfaceC16660sJ interfaceC16660sJ;
        switch (this.A00) {
            case 0:
                ((C2GT) this.A02).A08((InterfaceC58362lv) this.A01);
                return;
            case 1:
                if (AbstractC25230BEn.A1X((InterfaceC74953Yl) this.A02) || (interfaceC16660sJ = (InterfaceC16660sJ) this.A01) == null) {
                    return;
                }
                AbstractC25227BEk.A1Q(interfaceC16660sJ, false);
                return;
            case 2:
                A0A = AbstractC43592JPx.A0A(this.A01);
                obj = this.A02;
                A0A.A0A((C07W) obj);
                return;
            default:
                A0A = AbstractC43592JPx.A0A(this.A02);
                obj = this.A01;
                A0A.A0A((C07W) obj);
                return;
        }
    }

    public LRS(InterfaceC09670ek interfaceC09670ek, C07X c07x, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A02 = c07x;
            this.A01 = interfaceC09670ek;
        } else {
            this.A01 = c07x;
            this.A02 = interfaceC09670ek;
        }
    }
}
