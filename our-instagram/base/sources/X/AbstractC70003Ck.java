package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC70003Ck {
    public static final void A00(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        A02(fragmentActivity, abstractC59962oe, userSession, C25069B7q.A00);
    }

    public static final void A02(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A00.ARD();
        ARD.E7G("preference_push_permission_dialog_impression_timestamp", currentTimeMillis);
        ARD.apply();
        AbstractC23451Ch.A04(fragmentActivity, new C36164Fxe(abstractC59962oe, userSession, A00, interfaceC16820sZ), "android.permission.POST_NOTIFICATIONS");
    }

    public static final boolean A03(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && !AbstractC23451Ch.A07(context, "android.permission.POST_NOTIFICATIONS")) {
            return true;
        }
        return false;
    }

    public static final void A01(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        A02(fragmentActivity, abstractC59962oe, userSession, interfaceC16820sZ);
    }
}
