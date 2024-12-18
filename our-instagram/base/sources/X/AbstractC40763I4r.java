package X;

import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I4r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40763I4r {
    public static CloseFriendsUserStoryTarget parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CloseFriendsUserStoryTarget closeFriendsUserStoryTarget = new CloseFriendsUserStoryTarget();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1E(A0s)) {
                    closeFriendsUserStoryTarget.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("blacklisted_user_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    closeFriendsUserStoryTarget.A01 = arrayList;
                }
                c16l.A0z();
            }
            return closeFriendsUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
