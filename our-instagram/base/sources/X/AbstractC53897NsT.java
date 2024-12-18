package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NsT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53897NsT {
    public static final InterfaceC25221BDv A00(FragmentActivity fragmentActivity, C07X c07x, UserSession userSession, C55U c55u, AnonymousClass840 anonymousClass840) {
        C52942bb A0F;
        Class cls;
        AbstractC25233BEq.A0w(0, c55u, userSession, anonymousClass840);
        if (c55u.equals(C208509Kk.A00)) {
            A0F = MSW.A0F(new C55568Om3(userSession, anonymousClass840), fragmentActivity);
            cls = C51051Mh5.class;
        } else if (c55u instanceof C81V) {
            A0F = MSW.A0F(new Om4(fragmentActivity, c07x, userSession), fragmentActivity);
            cls = C51050Mh4.class;
        } else {
            return null;
        }
        return (InterfaceC25221BDv) A0F.A00(cls);
    }
}
