package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class DIY extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ InterfaceC30798DgZ A01;
    public final /* synthetic */ C26009Bex A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16620sF A08;
    public final /* synthetic */ InterfaceC16620sF A09;
    public final /* synthetic */ InterfaceC16620sF A0A;
    public final /* synthetic */ C5Hc A0B;
    public final /* synthetic */ C5Hc A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIY(Drawable drawable, InterfaceC30798DgZ interfaceC30798DgZ, C26009Bex c26009Bex, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, C5Hc c5Hc, C5Hc c5Hc2, boolean z, boolean z2) {
        super(1);
        this.A0D = z;
        this.A0C = c5Hc;
        this.A01 = interfaceC30798DgZ;
        this.A0E = z2;
        this.A02 = c26009Bex;
        this.A09 = interfaceC16620sF;
        this.A05 = interfaceC16660sJ;
        this.A03 = interfaceC16820sZ;
        this.A06 = interfaceC16660sJ2;
        this.A04 = interfaceC16820sZ2;
        this.A08 = interfaceC16620sF2;
        this.A0B = c5Hc2;
        this.A00 = drawable;
        this.A0A = interfaceC16620sF3;
        this.A07 = interfaceC16660sJ3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC30984Djg interfaceC30984Djg = (InterfaceC30984Djg) obj;
        C14360o3.A0B(interfaceC30984Djg, 0);
        DLI dli = DLI.A00;
        InterfaceC30798DgZ interfaceC30798DgZ = this.A01;
        boolean z = this.A0E;
        C26009Bex c26009Bex = this.A02;
        InterfaceC16620sF interfaceC16620sF = this.A09;
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        interfaceC30984Djg.CgI(null, null, dli, C5UA.A03(new C30579Dd0(interfaceC30798DgZ, c26009Bex, this.A03, this.A04, interfaceC16660sJ, this.A06, interfaceC16620sF, this.A08, this.A0B, z), 1293020844));
        if (this.A0D) {
            interfaceC30984Djg.CgI(null, null, DLJ.A00, CO4.A00);
        } else {
            C5Hc c5Hc = this.A0C;
            if (AbstractC166987dD.A1b(c5Hc)) {
                interfaceC30984Djg.CgI(null, null, DLK.A00, CO4.A01);
                Drawable drawable = this.A00;
                InterfaceC16620sF interfaceC16620sF2 = this.A0A;
                InterfaceC16660sJ interfaceC16660sJ2 = this.A07;
                interfaceC30984Djg.CgP(null, new C50262MHr(c5Hc, 8), null, C5UA.A03(new C30726DfO(2, drawable, interfaceC16620sF2, interfaceC16660sJ2, c5Hc), 1229287273), c5Hc.size());
            } else if (!(interfaceC30798DgZ instanceof C29097CsO)) {
                interfaceC30984Djg.CgI(null, null, DLL.A00, CO4.A02);
            }
        }
        return C0eB.A00;
    }
}
