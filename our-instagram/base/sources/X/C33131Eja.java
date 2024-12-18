package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33131Eja extends ETO {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33131Eja(Activity activity, Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, Runnable runnable, String str, String str2) {
        super(context, null, abstractC10360h2, false);
        this.A06 = str;
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = c41181vS;
        this.A05 = str2;
        this.A04 = runnable;
    }

    @Override // X.ETO, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-54525093);
        super.onFail(abstractC115105If);
        AbstractC73317Y7a.A0H(this.A02, this.A01, this.A03.A0j, this.A05, "user_sms", abstractC115105If.A01());
        this.A04.run();
        C0f9.A0A(-840186456, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(58596796);
        int A032 = C0f9.A03(-327715480);
        String str = ((EC2) obj).A00;
        AbstractC35101FdC.A02(this.A00, this.A06, str);
        AbstractC73317Y7a.A0J(this.A02, this.A01, this.A03.A0j, this.A05, "user_sms", str);
        this.A04.run();
        C0f9.A0A(1297840931, A032);
        C0f9.A0A(-1082803575, A03);
    }
}
