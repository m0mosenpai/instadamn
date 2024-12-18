package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VXI {
    public static final void A00(Activity activity, C19280xC c19280xC, UserSession userSession) {
        int i;
        if (activity != null) {
            C72603Nh c72603Nh = (C72603Nh) C55772hI.A00(userSession).A0L.get(activity.toString());
            if (c72603Nh != null) {
                i = c72603Nh.A00;
            } else {
                i = -1;
            }
            c19280xC.A08(Integer.valueOf(i), AbstractC111324zv.A00(474));
            c19280xC.A06(C55782hJ.A00(C55772hI.A00(userSession), activity.toString()), "nav_stack");
        }
    }
}
