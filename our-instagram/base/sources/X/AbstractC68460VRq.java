package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VRq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68460VRq {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        String str2 = userSession.userId;
        C14360o3.A0B(str2, 0);
        String A0u = AnonymousClass001.A0u("instagram://accountquality/?actor_id=", str2, "&source=", str);
        C14H A00 = C14H.A03.A00();
        android.net.Uri A03 = AbstractC08820cl.A03(A0u);
        C14360o3.A07(A03);
        C12260kU.A0C(fragmentActivity, A00.A04(fragmentActivity, A03));
    }
}
