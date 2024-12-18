package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Obi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55121Obi {
    public final Activity A00;
    public final UserSession A01;
    public final C5SE A02;
    public final P2Q A03;
    public final O83 A04;
    public final InterfaceC60442pS insightsHost;

    public static final void A01(C55121Obi c55121Obi, String str) {
        InterfaceC60442pS interfaceC60442pS = c55121Obi.insightsHost;
        P2Q p2q = c55121Obi.A03;
        C82713mZ A01 = C32U.A01(c55121Obi.A02, p2q, interfaceC60442pS, str);
        UserSession userSession = c55121Obi.A01;
        A01.A0J(userSession, p2q);
        C32U.A0C(userSession, A01, p2q, c55121Obi.insightsHost, null);
    }

    public static final void A02(C55121Obi c55121Obi, String str, String str2) {
        P2Q p2q = c55121Obi.A03;
        C38321qM c38321qM = p2q.A02;
        UserSession userSession = c55121Obi.A01;
        C3YS.A00(userSession).A02(c38321qM, true);
        O83 o83 = c55121Obi.A04;
        C51137Mig c51137Mig = o83.A01;
        List list = c51137Mig.A03;
        int i = o83.A00;
        list.remove(i);
        c51137Mig.notifyItemRemoved(i);
        c51137Mig.notifyItemRangeChanged(i, list.size());
        if (str2 != null) {
            C82713mZ A01 = C32U.A01(c55121Obi.A02, p2q, c55121Obi.insightsHost, AbstractC111324zv.A00(2448));
            A01.A6v = str2;
            A01.A76 = str;
            String A14 = AbstractC25225BEi.A14();
            if (A14 != null) {
                A01.A6C = A14;
            }
            A01.A0J(userSession, p2q);
            C32U.A0C(userSession, A01, p2q, c55121Obi.insightsHost, null);
        }
    }

    public C55121Obi(Activity activity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, O83 o83, P2Q p2q) {
        AbstractC43594JPz.A1P(userSession, p2q);
        this.A00 = activity;
        this.A01 = userSession;
        this.insightsHost = interfaceC60442pS;
        this.A03 = p2q;
        this.A04 = o83;
        this.A02 = new C5SE(userSession, p2q.A02);
    }

    public static final void A00(C55121Obi c55121Obi, EnumC39619HeT enumC39619HeT, String str, String str2, String str3) {
        A01(c55121Obi, str);
        WEz A01 = AbstractC69993VzD.A01(c55121Obi.A00, c55121Obi.insightsHost, c55121Obi.A01, EnumC65855TvH.A0a, VG2.A03, str3);
        A01.A07 = str2;
        A01.A02 = enumC39619HeT;
        A01.A03 = new C53026Ncy(str, c55121Obi, 0);
        WEz.A00(null, A01);
    }
}
