package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.JUj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43699JUj extends AbstractC46524KiP {
    public LI8 A00;
    public C45078Jx7 A01;
    public final UserSession A02;
    public final C50570MUb A03;
    public final JUk A04;
    public final C31320Dpg A05;
    public final C164387Xb A06;
    public final C23031Ai A07;

    public static final void A00(C43699JUj c43699JUj) {
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) c43699JUj).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        C23031Ai c23031Ai = c43699JUj.A07;
        C45078Jx7 c45078Jx7 = c43699JUj.A01;
        if (c45078Jx7 != null) {
            c23031Ai.A0x(String.valueOf(c45078Jx7.A00));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C43699JUj(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A07 = AbstractC23021Ah.A00(userSession);
        this.A03 = new C50570MUb(fragmentActivity, interfaceC11380iw, userSession);
        this.A04 = new JUk(interfaceC11380iw, userSession);
        this.A05 = new C31320Dpg(fragmentActivity, interfaceC11380iw, userSession);
        this.A06 = AbstractC164377Xa.A00(userSession);
    }
}
