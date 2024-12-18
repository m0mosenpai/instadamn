package X;

import com.instagram.api.schemas.ChallengeDetails;

/* renamed from: X.ByR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27159ByR extends C9P {
    public final ChallengeDetails A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27159ByR) {
                C27159ByR c27159ByR = (C27159ByR) obj;
                if (!C14360o3.A0K(this.A00, c27159ByR.A00) || !C14360o3.A0K(this.A01, c27159ByR.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C27159ByR(ChallengeDetails challengeDetails, String str) {
        this.A00 = challengeDetails;
        this.A01 = str;
    }
}
