package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class S4Q {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        List list = c6fw.A00;
        list.get(1);
        String A0s = AbstractC31173DnH.A0s(list, 2);
        String A0s2 = AbstractC31173DnH.A0s(list, 3);
        boolean A01 = C6DZ.A01(list.get(4));
        android.net.Uri A0B = AbstractC25227BEk.A0B(A0e);
        AbstractC12990ll A0B2 = C6BQ.A0B(c6fq);
        FragmentActivity activity = C6BQ.A01(c6fq).getActivity();
        C14360o3.A0C(A0B2, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0B2;
        if (activity != null) {
            String A19 = AbstractC166987dD.A19(A0B);
            C2Fb c2Fb = C2Fb.A1z;
            C14360o3.A0B(userSession, 1);
            C63397SjR c63397SjR = new C63397SjR(activity, userSession, c2Fb, A19, false);
            c63397SjR.A0E(userSession.userId);
            c63397SjR.A0S = "in_app_browser_v2";
            c63397SjR.A0Q = A0s;
            if (A0s != null) {
                c63397SjR.A1L.A00.putString("TrackingInfo.ARG_LINK_HISTORY_ITEM_ID", A0s);
            }
            c63397SjR.A0D(A0s2);
            if (A01) {
                c63397SjR.A0r = false;
                c63397SjR.A0D = ZonePolicy.A0D;
            }
            c63397SjR.A0A();
        }
        return null;
    }
}
