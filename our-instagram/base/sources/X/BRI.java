package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* loaded from: classes5.dex */
public abstract class BRI {
    public static final boolean A01(UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, String str) {
        C14360o3.A0B(socialContextBubbleUiState, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        if (AbstractC002300n.A0h(str, "clips_viewer", false) || socialContextBubbleUiState.A02 != SocialContextType.A05 || !C3HM.A00.A04(userSession)) {
            return false;
        }
        return true;
    }

    public static final Integer A00(UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, String str) {
        AbstractC167017dG.A1P(userSession, str);
        if (A01(userSession, socialContextBubbleUiState, str)) {
            return C05F.A0j;
        }
        if (!BLH.A02(userSession) && !C14360o3.A0K(C18U.A04(C06090Tz.A05, userSession, 36892536417158087L), "above_caption")) {
            return C05F.A00;
        }
        return C05F.A0u;
    }
}
