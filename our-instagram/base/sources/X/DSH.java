package X;

/* loaded from: classes5.dex */
public final class DSH extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C74863Yb A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSH(C74863Yb c74863Yb, String str, long j, boolean z) {
        super(2);
        this.A01 = c74863Yb;
        this.A03 = z;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-492065622, "com.instagram.compose.igds.components.navigation.actionbar.MainFeedActionBarTitleComposeView.getComposeView.<anonymous>.<anonymous>.<anonymous> (InstagramLogoTitle.kt:74)");
            }
            C74863Yb c74863Yb = this.A01;
            boolean A1X = AbstractC25230BEn.A1X(c74863Yb.A02);
            boolean z = this.A03;
            long j = this.A00;
            String str = this.A02;
            boolean z2 = c74863Yb.A01;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c74863Yb, 447484163);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new C29889DGd(c74863Yb, 7);
                c5Tl.FBy(EEc);
            }
            CGK.A00(c5Tl, str, (InterfaceC16820sZ) EEc, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, j, A1X, z, z2);
            if (C0fH.A02()) {
                C0fH.A00(-738561803);
            }
        }
        return C0eB.A00;
    }
}
