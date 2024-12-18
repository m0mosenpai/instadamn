package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ETW extends C1P1 {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C42582It0 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public ETW(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C42582It0 c42582It0, String str, String str2) {
        this.A00 = abstractC59962oe;
        this.A03 = c38321qM;
        this.A04 = c42582It0;
        this.A02 = userSession;
        this.A05 = str;
        this.A01 = interfaceC11380iw;
        this.A06 = str2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1157505271);
        EC0 ec0 = (EC0) obj;
        int A032 = C0f9.A03(691747689);
        C14360o3.A0B(ec0, 0);
        String str = ec0.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        C38321qM c38321qM = this.A03;
        UserSession userSession = this.A02;
        A0b.putString("android.intent.extra.TEXT", AbstractC31510Dsu.A01(userSession, c38321qM, str));
        FragmentActivity requireActivity = this.A00.requireActivity();
        C42582It0 c42582It0 = this.A04;
        String A00 = MSV.A00(1279);
        HashMap A0o = AbstractC31180DnO.A0o(str);
        AbstractC31181DnP.A0w(userSession, c38321qM, A00, A0o);
        AbstractC31510Dsu.A0N(requireActivity, null, A0b, c42582It0, userSession, null, "share_to_system_sheet", A0o, true, false);
        if (!C18U.A06(C06090Tz.A05, userSession, 36323878452080296L)) {
            AbstractC73317Y7a.A0I(this.A01, userSession, null, this.A05, this.A06, "system_share_sheet", ec0.A00, "system_share_sheet", AbstractC25226BEj.A1G(c38321qM), null, null);
        }
        C0f9.A0A(-2045155246, A032);
        C0f9.A0A(-728103169, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 239691154);
        super.onFail(abstractC115105If);
        AbstractC73317Y7a.A0H(this.A01, this.A02, this.A05, this.A06, "system_share_sheet", abstractC115105If.A01());
        C0f9.A0A(605234584, A0N);
    }
}
