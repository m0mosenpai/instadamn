package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DTk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30231DTk extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30231DTk(Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A01 = modifier;
        this.A03 = interfaceC16660sJ;
        this.A06 = z;
        this.A02 = interfaceC16820sZ;
        this.A05 = z2;
        this.A04 = z3;
        this.A00 = j;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2131027209, "com.instagram.barcelona.feed.post.ui.PostLikeIconWithAnimatedCount.<anonymous> (PostDenseUfi.kt:303)");
            }
            Modifier A0C = AbstractC118185Wd.A0C(this.A01, 18.0f);
            c5Tl.Eno(105946690);
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            boolean AH4 = c5Tl.AH4(interfaceC16660sJ);
            boolean z = this.A06;
            boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z, AH4);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25229BEm.A0x(c5Tl, interfaceC16660sJ, 10, z);
            }
            boolean A1W = AbstractC25228BEl.A1W(c5Tl);
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            boolean z2 = this.A05;
            boolean z3 = this.A04;
            C6HO.A02(c5Tl, A0C, (InterfaceC16820sZ) EEc, interfaceC16820sZ, 12582912, A1W ? 1 : 0, this.A00, z, z2, z3, A1W);
            if (C0fH.A02()) {
                C0fH.A00(-2027743794);
            }
        }
        return C0eB.A00;
    }
}
