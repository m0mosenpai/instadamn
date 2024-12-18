package X;

/* renamed from: X.DTg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30227DTg extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30227DTg(C26771Brs c26771Brs, String str, String str2, String str3, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = c26771Brs;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A03 = str3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.A00;
        C5Tl c5Tl = (C5Tl) obj;
        int A0B = AbstractC25228BEl.A0B(obj2);
        if (i2 != 0) {
            if (A0B != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-196988706, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicDetailFragment.onCreateView.<anonymous> (AvoidedTopicDetailFragment.kt:147)");
                }
                if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25228BEl.A0W(), new C30227DTg((C26771Brs) this.A02, this.A04, this.A05, this.A03, this.A01, 0), 1006189269)) {
                    i = -12180028;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            if (A0B != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(1704888254, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicDetailFragment.onCreateView.<anonymous>.<anonymous> (AvoidedTopicDetailFragment.kt:148)");
                }
                C26771Brs c26771Brs = (C26771Brs) this.A02;
                InterfaceC09390do interfaceC09390do = c26771Brs.A08;
                InterfaceC74963Ym A02 = C6IB.A02(c5Tl, ((C25867BcM) interfaceC09390do.getValue()).A0A, 0);
                String str = this.A04;
                if (str == null && (str = this.A05) == null) {
                    str = "";
                }
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26771Brs, 1616979963);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = AbstractC25235BEs.A17(c5Tl, c26771Brs, 29);
                }
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c26771Brs, 1616982815);
                Object EEc2 = c5Tl.EEc();
                if (A1Z2 || EEc2 == C5UI.A00) {
                    EEc2 = C29908DGw.A01(c5Tl, c26771Brs, 5);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc2, false);
                Object value = interfaceC09390do.getValue();
                boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, value, 1616985085);
                Object EEc3 = c5Tl.EEc();
                if (A1Z3 || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25230BEn.A0u(c5Tl, value, 3);
                }
                AbstractC28440Cgo.A02(c5Tl, (C26080Bg9) A02.getValue(), str, A1A, interfaceC16660sJ, AbstractC25228BEl.A1E(A0K, EEc3, false), this.A01, 0);
                C0eB c0eB = C0eB.A00;
                boolean A1Z4 = AbstractC25227BEk.A1Z(c5Tl, c26771Brs, 1616990238);
                String str2 = this.A03;
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, str2, A1Z4);
                Object EEc4 = c5Tl.EEc();
                if (A1X || EEc4 == C5UI.A00) {
                    EEc4 = new PYc(c26771Brs, str2, null, 12);
                    c5Tl.FBy(EEc4);
                }
                if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc4, c0eB, false)) {
                    i = -2014921499;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
