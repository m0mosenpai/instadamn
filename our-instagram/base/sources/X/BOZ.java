package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "This class is being replace with Follow Action Handlers in MVVM")
/* loaded from: classes5.dex */
public final class BOZ implements InterfaceC77483dY {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C38321qM A03;
    public final C26914BuH A04;
    public final InterfaceC16820sZ A05;

    public BOZ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C26914BuH c26914BuH, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25229BEm.A1I(interfaceC11380iw, 3, interfaceC16820sZ);
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A04 = c26914BuH;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        C38321qM c38321qM = this.A03;
        if (c38321qM != null) {
            InterfaceC11380iw interfaceC11380iw = this.A01;
            if (interfaceC11380iw instanceof AbstractC59962oe) {
                UserSession userSession = this.A02;
                AbstractC37802GkH.A00(MusicPageTabType.A04, userSession).A01(AbstractC25226BEj.A0u(c38321qM), userSession, "follow_creator", interfaceC11380iw.getModuleName());
            }
        }
        this.A05.invoke();
        UserSession userSession2 = this.A02;
        boolean z = false;
        int i = 2131976085;
        if (C57582kX.A00(userSession2).A0N(user) == FollowStatus.A05) {
            z = true;
            i = 2131962763;
        }
        Context context = this.A00;
        String A0f = AbstractC167007dF.A0f(context, user.getUsername(), i);
        C14360o3.A07(A0f);
        C9GR.A09(context, A0f);
        if (z) {
            AbstractC54029Nuf.A00(userSession2).A01();
            C26914BuH c26914BuH = this.A04;
            if (c26914BuH != null) {
                C26914BuH.A02(c26914BuH, C05F.A00, AbstractC25231BEo.A0s(c38321qM));
            }
        }
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }
}
