package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ej9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33105Ej9 extends ET4 {
    public final /* synthetic */ AbstractC10360h2 A00;
    public final /* synthetic */ C2n2 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33105Ej9(Context context, AbstractC10360h2 abstractC10360h2, AbstractC10360h2 abstractC10360h22, C2n2 c2n2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Boolean bool, Runnable runnable, String str, String str2) {
        super(context, abstractC10360h2);
        this.A08 = str;
        this.A03 = c38321qM;
        this.A07 = str2;
        this.A04 = interfaceC60442pS;
        this.A02 = userSession;
        this.A05 = bool;
        this.A06 = runnable;
        this.A01 = c2n2;
        this.A00 = abstractC10360h22;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1101081216);
        int A032 = C0f9.A03(282927703);
        String str = ((EC0) obj).A00;
        String str2 = this.A08;
        C38321qM c38321qM = this.A03;
        String str3 = this.A07;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        Boolean bool = this.A05;
        Runnable runnable = this.A06;
        this.A01.apply(str);
        if (bool.booleanValue()) {
            String id = c38321qM.getId();
            id.getClass();
            AbstractC73317Y7a.A0I(interfaceC60442pS, userSession, null, id, str3, str2, str, AbstractC25226BEj.A1G(c38321qM), null, null, null);
        }
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-482742459, A032);
        C0f9.A0A(222916856, A03);
    }

    @Override // X.ET4, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-749527475);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C38321qM c38321qM = this.A03;
        String str = this.A07;
        String str2 = this.A08;
        Throwable A01 = abstractC115105If.A01();
        Runnable runnable = this.A06;
        String id = c38321qM.getId();
        id.getClass();
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, id, str, str2, A01);
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-101419260, A03);
    }

    @Override // X.ET4, X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1300397324);
        final AbstractC10360h2 abstractC10360h2 = this.A00;
        C11T.A03(new Runnable() { // from class: X.GN8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63248Sg4.A01(AbstractC10360h2.this);
            }
        });
        C0f9.A0A(1103857409, A03);
    }
}
