package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Comparator;

/* renamed from: X.D2k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29609D2k implements Comparator {
    public final /* synthetic */ C57332k8 A00;

    public C29609D2k(C57332k8 c57332k8) {
        this.A00 = c57332k8;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        UserSession userSession = this.A00.A0J;
        FollowStatus A0N = C57582kX.A00(userSession).A0N((User) obj);
        FollowStatus followStatus = FollowStatus.A05;
        boolean z = true;
        Boolean valueOf = Boolean.valueOf(AbstractC25229BEm.A1a(A0N, followStatus));
        if (C57582kX.A00(userSession).A0N((User) obj2) == followStatus) {
            z = false;
        }
        return C2BS.A00(valueOf, Boolean.valueOf(z));
    }
}
