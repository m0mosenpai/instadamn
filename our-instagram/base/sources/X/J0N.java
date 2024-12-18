package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J0N implements InterfaceC125355lh {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C3W8 A03;

    public J0N(Activity activity, View view, UserSession userSession, C3W8 c3w8) {
        this.A03 = c3w8;
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = view;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        UserSession userSession;
        Activity activity;
        C3W8 c3w8 = this.A03;
        Runnable runnable = c3w8.A09;
        if (runnable != null) {
            c3w8.A0B.postDelayed(runnable, 3000L);
        }
        InterfaceC60442pS interfaceC60442pS = c3w8.A06;
        C75113Zb c75113Zb = c3w8.A08;
        C9C3 c9c3 = c3w8.A04;
        if (c9c3 != null && c9c3.A02 && (userSession = this.A02) != null && !AbstractC35184Ffb.A03(userSession) && AbstractC35273Fh8.A08(userSession) && !AbstractC166987dD.A0x(userSession).getBoolean(AbstractC111324zv.A00(2444), false) && (activity = this.A00) != null && interfaceC60442pS != null && c75113Zb != null) {
            View A00 = c3w8.A00();
            String A0q = AbstractC166997dE.A0q(AbstractC25228BEl.A0M(c3w8.A00()), 2131972716);
            int width = this.A01.getWidth() / 10;
            int i = -((int) c3w8.A0A);
            EnumC58132lV enumC58132lV = EnumC58132lV.A02;
            C220459oV c220459oV = new C220459oV(c3w8, 4);
            C5SU c5su = new C5SU(activity, new C149686oL(A0q));
            c5su.A04(A00, width, i, false);
            c5su.A0B = true;
            c5su.A05 = enumC58132lV;
            c5su.A0A = true;
            c5su.A04 = c220459oV;
            c5su.A00().A06();
        }
    }
}
