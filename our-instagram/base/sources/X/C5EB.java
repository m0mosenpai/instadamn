package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5EB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EB extends C58J implements C5DW, C5DY, InterfaceC113445Ag {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass195 A04;
    public final C5Y1 A05;
    public final InterfaceC119545bC A06;
    public final InterfaceC119545bC A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final InterfaceC74953Yl A0A;
    public final InterfaceC74963Ym A0B;

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return 0;
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public static final float A00(C5EB c5eb) {
        float signum = Math.signum(c5eb.A00);
        int ordinal = AbstractC114335Dx.A02(c5eb).A0D.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = -1;
            } else {
                throw new RuntimeException();
            }
        }
        return signum * i;
    }

    public static final void A01(C5EB c5eb) {
        AnonymousClass195 anonymousClass195 = c5eb.A04;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        if (((C58J) c5eb).A08) {
            C19L A05 = c5eb.A05();
            c5eb.A04 = AbstractC23641Du.A04(AnonymousClass191.A00, new D52(c5eb, anonymousClass195, (InterfaceC23621Ds) null, 2), A05);
        }
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        InterfaceC119545bC interfaceC119545bC;
        InterfaceC74963Ym interfaceC74963Ym;
        int intValue;
        int intValue2;
        InterfaceC74953Yl interfaceC74953Yl = this.A05.A04.A05;
        float floatValue = ((Number) interfaceC74953Yl.getValue()).floatValue() * A00(this);
        float A00 = A00(this);
        float floatValue2 = ((Number) interfaceC74953Yl.getValue()).floatValue();
        if (A00 == 1.0f) {
            interfaceC119545bC = this.A07;
        } else {
            interfaceC119545bC = this.A06;
        }
        boolean z = false;
        if (floatValue2 < interfaceC119545bC.BIi()) {
            z = true;
        }
        float A002 = A00(this);
        float floatValue3 = ((Number) interfaceC74953Yl.getValue()).floatValue();
        if (A002 == 1.0f) {
            int BIi = this.A07.BIi();
            interfaceC74963Ym = this.A0B;
            intValue = (BIi + ((Number) interfaceC74963Ym.getValue()).intValue()) - this.A06.BIi();
        } else {
            interfaceC74963Ym = this.A0B;
            intValue = ((Number) interfaceC74963Ym.getValue()).intValue();
        }
        boolean z2 = false;
        if (floatValue3 > intValue) {
            z2 = true;
        }
        float A003 = A00(this);
        int BIi2 = this.A07.BIi();
        if (A003 == 1.0f) {
            intValue2 = BIi2 + ((Number) interfaceC74963Ym.getValue()).intValue();
        } else {
            intValue2 = (-BIi2) - ((Number) interfaceC74963Ym.getValue()).intValue();
        }
        float f = intValue2;
        float BIi3 = floatValue + this.A06.BIi();
        float A004 = C5YC.A00(interfaceC1129057z.Bxc());
        AnonymousClass588 AzL = interfaceC1129057z.AzL();
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
        AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
        long j = anonymousClass586.A00;
        anonymousClass586.A01.ELZ();
        try {
            C58A c58a = anonymousClass587.A01;
            c58a.AI7(1, floatValue, 0.0f, BIi3, A004);
            if (z) {
                interfaceC1129057z.AQf();
            }
            if (z2) {
                c58a.F8X(f, 0.0f);
                try {
                    interfaceC1129057z.AQf();
                    c58a.F8X(-f, -0.0f);
                } catch (Throwable th) {
                    c58a.F8X(-f, -0.0f);
                    throw th;
                }
            }
        } finally {
            anonymousClass586.A01.EKS();
            AzL.EeS(j);
        }
    }

    public C5EB(InterfaceC31080DlO interfaceC31080DlO, float f, int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A07 = new ParcelableSnapshotMutableIntState(0);
        this.A06 = new ParcelableSnapshotMutableIntState(0);
        this.A09 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
        this.A0A = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), interfaceC31080DlO);
        this.A08 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), new Object());
        this.A05 = AbstractC118385Xa.A00(0.0f);
        this.A0B = new C113775Bp(null, new DH1(1, interfaceC31080DlO, this));
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cnj(Integer.MAX_VALUE);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cnm(i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C59W CpF = interfaceC1131559d.CpF(Constraints.A04(Constraints.A03(j), Integer.MAX_VALUE, Constraints.A02(j), Constraints.A00(j)));
        int A03 = C5AU.A03(j, CpF.A01);
        InterfaceC119545bC interfaceC119545bC = this.A06;
        interfaceC119545bC.EWE(A03);
        this.A07.EWE(CpF.A01);
        int BIi = interfaceC119545bC.BIi();
        int i = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new DRZ(14, CpF, this), BIi, i);
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return interfaceC1131659e.Cpe(Integer.MAX_VALUE);
    }

    @Override // X.C5DY
    public final void DHg(InterfaceC118945aB interfaceC118945aB) {
        this.A09.Egh(Boolean.valueOf(interfaceC118945aB.BBj()));
    }
}
