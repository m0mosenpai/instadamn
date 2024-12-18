package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Kl6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46689Kl6 {
    public static final void A00(Activity activity, Context context, EnumC33503Erc enumC33503Erc, C22P c22p, UserSession userSession, C60322pF c60322pF) {
        AbstractC25233BEq.A0x(0, userSession, c22p, c60322pF);
        C47788L8u A00 = Kl7.A00(userSession);
        String obj = enumC33503Erc.toString();
        if (A00.A00 == 0) {
            C24Q c24q = A00.A03;
            long A03 = c24q.A03(246622982, 20000L);
            A00.A00 = A03;
            c24q.A0A(A03, AbstractC111324zv.A00(3832), String.valueOf(obj));
        }
        AbstractC60332pG.A00(context, userSession, c60322pF).A02();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putSerializable("CAMERA_ACR_BROWSER_ENTRY_POINT_ARGS", enumC33503Erc);
        A05.putSerializable("CAMERA_ENTRY_POINT_ARGS", c22p);
        C6XJ A02 = C6XJ.A02(activity, A05, userSession, ModalActivity.class, "clips_acr_browser");
        A02.A07();
        A02.A0C(context);
    }
}
