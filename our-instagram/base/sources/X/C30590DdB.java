package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DdB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30590DdB extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C27872CQj A01;
    public final /* synthetic */ C26073Bg2 A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16610sE A0A;
    public final /* synthetic */ InterfaceC16610sE A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30590DdB(InterfaceC11380iw interfaceC11380iw, C27872CQj c27872CQj, C26073Bg2 c26073Bg2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, boolean z, boolean z2) {
        super(3);
        this.A0D = z;
        this.A02 = c26073Bg2;
        this.A06 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
        this.A00 = interfaceC11380iw;
        this.A09 = interfaceC16660sJ;
        this.A0A = interfaceC16610sE;
        this.A0B = interfaceC16610sE2;
        this.A08 = interfaceC16660sJ2;
        this.A07 = interfaceC16820sZ4;
        this.A05 = interfaceC16820sZ5;
        this.A01 = c27872CQj;
        this.A0C = z2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(modifier, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0R(c5Tl, modifier);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1717546658, "com.instagram.opal.impl.ui.OpalProfile.<anonymous> (OpalContent.kt:460)");
            }
            boolean z = this.A0D;
            C26073Bg2 c26073Bg2 = this.A02;
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A04;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            InterfaceC16660sJ interfaceC16660sJ = this.A09;
            InterfaceC16610sE interfaceC16610sE = this.A0A;
            InterfaceC16610sE interfaceC16610sE2 = this.A0B;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A08;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A07;
            InterfaceC16820sZ interfaceC16820sZ5 = this.A05;
            C27872CQj c27872CQj = this.A01;
            boolean z2 = this.A0C;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (z) {
                c5Tl.Eno(-470600568);
                AbstractC28507Ci0.A04(c5Tl, AbstractC25228BEl.A0V(), interfaceC11380iw, c26073Bg2.A05.A01, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, 1572864, c26073Bg2.A09);
            } else {
                c5Tl.Eno(-470137707);
                AbstractC28322CeA.A01(c5Tl, AbstractC25228BEl.A0V(), interfaceC11380iw, c27872CQj, c26073Bg2, c26073Bg2.A05.A05, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16610sE, interfaceC16610sE2, 0, 3072, z2);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-308600724);
            }
        }
        return C0eB.A00;
    }
}
