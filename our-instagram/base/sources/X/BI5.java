package X;

/* loaded from: classes5.dex */
public final class BI5 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C5YV A00;
    public final /* synthetic */ C2DC A01;
    public final /* synthetic */ C5YL A02;
    public final /* synthetic */ BI3 A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BI5(C5YV c5yv, C2DC c2dc, C5YL c5yl, BI3 bi3, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(3);
        this.A01 = c2dc;
        this.A03 = bi3;
        this.A00 = c5yv;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = c5yl;
        this.A04 = interfaceC16660sJ;
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
                C0fH.A01(1123073700, "com.instagram.compose.igds.components.peoplecell.IgdsPeopleCell.<anonymous> (IgdsPeopleCell.kt:150)");
            }
            C2DC c2dc = this.A01;
            InterfaceC31127DmA interfaceC31127DmA = this.A03.A02;
            BGD.A00(c5Tl, null, this.A00, c2dc, this.A02, interfaceC31127DmA, this.A04, 0, 0, 308, 0L, 0L, this.A06, this.A05, false);
            if (C0fH.A02()) {
                C0fH.A00(-391743834);
            }
        }
        return C0eB.A00;
    }
}
