package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ExW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33868ExW {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        PendingRecipient pendingRecipient;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        String A0s2 = AbstractC31173DnH.A0s(list, 1);
        C18C.A07(A0s2, "Merchant ID should not be null");
        C18C.A07(A0s, "Entrypoint must be provided");
        FragmentActivity A04 = C6BQ.A04(c6fq);
        A04.finish();
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        User A0k = AbstractC31174DnI.A0k(A0W, A0s2);
        if (A0k != null) {
            pendingRecipient = new PendingRecipient(A0k);
        } else {
            pendingRecipient = new PendingRecipient(A0s2);
        }
        C36881nl A01 = C36881nl.A01(A04, new C35977Fub(A0s), A0W, A0s);
        A01.A0B(Collections.singletonList(pendingRecipient));
        A01.A0s = true;
        A01.A06();
        if (A0s.equals("service_buyer_booking_confirmation") && C1VN.A00 != null) {
            AbstractC31282Dp4.A00().A01(A04, A0W, "803330587195545", null);
        }
        return null;
    }
}
