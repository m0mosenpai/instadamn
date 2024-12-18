package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F19 {
    public static final ClipsFanClubMetadata A00(UserSession userSession, C47Z c47z, boolean z, boolean z2) {
        User A0Y;
        EnumC31515Dsz enumC31515Dsz;
        C14360o3.A0B(userSession, 0);
        if (z) {
            A0Y = AbstractC166997dE.A0Y(userSession);
            enumC31515Dsz = EnumC31515Dsz.A05;
        } else if (z2) {
            A0Y = AbstractC166997dE.A0Y(userSession);
            enumC31515Dsz = EnumC31515Dsz.A06;
        } else {
            if (c47z != null) {
                return c47z.A11;
            }
            return null;
        }
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(A0Y);
        if (A0M != null) {
            String fanClubId = A0M.getFanClubId();
            if (fanClubId != null) {
                return new ClipsFanClubMetadata(enumC31515Dsz, fanClubId);
            }
            throw AbstractC166987dD.A14("fanClubId is null");
        }
        throw AbstractC166987dD.A14("fanClubInfoDict is null");
    }
}
