package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EjM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33118EjM extends AbstractC32533EUj {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33118EjM(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str) {
        super(abstractC10360h2);
        this.A00 = fragment;
        this.A03 = user;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = runnable;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-607518020);
        User user = this.A03;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String str = this.A05;
        Fragment fragment = this.A00;
        Throwable A01 = abstractC115105If.A01();
        Runnable runnable = this.A04;
        AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, "system_share_sheet", A01);
        AbstractC31510Dsu.A0S(AbstractC166987dD.A0b(), fragment, interfaceC11380iw, userSession, user, runnable, AbstractC31178DnM.A0e(user), str);
        C0f9.A0A(1886790630, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1478456557);
        EC1 ec1 = (EC1) obj;
        int A032 = C0f9.A03(1907058225);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("android.intent.extra.TEXT", ec1.A00);
        String str = ec1.A00;
        Fragment fragment = this.A00;
        User user = this.A03;
        UserSession userSession = this.A02;
        AbstractC31510Dsu.A0S(A0b, fragment, this.A01, userSession, user, this.A04, str, this.A05);
        C0f9.A0A(-2103022934, A032);
        C0f9.A0A(-939839015, A03);
    }
}
