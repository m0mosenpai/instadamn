package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ejb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33132Ejb extends ETO {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33132Ejb(Activity activity, Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, User user, Runnable runnable, String str, String str2, String str3, String str4, String str5, boolean z) {
        super(context, null, abstractC10360h2, false);
        this.A03 = c41181vS;
        this.A06 = str;
        this.A09 = str2;
        this.A04 = user;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A08 = str3;
        this.A07 = str4;
        this.A0B = z;
        this.A00 = activity;
        this.A0A = str5;
        this.A05 = runnable;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-944493268);
        int A032 = C0f9.A03(-1799285197);
        String str = ((EC2) obj).A00;
        C41181vS c41181vS = this.A03;
        String str2 = c41181vS.A0j;
        String str3 = this.A06;
        String str4 = this.A09;
        User user = this.A04;
        String id = user.getId();
        InterfaceC60442pS interfaceC60442pS = this.A02;
        UserSession userSession = this.A01;
        AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, str2, str3, str4, id, str);
        AbstractC31510Dsu.A03(this.A00, AbstractC31180DnO.A03(str), userSession, interfaceC60442pS, user, this.A08, this.A07, str, c41181vS.A0k, str2, str3, false, this.A0B);
        String str5 = this.A0A;
        AbstractC167017dG.A1N(userSession, interfaceC60442pS);
        C14360o3.A0B(str4, 4);
        AbstractC73317Y7a.A0I(interfaceC60442pS, userSession, null, str2, str3, str4, str, null, null, str5, null);
        this.A05.run();
        C0f9.A0A(798843996, A032);
        C0f9.A0A(-2055827982, A03);
    }

    @Override // X.ETO, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-2123529998);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String str = this.A03.A0j;
        String str2 = this.A06;
        String str3 = this.A09;
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, str, str2, str3, abstractC115105If.A01());
        this.A05.run();
        AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, str, str2, str3, this.A04.getId(), null);
        C0f9.A0A(-725488039, A03);
    }
}
