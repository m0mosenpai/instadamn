package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IQQ {
    public static final void A00(Context context, UserSession userSession, C38321qM c38321qM) {
        boolean A1V = AbstractC167007dF.A1V(c38321qM);
        c38321qM.A4R(false);
        if (c38321qM.A6F()) {
            c38321qM.A0C.ER7(Boolean.valueOf(A1V));
        }
        c38321qM.AEH(userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("media/%s/enable_comments/", c38321qM.getId());
        C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
        C37460Gee.A00(A0Q, context, userSession, c38321qM, 4);
        C1GJ.A03(A0Q);
    }

    public static final void A01(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        boolean A1V = AbstractC167007dF.A1V(c38321qM);
        C14360o3.A0B(c75113Zb, 3);
        c38321qM.A4R(A1V);
        if (c38321qM.A6F()) {
            c38321qM.A0C.ER7(false);
        }
        c75113Zb.A3D = false;
        c38321qM.AEH(userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("media/%s/disable_comments/", c38321qM.getId());
        C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
        C37460Gee.A00(A0Q, context, userSession, c38321qM, 3);
        C1GJ.A03(A0Q);
    }
}
