package X;

import com.instagram.pendingmedia.model.AllUserStoryTarget;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I4q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40762I4q {
    public static AllUserStoryTarget parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AllUserStoryTarget allUserStoryTarget = new AllUserStoryTarget();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1E(A0s)) {
                    allUserStoryTarget.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("blacklisted_user_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    allUserStoryTarget.A01 = arrayList;
                }
                c16l.A0z();
            }
            return allUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}