package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IT4 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6ab] */
    public static final void A01(Activity activity, UserSession userSession, Reel reel, C3G2 c3g2, String str, String str2, List list, int i, boolean z, boolean z2) {
        C14360o3.A0B(c3g2, 3);
        C1OU c1ou = C1OU.$redex_init_class;
        ?? obj = new Object();
        obj.A02(userSession, reel.getId(), list);
        obj.A0C = str;
        obj.A0D = str2;
        obj.A04 = c3g2;
        AbstractC31177DnL.A1P(obj);
        obj.A00 = i;
        A00(activity, obj.A00(), userSession, reel, c3g2, z, z2);
    }

    public static final void A00(Activity activity, Bundle bundle, UserSession userSession, Reel reel, C3G2 c3g2, boolean z, boolean z2) {
        C75363a3 c75363a3;
        C105824pt c105824pt = reel.A0H;
        if (c105824pt != null) {
            c75363a3 = c105824pt.A04(userSession);
        } else {
            c75363a3 = null;
        }
        if (reel.A0d()) {
            if (c105824pt != null && c75363a3 != null) {
                C4AG.A00(userSession).A01(new C4AD(c75363a3, c3g2.A00));
            } else if (!z) {
                return;
            }
        }
        C6XJ A0L = AbstractC31171DnF.A0L(activity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(1218));
        if (z2) {
            A0L.A07();
        } else {
            A0L.A0J = ModalActivity.A08;
        }
        A0L.A0C(activity);
    }
}
