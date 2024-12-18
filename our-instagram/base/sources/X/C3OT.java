package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3OT, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OT {
    public static final int A00(UserSession userSession, C3G4 c3g4) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3g4, 1);
        C3G2 c3g2 = C3G2.A1L;
        C3G2 c3g22 = c3g4.A04;
        if (c3g2 == c3g22) {
            if (C25371Lr.A00(AbstractC25351Lp.A00(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36321988667058106L)) {
                return 11;
            }
            if (C25371Lr.A00(AbstractC25351Lp.A00(userSession))) {
                return 3;
            }
        }
        if (c3g4.A03()) {
            if (C18U.A06(C06090Tz.A05, userSession, 36325626503836890L)) {
                return 0;
            }
            return 2;
        }
        if (C3G2.A1G == c3g22) {
            return 4;
        }
        if (C3G2.A1F == c3g22) {
            return 7;
        }
        if (C3G2.A06 == c3g22) {
            return 5;
        }
        if (AbstractC70833Fv.A00(userSession).A01()) {
            Reel reel = c3g4.A03;
            if (reel.A0o() || reel.getId().equals("election:rollcall_v2")) {
                return 10;
            }
        }
        return 0;
    }

    public static final String A01(UserSession userSession, C3G4 c3g4) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3g4, 1);
        int A00 = A00(userSession, c3g4);
        if (A00 != 0) {
            switch (A00) {
                case 2:
                    return "livewith";
                case 3:
                    return "story_with_preview";
                case 4:
                    return "stories_netego";
                case 5:
                    return "ads_history_story_unit";
                case 6:
                    return "stories_tray_loading_spinner";
                case 7:
                    return "highlight_in_feed";
                case 8:
                    return "see_all_stories_button";
                case 9:
                    return "stories_tray_end_card";
                case 10:
                    return "live_roll_call";
                case 11:
                    return "story_top_tray_preview";
                default:
                    return null;
            }
        }
        return "story";
    }
}
