package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Ddo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30628Ddo extends C0YY implements InterfaceC16610sE {
    public static final C30628Ddo A00 = new C30628Ddo();

    public C30628Ddo() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C59Z c59z = (C59Z) obj;
        InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) obj2;
        long j = ((Constraints) obj3).A00;
        AbstractC167017dG.A1N(c59z, interfaceC1131559d);
        Modifier modifier = CM7.A00;
        int EL8 = c59z.EL8(22.0f);
        int A02 = Constraints.A02(j) + EL8;
        int A002 = Constraints.A00(j);
        int i = 0;
        if (A002 != Integer.MAX_VALUE) {
            i = EL8;
        }
        C59W CpF = interfaceC1131559d.CpF(Constraints.A04(Constraints.A03(j), Constraints.A01(j), A02, A002 + i));
        return AbstractC25229BEm.A0Z(c59z, new DHO(EL8, 7, CpF), CpF.A01, CpF.A00 - EL8);
    }
}
