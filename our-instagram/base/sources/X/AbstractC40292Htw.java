package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.Htw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40292Htw {
    public static C68D parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Long l = null;
            Float f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_bestie".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("latest_reel_media".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("story_seen_time".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c16l, "StoryInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C68D(bool, f, l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
