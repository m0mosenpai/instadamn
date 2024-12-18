package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HbL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39433HbL extends AbstractC77473dX {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC144936gD A02;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC110564yT A03;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHr(User user) {
        C14360o3.A0B(user, 0);
        if (!user.CQf()) {
            this.A03.A04(this.A00, this.A01, user);
        } else {
            InterfaceC144936gD interfaceC144936gD = this.A02;
            if (interfaceC144936gD == null) {
                return;
            }
            interfaceC144936gD.DHm();
        }
    }

    public C39433HbL(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC144936gD interfaceC144936gD, ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
        this.A02 = interfaceC144936gD;
        this.A03 = viewOnAttachStateChangeListenerC110564yT;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHs(User user) {
        InterfaceC144936gD interfaceC144936gD = this.A02;
        if (interfaceC144936gD != null) {
            interfaceC144936gD.DHn(true);
        }
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
        InterfaceC144936gD interfaceC144936gD = this.A02;
        if (interfaceC144936gD != null) {
            interfaceC144936gD.DHm();
        }
    }
}
