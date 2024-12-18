package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ln2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49076Ln2 implements InterfaceC165767b3 {
    public final C7XS A00;
    public final C49623LwG A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final C163867Va A04;
    public final InterfaceC16820sZ A05;

    public C49076Ln2(AbstractC59962oe abstractC59962oe, UserSession userSession, C163867Va c163867Va, C7XS c7xs, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25233BEq.A0w(2, abstractC59962oe, c7xs, c163867Va);
        this.A03 = userSession;
        this.A02 = abstractC59962oe;
        this.A00 = c7xs;
        this.A04 = c163867Va;
        this.A05 = interfaceC16820sZ;
        this.A01 = new C49623LwG(this, 9);
    }

    @Override // X.InterfaceC165767b3
    public final void E2q(String str) {
        Bundle A02 = AbstractC86593tX.A02(null, null, AbstractC41763Iee.A06(str), AbstractC166997dE.A0n());
        C14360o3.A07(A02);
        UserSession userSession = this.A03;
        C38929HCc c38929HCc = new C38929HCc();
        c38929HCc.setArguments(A02);
        AbstractC59962oe abstractC59962oe = this.A02;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(abstractC59962oe.requireContext(), ((C7IM) this.A05.invoke()).A07.A0E);
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, false);
        A0X.A1E = true;
        A0X.A06 = AbstractC53242c7.A0F(contextThemeWrapper, R.attr.elevatedBackgroundColor);
        A0X.A0U = this.A01;
        C189478aR A00 = A0X.A00();
        this.A04.CMc();
        A00.A02(abstractC59962oe.requireActivity(), c38929HCc);
        this.A00.D0E();
    }
}
