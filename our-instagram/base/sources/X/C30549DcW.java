package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DcW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30549DcW extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LineType A01;
    public final /* synthetic */ InterfaceC132245y2 A02;
    public final /* synthetic */ InterfaceC132365yF A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30549DcW(LineType lineType, InterfaceC132245y2 interfaceC132245y2, InterfaceC132365yF interfaceC132365yF, String str, long j, boolean z) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A01 = lineType;
        this.A05 = z;
        this.A03 = interfaceC132365yF;
        this.A04 = str;
        this.A00 = j;
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
                C0fH.A01(1351961017, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:733)");
            }
            InterfaceC132245y2 interfaceC132245y2 = this.A02;
            C6HI c6hi = (C6HI) interfaceC132245y2;
            C45123Jxs c45123Jxs = c6hi.A00;
            String str = c45123Jxs.A02;
            ImageUrl imageUrl = (ImageUrl) c45123Jxs.A00;
            ImageUrl imageUrl2 = (ImageUrl) c45123Jxs.A01;
            String str2 = c45123Jxs.A04;
            String str3 = c45123Jxs.A05;
            LineType lineType = this.A01;
            boolean z = this.A05;
            boolean z2 = c6hi.A02.A00;
            float f = 12.0f;
            if (z) {
                f = 16.0f;
            }
            float f2 = 16.0f;
            if (z2) {
                f2 = 0.0f;
            }
            C25981BeV c25981BeV = new C25981BeV(new C1333560c(12.0f, 0.0f, f, f2), z);
            boolean z3 = c6hi.A03;
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC132245y2, -1660350499);
            InterfaceC132365yF interfaceC132365yF = this.A03;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, interfaceC132365yF, A1Y);
            String str4 = this.A04;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str4, A1X);
            long j = this.A00;
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, A1X2);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new D8e(interfaceC132365yF, interfaceC132245y2, str4, 2, j);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28299Cdl.A01(c5Tl, null, lineType, c25981BeV, imageUrl, imageUrl2, str, str2, str3, (InterfaceC16820sZ) EEc, null, 0, 0, 1280, z3, c6hi.A04);
            if (C0fH.A02()) {
                C0fH.A00(-655648566);
            }
        }
        return C0eB.A00;
    }
}
