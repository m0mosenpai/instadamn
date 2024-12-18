package X;

import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import java.io.IOException;

/* renamed from: X.Vxi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69917Vxi {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1um, com.instagram.business.promote.model.PromoteAudiencePotentialReach, X.1ul] */
    public static PromoteAudiencePotentialReach parseFromJson(C16L c16l) {
        AudiencePotentialReachRating audiencePotentialReachRating;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("potential_reach".equals(A0s)) {
                    c40791um.A00 = c16l.A1D();
                } else if ("overall_rating".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    AudiencePotentialReachRating[] values = AudiencePotentialReachRating.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            audiencePotentialReachRating = values[i];
                            if (C14360o3.A0K(audiencePotentialReachRating.A01, A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            audiencePotentialReachRating = AudiencePotentialReachRating.A06;
                            break;
                        }
                    }
                    c40791um.A03 = audiencePotentialReachRating;
                } else if ("user_reach_lower_bound".equals(A0s)) {
                    c40791um.A01 = c16l.A1D();
                } else if ("user_reach_upper_bound".equals(A0s)) {
                    c40791um.A02 = c16l.A1D();
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
