package X;

import android.graphics.DashPathEffect;

/* renamed from: X.DHi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29920DHi extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29920DHi(Object obj, float f, float f2, int i, long j) {
        super(1);
        this.A02 = i;
        this.A04 = obj;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        if (this.A02 != 0) {
            C14360o3.A0B(interfaceC1129057z, 0);
            interfaceC1129057z.AQf();
            C211819a8 c211819a8 = (C211819a8) this.A04;
            if (c211819a8 != null) {
                float f = this.A01;
                float f2 = this.A00;
                long j = this.A03;
                long A00 = C5YB.A00(c211819a8.CHe() * c211819a8.BqP() * f, c211819a8.BDQ() * c211819a8.BqP() * f2);
                long A002 = AbstractC119395aw.A00(c211819a8.BYd() * f, c211819a8.BYf() * f2);
                float EqT = interfaceC1129057z.EqT(2.0f);
                float EqT2 = interfaceC1129057z.EqT(4.0f);
                float EqT3 = interfaceC1129057z.EqT(4.0f);
                float Bpb = c211819a8.Bpb();
                AnonymousClass588 AzL = interfaceC1129057z.AzL();
                AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
                AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
                long A08 = AbstractC25227BEk.A08(anonymousClass586);
                try {
                    anonymousClass587.A01.EL7(A002, Bpb);
                    interfaceC1129057z.AR4(null, new C62V(new C28803CnZ(new DashPathEffect(new float[]{EqT3, EqT3}, 0.0f)), EqT, 4.0f, 0, 0), 1.0f, 3, j, C119365at.A06(A002, C119365at.A04(2.0f, AbstractC119395aw.A00(C5YC.A02(A00), C5YC.A00(A00)))), A00, AbstractC137636Lj.A00(EqT2, EqT2));
                } finally {
                    AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
                }
            }
        } else {
            AbstractC25230BEn.A19(interfaceC1129057z);
            EnumC27346C5b enumC27346C5b = (EnumC27346C5b) this.A04;
            long j2 = this.A03;
            float f3 = this.A00;
            float f4 = this.A01;
            if (enumC27346C5b instanceof C27115Bxe) {
                long A003 = C5YB.A00(f3, f4);
                C119815bf c119815bf = C119815bf.A00;
                interfaceC1129057z.AR1(null, c119815bf, 1.0f, 3, j2, 0L, A003);
                interfaceC1129057z.AR1(null, c119815bf, 1.0f, 3, j2, AbstractC119395aw.A00(f3 - f4, 0.0f), C5YB.A00(f4, f3));
            } else if (enumC27346C5b instanceof C27114Bxd) {
                long A004 = C5YB.A00(f3, f4);
                C119815bf c119815bf2 = C119815bf.A00;
                interfaceC1129057z.AR1(null, c119815bf2, 1.0f, 3, j2, 0L, A004);
                interfaceC1129057z.AR1(null, c119815bf2, 1.0f, 3, j2, 0L, C5YB.A00(f4, f3));
            } else {
                boolean z = enumC27346C5b instanceof C27113Bxc;
                float f5 = f3 - f4;
                long A005 = AbstractC119395aw.A00(0.0f, f5);
                long A006 = C5YB.A00(f3, f4);
                C119815bf c119815bf3 = C119815bf.A00;
                if (z) {
                    interfaceC1129057z.AR1(null, c119815bf3, 1.0f, 3, j2, A005, A006);
                    interfaceC1129057z.AR1(null, c119815bf3, 1.0f, 3, j2, AbstractC119395aw.A00(f5, 0.0f), C5YB.A00(f4, f3));
                } else {
                    interfaceC1129057z.AR1(null, c119815bf3, 1.0f, 3, j2, A005, A006);
                    interfaceC1129057z.AR1(null, c119815bf3, 1.0f, 3, j2, 0L, C5YB.A00(f4, f3));
                }
            }
        }
        return C0eB.A00;
    }
}
