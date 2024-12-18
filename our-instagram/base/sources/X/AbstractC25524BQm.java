package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import java.util.List;

/* renamed from: X.BQm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25524BQm {
    public static final long A00(UserSession userSession, int i) {
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 1);
        return C18U.A01(A0j, userSession, 36602093549785670L) + (i * C18U.A01(A0j, userSession, 36602093549654596L));
    }

    public static final Integer A01(C86493tM c86493tM) {
        InterfaceC86523tQ interfaceC86523tQ;
        SocialContextBubbleUiState socialContextBubbleUiState;
        C86503tN c86503tN;
        List list;
        C14360o3.A0B(c86493tM, 0);
        int intValue = c86493tM.A02.intValue();
        if (intValue == 0) {
            return null;
        }
        if (intValue == 1) {
            InterfaceC86513tO interfaceC86513tO = c86493tM.A01;
            if ((interfaceC86513tO instanceof C86503tN) && (c86503tN = (C86503tN) interfaceC86513tO) != null && (list = c86503tN.A00) != null) {
                interfaceC86523tQ = (InterfaceC86523tQ) AbstractC001800i.A0J(list);
            } else {
                interfaceC86523tQ = null;
            }
            if (!(interfaceC86523tQ instanceof SocialContextBubbleUiState) || (socialContextBubbleUiState = (SocialContextBubbleUiState) interfaceC86523tQ) == null) {
                return null;
            }
            return socialContextBubbleUiState.A05;
        }
        throw new RuntimeException();
    }

    public static final boolean A02(UserSession userSession, C86493tM c86493tM) {
        C14360o3.A0B(userSession, 1);
        int intValue = c86493tM.A02.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return AbstractC167007dF.A1X(c86493tM.A04, C05F.A00);
            }
            throw B4Z.A00();
        }
        return C18U.A06(C06090Tz.A05, userSession, 36320618572358365L);
    }

    public static final boolean A03(UserSession userSession, C86493tM c86493tM) {
        InterfaceC86523tQ interfaceC86523tQ;
        SocialContextBubbleUiState socialContextBubbleUiState;
        C86503tN c86503tN;
        List list;
        boolean A1R = AbstractC167007dF.A1R(0, c86493tM, userSession);
        int intValue = c86493tM.A02.intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                InterfaceC86513tO interfaceC86513tO = c86493tM.A01;
                Integer num = null;
                if ((interfaceC86513tO instanceof C86503tN) && (c86503tN = (C86503tN) interfaceC86513tO) != null && (list = c86503tN.A00) != null) {
                    interfaceC86523tQ = (InterfaceC86523tQ) AbstractC001800i.A0J(list);
                } else {
                    interfaceC86523tQ = null;
                }
                if ((interfaceC86523tQ instanceof SocialContextBubbleUiState) && (socialContextBubbleUiState = (SocialContextBubbleUiState) interfaceC86523tQ) != null) {
                    num = socialContextBubbleUiState.A05;
                }
                if (num == C05F.A0C) {
                    return true;
                }
                return false;
            }
            throw B4Z.A00();
        }
        return C18U.A06(C06090Tz.A05, userSession, 36320618578256659L);
    }

    public static final boolean A04(C86493tM c86493tM) {
        int intValue = c86493tM.A02.intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue == 1) {
            if (A01(c86493tM) != C05F.A00) {
                return true;
            }
            return false;
        }
        throw B4Z.A00();
    }
}
