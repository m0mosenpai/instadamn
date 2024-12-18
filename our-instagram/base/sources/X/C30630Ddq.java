package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Ddq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30630Ddq extends C0YY implements InterfaceC16610sE {
    public static final C30630Ddq A00 = new C30630Ddq();

    public C30630Ddq() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C59Z c59z = (C59Z) obj;
        InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) obj2;
        long j = ((Constraints) obj3).A00;
        boolean A1a = AbstractC167017dG.A1a(c59z, interfaceC1131559d);
        C59W A0N = AbstractC25236BEt.A0N(interfaceC1131559d, Constraints.A01(j) + c59z.EL8(16.0f), j);
        return AbstractC25229BEm.A0Z(c59z, new C50259MHo(A0N, A1a ? 1 : 0), A0N.A01, A0N.A00);
    }
}
