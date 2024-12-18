package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.FAh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34287FAh {
    public static final boolean A00(UserSession userSession, Reel reel) {
        if (reel.getId().equals("election:rollcall_v2") && !AbstractC70833Fv.A00(userSession).A03) {
            return true;
        }
        return false;
    }
}
