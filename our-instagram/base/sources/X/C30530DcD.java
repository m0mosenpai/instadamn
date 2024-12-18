package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.DcD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30530DcD extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ InterfaceC132245y2 A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30530DcD(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, boolean z) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A00 = lineType;
        this.A03 = z;
        this.A01 = c5yI;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16660sJ interfaceC16660sJ;
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(924419017, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:708)");
            }
            InterfaceC132245y2 interfaceC132245y2 = this.A02;
            C6HH c6hh = (C6HH) interfaceC132245y2;
            C25999Ben c25999Ben = c6hh.A00;
            LineType lineType = this.A00;
            boolean z = this.A03;
            c5Tl.Eno(-1660393259);
            if (c25999Ben.A04 && c25999Ben.A01 == null) {
                c5Tl.Eno(-1660390218);
                C5yI c5yI = this.A01;
                boolean A1W = AbstractC25230BEn.A1W(c5Tl, c5yI, interfaceC132245y2);
                Object EEc = c5Tl.EEc();
                if (A1W || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A12(c5Tl, c5yI, interfaceC132245y2, 46);
                }
                interfaceC16660sJ = (InterfaceC16660sJ) EEc;
                AbstractC25225BEi.A1T(c5Tl);
            } else {
                interfaceC16660sJ = null;
            }
            boolean A1W2 = AbstractC25228BEl.A1W(c5Tl);
            AbstractC28031CXf.A00(c5Tl, null, lineType, c25999Ben, interfaceC16660sJ, A1W2 ? 1 : 0, 16, z, c6hh.A02.A00);
            if (C0fH.A02()) {
                C0fH.A00(-510068100);
            }
        }
        return C0eB.A00;
    }
}
