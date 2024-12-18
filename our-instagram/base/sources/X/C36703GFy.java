package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GFy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36703GFy implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        C34573FLi c34573FLi = (C34573FLi) obj;
        c34573FLi.getClass();
        C03990Jp c03990Jp = new C03990Jp(c34573FLi.A02, interfaceC03960Jm);
        try {
            Context context = c34573FLi.A00;
            AbstractC018607g abstractC018607g = c34573FLi.A01;
            List list = c34573FLi.A03;
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                JSONObject A0q = AbstractC31171DnF.A0q();
                A0q.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.parseLong(A1B));
                A0p.put(A0q);
            }
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("multiple_accounts/set_child_accounts/");
            A0M.A0S(C40781ul.class, C55702hA.class);
            A0M.A9s("child_account_ids", A0p.toString());
            A0M.A0N = true;
            C1ON A0N = A0M.A0N();
            A0N.A00 = c03990Jp;
            C1GJ.A00(context, abstractC018607g, A0N);
        } catch (JSONException unused) {
            interfaceC03960Jm.AIn(null);
        }
    }
}
