package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.ExF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33851ExF {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        String obj = A01.toString();
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        User A0k = AbstractC31174DnI.A0k(A0S, obj);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC31171DnF.A1O(A04);
        C36881nl A012 = C36881nl.A01(A04, C6BQ.A08(c6fq), A0S, "shared_activity_direct_message");
        ImageUrl imageUrl = PendingRecipient.A0g;
        C14360o3.A0A(A0k);
        AbstractC31179DnN.A1Q(A012, A0k);
        A012.A0s = true;
        A012.A06();
        return null;
    }
}
