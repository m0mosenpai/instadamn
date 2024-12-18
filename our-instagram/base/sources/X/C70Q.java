package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.70Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70Q implements InterfaceC60092or, C70R {
    public final FragmentActivity A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C152336tJ A04;
    public final C70D A05;
    public final C53I A06;
    public final UserDetailFragment A07;
    public final MUB A08;
    public final C70P A09;
    public final String A0A;
    public final String A0B;
    public final AnonymousClass708 A0C;

    @Override // X.C70R
    public final void D3X(User user) {
        C14360o3.A0B(user, 0);
        if (this.A07.isResumed()) {
            this.A0C.BiC().D3x(user, "user_profile_top_bar", false);
        }
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        this.A07.EMT();
    }

    public C70Q(FragmentActivity fragmentActivity, C18920wW c18920wW, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C152336tJ c152336tJ, C70D c70d, C53I c53i, AnonymousClass708 anonymousClass708, UserDetailFragment userDetailFragment, MUB mub, C70P c70p, String str, String str2) {
        this.A08 = mub;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A06 = c53i;
        this.A05 = c70d;
        this.A07 = userDetailFragment;
        this.A0A = str;
        this.A0B = str2;
        this.A04 = c152336tJ;
        this.A01 = c18920wW;
        this.A03 = interfaceC60442pS;
        this.A0C = anonymousClass708;
        this.A09 = c70p;
    }
}
