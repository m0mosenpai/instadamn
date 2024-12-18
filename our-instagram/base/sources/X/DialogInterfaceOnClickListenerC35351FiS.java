package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35351FiS implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ EDR A02;
    public final /* synthetic */ C129885ts A03;

    public DialogInterfaceOnClickListenerC35351FiS(Context context, C1P1 c1p1, EDR edr, C129885ts c129885ts) {
        this.A03 = c129885ts;
        this.A00 = context;
        this.A01 = c1p1;
        this.A02 = edr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C129885ts c129885ts = this.A03;
        UserSession userSession = c129885ts.A02;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/set_public/");
        AbstractC31178DnM.A1J(A0c, new C36014FvC(3), userSession);
        C1ON A0P = AbstractC31176DnK.A0P(A0c);
        A0P.A00 = new EUR(this.A00, userSession, new C32997Egk(this.A01, this.A02));
        C129885ts.A03(A0P, c129885ts);
    }
}
