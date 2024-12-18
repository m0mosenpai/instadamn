package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.70N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70N implements C70O {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass708 A02;
    public final UserDetailFragment A03;
    public final UserDetailTabController A04;

    @Override // X.AnonymousClass709
    public final InterfaceC151446rm BhX() {
        return this.A02.BhX();
    }

    @Override // X.C70A
    public final AnonymousClass741 BiC() {
        return this.A02.BiC();
    }

    @Override // X.C70B
    public final InterfaceC1570073e BxR() {
        return this.A02.BxR();
    }

    public C70N(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass708 anonymousClass708, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController) {
        this.A04 = userDetailTabController;
        this.A03 = userDetailFragment;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = anonymousClass708;
    }
}
