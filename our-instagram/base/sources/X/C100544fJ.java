package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100544fJ {
    public final InterfaceC75453aC A00;

    public final C76593c4 A00(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320184780267644L);
        List A3t = c38321qM.A3t(userSession);
        if (A06) {
            A3t = AbstractC001800i.A0g(A3t, new Comparator() { // from class: X.4fK
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    User user = (User) obj2;
                    FollowStatus followStatus = null;
                    if (user != null) {
                        followStatus = user.B7L();
                    }
                    FollowStatus followStatus2 = FollowStatus.A05;
                    boolean z = true;
                    boolean z2 = false;
                    if (followStatus == followStatus2) {
                        z2 = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    User user2 = (User) obj;
                    if (user2 == null || user2.B7L() != followStatus2) {
                        z = false;
                    }
                    return C2BS.A00(valueOf, Boolean.valueOf(z));
                }
            });
        }
        int i = 2;
        if (C18U.A06(c06090Tz, userSession, 36330643025576913L)) {
            i = 1;
        }
        return new C76593c4(c38321qM, c75113Zb, A3t, i);
    }

    public C100544fJ(InterfaceC75453aC interfaceC75453aC) {
        this.A00 = interfaceC75453aC;
    }
}
