package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AO8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C92N A00;

    public AO8(C92N c92n) {
        this.A00 = c92n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C55079OaZ c55079OaZ = C55079OaZ.A00;
        C92N c92n = this.A00;
        UserSession userSession = c92n.A05;
        c55079OaZ.A01(c92n.A00, AbstractC12220kQ.A02(userSession), c92n.A09, "reminder_turnoff");
        LimitedInteractionsVersions limitedInteractionsVersions = c92n.A00;
        C92R c92r = c92n.A07;
        AbstractC167017dG.A1P(limitedInteractionsVersions, c92r);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B(MSV.A00(124));
        A0c.A9s("is_enabled", "false");
        AbstractC167027dH.A0x(A0c, c92r, "version", limitedInteractionsVersions.toString());
    }
}
