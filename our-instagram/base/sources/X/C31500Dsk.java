package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Locale;

/* renamed from: X.Dsk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31500Dsk {
    public final UserSession A00;
    public final C1GL A01;

    public C31500Dsk(UserSession userSession, C1GL c1gl) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c1gl;
    }

    public static final String A00(C31500Dsk c31500Dsk) {
        UserSession userSession = c31500Dsk.A00;
        String str = "";
        for (String str2 : ((C17110t6) C0BQ.A00(userSession)).BOc(null)) {
            if (!C14360o3.A0K(str2, userSession.userId)) {
                if (str.length() > 0) {
                    str = AnonymousClass001.A0C(str, ',');
                }
                str = AnonymousClass001.A0R(str, str2);
            }
        }
        return str;
    }

    public final void A01(C1P1 c1p1, Integer num) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("business/account/set_onboarding_checklist_manual_status/");
        String A00 = F0S.A00(num);
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        C1ON A0K = AbstractC31178DnM.A0K(A0c, "checklist_item_key", AbstractC31172DnG.A16(locale, A00));
        if (c1p1 != null) {
            A0K.A00 = c1p1;
        }
        this.A01.schedule(A0K);
    }

    public final void A02(C1P1 c1p1, String str) {
        C1GL c1gl = this.A01;
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A00);
        A0M.A0B("business/account/get_onboarding_checklist/");
        A0M.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0M.A9s("logged_in_user_ids", A00(this));
        A0M.A0R(C31505Dsp.class, C31504Dso.class);
        AbstractC31175DnJ.A1L(A0M, c1p1, c1gl);
    }
}
