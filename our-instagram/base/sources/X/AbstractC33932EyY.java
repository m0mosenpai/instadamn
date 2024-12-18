package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;

/* renamed from: X.EyY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33932EyY {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.1vN] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) c6fw.A02();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(A04, 0);
        if (A04 instanceof ChallengeActivity) {
            A04.finish();
        }
        if (c102884kP.A0S(36, false)) {
            G06 A00 = FTX.A00(C6BQ.A0B(c6fq));
            C14360o3.A07(A00);
            String str = "";
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                str = A0E;
            }
            if ("IG_PAYOUT_EDIT".equals(str)) {
                AbstractC25651Mw.A00(A00.A06).E4s(new Object());
                return null;
            }
            return null;
        }
        return null;
    }
}
