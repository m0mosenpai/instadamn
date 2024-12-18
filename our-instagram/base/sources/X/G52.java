package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* loaded from: classes6.dex */
public final class G52 implements InterfaceC37161GYy {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C32056E6i A03;
    public final Capabilities A04;
    public final boolean A05;

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        Capabilities capabilities = this.A04;
        C32056E6i c32056E6i = this.A03;
        boolean z = this.A05;
        if (!c32056E6i.A0M && capabilities.A00(EnumC2054697t.A1A) && c32056E6i.A0O && !z) {
            return true;
        }
        return false;
    }

    public G52(FragmentActivity fragmentActivity, C206269Bj c206269Bj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C7U0 c7u0, boolean z) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = capabilities;
        this.A05 = z;
        this.A01 = interfaceC11380iw;
        this.A03 = C35252Fgl.A00(c206269Bj, userSession, c7u0);
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        int i = 2131968875;
        if (C18U.A06(C06090Tz.A05, this.A02, 36324514107240662L)) {
            i = 2131968874;
        }
        return C32073E6z.A00(this, 22, R.drawable.instagram_user_follow_pano_outline_24, i);
    }
}
