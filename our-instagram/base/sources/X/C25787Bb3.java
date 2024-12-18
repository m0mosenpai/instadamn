package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Bb3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25787Bb3 extends C5X7 implements InterfaceC118865a3 {
    public final InterfaceC1333460b A00;
    public final float A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25787Bb3(InterfaceC1333460b interfaceC1333460b, InterfaceC16660sJ interfaceC16660sJ, float f) {
        super(interfaceC16660sJ);
        C14360o3.A0B(interfaceC16660sJ, 3);
        this.A01 = f;
        this.A00 = interfaceC1333460b;
        if (f > 0.0f) {
        } else {
            throw AbstractC166987dD.A12(AnonymousClass001.A0Z("aspectRatio ", " must be > 0", f));
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        C25787Bb3 c25787Bb3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25787Bb3) {
            c25787Bb3 = (C25787Bb3) obj;
        } else {
            c25787Bb3 = null;
        }
        return c25787Bb3 != null && this.A01 == c25787Bb3.A01 && C14360o3.A0K(this.A00, ((C25787Bb3) obj).A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25235BEs.A02(this.A01));
    }

    public final String toString() {
        return AnonymousClass001.A0F("ContentAspectRatioModifier(aspectRatio=", ')', this.A01);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        AbstractC167017dG.A1N(c59z, interfaceC1131559d);
        C1333560c c1333560c = (C1333560c) this.A00;
        long A00 = AbstractC119215ad.A00(c59z.EL8(c1333560c.A02 + c1333560c.A01), c59z.EL8(c1333560c.A03 + c1333560c.A00));
        int i = -AbstractC25225BEi.A06(A00);
        int A002 = C119055aN.A00(A00);
        long A06 = C5AU.A06(j, i, -A002);
        float A01 = Constraints.A01(A06);
        int A003 = Constraints.A00(A06);
        float f = A01 / A003;
        float f2 = this.A01;
        if (f2 > f) {
            A003 = C1H4.A01(A01 / f2);
        }
        int i2 = A003 + A002;
        C59W CpF = interfaceC1131559d.CpF(Constraints.A04(Constraints.A03(j), Constraints.A01(j), i2, i2));
        return AbstractC25229BEm.A0Z(c59z, new C50262MHr(CpF, 44), CpF.A01, CpF.A00);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }
}
