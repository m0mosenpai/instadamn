package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gf1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37483Gf1 {
    public static final void A01(Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        AbstractC167017dG.A1N(fragment, userSession);
        c38321qM.A0C.ERa(C16930sl.A00);
        c38321qM.AEH(userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("users/unpin_timeline_media/");
        AbstractC31173DnH.A1N(A0c);
        A0c.A9s("post_id", c38321qM.A2u());
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "profile_tab", "clips");
        A0T.A00 = C41602Iaq.A00(fragment, new GSw(userSession, 36), new C57255Pbd(48, c38321qM, userSession), 2131976185, R.drawable.instagram_unpin_pano_outline_24, 2131976181, 2131976183);
        C1GJ.A03(A0T);
    }

    public static final void A00(Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        AbstractC167017dG.A1N(fragment, userSession);
        AbstractC25651Mw.A00(userSession).E4s(new C154086wI(new C30184DRp(45, c38321qM, fragment, userSession)));
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        AbstractC167017dG.A1N(userSession, c38321qM);
        if (c38321qM.A5P() && !c38321qM.A5H() && !c38321qM.A60() && c38321qM.A2O() != C05F.A0C && C2TN.A02(userSession, c38321qM) && c38321qM.A0C.BAR() == null && C18U.A06(C06090Tz.A05, userSession, 36316963554726634L)) {
            return true;
        }
        return false;
    }
}
