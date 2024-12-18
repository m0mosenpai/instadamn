package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FDY {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FLZ, java.lang.Object] */
    public static FLZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("bloks_action".equals(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("nonce".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("challenge_node_id".equals(A0s)) {
                        obj.A00 = AbstractC31173DnH.A0h(c16l);
                    } else if ("challenge_context".equals(A0s)) {
                        obj.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                        c16l.A0y();
                    }
                    c16l.A0z();
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
