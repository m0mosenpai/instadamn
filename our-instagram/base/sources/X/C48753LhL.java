package X;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LhL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48753LhL implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final C6C9 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
    }

    @Override // X.InterfaceC50465MPt
    public final void DW3(L5X l5x) {
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C35125FeS c35125FeS = new C35125FeS(this.A00, this.A01, interfaceC11380iw, this.A03);
        C0fJ.A00((Dialog) c35125FeS.A04.getValue());
        C35125FeS.A01(c35125FeS, false);
    }

    public C48753LhL(FragmentActivity fragmentActivity, C6C9 c6c9, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A01 = c6c9;
    }
}
