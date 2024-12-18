package X;

import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.I1f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40673I1f {
    public static final C11520jB A00(UserSession userSession, IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc) {
        ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl;
        C11520jB A0B = AbstractC37300Gc1.A0B();
        String str = hbc.A00().A02;
        if (str != null && str.length() > 0) {
            A0B.A04(C5I8.A3c, str);
        }
        String str2 = null;
        if (hbc.A00 == 7 && (contextualAdResponseOrganicInfoImpl = hbc.A02) != null) {
            A0B.A05(C5I8.A3e, contextualAdResponseOrganicInfoImpl.A01);
            C11500j9 c11500j9 = C5I8.A3d;
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl2 = hbc.A02;
            if (contextualAdResponseOrganicInfoImpl2 != null) {
                str2 = contextualAdResponseOrganicInfoImpl2.A00;
            }
            A0B.A05(c11500j9, str2);
        }
        A0B.A04(C5I8.A1C, intentAwareAdPivotState.A0E);
        AbstractC37300Gc1.A0z(C5I8.A4W, A0B, true);
        A0B.A04(C5I8.A5y, AbstractC31171DnF.A0V(hbc.A00));
        A0B.A04(C5I8.A5w, hbc.getId());
        C11500j9 c11500j92 = C5I8.A5v;
        String A07 = AbstractC41071vF.A07(userSession, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00());
        if (A07 != null) {
            A0B.A04(c11500j92, A07);
            A0B.A04(C5I8.A5u, AbstractC37302Gc3.A0V(intentAwareAdPivotState.A06));
            return A0B;
        }
        throw AbstractC166997dE.A0g();
    }
}
