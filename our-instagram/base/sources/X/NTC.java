package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTC extends AbstractC55206OeJ {
    public final Activity A00;
    public final UserSession A01;
    public final OI6 A02;
    public final C55177Odh A03;
    public final PC3 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTC(Activity activity, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PC3 pc3) {
        super(AbstractC25225BEi.A1D(C56623PBt.class));
        AbstractC37302Gc3.A1U(c55177Odh, oi6);
        this.A01 = userSession;
        this.A04 = pc3;
        this.A03 = c55177Odh;
        this.A02 = oi6;
        this.A00 = activity;
        pc3.A00 = new C54466O4u(this);
    }
}
