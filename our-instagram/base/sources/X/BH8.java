package X;

import com.instagram.user.model.FollowStatus;

/* loaded from: classes5.dex */
public abstract class BH8 {
    public static final BJ3 A00(FollowStatus followStatus, Boolean bool) {
        if (followStatus != null) {
            int ordinal = followStatus.ordinal();
            if (ordinal != 4) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            return BJ3.A0A;
                        }
                    } else {
                        if (AbstractC166997dE.A1Z(bool, true)) {
                            return BJ3.A05;
                        }
                        return BJ3.A03;
                    }
                } else {
                    return BJ3.A07;
                }
            } else {
                return BJ3.A04;
            }
        }
        return BJ3.A0D;
    }
}
