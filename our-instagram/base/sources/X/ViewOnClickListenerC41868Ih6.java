package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Ih6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41868Ih6 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass308 A00;

    public ViewOnClickListenerC41868Ih6(AnonymousClass308 anonymousClass308) {
        this.A00 = anonymousClass308;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1234133624);
        AnonymousClass308 anonymousClass308 = this.A00;
        InterfaceC08430c6 interfaceC08430c6 = anonymousClass308.A0R;
        C14360o3.A0C(interfaceC08430c6, AbstractC111324zv.A00(1141));
        Hashtag BD4 = ((InterfaceC114465Eq) interfaceC08430c6).BD4();
        if (BD4 != null) {
            C38321qM A07 = anonymousClass308.A07();
            UserSession userSession = anonymousClass308.A0T;
            C1GJ.A03(I1H.A00(userSession, A07, BD4));
            AnonymousClass308.A03(anonymousClass308, EnumC75193Zm.A0O, true);
            Context context = anonymousClass308.A0P;
            C14360o3.A0B(context, 0);
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131975659);
            A0I.A09(2131975660);
            A0I.A07();
            AbstractC166987dD.A1W(A0I);
            AbstractC70136W6n.A01(anonymousClass308.A0X, userSession, anonymousClass308.A07(), BD4, anonymousClass308.A01);
        }
        C0f9.A0C(-1740286715, A05);
    }
}
