package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* renamed from: X.5ED, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ED extends C5AY implements C5DW, InterfaceC1129458d {
    public L3T A00;
    public AnonymousClass195 A01;
    public final C57F A02;
    public final C5Y1 A03;

    public C5ED(L3T l3t) {
        C14360o3.A0B(l3t, 1);
        this.A00 = l3t;
        this.A03 = AbstractC118385Xa.A00(1.0f);
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A02 = new ParcelableSnapshotMutableFloatState(1.0f);
        MC6 mc6 = new MC6(this, null, 28);
        C6KW c6kw = C6KX.A00;
        A0F(new C6KL(null, null, mc6));
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C14360o3.A0B(c59z, 0);
        C14360o3.A0B(interfaceC1131559d, 1);
        C59W CpF = interfaceC1131559d.CpF(j);
        int i = CpF.A01;
        int i2 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C50363MLp(31, CpF, this), i, i2);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    public static final Object A00(C5ED c5ed, InterfaceC23621Ds interfaceC23621Ds, float f) {
        C5Y1 c5y1 = c5ed.A03;
        Float f2 = new Float(f);
        Object A04 = c5y1.A04(new C5Y4(null, 0.5f, 200.0f), f2, c5y1.A02(), interfaceC23621Ds, new C50357MLj(c5ed, 45));
        if (A04 != C1JX.A02) {
            return C0eB.A00;
        }
        return A04;
    }
}
