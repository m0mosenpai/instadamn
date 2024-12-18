package X;

import android.content.DialogInterface;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class AO9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C92N A00;

    public AO9(C92N c92n) {
        this.A00 = c92n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C55079OaZ c55079OaZ = C55079OaZ.A00;
        C92N c92n = this.A00;
        UserSession userSession = c92n.A05;
        c55079OaZ.A01(c92n.A00, AbstractC12220kQ.A02(userSession), c92n.A09, "reminder_extend");
        long currentTimeMillis = System.currentTimeMillis();
        long A0L = AbstractC166987dD.A0L(currentTimeMillis - ((TimeZone.getDefault().getOffset(currentTimeMillis) + currentTimeMillis) % 86400000)) + 604800;
        LimitedInteractionsVersions limitedInteractionsVersions = c92n.A00;
        C92S c92s = c92n.A08;
        AbstractC167017dG.A1R(limitedInteractionsVersions, c92s);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B(MSV.A00(124));
        A0c.A0D(MSV.A00(556), (int) A0L);
        AbstractC167027dH.A0x(A0c, c92s, "version", limitedInteractionsVersions.toString());
    }
}
