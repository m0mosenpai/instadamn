package X;

import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import java.io.IOException;

/* renamed from: X.I4s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40764I4s {
    public static GroupProfileUserStoryTarget parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            GroupProfileUserStoryTarget groupProfileUserStoryTarget = new GroupProfileUserStoryTarget();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1E(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    groupProfileUserStoryTarget.A01 = A1P;
                } else if ("group_profile_recipient".equals(A0s)) {
                    groupProfileUserStoryTarget.A00 = C7NT.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return groupProfileUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
