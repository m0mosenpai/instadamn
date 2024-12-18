package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.I4w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40768I4w {
    public static final void A00(Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        AbstractC167027dH.A12(fragment, userSession, c38321qM);
        c38321qM.A0C.ERa(AbstractC166987dD.A1J(userSession.userId));
        c38321qM.AEH(userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("users/pin_timeline_media/");
        AbstractC31173DnH.A1N(A0c);
        A0c.A9s("post_id", c38321qM.A2u());
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "profile_tab", "clips");
        A0T.A00 = C41602Iaq.A00(fragment, new GSw(userSession, 35), new C57255Pbd(47, c38321qM, userSession), 2131969667, R.drawable.instagram_pin_pano_outline_24, 2131969644, 2131969649);
        C1GJ.A03(A0T);
    }
}
