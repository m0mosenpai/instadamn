package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VPz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68417VPz {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.1vN] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        BaseFragmentActivity baseFragmentActivity;
        Object A02 = c6fw.A02();
        if (!(A02 instanceof String)) {
            A02 = null;
        }
        if (C14360o3.A0K(A02, AbstractC111324zv.A00(501))) {
            AbstractC31177DnL.A0w(null, new C68096VAq(), C6BQ.A04(c6fq), C6BQ.A0B(c6fq));
        } else {
            if (C14360o3.A0K(A02, AbstractC111324zv.A00(259))) {
                UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
                AbstractC10360h2 parentFragmentManager = C6BQ.A00(C6BQ.A09(c6fq)).getParentFragmentManager();
                while (parentFragmentManager.A0L() > 0) {
                    Object A0S = parentFragmentManager.A0S(parentFragmentManager.A0L() - 1);
                    C14360o3.A07(A0S);
                    if (C14360o3.A0K(((AbstractC016706m) A0S).A09, AbstractC111324zv.A00(159))) {
                        break;
                    }
                    parentFragmentManager.A12();
                }
                FragmentActivity A04 = C6BQ.A04(c6fq);
                if (A04 instanceof BaseFragmentActivity) {
                    baseFragmentActivity = (BaseFragmentActivity) A04;
                } else {
                    baseFragmentActivity = null;
                }
                VRN.A00(baseFragmentActivity, userSession, "fulcrum_nexus");
                return null;
            }
            if (C14360o3.A0K(A02, AbstractC111324zv.A00(344))) {
                AbstractC25651Mw.A00(C6BQ.A0B(c6fq)).E4s(new Object());
                AbstractC70132W6e.A00(C6BQ.A04(c6fq), C6BQ.A00(C6BQ.A09(c6fq)).getParentFragmentManager());
                return null;
            }
        }
        return null;
    }
}
