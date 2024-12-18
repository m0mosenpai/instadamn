package X;

import com.instagram.user.model.FollowStatus;

/* renamed from: X.1rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38871rK {
    public static final FollowStatus A00(String str) {
        FollowStatus followStatus = (FollowStatus) FollowStatus.A01.get(str);
        if (followStatus == null) {
            return FollowStatus.A09;
        }
        return followStatus;
    }
}
