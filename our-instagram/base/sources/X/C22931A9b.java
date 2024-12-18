package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.A9b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22931A9b {
    public final C185358Kb A00;
    public final Context A01;
    public final UserSession A02;
    public final C8KR A03;
    public final HashSet A04 = AbstractC166987dD.A1H();

    public C22931A9b(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        C8KR c8kr = new C8KR(userSession);
        this.A03 = c8kr;
        this.A00 = new C185358Kb(new AZU(new C8KU(context, new AZT(2), new C85N(context, userSession)), new C85N(context, userSession)), c8kr);
    }
}
