package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KrG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47059KrG {
    public static final void A00(Activity activity, EnumC50631MWs enumC50631MWs, UserSession userSession, MQB mqb) {
        boolean A1R = AbstractC167007dF.A1R(0, activity, userSession);
        KDG kdg = new KDG();
        kdg.A00 = mqb;
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putSerializable("TRENDING_PROMPTS_CAMERA_SURFACE_ARG", enumC50631MWs);
        kdg.setArguments(A0b);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0T = kdg;
        A0y.A03 = 0.85f;
        A0y.A1E = A1R;
        A0y.A06 = activity.getColor(R.color.background);
        A0y.A1O = false;
        AbstractC25225BEi.A1Q(A0y, A1R);
        A0y.A0x = A1R;
        AbstractC31173DnH.A0w(activity, kdg, A0y);
    }
}
