package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ia8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41559Ia8 {
    public static final HashMap A00 = AbstractC06930Yk.A02(AbstractC167007dF.A1b(3, EnumC39562HdY.A04, AbstractC166987dD.A1L(1, EnumC39562HdY.A03), AbstractC166987dD.A1L(2, EnumC39562HdY.A05)));

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C5H9 c5h9, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ, int i) {
        AbstractC11060iN.A00(userSession);
        C82713mZ A01 = C32U.A01(c5h9, c38321qM, interfaceC60442pS, "political_ad_unit_action");
        A01.A5A = "ad_transparency_disclaimer_info_bottom_sheet";
        C32U.A0H(userSession, A01, interfaceC60442pS);
        AbstractC41689IdI.A00(fragmentActivity, IGAdTransparencyDisclaimerPlacement.A05, userSession, c38321qM, (EnumC39562HdY) AbstractC06930Yk.A01(Integer.valueOf(i), A00), interfaceC16820sZ);
    }
}
