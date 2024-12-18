package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G50 implements InterfaceC37161GYy {
    public final FragmentActivity A00;
    public final C206269Bj A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C7U0 A04;

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        return AbstractC34116F3s.A00(this.A01, this.A03, this.A04);
    }

    public G50(FragmentActivity fragmentActivity, C206269Bj c206269Bj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = c7u0;
        this.A01 = c206269Bj;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        return C32073E6z.A00(this, 25, R.drawable.instagram_link_pano_outline_24, 2131963328);
    }
}
