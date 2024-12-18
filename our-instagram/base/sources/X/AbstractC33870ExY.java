package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.ExY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33870ExY {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        PendingRecipient pendingRecipient;
        Object A01 = c6fw.A01();
        String A0f = AbstractC31171DnF.A0f(A01);
        String str = (String) A01;
        String A0i = AbstractC31180DnO.A0i(c6fw, 1);
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, A0f);
        String str2 = (String) A00;
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        if (A0i != null && A0i.length() != 0) {
            A08 = new C35978Fuc(A0i);
        }
        User A0k = AbstractC31174DnI.A0k(A0S, str);
        if (A0k != null) {
            pendingRecipient = new PendingRecipient(A0k);
        } else {
            ImageUrl imageUrl = PendingRecipient.A0g;
            pendingRecipient = new PendingRecipient(AbstractC25225BEi.A0t(""), str, "");
        }
        C36881nl A012 = C36881nl.A01(C6BQ.A04(c6fq), A08, A0S, str2);
        A012.A0B(AbstractC166987dD.A1J(pendingRecipient));
        A012.A0s = true;
        A012.A06();
        return null;
    }
}
