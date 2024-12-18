package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31611Dud implements InterfaceC37124GXj {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public C31611Dud(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC37124GXj
    public final void D4f(String str) {
        C63397SjR A0y = AbstractC25228BEl.A0y(this.A00, this.A01, C2Fb.A0e, str);
        A0y.A0S = "direct_bc_partnerships_inbox_header";
        A0y.A0A();
    }
}
