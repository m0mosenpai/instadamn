package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.J0k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43019J0k implements InterfaceC1119153d {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC1119153d A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    public C43019J0k(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1119153d interfaceC1119153d, User user, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = user;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = interfaceC1119153d;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        User user = this.A03;
        if (user.A26()) {
            UserSession userSession = this.A01;
            AbstractC31364DqT.A03().A01(this.A00, userSession, this.A02, user, AbstractC111324zv.A00(238));
            return;
        }
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        if (interfaceC16820sZ == null) {
            return;
        }
        interfaceC16820sZ.invoke();
    }
}
