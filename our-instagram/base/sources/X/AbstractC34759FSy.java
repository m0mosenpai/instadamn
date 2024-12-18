package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.FSy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34759FSy {
    public static final void A00(UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "avatar_tooltip_impression");
        if (A0f.isSampled()) {
            AbstractC31174DnI.A1G(A0f, AbstractC167007dF.A0n(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str));
        }
    }

    public static final void A01(UserSession userSession, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "avatar_mentions_bottom_sheet_action");
        if (A0f.isSampled()) {
            AbstractC31174DnI.A1G(A0f, AbstractC25233BEq.A0p("is_story_author", String.valueOf(z), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str)));
        }
    }
}
