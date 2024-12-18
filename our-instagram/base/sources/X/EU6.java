package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EU6 extends C1P1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC10360h2 A01;
    public final /* synthetic */ C2n2 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public EU6(Activity activity, AbstractC10360h2 abstractC10360h2, C2n2 c2n2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Boolean bool, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0A = str;
        this.A07 = str2;
        this.A0B = str3;
        this.A08 = str4;
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A02 = c2n2;
        this.A06 = runnable;
        this.A05 = bool;
        this.A09 = str5;
        this.A0C = str6;
        this.A00 = activity;
        this.A01 = abstractC10360h2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-455156519);
        int A032 = C0f9.A03(994133216);
        String str = ((C32176EBx) obj).A00;
        if (str != null) {
            String str2 = this.A0A;
            String str3 = this.A07;
            String str4 = this.A0B;
            String str5 = this.A08;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A03;
            AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, str2, str3, str4, str5, str);
            this.A02.apply(str);
            Runnable runnable = this.A06;
            if (runnable != null) {
                runnable.run();
            }
            if (this.A05.booleanValue()) {
                String str6 = this.A09;
                String str7 = this.A0C;
                AbstractC167017dG.A1N(userSession, interfaceC60442pS);
                C14360o3.A0B(str4, 4);
                AbstractC73317Y7a.A0I(interfaceC60442pS, userSession, null, str6, str3, str4, str, null, null, str7, null);
            }
            C0f9.A0A(-328727545, A032);
            C0f9.A0A(-1602142142, A03);
            return;
        }
        C14360o3.A0F("highlightUrl");
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1172857013);
        C9GR.A0E(this.A00, "fetch_highlight_permalink_failed");
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        String str = this.A09;
        String str2 = this.A07;
        String str3 = this.A0B;
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, str, str2, str3, abstractC115105If.A01());
        AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, this.A0A, str2, str3, this.A08, null);
        C0f9.A0A(417771721, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1297202307);
        final AbstractC10360h2 abstractC10360h2 = this.A01;
        C11T.A03(new Runnable() { // from class: X.GNB
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63248Sg4.A01(AbstractC10360h2.this);
            }
        });
        C0f9.A0A(123253488, A03);
    }
}
