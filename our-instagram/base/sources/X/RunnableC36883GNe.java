package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GNe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36883GNe implements Runnable {
    public final /* synthetic */ N6J A00;
    public final /* synthetic */ C47Z A01;

    public RunnableC36883GNe(N6J n6j, C47Z c47z) {
        this.A01 = c47z;
        this.A00 = n6j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47Z c47z = this.A01;
        N6J n6j = this.A00;
        UserSession A0S = n6j.A0S();
        InterfaceC11380iw interfaceC11380iw = n6j.A0O;
        C31575Du3 c31575Du3 = new C31575Du3(n6j, 1);
        C31575Du3 c31575Du32 = new C31575Du3(n6j, 2);
        AbstractC167007dF.A1E(A0S, 1, interfaceC11380iw);
        String moduleName = n6j.getModuleName();
        EN5 en5 = new EN5();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A03(A0b, A0S);
        A0b.putString("module_name", moduleName);
        C189448aO A0W = AbstractC31174DnI.A0W(A0b, en5, A0S);
        A0W.A0T = en5;
        AbstractC25225BEi.A1Q(A0W, false);
        C189478aR A00 = GH5.A00(A0W, c31575Du3, 2);
        en5.A03 = A00;
        en5.A01 = new FF8(c31575Du32);
        en5.A02 = new FKG(interfaceC11380iw, A0S, c47z);
        C35038FcB A002 = FXY.A00(A0S);
        A002.A02(n6j.getActivity(), C05F.A01, n6j.getModuleName(), EN5.__redex_internal_original_name);
        A002.A01(n6j);
        en5.A00 = A002.A00;
        AbstractC31173DnH.A1G(n6j, en5, A00);
        N6J.A06(n6j).A0h.A08();
    }
}
