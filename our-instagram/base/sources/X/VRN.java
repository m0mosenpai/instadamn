package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VRN {
    public static final void A00(BaseFragmentActivity baseFragmentActivity, UserSession userSession, String str) {
        Bundle A0E = AbstractC31174DnI.A0E(userSession, 2);
        A0E.putString("entryPoint", str);
        A0E.putString("igUserID", userSession.userId);
        A0E.putString("waterfallID", C70399WUb.A00(userSession).A03);
        AbstractC27401Ut.getInstance();
        C64501TGn A00 = new C64501TGn(userSession).A00(A0E);
        A00.A01(AbstractC111324zv.A00(596));
        A00.EqV(baseFragmentActivity).A04();
    }
}
