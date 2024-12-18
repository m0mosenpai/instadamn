package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GNf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36884GNf implements Runnable {
    public final /* synthetic */ N6J A00;
    public final /* synthetic */ C47Z A01;

    public RunnableC36884GNf(N6J n6j, C47Z c47z) {
        this.A01 = c47z;
        this.A00 = n6j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N6J n6j = this.A00;
        UserSession A0S = n6j.A0S();
        C31575Du3 c31575Du3 = new C31575Du3(n6j, 3);
        C31575Du3 c31575Du32 = new C31575Du3(n6j, 4);
        C14360o3.A0B(A0S, 1);
        String moduleName = n6j.getModuleName();
        EN4 en4 = new EN4();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A03(A0b, A0S);
        en4.setArguments(A0b);
        en4.A03 = moduleName;
        C189448aO A0y = AbstractC25225BEi.A0y(A0S);
        A0y.A0T = en4;
        AbstractC25225BEi.A1Q(A0y, false);
        C189478aR A00 = GH5.A00(A0y, c31575Du3, 1);
        en4.A02 = A00;
        en4.A01 = new FF7(c31575Du32);
        C35038FcB A002 = FXY.A00(A0S);
        A002.A02(n6j.getActivity(), C05F.A01, n6j.getModuleName(), EN4.__redex_internal_original_name);
        A002.A01(n6j);
        en4.A00 = A002.A00;
        AbstractC31173DnH.A1G(n6j, en4, A00);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(A0S);
        AbstractC167017dG.A1L(A0x.ARD(), A0x, MSV.A00(1030), 0);
        N6J.A06(n6j).A0h.A08();
    }
}
