package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Deprecated;

@Deprecated(message = "Use [BouncyIndication] on the Modifier.clickable directly.")
/* renamed from: X.5E2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5E2 extends C58J implements C5DW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public C5XO A04;
    public InterfaceC16820sZ A05;
    public InterfaceC16820sZ A06;
    public AnonymousClass195 A07;
    public AnonymousClass195 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C5Y1 A0D = AbstractC118385Xa.A00(1.0f);
    public final C57F A0E;
    public final InterfaceC16660sJ A0F;

    public static final void A01(C5E2 c5e2) {
        c5e2.A0B = false;
        c5e2.A0C = false;
        c5e2.A09 = false;
        c5e2.A0A = false;
        c5e2.A0E.EUc(1.0f);
        AnonymousClass195 anonymousClass195 = c5e2.A08;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        c5e2.A08 = null;
        if (((C58J) c5e2).A08) {
            C19L A05 = c5e2.A05();
            C206639Cu c206639Cu = new C206639Cu(c5e2, null, 17);
            c5e2.A08 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A05);
        }
    }

    public static final void A02(C5E2 c5e2) {
        boolean z;
        float f;
        if (!c5e2.A0B && !c5e2.A09 && !c5e2.A0A) {
            z = false;
            f = 1.0f;
        } else {
            z = true;
            f = c5e2.A02;
        }
        C5Y1 c5y1 = c5e2.A0D;
        if (((Number) c5y1.A09.getValue()).floatValue() == f) {
            if (!((Boolean) c5y1.A08.getValue()).booleanValue()) {
                A00(c5e2);
            }
        } else {
            C19L A05 = c5e2.A05();
            c5e2.A07 = AbstractC23641Du.A04(AnonymousClass191.A00, new D4G(c5e2, null, f, 1, z), A05);
        }
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
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C9F3(48, this, CpF), i, i2);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    public static final void A00(C5E2 c5e2) {
        InterfaceC16820sZ interfaceC16820sZ;
        if (c5e2.A09) {
            c5e2.A09 = false;
            A02(c5e2);
            interfaceC16820sZ = c5e2.A05;
        } else {
            if (!c5e2.A0A) {
                return;
            }
            c5e2.A0A = false;
            A02(c5e2);
            interfaceC16820sZ = c5e2.A06;
            if (interfaceC16820sZ == null) {
                return;
            }
        }
        interfaceC16820sZ.invoke();
    }

    public C5E2(C5XO c5xo, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, float f, float f2, float f3, float f4) {
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A02 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A04 = c5xo;
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A0E = new ParcelableSnapshotMutableFloatState(1.0f);
        this.A0F = new C9EB(this, 14);
    }
}
