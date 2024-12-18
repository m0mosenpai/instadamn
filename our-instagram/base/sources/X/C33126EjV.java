package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EjV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33126EjV extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C2n2 A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33126EjV(Activity activity, AbstractC10360h2 abstractC10360h2, C2n2 c2n2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Boolean bool, String str, String str2, boolean z) {
        super(abstractC10360h2);
        this.A08 = z;
        this.A01 = c2n2;
        this.A05 = bool;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = user;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = activity;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1336804254);
        User user = this.A04;
        Activity activity = this.A00;
        activity.getClass();
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String str = this.A06;
        Throwable A01 = abstractC115105If.A01();
        String str2 = this.A07;
        AbstractC13900nG.A01(activity, AbstractC31178DnM.A0e(user), null);
        C9GR.A07(activity, 2131965226);
        AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, str2, A01);
        C0f9.A0A(-954114573, A03);
    }

    @Override // X.AbstractC32533EUj, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(730815253);
        if (!this.A08) {
            super.onStart();
        }
        C0f9.A0A(2040332225, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(248457953);
        EC1 ec1 = (EC1) obj;
        int A032 = C0f9.A03(-2124532735);
        this.A01.apply(ec1.A00);
        if (this.A05.booleanValue()) {
            AbstractC73317Y7a.A0J(this.A02, this.A03, this.A04.getId(), this.A06, this.A07, ec1.A00);
        }
        C0f9.A0A(1421735779, A032);
        C0f9.A0A(362323121, A03);
    }
}
