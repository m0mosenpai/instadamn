package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.L9r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47809L9r {
    public EnumC60792q3 A00;
    public KNU A01;
    public C189478aR A02;
    public C189448aO A03;
    public final C47539Kz7 A04;
    public final Context A05;
    public final UserSession A06;

    public C47809L9r(Context context, UserSession userSession, C47539Kz7 c47539Kz7) {
        C14360o3.A0B(userSession, 2);
        this.A05 = context;
        this.A06 = userSession;
        this.A04 = c47539Kz7;
        this.A00 = EnumC60792q3.A02;
    }

    public final void A00(View view, AbstractC10360h2 abstractC10360h2, InterfaceC193828i3 interfaceC193828i3) {
        C14360o3.A0B(view, 0);
        KNU A00 = AbstractC46686Kl3.A00(this.A06, this.A04);
        A00.A02 = interfaceC193828i3;
        A00.setDayNightMode(this.A00);
        C14240no c14240no = new C14240no(abstractC10360h2);
        c14240no.A0A(A00, view.getId());
        c14240no.A00();
        this.A01 = A00;
    }

    public final void A01(View view, InterfaceC193828i3 interfaceC193828i3) {
        Context context = this.A05;
        C14360o3.A0C(context, MSV.A00(0));
        AbstractC10360h2 supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        A00(view, supportFragmentManager, interfaceC193828i3);
    }

    public final void A02(InterfaceC193828i3 interfaceC193828i3) {
        UserSession userSession = this.A06;
        KNU A00 = AbstractC46686Kl3.A00(userSession, this.A04);
        A00.setDayNightMode(this.A00);
        A00.A02 = interfaceC193828i3;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0k = false;
        A0y.A0q = false;
        A0y.A03 = 1.0f;
        A0y.A04 = 1.0f;
        A0y.A0x = false;
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A0T = A00;
        Context context = this.A05;
        A0y.A0d = context.getString(2131973223);
        A0y.A1C = false;
        A0y.A0O = this.A00;
        A0y.A0U = new C24116An1(this, 0);
        A0y.A1O = false;
        this.A03 = A0y;
        C189478aR A002 = A0y.A00();
        this.A02 = A002;
        A00.A00 = new L11(context, A00, A002);
        A002.A03(context, A00);
        this.A01 = A00;
    }
}
