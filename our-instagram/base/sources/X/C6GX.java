package X;

/* renamed from: X.6GX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GX extends C58J implements C5DW {
    public InterfaceC1333460b A00;

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
        float f;
        float f2;
        InterfaceC1333460b interfaceC1333460b = this.A00;
        AnonymousClass583 layoutDirection = c59z.getLayoutDirection();
        C1333560c c1333560c = (C1333560c) interfaceC1333460b;
        AnonymousClass583 anonymousClass583 = AnonymousClass583.Ltr;
        if (layoutDirection == anonymousClass583) {
            f = c1333560c.A02;
        } else {
            f = c1333560c.A01;
        }
        if (Float.compare(f, 0.0f) >= 0) {
            float f3 = c1333560c.A03;
            if (Float.compare(f3, 0.0f) >= 0) {
                if (layoutDirection == anonymousClass583) {
                    f2 = c1333560c.A01;
                } else {
                    f2 = c1333560c.A02;
                }
                if (Float.compare(f2, 0.0f) >= 0) {
                    float f4 = c1333560c.A00;
                    if (Float.compare(f4, 0.0f) >= 0) {
                        int EL8 = c59z.EL8(f) + c59z.EL8(f2);
                        int EL82 = c59z.EL8(f3) + c59z.EL8(f4);
                        C59W CpF = interfaceC1131559d.CpF(C5AU.A06(j, -EL8, -EL82));
                        int A03 = C5AU.A03(j, CpF.A01 + EL8);
                        int A02 = C5AU.A02(j, CpF.A00 + EL82);
                        return c59z.Cgx(AbstractC06930Yk.A0E(), new C9FO(2, this, CpF, c59z), A03, A02);
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
