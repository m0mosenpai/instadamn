package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.F1j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34056F1j {
    public static InterfaceC83703oF A00(UserSession userSession, AnonymousClass172 anonymousClass172) {
        String str = null;
        C81663kb B3U = AbstractC28761aE.A00(userSession).B3U(new DirectThreadKey(null, AbstractC16960so.A1N(anonymousClass172.getId())));
        if (B3U != null) {
            str = B3U.C7I();
        }
        ImageUrl imageUrl = PendingRecipient.A0g;
        return AbstractC31232DoF.A00(str, AbstractC166987dD.A1J(new PendingRecipient(anonymousClass172.Bhu(), anonymousClass172.getId(), anonymousClass172.B8y())));
    }
}
