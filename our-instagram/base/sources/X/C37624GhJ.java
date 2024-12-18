package X;

/* renamed from: X.GhJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37624GhJ {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;

    public final int A01() {
        return AbstractC25226BEj.A17(this.A00).A03();
    }

    public final C120985dq A02() {
        return A03(((C37556GgC) this.A00.invoke()).A03());
    }

    public final C120985dq A03(int i) {
        if (i >= 0) {
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            if (i < ((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0B()) {
                return ((C37546Gg2) interfaceC16820sZ.invoke()).A0A.A0G(i);
            }
            return null;
        }
        return null;
    }

    public C37624GhJ(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC16820sZ2;
    }

    public static C120985dq A00(C59952od c59952od) {
        return c59952od.A0O().A02();
    }
}
