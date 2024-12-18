package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GB9 implements GY7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC33445EqI A03;

    public GB9(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33445EqI enumC33445EqI) {
        this.A02 = userSession;
        this.A03 = enumC33445EqI;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.GY7
    public final void onFinished() {
        UserSession userSession = this.A02;
        AbstractC34356FCy.A00(userSession, this.A03);
        AbstractC31525Dt9.A08(this.A00, this.A01, userSession);
    }
}
