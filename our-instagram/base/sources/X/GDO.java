package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class GDO implements GYB {
    public final UserSession A00;
    public final WeakReference A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        Activity activity = (Activity) this.A01.get();
        EnumC55212gM enumC55212gM = EnumC55212gM.A1L;
        String obj = uri.toString();
        UserSession userSession = this.A00;
        if (enumC55212gM.A00(userSession, obj) && activity != null) {
            String queryParameter = uri.getQueryParameter("loggingSurface");
            String queryParameter2 = uri.getQueryParameter("loggingMechanism");
            JZ8 jz8 = AbstractC47193KtS.A01;
            if (queryParameter == null) {
                queryParameter = "ig_direct";
            }
            if (queryParameter2 == null) {
                queryParameter2 = "ig_direct_avatar_qp_button";
            }
            jz8.A05(activity, userSession, queryParameter, queryParameter2);
        }
    }

    public GDO(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC25225BEi.A16(fragmentActivity);
    }
}
