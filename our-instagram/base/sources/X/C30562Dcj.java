package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dcj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30562Dcj extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ InterfaceC132245y2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30562Dcj(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, String str, String str2, String str3, boolean z) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A00 = lineType;
        this.A06 = z;
        this.A01 = c5yI;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
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
                C0fH.A01(409827505, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:476)");
            }
            C6HF c6hf = (C6HF) this.A02;
            String str = c6hf.A08;
            LineType lineType = this.A00;
            boolean z = this.A06;
            boolean z2 = c6hf.A0A;
            boolean z3 = c6hf.A09;
            String str2 = c6hf.A06;
            ImageUrl imageUrl = c6hf.A03;
            boolean z4 = c6hf.A0C;
            c5Tl.Eno(-1660696812);
            C5yI c5yI = this.A01;
            boolean A1W = AbstractC25230BEn.A1W(c5Tl, c5yI, str);
            String str3 = this.A04;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, null, AbstractC25225BEi.A1X(c5Tl, str3, A1W));
            String str4 = this.A05;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str4, A1X);
            String str5 = this.A03;
            boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str5, A1X2);
            Object EEc = c5Tl.EEc();
            if (A1X3 || EEc == C5UI.A00) {
                EEc = new C29725D8v(c5yI, str, str3, str4, str5, 0);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            CEF.A00(c5Tl, null, lineType, imageUrl, str2, c6hf.A07, c6hf.A05, (InterfaceC16820sZ) EEc, 0, 0, 1024, z, z2, z3, z4);
            if (C0fH.A02()) {
                C0fH.A00(1977649152);
            }
        }
        return C0eB.A00;
    }
}
