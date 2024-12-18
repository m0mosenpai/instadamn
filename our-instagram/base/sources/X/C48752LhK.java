package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LhK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48752LhK implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final C6C9 A01;
    public final UserSession A02;
    public final C4F7 A03;

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
    }

    @Override // X.InterfaceC50465MPt
    public final void DW3(L5X l5x) {
        C6C9 c6c9 = this.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        KBE kbe = new KBE();
        kbe.A01 = c6c9;
        kbe.setArguments(A0b);
        kbe.A03 = this.A03;
        LKo.A02(this.A00, kbe, AbstractC25225BEi.A0y(this.A02));
    }

    public C48752LhK(FragmentActivity fragmentActivity, C6C9 c6c9, UserSession userSession, C4F7 c4f7) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = c4f7;
        this.A01 = c6c9;
    }
}
