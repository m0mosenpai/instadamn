package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ej8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33104Ej8 extends ET4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33104Ej8(Activity activity, Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        super(context, abstractC10360h2);
        this.A08 = str;
        this.A02 = c38321qM;
        this.A01 = userSession;
        this.A07 = str2;
        this.A09 = str3;
        this.A06 = str4;
        this.A0B = z;
        this.A00 = activity;
        this.A05 = str5;
        this.A03 = interfaceC60442pS;
        this.A04 = runnable;
        this.A0A = str6;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A01;
        int A03 = C0f9.A03(-893951443);
        int A032 = C0f9.A03(327440212);
        String str = ((EC0) obj).A00;
        String str2 = this.A08;
        if (str2 != null) {
            A01 = AnonymousClass001.A0g(str2, "\n", str);
        } else {
            C38321qM c38321qM = this.A02;
            c38321qM.getClass();
            A01 = AbstractC31510Dsu.A01(this.A01, c38321qM, str);
        }
        String str3 = this.A07;
        String str4 = this.A09;
        String str5 = this.A06;
        boolean z = this.A0B;
        Activity activity = this.A00;
        C38321qM c38321qM2 = this.A02;
        String str6 = this.A05;
        AbstractC31510Dsu.A0R(activity, this.A01, c38321qM2, this.A03, this.A04, str3, str4, str5, str, A01, str6, this.A0A, z);
        C0f9.A0A(-67316385, A032);
        C0f9.A0A(-2110289205, A03);
    }

    @Override // X.ET4, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1339151944);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C38321qM c38321qM = this.A02;
        String str = this.A05;
        String str2 = this.A09;
        Throwable A01 = abstractC115105If.A01();
        Runnable runnable = this.A04;
        String id = c38321qM.getId();
        id.getClass();
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, id, str, str2, A01);
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-795070774, A03);
    }
}
