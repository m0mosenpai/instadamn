package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EjO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33120EjO extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33120EjO(Activity activity, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Runnable runnable, String str, String str2, String str3) {
        super(abstractC10360h2);
        this.A06 = str;
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = runnable;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-271924186);
        AbstractC73317Y7a.A0H(this.A02, this.A01, this.A04, this.A05, "user_sms", abstractC115105If.A01());
        this.A03.run();
        C0f9.A0A(356189763, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1958142686);
        int A032 = C0f9.A03(1557392262);
        String str = ((C32173EBu) obj).A00;
        AbstractC166987dD.A0b().putString("android.intent.extra.TEXT", str);
        AbstractC35101FdC.A02(this.A00, this.A06, str);
        AbstractC73317Y7a.A0J(this.A02, this.A01, this.A04, this.A05, "user_sms", str);
        this.A03.run();
        C0f9.A0A(-1457018048, A032);
        C0f9.A0A(-818021575, A03);
    }
}
