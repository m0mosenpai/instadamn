package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnSizeChangedModifier;
import com.instagram.common.session.UserSession;

/* renamed from: X.DdC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30591DdC extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ InterfaceC74953Yl A06;
    public final /* synthetic */ InterfaceC74953Yl A07;
    public final /* synthetic */ InterfaceC74953Yl A08;
    public final /* synthetic */ EnumC27391C6u A09;
    public final /* synthetic */ UserSession A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ InterfaceC16660sJ A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30591DdC(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74953Yl interfaceC74953Yl3, EnumC27391C6u enumC27391C6u, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, float f, float f2, float f3, float f4, long j, long j2, boolean z, boolean z2) {
        super(3);
        this.A0E = z;
        this.A09 = enumC27391C6u;
        this.A05 = j;
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = j2;
        this.A0F = z2;
        this.A0D = interfaceC16660sJ;
        this.A0C = interfaceC16820sZ;
        this.A0B = interfaceC16820sZ2;
        this.A0A = userSession;
        this.A08 = interfaceC74953Yl;
        this.A06 = interfaceC74953Yl2;
        this.A07 = interfaceC74953Yl3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0H(c5Tl, obj);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-267551088, "com.instagram.barcelona.creation.voiceclips.FeedWaveform.<anonymous> (FeedWaveform.kt:112)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            boolean z = this.A0E;
            EnumC27391C6u enumC27391C6u = this.A09;
            long j = this.A05;
            float f = this.A02;
            float f2 = this.A03;
            float f3 = this.A01;
            float f4 = this.A00;
            long j2 = this.A04;
            boolean z2 = this.A0F;
            InterfaceC16660sJ interfaceC16660sJ = this.A0D;
            InterfaceC16820sZ interfaceC16820sZ = this.A0C;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A0B;
            UserSession userSession = this.A0A;
            InterfaceC74953Yl interfaceC74953Yl = this.A08;
            InterfaceC74953Yl interfaceC74953Yl2 = this.A06;
            InterfaceC74953Yl interfaceC74953Yl3 = this.A07;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            c5Tl.Eno(1478615200);
            if (z) {
                CXY.A01(c5Tl, enumC27391C6u, f, 0, j);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A08 = AbstractC118185Wd.A08(c6l0.A00(AbstractC118175Wb.A08(c1130158n, f)), f2);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1478627609);
            Object obj4 = C5UI.A00;
            if (A0q == obj4) {
                A0q = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl, 30);
            }
            Modifier A0Y = AbstractC25230BEn.A0Y(A08.Eq3(new OnSizeChangedModifier(AbstractC25225BEi.A1B(c117505Tk, A0q, false))), DLR.A00);
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, AbstractC25226BEj.A1Y(c5Tl, z2, AbstractC25226BEj.A1W(c5Tl, j2, AbstractC25235BEs.A1V(c5Tl, f4, f2, AbstractC25227BEk.A1T(c5Tl, f3, 1478634304))) | AbstractC167007dF.A1P(A0H & 14, 4)));
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == obj4) {
                EEc = new DIT(obj, interfaceC74953Yl2, interfaceC74953Yl, f2, f3, f4, 1, j2, j, z2);
                c5Tl.FBy(EEc);
            }
            Modifier A0A = AbstractC25233BEq.A0A(c117505Tk, A0Y, EEc);
            C6M3 c6m3 = C6M3.Horizontal;
            boolean A1W2 = AbstractC25232BEp.A1W(c5Tl, interfaceC16660sJ, 1478693487, z2);
            Object EEc2 = c5Tl.EEc();
            if (A1W2 || EEc2 == obj4) {
                EEc2 = new MIF(7, interfaceC74953Yl3, interfaceC74953Yl, interfaceC16660sJ, z2);
                c5Tl.FBy(EEc2);
            }
            InterfaceC30902DiF A002 = BG5.A00(c5Tl, AbstractC25225BEi.A1B(c117505Tk, EEc2, false));
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 1478687480);
            if (A0q2 == obj4) {
                A0q2 = new D5A(interfaceC74953Yl3, null, 0);
                c5Tl.FBy(A0q2);
            }
            InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) A0q2;
            C117505Tk.A0L(c117505Tk, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ, 1478689924);
            Object EEc3 = c5Tl.EEc();
            if (A1Y || EEc3 == obj4) {
                EEc3 = new MWF(interfaceC16820sZ, null, 4);
                c5Tl.FBy(EEc3);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC119685bS.A00(c5Tl, A0A.Eq3(new DraggableElement(A002, c6m3, null, interfaceC16610sE, (InterfaceC16610sE) EEc3, true, false)));
            c5Tl.Eno(1478708755);
            if (interfaceC16820sZ2 != null && C18U.A06(C06090Tz.A05, userSession, 36320262090399973L)) {
                boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ2, 1478713995);
                Object EEc4 = c5Tl.EEc();
                if (A1Y2 || EEc4 == obj4) {
                    EEc4 = AbstractC25235BEs.A12(c5Tl, interfaceC16820sZ2, 17);
                }
                AbstractC27545CDp.A00(c5Tl, AbstractC25227BEk.A0I(c1130158n, 12.0f), C26032BfL.A03, AbstractC25225BEi.A1A(c117505Tk, EEc4, false), 48, 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(384689819);
            }
        }
        return C0eB.A00;
    }
}
