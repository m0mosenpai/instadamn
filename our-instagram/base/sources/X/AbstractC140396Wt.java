package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.6Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140396Wt {
    public static final C2EC A00(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        if (interfaceC83713oG instanceof InterfaceC83703oF) {
            DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
            C2DU c2du = (C2DU) AbstractC28761aE.A00(userSession);
            C14360o3.A0B(A01, 0);
            C81663kb A03 = C2DU.A03(c2du, A01);
            if (A03 instanceof C2EC) {
                return A03;
            }
        }
        return null;
    }

    public static final C7TH A01(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        C7TH A00;
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            A00 = AbstractC44138Jf3.A00(userSession);
        } else {
            A00 = AbstractC165967bO.A00(userSession);
        }
        return A00;
    }

    public static final void A03(Activity activity, AbstractC59962oe abstractC59962oe, C189478aR c189478aR, InterfaceC16820sZ interfaceC16820sZ) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC24847Az8(activity, abstractC59962oe, c189478aR, interfaceC16820sZ), 200L);
    }

    public static final C7TM A02(UserSession userSession, DirectShareTarget directShareTarget) {
        return C36911no.A00().E6g(userSession).A01(directShareTarget);
    }
}
