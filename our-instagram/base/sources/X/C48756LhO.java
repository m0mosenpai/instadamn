package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LhO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48756LhO implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C47364KwD A03;
    public final C4F7 A04;

    public C48756LhO(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47364KwD c47364KwD, C4F7 c4f7) {
        C14360o3.A0B(c4f7, 3);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = c4f7;
        this.A01 = interfaceC11380iw;
        this.A03 = c47364KwD;
    }

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
    }

    @Override // X.InterfaceC50465MPt
    public final void DW3(L5X l5x) {
        C14360o3.A0B(l5x, 0);
        KDQ kdq = new KDQ();
        kdq.A0J = l5x;
        kdq.A0K = this.A04;
        kdq.A0L = new KzY(l5x, this);
        FragmentActivity fragmentActivity = this.A00;
        C189448aO A0y = AbstractC25225BEi.A0y(this.A02);
        boolean z = l5x.A0J;
        A0y.A1O = z;
        A0y.A1F = !z;
        A0y.A0U = kdq;
        LKo.A02(fragmentActivity, kdq, A0y);
    }
}
