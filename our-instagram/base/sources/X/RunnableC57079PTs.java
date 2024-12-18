package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PTs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57079PTs implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AbstractC27671Vv A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public RunnableC57079PTs(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC27671Vv abstractC27671Vv, String str, String str2, String str3) {
        this.A03 = abstractC27671Vv;
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56139Ovz A01;
        AbstractC27671Vv abstractC27671Vv = this.A03;
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        AbstractC167027dH.A12(context, userSession, interfaceC11380iw);
        C3ES A00 = abstractC27671Vv.A00(context, userSession);
        Context context2 = A00.A04;
        UserSession userSession2 = A00.A06;
        if (new OKi(context2, interfaceC11380iw, userSession2).A01("ar_effect_try_on") && (A01 = MWJ.A01(userSession2)) != null) {
            A01.A09.A0N.A0L(C05F.A0N, str, str2, str3, A01.A02.userId);
        }
    }
}
