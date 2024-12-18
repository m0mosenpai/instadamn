package X;

/* renamed from: X.Dcr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30570Dcr extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C136946Hx A01;
    public final /* synthetic */ C136936Hw A02;
    public final /* synthetic */ InterfaceC132185xw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30570Dcr(C136946Hx c136946Hx, C136936Hw c136936Hw, InterfaceC132185xw interfaceC132185xw, String str, InterfaceC16660sJ interfaceC16660sJ, float f, boolean z, boolean z2) {
        super(3);
        this.A02 = c136936Hw;
        this.A01 = c136946Hx;
        this.A03 = interfaceC132185xw;
        this.A00 = f;
        this.A07 = z;
        this.A04 = str;
        this.A05 = interfaceC16660sJ;
        this.A06 = z2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(452255122, "com.instagram.barcelona.feed.post.ui.PostSingleMedia.<anonymous>.<anonymous> (PostSingleMedia.kt:465)");
            }
            C136936Hw c136936Hw = this.A02;
            if (c136936Hw != null) {
                C136946Hx c136946Hx = this.A01;
                InterfaceC132185xw interfaceC132185xw = this.A03;
                float f = this.A00;
                boolean z = this.A07;
                String str = this.A04;
                InterfaceC16660sJ interfaceC16660sJ = this.A05;
                boolean z2 = this.A06;
                if (c136946Hx != null) {
                    C75363a3 c75363a3 = ((C136886Hr) interfaceC132185xw).A03;
                    boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, interfaceC16660sJ, interfaceC132185xw, -2091581271);
                    Object EEc = c5Tl.EEc();
                    if (A1Z || EEc == C5UI.A00) {
                        EEc = AbstractC25230BEn.A11(c5Tl, interfaceC132185xw, interfaceC16660sJ, 23);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    CEZ.A00(c5Tl, null, c136946Hx, c136936Hw, c75363a3, str, null, (InterfaceC16820sZ) EEc, f, 0, 12779520, 0, 56832, z, false, false, false, z2, false, false);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (C0fH.A02()) {
                C0fH.A00(764174300);
            }
        }
        return C0eB.A00;
    }
}
