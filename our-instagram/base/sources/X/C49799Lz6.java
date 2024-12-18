package X;

/* renamed from: X.Lz6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49799Lz6 implements InterfaceC42241xE, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    public C49799Lz6(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
                break;
            case 1:
            default:
                C14360o3.A0B(interfaceC16660sJ, 1);
                break;
        }
        this.A01 = interfaceC16660sJ;
    }

    public static void A00(C42221xC c42221xC, C41761wQ c41761wQ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c41761wQ.A02(c42221xC, new C49799Lz6(i, interfaceC16660sJ));
    }

    @Override // X.InterfaceC42241xE
    public final /* synthetic */ void accept(Object obj) {
        AbstractC25225BEi.A1U(this.A01, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC42241xE) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A01);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return (InterfaceC09250da) this.A01;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
