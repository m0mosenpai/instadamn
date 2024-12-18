package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.FcP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35052FcP {
    public static final ArrayList A00(UserSession userSession, List list) {
        User A00;
        ArrayList A12 = AbstractC166997dE.A12(userSession, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (A0m.A0R()) {
                if (A0m.A0S()) {
                    A00 = AbstractC166997dE.A0Y(userSession);
                } else {
                    PendingRecipient A0R = AbstractC31178DnM.A0R(A0m, 0);
                    C14360o3.A0A(A0R);
                    A00 = C4GO.A00(userSession, A0R);
                }
                A12.add(A00);
            }
        }
        return A12;
    }

    public static final ArrayList A01(List list) {
        C14360o3.A0B(list, 0);
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (!A0m.A0S()) {
                A0l.addAll(AbstractC31175DnJ.A0f(A0m));
            }
        }
        return AbstractC166987dD.A1F(A0l);
    }

    public static final ArrayList A02(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (A0m.A0R()) {
                A12.add(AbstractC31173DnH.A0o(A0m));
            }
        }
        return A12;
    }
}
