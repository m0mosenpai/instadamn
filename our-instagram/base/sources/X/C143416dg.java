package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143416dg implements InterfaceC147946lQ {
    public final UserSession A00;
    public final InterfaceC1118853a A01;

    public C143416dg(UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC1118853a;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC147946lQ
    public final boolean CoF(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
        return false;
    }

    @Override // X.InterfaceC147946lQ
    public final void Dc1(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
        User CDj;
        C143556du c143556du;
        C6e7 c6e7;
        View view;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c141596ac, 2);
        C1NB c1nb = c41551w4.A0H.A0W;
        if (c1nb != null && (CDj = c1nb.CDj()) != null && f >= 0.02d && !c141596ac.A14) {
            UserSession userSession = this.A00;
            if (AbstractC140926Yu.A00(userSession, CDj)) {
                c141596ac.A14 = true;
                InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) this.A01).mViewPager;
                Object obj = null;
                if (interfaceC147266kB != null && (view = ((C147256kA) interfaceC147266kB).A04.A0F) != null) {
                    obj = view.getTag();
                }
                if ((obj instanceof C143556du) && (c143556du = (C143556du) obj) != null && (c6e7 = c143556du.A1e) != null) {
                    InterfaceC56392iX interfaceC56392iX = c6e7.A1b;
                    if (interfaceC56392iX.CWW()) {
                        BP5.A00(new BP5(userSession, "story-reply-sparkle"), AbstractC003100w.A0k(10, CDj.getId()), "story_reply_message_ai_impression");
                        ImageView imageView = (ImageView) interfaceC56392iX.getView();
                        D8P d8p = new D8P(19, c141596ac, this, CDj);
                        C14360o3.A0B(imageView, 0);
                        AnonymousClass693 A00 = C68U.A00(imageView.getContext(), R.raw.story_reply_sparkle_animation);
                        imageView.setImageDrawable(A00);
                        if (A00 != null) {
                            A00.A8x(new C66296U7u(d8p));
                            A00.E4S();
                        }
                    }
                }
            }
        }
    }
}
