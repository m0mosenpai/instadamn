package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.F1r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34064F1r {
    public static final void A00(UserSession userSession, DirectPromptTypes directPromptTypes) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), AbstractC111324zv.A00(4287));
        Map A0t = AbstractC31180DnO.A0t(directPromptTypes);
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "tap");
            A0f.AAP(CacheBehaviorLogger.SOURCE, "prompt");
            AbstractC31174DnI.A1F(A0f, A0t);
        }
    }
}
