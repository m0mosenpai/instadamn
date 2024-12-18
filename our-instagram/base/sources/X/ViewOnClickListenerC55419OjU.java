package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55419OjU implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public ViewOnClickListenerC55419OjU(Context context, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = z;
        this.A02 = c38321qM;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1528127820);
        Context context = this.A00;
        UserSession userSession = this.A01;
        boolean z = this.A04;
        C38321qM c38321qM = this.A02;
        String str = this.A03;
        int i = 2131956762;
        if (z) {
            i = 2131956763;
        }
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A04();
        A0I.A0A(i);
        A0I.A0G(new Og6(context, userSession, c38321qM, str, 0));
        A0I.A06();
        AbstractC166987dD.A1W(A0I);
        C0f9.A0C(450273467, A05);
    }
}
