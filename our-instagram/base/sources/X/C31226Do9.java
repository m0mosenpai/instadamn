package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Do9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31226Do9 {
    public AbstractC59962oe A00;
    public C38E A01;
    public C31559Dtj A02;
    public final Runnable A03;
    public final UserSession A04;

    public static Reel A01(UserSession userSession, AbstractC46458KhI abstractC46458KhI) {
        Reel A0L;
        if (abstractC46458KhI == null) {
            return null;
        }
        if (abstractC46458KhI instanceof C31229DoC) {
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36318771735960030L) || (A0L = ReelStore.A03(userSession).A0L(((C31229DoC) abstractC46458KhI).A00.getId())) == null) {
                User user = ((C31229DoC) abstractC46458KhI).A00;
                C1OU c1ou = C1OU.$redex_init_class;
                C14360o3.A0B(user, 1);
                return C75653aW.A03(userSession, user);
            }
            return A0L;
        }
        throw new IllegalStateException("Unknown ReelForThreadData type");
    }

    public final void A02(Reel reel, C3G2 c3g2, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        RectF avatarBounds = gradientSpinnerAvatarView.getAvatarBounds();
        C31559Dtj c31559Dtj = this.A02;
        if (c31559Dtj == null) {
            this.A02 = new C31559Dtj(this.A00.getActivity(), avatarBounds, new GF3(this, 1));
        } else if (!AbstractC31174DnI.A0A(gradientSpinnerAvatarView).equals(c31559Dtj.A00.C5U())) {
            this.A02.A0C(avatarBounds);
        }
        C38E c38e = this.A01;
        c38e.A05 = this.A02;
        List singletonList = Collections.singletonList(reel);
        c38e.A0A(reel, c3g2, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
    }

    public C31226Do9(AbstractC59962oe abstractC59962oe, UserSession userSession, Runnable runnable) {
        this.A04 = userSession;
        this.A00 = abstractC59962oe;
        this.A03 = runnable;
        C38E c38e = new C38E(abstractC59962oe, userSession, new C38C(abstractC59962oe));
        this.A01 = c38e;
        c38e.A0C = AbstractC166997dE.A0n();
    }

    public static C31229DoC A00(UserSession userSession, C2EC c2ec) {
        User user;
        if (c2ec.BSH().isEmpty()) {
            if (c2ec.CVQ() || c2ec.C7g() == 1013 || c2ec.C7g() == 1012 || c2ec.C7g() == 1014 || c2ec.CZH()) {
                return null;
            }
            return new C31229DoC(C17060sy.A01.A01(userSession));
        }
        if (c2ec.C7g() == 29 && c2ec.At5() != null && c2ec.C7L() == null && C18U.A06(C06090Tz.A05, userSession, 36319377328512320L)) {
            user = c2ec.At5();
        } else {
            if (c2ec.CVQ()) {
                return null;
            }
            user = (User) c2ec.BSH().get(0);
        }
        return new C31229DoC(user);
    }
}
