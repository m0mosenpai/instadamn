package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.5G2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5G2 implements InterfaceC12870lZ, InterfaceC13000lm {
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02;
    public final java.util.Set A03;
    public final UserSession A04;

    public C5G2(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        C218914p.A04(EnumC220415e.A02, this, false, true);
        this.A03 = new LinkedHashSet();
        this.A02 = new LinkedHashSet();
    }

    public final boolean A00(String str) {
        if (this.A01) {
            return true;
        }
        if (str == null) {
            return !this.A00;
        }
        boolean z = this.A00;
        java.util.Set set = this.A02;
        boolean z2 = !set.isEmpty();
        if (z) {
            if (!z2) {
                return false;
            }
        } else if (!z2) {
            return true;
        }
        if (!set.contains(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A04.A03(getClass());
        this.A00 = false;
        this.A01 = false;
        this.A02.clear();
        this.A03.clear();
        C218914p.A07(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(329156507);
        this.A01 = true;
        C0f9.A0A(625602775, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1975075835, C0f9.A03(1523841925));
    }
}
