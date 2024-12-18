package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IQR {
    public static final void A00(Context context, UserSession userSession, C38321qM c38321qM, int i, boolean z) {
        c38321qM.A0C.EY7(Boolean.valueOf(z));
        c38321qM.AEH(userSession);
        boolean A68 = c38321qM.A68();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("media/update_like_and_view_counts_visibility/");
        A0c.A0I("like_and_view_counts_disabled", z);
        A0c.A0I("share_count_disabled", A68);
        C1ON A0K = AbstractC31178DnM.A0K(A0c, "media_id", c38321qM.getId());
        A0K.A00 = new HG5(context, userSession, c38321qM, new C50168MDv(29, c38321qM, z), i, 0);
        C1GJ.A03(A0K);
    }

    public static final void A01(Context context, UserSession userSession, C38321qM c38321qM, int i, boolean z) {
        c38321qM.A0C.Edq(Boolean.valueOf(z));
        c38321qM.AEH(userSession);
        boolean A5k = c38321qM.A5k();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("media/update_like_and_view_counts_visibility/");
        A0c.A0I("like_and_view_counts_disabled", A5k);
        A0c.A0I("share_count_disabled", z);
        C1ON A0K = AbstractC31178DnM.A0K(A0c, "media_id", c38321qM.getId());
        A0K.A00 = new HG5(context, userSession, c38321qM, new C50168MDv(30, c38321qM, z), i, 0);
        C1GJ.A03(A0K);
    }
}
