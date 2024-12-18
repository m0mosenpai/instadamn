package X;

/* renamed from: X.Dcq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30569Dcq extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ CSQ A00;
    public final /* synthetic */ C136946Hx A01;
    public final /* synthetic */ C136936Hw A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30569Dcq(CSQ csq, C136946Hx c136946Hx, C136936Hw c136936Hw, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(3);
        this.A01 = c136946Hx;
        this.A00 = csq;
        this.A02 = c136936Hw;
        this.A03 = str;
        this.A07 = z;
        this.A05 = interfaceC16660sJ;
        this.A04 = str2;
        this.A06 = z2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(898554314, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:376)");
            }
            C136946Hx c136946Hx = this.A01;
            CSQ csq = this.A00;
            C9CM c9cm = (C9CM) csq.A02;
            C75363a3 c75363a3 = (C75363a3) c9cm.A06;
            C136936Hw c136936Hw = this.A02;
            float f2 = c9cm.A02;
            float f3 = c9cm.A01;
            if (f2 > 0.0f && f3 > 0.0f) {
                f = C17s.A02(f2 / f3, 0.75f, 1.3333334f);
            } else {
                f = 1.0f;
            }
            String str = this.A03;
            boolean z = this.A07;
            c5Tl.Eno(1216649486);
            InterfaceC16660sJ interfaceC16660sJ = this.A05;
            boolean A1W = AbstractC25230BEn.A1W(c5Tl, interfaceC16660sJ, csq);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A11(c5Tl, interfaceC16660sJ, csq, 9);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            CEZ.A00(c5Tl, null, c136946Hx, c136936Hw, c75363a3, str, this.A04, (InterfaceC16820sZ) EEc, f, csq.A01, 221184, 0, 53760, true, false, z, false, this.A06, false, false);
            if (C0fH.A02()) {
                C0fH.A00(1506561125);
            }
        }
        return C0eB.A00;
    }
}
