package X;

import com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class IO7 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.H8Z, X.1um, X.1ul] */
    public static H8Z parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("feed_after_party_eligibility_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum = (FeedAfterPartyPromoteEligibilityStatusEnum) FeedAfterPartyPromoteEligibilityStatusEnum.A01.get(A1P);
                    if (feedAfterPartyPromoteEligibilityStatusEnum == null) {
                        feedAfterPartyPromoteEligibilityStatusEnum = FeedAfterPartyPromoteEligibilityStatusEnum.A05;
                    }
                    c40791um.A00 = feedAfterPartyPromoteEligibilityStatusEnum;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum2 = c40791um.A00;
            C14360o3.A0A(feedAfterPartyPromoteEligibilityStatusEnum2);
            c40791um.A01 = new H3J(feedAfterPartyPromoteEligibilityStatusEnum2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
