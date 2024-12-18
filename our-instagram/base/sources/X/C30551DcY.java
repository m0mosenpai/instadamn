package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.DcY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30551DcY extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ InterfaceC132245y2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30551DcY(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, String str, String str2, boolean z) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A01 = c5yI;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = lineType;
        this.A05 = z;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C7A c7a;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-909511645, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1179)");
            }
            InterfaceC132245y2 interfaceC132245y2 = this.A02;
            EnumC132165xt enumC132165xt = interfaceC132245y2.Bet().A01;
            C9C5 c9c5 = (C9C5) interfaceC132245y2;
            boolean z = c9c5.A06;
            boolean z2 = c9c5.Bet().A0C;
            switch (AbstractC166987dD.A0H(c9c5.A03)) {
                case 0:
                    c7a = C7A.A05;
                    break;
                case 1:
                    c7a = C7A.A09;
                    break;
                case 2:
                    c7a = C7A.A02;
                    break;
                case 3:
                    c7a = C7A.A03;
                    break;
                case 4:
                    c7a = C7A.A06;
                    break;
                case 5:
                    c7a = C7A.A04;
                    break;
                case 6:
                    c7a = C7A.A07;
                    break;
                case 7:
                    c7a = C7A.A08;
                    break;
                default:
                    throw B4Z.A00();
            }
            c5Tl.Eno(-1659774335);
            C5yI c5yI = this.A01;
            boolean AH4 = c5Tl.AH4(c5yI);
            String str = this.A03;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, null, AbstractC25225BEi.A1X(c5Tl, str, AH4));
            String str2 = this.A04;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str2, A1X);
            Object EEc = c5Tl.EEc();
            if (A1X2 || EEc == C5UI.A00) {
                EEc = new C29913DHb(c5yI, str, str2, 3);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28432Cgg.A00(c5Tl, null, this.A00, enumC132165xt, c7a, (InterfaceC16660sJ) EEc, 196608, 384, this.A05, false, z, false, z2);
            if (C0fH.A02()) {
                C0fH.A00(540642339);
            }
        }
        return C0eB.A00;
    }
}
