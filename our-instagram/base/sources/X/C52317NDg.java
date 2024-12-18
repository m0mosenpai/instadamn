package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* renamed from: X.NDg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52317NDg extends AbstractC61132qb {
    public final XIGIGBoostCallToAction A00;
    public final XIGIGBoostDestination A01;
    public final C70399WUb A02;
    public final C53856Nrk A03;
    public final UserSession A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Nrk] */
    public /* synthetic */ C52317NDg(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, C70399WUb c70399WUb, UserSession userSession, String str, boolean z) {
        ?? obj = new Object();
        AbstractC25234BEr.A1P(userSession, xIGIGBoostDestination, xIGIGBoostCallToAction);
        this.A04 = userSession;
        this.A01 = xIGIGBoostDestination;
        this.A05 = str;
        this.A00 = xIGIGBoostCallToAction;
        this.A06 = z;
        this.A02 = c70399WUb;
        this.A03 = obj;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A04;
        XIGIGBoostDestination xIGIGBoostDestination = this.A01;
        String str = this.A05;
        return new C50955MfO(this.A00, xIGIGBoostDestination, this.A02, this.A03, userSession, str, this.A06);
    }
}
