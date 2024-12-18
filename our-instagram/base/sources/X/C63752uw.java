package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.2uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63752uw {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C63742uv A03;
    public final String A04;
    public final java.util.Set A05;

    public C63752uw(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63742uv c63742uv, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = interfaceC11380iw;
        this.A04 = str;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A05 = new HashSet();
        this.A03 = c63742uv;
    }

    public final void A00() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A08();
        c140966Yy.A0D(MUK.A00(userSession, this.A04, false, true, false, false, false));
        c140966Yy.A04();
    }

    public final void A01(String str) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A08();
        c140966Yy.A0D(AbstractC31364DqT.A03().A01.A02(userSession, AbstractC31402Dr6.A01(userSession, str, MSV.A00(441), this.A04).A03()));
        c140966Yy.A04();
    }
}
