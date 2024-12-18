package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Hwu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40465Hwu {
    public static final void A00(Activity activity, Bundle bundle, EnumC114925Hg enumC114925Hg, EnumC223429tZ enumC223429tZ, C22P c22p, EnumC50631MWs enumC50631MWs, UserSession userSession, Integer num, String str) {
        AbstractC25233BEq.A0v(0, userSession, activity, str);
        C14360o3.A0B(enumC50631MWs, 7);
        C6XJ A0L = AbstractC31171DnF.A0L(activity, bundle, userSession, ModalActivity.class, "effects_page");
        if (num == C05F.A00) {
            A0L.A08();
        } else {
            A0L.A07();
        }
        A0L.A0C(activity);
        C4T4.A00(userSession).Cj2(enumC114925Hg, enumC223429tZ, c22p, enumC50631MWs, str);
    }
}
