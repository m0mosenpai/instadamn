package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

/* renamed from: X.DcX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30550DcX extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ InterfaceC132245y2 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30550DcX(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, UserSession userSession, String str, boolean z) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A00 = lineType;
        this.A05 = z;
        this.A01 = c5yI;
        this.A04 = str;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(888976113, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:788)");
            }
            InterfaceC132245y2 interfaceC132245y2 = this.A02;
            C9CF c9cf = (C9CF) interfaceC132245y2;
            boolean z = ((C26036BfP) c9cf.A01).A00;
            String str = c9cf.A04;
            LineType lineType = this.A00;
            boolean z2 = this.A05;
            c5Tl.Eno(-1660278935);
            C5yI c5yI = this.A01;
            boolean AH4 = c5Tl.AH4(c5yI);
            String str2 = this.A04;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, str2, AH4);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C57258Pbg(str2, c5yI, 45);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-1660293854);
            UserSession userSession = this.A03;
            boolean A1a = AbstractC25232BEp.A1a(c5Tl, interfaceC132245y2, c5yI, c5Tl.AH6(userSession));
            Object EEc2 = c5Tl.EEc();
            if (A1a || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25229BEm.A10(c5Tl, c5yI, interfaceC132245y2, userSession, 39);
            }
            CEN.A00(c5Tl, null, lineType, str, interfaceC16820sZ, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 0, 160, z2, false, z);
            if (C0fH.A02()) {
                C0fH.A00(652999953);
            }
        }
        return C0eB.A00;
    }
}
