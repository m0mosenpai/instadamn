package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LBf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47841LBf {
    public static final C189478aR A00(FragmentActivity fragmentActivity, UserSession userSession) {
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0d = fragmentActivity.getString(2131952134);
        A0y.A0k = true;
        A0y.A1G = false;
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A08 = AbstractC166997dE.A04(AbstractC166987dD.A0O(fragmentActivity), R.dimen.achievements_list_container_height);
        A0y.A1E = true;
        return A0y.A00();
    }

    public static final C189448aO A01(FragmentActivity fragmentActivity, UserSession userSession) {
        int[] iArr;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        if (AbstractC13620mo.A02(fragmentActivity.getApplicationContext())) {
            iArr = C189448aO.A1W;
        } else {
            iArr = C189448aO.A1X;
        }
        A0y.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        return A0y;
    }
}
