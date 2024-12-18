package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.FeJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35117FeJ {
    public static List A00;
    public static final C35117FeJ A01 = new Object();

    public static final void A00(Context context, UserSession userSession, List list) {
        A00 = list;
        Context A0O = AbstractC166987dD.A0O(context);
        List list2 = A00;
        String A02 = C35270Fh5.A02(A0O);
        String A022 = AbstractC31172DnG.A0P(userSession).A02(C19T.A1W);
        String A10 = AbstractC31172DnG.A10(A0O);
        JSONArray A0p = AbstractC31171DnF.A0p();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC31172DnG.A1W(it, A0p);
            }
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/process_contact_point_signals/");
        A0c.A9s(AbstractC31186DnV.A01(0, 9, 92), A10);
        AbstractC31176DnK.A1R(A0c, A0p);
        A0c.A0H("phone_id", A022);
        A0c.A0H("sim_phone_number", A02);
        if (C0BQ.A00(userSession).CLL()) {
            A0c.A0N = true;
        }
        C1ON A0J = AbstractC31178DnM.A0J(A0c, C40781ul.class, C55702hA.class);
        C31714DwJ.A00(A0J, userSession, 20);
        C1GJ.A03(A0J);
    }
}
