package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.3Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73983Tk {
    public static final String A00(UserSession userSession, C3G4 c3g4) {
        User CDj;
        Reel reel = c3g4.A03;
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            if (C05F.A01 == c1nb.CBs() && (CDj = c1nb.CDj()) != null) {
                if (!c3g4.A01().isEmpty() && !C2TN.A04(userSession, CDj) && FollowStatus.A05 != CDj.B7L()) {
                    CDj = (User) new ArrayList(c3g4.A01()).get(0);
                }
                return CDj.getUsername();
            }
            return c1nb.getName();
        }
        String str = reel.A1o;
        C14360o3.A07(str);
        C0w9.A03("ReelItemLabelUtil", AnonymousClass001.A0R("Tried to get username for reel with no owner, reel id: ", str));
        return null;
    }
}
