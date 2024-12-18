package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VQ1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        BaseFragmentActivity baseFragmentActivity;
        Object A00 = c6fw.A00();
        if ((A00 instanceof String) && (str = (String) A00) != null) {
            FragmentActivity A04 = C6BQ.A04(c6fq);
            if ((A04 instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) A04) != null) {
                UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
                W6f.A02(baseFragmentActivity, new C70627We6(baseFragmentActivity, userSession, str), userSession, true);
            }
        }
        return null;
    }
}
