package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IRb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41331IRb {
    public static final C1ON A00(Fragment fragment, UserSession userSession, String str) {
        AbstractC167017dG.A1N(fragment, userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("users/pin_timeline_media/");
        AbstractC31173DnH.A1N(A0c);
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "post_id", str);
        A0T.A00 = C41602Iaq.A00(fragment, new GSw(userSession, 32), new GSw(userSession, 33), 2131969667, R.drawable.instagram_pin_pano_outline_24, 2131969644, 2131969647);
        return A0T;
    }

    public static final C1ON A01(Fragment fragment, UserSession userSession, String str) {
        AbstractC167017dG.A1N(fragment, userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("users/unpin_timeline_media/");
        AbstractC31173DnH.A1N(A0c);
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "post_id", str);
        A0T.A00 = C41602Iaq.A00(fragment, new GSw(userSession, 34), J80.A00, 2131976185, R.drawable.instagram_unpin_pano_outline_24, 2131976181, 2131976182);
        return A0T;
    }
}
