package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTJ extends AbstractC55206OeJ {
    public C51869MwD A00;
    public final ViewGroup A01;
    public final UserSession A02;
    public final C23031Ai A03;
    public final OI6 A04;
    public final C55177Odh A05;
    public final O4S A06;
    public final PC9 A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTJ(ViewGroup viewGroup, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, O4S o4s) {
        super(AbstractC25225BEi.A1D(C51869MwD.class));
        AbstractC37302Gc3.A1U(c55177Odh, oi6);
        this.A01 = viewGroup;
        this.A02 = userSession;
        this.A05 = c55177Odh;
        this.A04 = oi6;
        this.A06 = o4s;
        this.A07 = new PC9(viewGroup, new O5H(this));
        this.A03 = AbstractC23021Ah.A00(userSession);
    }
}
