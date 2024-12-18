package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CZH {
    public static final void A00(C8Z c8z, C8i c8i, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_wearables_pivot_page");
        A0f.A8R(c8i, "pivot_page_event_name");
        AbstractC25234BEr.A0y(c8z, A0f, str, str2, null);
    }

    public static final void A01(C8i c8i, WearablesAppAttributionType wearablesAppAttributionType, UserSession userSession, String str, String str2) {
        C8Z c8z;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_wearables_pivot_page");
        A0f.A8R(c8i, "pivot_page_event_name");
        if (wearablesAppAttributionType != null) {
            int ordinal = wearablesAppAttributionType.ordinal();
            if (ordinal != 2) {
                if (ordinal == 7) {
                    c8z = C8Z.RAY_BAN_STORIES;
                }
            } else {
                c8z = C8Z.RAY_BAN_META;
            }
            AbstractC25234BEr.A0y(c8z, A0f, str, str2, null);
        }
        c8z = null;
        AbstractC25234BEr.A0y(c8z, A0f, str, str2, null);
    }
}
