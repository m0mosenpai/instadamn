package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;

/* renamed from: X.EyX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33931EyX {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1vN] */
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        boolean A012 = C6DZ.A01(c6fw.A02());
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(A04, 0);
        if (A04 instanceof ChallengeActivity) {
            A04.finish();
        }
        if (A012) {
            G06 A00 = FTX.A00(C6BQ.A0B(c6fq));
            if ("IG_PAYOUT_EDIT".equals(A01)) {
                AbstractC25651Mw.A00(A00.A06).E4s(new Object());
                return null;
            }
            return null;
        }
        return null;
    }
}
