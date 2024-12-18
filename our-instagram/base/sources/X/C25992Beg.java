package X;

import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.util.List;

/* renamed from: X.Beg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25992Beg extends C0T6 {
    public final Challenge A00;
    public final ChallengeDetails A01;
    public final GuidanceTipResponseImpl A02;
    public final long A03;
    public final List A04;

    public C25992Beg(Challenge challenge, ChallengeDetails challengeDetails, GuidanceTipResponseImpl guidanceTipResponseImpl, List list, long j) {
        AbstractC25233BEq.A0x(3, challenge, challengeDetails, list);
        this.A03 = j;
        this.A02 = guidanceTipResponseImpl;
        this.A00 = challenge;
        this.A01 = challengeDetails;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25992Beg) {
                C25992Beg c25992Beg = (C25992Beg) obj;
                if (this.A03 != c25992Beg.A03 || !C14360o3.A0K(this.A02, c25992Beg.A02) || !C14360o3.A0K(this.A00, c25992Beg.A00) || !C14360o3.A0K(this.A01, c25992Beg.A01) || !C14360o3.A0K(this.A04, c25992Beg.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, (AbstractC25235BEs.A03(this.A03) + AbstractC167017dG.A0M(this.A02)) * 31)));
    }
}
