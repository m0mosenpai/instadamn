package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LPD implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7SN A02;
    public final /* synthetic */ C45272K2a A03;

    public LPD(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7SN c7sn, C45272K2a c45272K2a) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = c45272K2a;
        this.A02 = c7sn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-615220246);
        C48513LdA A00 = AbstractC46706KlP.A00(this.A00, this.A01);
        C45272K2a c45272K2a = this.A03;
        int i = c45272K2a.A02;
        String str = c45272K2a.A03;
        String str2 = c45272K2a.A05;
        C48513LdA.A00(A00, "cta", "tap", str, str2, i, true);
        this.A02.A01.Cqh(str2, str, AbstractC166987dD.A1J(c45272K2a.A04));
        C0f9.A0C(-1340846937, A05);
    }
}
