package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Bb4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25788Bb4 extends C5X7 implements InterfaceC118915a8 {
    public final CT1 A00;
    public final InterfaceC16660sJ A01;

    public C25788Bb4(CT1 ct1, InterfaceC16660sJ interfaceC16660sJ) {
        super(C5XU.A00);
        this.A00 = ct1;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC118915a8
    public final /* bridge */ /* synthetic */ Object Cpn(InterfaceC1128957x interfaceC1128957x, Object obj) {
        return new C28815Cnl(this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        C25788Bb4 c25788Bb4;
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        InterfaceC16660sJ interfaceC16660sJ2 = null;
        if ((obj instanceof C25788Bb4) && (c25788Bb4 = (C25788Bb4) obj) != null) {
            interfaceC16660sJ2 = c25788Bb4.A01;
        }
        return C14360o3.A0K(interfaceC16660sJ, interfaceC16660sJ2);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // androidx.compose.ui.Modifier
    public final Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }
}
