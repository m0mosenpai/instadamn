package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EjP extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EjP(Activity activity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str, String str2) {
        super(abstractC10360h2);
        this.A06 = str;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = user;
        this.A05 = str2;
        this.A04 = runnable;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1698820647);
        User user = this.A03;
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        Runnable runnable = this.A04;
        AbstractC35101FdC.A02(activity, str2, AbstractC31178DnM.A0e(user));
        AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, "user_sms", AbstractC31178DnM.A0g(user));
        runnable.run();
        C0f9.A0A(-827942854, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-509386754);
        int A032 = C0f9.A03(-962919502);
        String str = ((EC1) obj).A00;
        AbstractC35101FdC.A02(this.A00, this.A06, str);
        AbstractC73317Y7a.A0J(this.A01, this.A02, this.A03.getId(), this.A05, "user_sms", str);
        this.A04.run();
        C0f9.A0A(-1066464167, A032);
        C0f9.A0A(-1972980426, A03);
    }
}
