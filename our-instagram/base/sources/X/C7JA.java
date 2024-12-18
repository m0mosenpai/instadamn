package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7JA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7JA {
    public static final void A00(Activity activity, View view, UserSession userSession, String str, List list, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        if (view != null && C2TN.A00(userSession)) {
            view.setOnLongClickListener(new ViewOnLongClickListenerC28677ClP(activity, userSession, str, list, interfaceC16820sZ));
        }
    }

    public static final void A01(Activity activity, UserSession userSession, String str, String str2, List list, InterfaceC16820sZ interfaceC16820sZ) {
        Object newInstance;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC16820sZ, 5);
        if (C2TN.A00(userSession)) {
            Fragment fragment = null;
            try {
                newInstance = Class.forName("com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
            }
            if (newInstance instanceof Fragment) {
                fragment = (Fragment) newInstance;
                if (fragment != null) {
                    fragment.setArguments(AbstractC61636Rr0.A00(new C09530e4("launcher_rig_parameter_names", new ArrayList(list)), new C09530e4("is_in_launcher_rig_mode", true)));
                    if (!list.isEmpty()) {
                        C189448aO c189448aO = new C189448aO(userSession);
                        c189448aO.A0d = str;
                        c189448aO.A1G = true;
                        c189448aO.A0c = str2;
                        c189448aO.A1P = true;
                        c189448aO.A0U = new C24100Aml(interfaceC16820sZ);
                        c189448aO.A04 = 0.8f;
                        c189448aO.A00().A02(activity, fragment);
                    }
                }
            }
        }
    }
}
