package X;

import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27045BwP extends AbstractC61132qb {
    public final long A00;
    public final ChallengeName A01;
    public final ChallengeState A02;
    public final UserSession A03;
    public final String A04;

    public C27045BwP(ChallengeName challengeName, ChallengeState challengeState, UserSession userSession, String str, long j) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = j;
        this.A01 = challengeName;
        this.A02 = challengeState;
        this.A04 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        long j = this.A00;
        return new C25872BcU(this.A01, this.A02, userSession, new CUN(userSession), this.A04, j);
    }
}
