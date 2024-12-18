package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTG extends AbstractC55206OeJ {
    public C51886MwU A00;
    public final Context A01;
    public final UserSession A02;
    public final C55177Odh A03;
    public final PC4 A04;
    public final InterfaceC16660sJ A05;

    public NTG(Context context, UserSession userSession, C55177Odh c55177Odh, PC4 pc4, InterfaceC16660sJ interfaceC16660sJ) {
        super(AbstractC25225BEi.A1D(C51886MwU.class));
        this.A04 = pc4;
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = c55177Odh;
        this.A05 = interfaceC16660sJ;
        pc4.A01 = new O54(this);
    }
}
