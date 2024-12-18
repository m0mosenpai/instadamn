package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ej6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33102Ej6 extends ET4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33102Ej6(Activity activity, Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Runnable runnable, String str, String str2) {
        super(context, abstractC10360h2);
        this.A02 = c38321qM;
        this.A01 = userSession;
        this.A06 = str;
        this.A00 = activity;
        this.A03 = interfaceC60442pS;
        this.A05 = str2;
        this.A04 = runnable;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-464760075);
        int A032 = C0f9.A03(-1606603294);
        String str = ((EC0) obj).A00;
        C38321qM c38321qM = this.A02;
        UserSession userSession = this.A01;
        String A01 = AbstractC31510Dsu.A01(userSession, c38321qM, str);
        AbstractC35101FdC.A02(this.A00, this.A06, A01);
        AbstractC73317Y7a.A0I(this.A03, userSession, null, c38321qM.getId(), this.A05, "user_sms", str, null, AbstractC25226BEj.A1G(c38321qM), null, null);
        this.A04.run();
        C0f9.A0A(-1274913747, A032);
        C0f9.A0A(-1815018267, A03);
    }

    @Override // X.ET4, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-437950725);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C38321qM c38321qM = this.A02;
        String str = this.A05;
        Throwable A01 = abstractC115105If.A01();
        Runnable runnable = this.A04;
        String id = c38321qM.getId();
        id.getClass();
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, id, str, "user_sms", A01);
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-1173491653, A03);
    }
}
