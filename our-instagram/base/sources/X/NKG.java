package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class NKG extends OX6 {
    public C47Z A00;
    public final Context A01;
    public final UserSession A02;
    public final C52457NJb A03;
    public final C56146OwA A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKG(Context context, UserSession userSession, C52457NJb c52457NJb) {
        super(c52457NJb);
        C14360o3.A0B(userSession, 3);
        this.A03 = c52457NJb;
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = (C56146OwA) userSession.A01(C56146OwA.class, new C50161MDo(userSession, 2));
        C008002u A1H = AbstractC25225BEi.A1H(new C52461NJf(null, null, -1, false, false, false));
        this.A05 = A1H;
        this.A06 = A1H;
    }

    public static final void A00(NKG nkg, List list) {
        C47Z c47z = nkg.A00;
        if (c47z != null) {
            c47z.A4K = list;
            nkg.A04.A00(nkg.A01, c47z);
            nkg.A07(C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, nkg.A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, -1, 262127, false, false, false, false, false, false, false, false, false, false, false, false, false));
        }
    }
}
