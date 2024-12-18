package X;

import com.instagram.user.model.FollowStatus;

/* loaded from: classes5.dex */
public abstract class CKG {
    public static final BJ3 A00(FollowStatus followStatus) {
        int ordinal = followStatus.ordinal();
        if (ordinal != 4) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        return BJ3.A0D;
                    }
                    return BJ3.A0A;
                }
                return BJ3.A03;
            }
            return BJ3.A07;
        }
        return BJ3.A09;
    }
}
