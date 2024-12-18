package X;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dcf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30558Dcf extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30558Dcf(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            C5Tl c5Tl = (C5Tl) obj2;
            if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(-546044201, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:1677)");
                }
                InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) this.A03;
                C26157Bhi c26157Bhi = (C26157Bhi) interfaceC132245y2;
                String str = c26157Bhi.A07;
                String str2 = c26157Bhi.A05;
                ImageUrl imageUrl = (ImageUrl) c26157Bhi.A01;
                LineType lineType = (LineType) this.A02;
                boolean z = this.A05;
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC132245y2, -1659067289);
                Object obj4 = this.A01;
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, obj4, A1Y);
                String str3 = this.A04;
                boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str3, A1X);
                Object EEc = c5Tl.EEc();
                if (A1X2 || EEc == C5UI.A00) {
                    EEc = new C50253MHi(obj4, interfaceC132245y2, str3, 17);
                    c5Tl.FBy(EEc);
                }
                AbstractC28295Cdh.A00(c5Tl, null, lineType, imageUrl, str, str2, (InterfaceC16820sZ) EEc, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, 32, z);
                if (C0fH.A02()) {
                    C0fH.A00(-832511561);
                }
            }
            return C0eB.A00;
        }
        C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
        if (AbstractC25227BEk.A1U(A0S, -1525724089)) {
            C0fH.A01(1719201455, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
        }
        C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(A0S, A0S.EEc(), C5UI.A00);
        Modifier A00 = C5WM.A00((InterfaceC118075Vr) this.A01, c5xo, Modifier.A00);
        boolean z2 = this.A05;
        Modifier Eq3 = A00.Eq3(new ClickableElement(null, c5xo, (C5XQ) this.A03, this.A04, (InterfaceC16820sZ) this.A02, z2));
        if (C0fH.A02()) {
            C0fH.A00(-2059685459);
        }
        AbstractC25225BEi.A1T(A0S);
        return Eq3;
    }
}
