package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6I5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6I5 extends C5X7 implements InterfaceC118865a3 {
    public final float A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6I5(InterfaceC16660sJ interfaceC16660sJ, float f) {
        super(interfaceC16660sJ);
        C14360o3.A0B(interfaceC16660sJ, 2);
        this.A00 = f;
        if (f > 0.0f) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0Z("targetAspectRatio ", " must be > 0", f));
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // X.InterfaceC118865a3
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C14360o3.A0B(c59z, 0);
        C14360o3.A0B(interfaceC1131559d, 1);
        float A01 = Constraints.A01(j);
        float f = this.A00;
        int A02 = C5AU.A02(j, C1H4.A01(A01 / f));
        C59W CpF = interfaceC1131559d.CpF(AbstractC119035aK.A02(C5AU.A03(j, C1H4.A01(f * A02)), A02));
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C206999Ee(CpF, 40), CpF.A01, CpF.A00);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        C6I5 c6i5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6I5) {
            c6i5 = (C6I5) obj;
        } else {
            c6i5 = null;
        }
        return c6i5 != null && this.A00 == c6i5.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0F("TargetAspectRatioModifier(targetAspectRatio=", ')', this.A00);
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
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.InterfaceC118865a3
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC28377Cfg.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }
}
