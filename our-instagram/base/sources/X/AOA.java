package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AOA implements DialogInterface.OnClickListener {
    public final /* synthetic */ C92N A00;

    public AOA(C92N c92n) {
        this.A00 = c92n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C92N c92n = this.A00;
        UserSession userSession = c92n.A05;
        C92Q c92q = c92n.A06;
        boolean A1U = AbstractC167007dF.A1U(c92q);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B(MSV.A00(124));
        AbstractC167027dH.A0x(A0c, c92q, "is_enabled", String.valueOf(A1U));
    }
}
