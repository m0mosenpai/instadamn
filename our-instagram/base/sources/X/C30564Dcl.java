package X;

/* renamed from: X.Dcl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30564Dcl extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ CSQ A00;
    public final /* synthetic */ C136946Hx A01;
    public final /* synthetic */ C136936Hw A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ C5Hc A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30564Dcl(CSQ csq, C136946Hx c136946Hx, C136936Hw c136936Hw, String str, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, boolean z) {
        super(3);
        this.A00 = csq;
        this.A04 = interfaceC16660sJ;
        this.A05 = c5Hc;
        this.A01 = c136946Hx;
        this.A02 = c136936Hw;
        this.A03 = str;
        this.A06 = z;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16820sZ interfaceC16820sZ;
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2005550879, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:455)");
            }
            CSQ csq = this.A00;
            C136876Hq c136876Hq = (C136876Hq) csq.A02;
            int i = csq.A01;
            c5Tl.Eno(1216746278);
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            if (interfaceC16660sJ != null) {
                boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, interfaceC16660sJ, csq, 1216747922);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A11(c5Tl, interfaceC16660sJ, csq, 11);
                }
                interfaceC16820sZ = (InterfaceC16820sZ) EEc;
                AbstractC25225BEi.A1T(c5Tl);
            } else {
                interfaceC16820sZ = null;
            }
            boolean A1W = AbstractC25228BEl.A1W(c5Tl);
            boolean A0K = C14360o3.A0K(c136876Hq.A03, ((InterfaceC132185xw) AbstractC001800i.A0I(this.A05)).getId());
            AbstractC27558CEd.A00(c5Tl, this.A01, this.A02, c136876Hq, this.A03, interfaceC16820sZ, i, A1W ? 1 : 0, A1W ? 1 : 0, this.A06, A0K);
            if (C0fH.A02()) {
                C0fH.A00(1942070624);
            }
        }
        return C0eB.A00;
    }
}
