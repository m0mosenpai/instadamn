package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136766Hf extends C58J implements C5DW {
    public float A00;
    public InterfaceC74963Ym A01;
    public InterfaceC74963Ym A02;

    @Override // X.C5DW
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        int i;
        int i2;
        int A03;
        int A02;
        InterfaceC74963Ym interfaceC74963Ym = this.A02;
        if (interfaceC74963Ym != null && ((Number) interfaceC74963Ym.getValue()).intValue() != Integer.MAX_VALUE) {
            i = Math.round(((Number) interfaceC74963Ym.getValue()).floatValue() * this.A00);
        } else {
            i = Integer.MAX_VALUE;
        }
        InterfaceC74963Ym interfaceC74963Ym2 = this.A01;
        if (interfaceC74963Ym2 != null && ((Number) interfaceC74963Ym2.getValue()).intValue() != Integer.MAX_VALUE) {
            i2 = Math.round(((Number) interfaceC74963Ym2.getValue()).floatValue() * this.A00);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i != Integer.MAX_VALUE) {
            A03 = i;
        } else {
            A03 = Constraints.A03(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            A02 = i2;
        } else {
            A02 = Constraints.A02(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = Constraints.A01(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = Constraints.A00(j);
        }
        C59W CpF = interfaceC1131559d.CpF(C5AU.A04(A03, i, A02, i2));
        int i3 = CpF.A01;
        int i4 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C206929Dx(CpF, 19), i3, i4);
    }
}
