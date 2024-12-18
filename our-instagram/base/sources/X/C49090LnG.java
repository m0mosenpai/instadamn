package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LnG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49090LnG implements InterfaceC165187a7 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;

    public C49090LnG(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 3);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC08830cm;
    }

    @Override // X.InterfaceC165187a7
    public final boolean Cog() {
        return AbstractC34068F1w.A00(this.A00, this.A01, (C3o9) this.A02.get());
    }
}
