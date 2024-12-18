package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.compose.igds.components.bottomsheet.IgComposeBottomSheetNavigator;
import kotlin.Deprecated;

/* renamed from: X.CaO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28115CaO {
    public static final long A00;

    @Deprecated(message = "This component is still a WIP. Please reach out if you are interested in using.")
    public static final CT3 A00(C5Tl c5Tl, C26087BgG c26087BgG, C6Y c6y, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i) {
        C26087BgG c26087BgG2 = c26087BgG;
        InterfaceC16620sF interfaceC16620sF3 = interfaceC16620sF;
        C14360o3.A0B(c6y, 1);
        c5Tl.Eno(1877529830);
        if ((i & 4) != 0) {
            c26087BgG2 = null;
        }
        if ((i & 8) != 0) {
            interfaceC16620sF3 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1247255032, "com.instagram.compose.igds.components.bottomsheet.rememberIgdsComposeBottomSheet (IgdsComposeBottomSheet.kt:152)");
        }
        Context A0K = AbstractC25228BEl.A0K(c5Tl);
        UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
        C07X c07x = (C07X) c5Tl.AJX(C5VN.A00);
        Object AJX = c5Tl.AJX(C5V2.A0A);
        IgComposeBottomSheetNavigator igComposeBottomSheetNavigator = (IgComposeBottomSheetNavigator) c5Tl.AJX(CMP.A00);
        C27964CUk c27964CUk = igComposeBottomSheetNavigator.A00;
        boolean A1X = AbstractC25232BEp.A1X(c5Tl, igComposeBottomSheetNavigator, AJX, -1606445007);
        Object EEc = c5Tl.EEc();
        if (A1X || EEc == C5UI.A00) {
            EEc = new MCK(AJX, igComposeBottomSheetNavigator, (InterfaceC23621Ds) null, 35);
            c5Tl.FBy(EEc);
        }
        C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
        C5UX.A04(c5Tl, c27964CUk, (InterfaceC16620sF) EEc);
        C5TR A01 = C5UA.A01(c5Tl, new C30536DcJ(8, interfaceC16620sF3, c26087BgG2, interfaceC16620sF2), 37055671);
        Object A0q = AbstractC25227BEk.A0q(c5Tl, -1606388207);
        if (A0q == C5UI.A00) {
            A0q = new CT3(A0K, c07x, A0u, c6y, str, A01, A00);
            c5Tl.FBy(A0q);
        }
        CT3 ct3 = (CT3) A0q;
        if (AbstractC25227BEk.A1a(A0J)) {
            C0fH.A00(-332484629);
        }
        C117505Tk.A0I(A0J);
        return ct3;
    }

    static {
        long A02;
        A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r1 & 63)], C1132359l.A03(r1), C1132359l.A02(r1), C1132359l.A01(C1132359l.A01), 0.4f);
        A00 = A02;
    }
}
