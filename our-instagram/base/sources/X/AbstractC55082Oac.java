package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* renamed from: X.Oac, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55082Oac {
    public final UserSession A00;

    public final C51754Mtd A02() {
        if (this instanceof C52458NJc) {
            AbstractC193598he abstractC193598he = (AbstractC193598he) ((C52458NJc) this).A06.getValue();
            if (abstractC193598he.A00 == 3) {
                return (C51754Mtd) abstractC193598he.A00();
            }
        }
        return new C51754Mtd(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, true, false, false, false, false, false, false, false, false, true, false, false, true, true);
    }

    public final EnumC53117NeU A03() {
        if (this instanceof C52457NJb) {
            return EnumC53117NeU.A02;
        }
        return EnumC53117NeU.A03;
    }

    public AbstractC55082Oac(UserSession userSession) {
        this.A00 = userSession;
    }

    public static C47Z A00(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A01(followersShareFragment).A04();
    }

    public static C47Z A01(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A01(followersShareFragment).A00;
    }
}
