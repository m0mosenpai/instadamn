package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public final class IMX {
    public JHY A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final C25671My A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final C57822kv A06;
    public final C146076i5 A07;
    public final C146086i6 A08;
    public final C141986bH A09;
    public final InterfaceC09390do A0A;

    public IMX(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1R(userSession, interfaceC60442pS);
        C08790ch A00 = AbstractC018607g.A00(fragmentActivity);
        C141986bH A002 = AbstractC146056i3.A00(userSession);
        C57822kv A003 = AbstractC57812ku.A00(userSession);
        C146076i5 c146076i5 = new C146076i5(interfaceC60442pS, userSession, str);
        C146086i6 c146086i6 = new C146086i6(userSession);
        InterfaceC09390do A004 = C1XM.A00(new C43204J8b(fragmentActivity, 12));
        C25671My A005 = AbstractC25651Mw.A00(userSession);
        AbstractC25229BEm.A1J(A002, 5, A005);
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A02 = A00;
        this.A09 = A002;
        this.A06 = A003;
        this.A07 = c146076i5;
        this.A08 = c146086i6;
        this.A0A = A004;
        this.A03 = A005;
        this.A00 = null;
    }

    public final void A00(Hj6 hj6, C41111IIc c41111IIc) {
        EnumC39559HdV enumC39559HdV;
        String str;
        C146086i6 c146086i6 = this.A08;
        if (c41111IIc.A03) {
            enumC39559HdV = EnumC39559HdV.A03;
        } else {
            enumC39559HdV = EnumC39559HdV.A04;
        }
        String str2 = c41111IIc.A02;
        UpcomingEvent upcomingEvent = c41111IIc.A01;
        String obj = upcomingEvent.CD5().toString();
        C38321qM c38321qM = c41111IIc.A00;
        if (c38321qM != null) {
            str = AbstractC41071vF.A07(this.A04, c38321qM);
        } else {
            str = null;
        }
        c146086i6.A02(enumC39559HdV, str2, obj, str);
        IJM ijm = new IJM(this.A01, this.A04, upcomingEvent);
        C43210J8h c43210J8h = new C43210J8h(31, this, hj6, c41111IIc);
        if (!ijm.A04 && !ijm.A03) {
            C193328hC c193328hC = ijm.A01;
            c193328hC.A0g(new DialogInterfaceOnDismissListenerC41843Ifx(c43210J8h, 3));
            AbstractC166987dD.A1W(c193328hC);
            return;
        }
        c43210J8h.invoke();
    }
}
