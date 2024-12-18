package X;

/* renamed from: X.Bi9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26184Bi9 extends C0T6 implements InterfaceC30938Dis {
    public final C2DC A00;
    public final InterfaceC30803Dge A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26184Bi9) {
                C26184Bi9 c26184Bi9 = (C26184Bi9) obj;
                if (!C14360o3.A0K(this.A00, c26184Bi9.A00) || !C14360o3.A0K(this.A03, c26184Bi9.A03) || !C14360o3.A0K(this.A02, c26184Bi9.A02) || !C14360o3.A0K(this.A01, c26184Bi9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static C5Hb A00(C2DC c2dc, String str, InterfaceC16820sZ interfaceC16820sZ) {
        return AbstractC133095zb.A04(new C26184Bi9(c2dc, C29188Ctt.A00, str, interfaceC16820sZ));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25225BEi.A05(AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A00)), AbstractC167017dG.A0O(this.A02)));
    }

    public C26184Bi9(C2DC c2dc, InterfaceC30803Dge interfaceC30803Dge, String str, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1P(c2dc, interfaceC16820sZ);
        this.A00 = c2dc;
        this.A03 = interfaceC16820sZ;
        this.A02 = str;
        this.A01 = interfaceC30803Dge;
    }

    @Override // X.InterfaceC30938Dis
    public final InterfaceC16820sZ BYj() {
        return this.A03;
    }
}
