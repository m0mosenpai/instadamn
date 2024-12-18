package X;

import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40765I4t {
    public static GroupUserStoryTarget parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            GroupUserStoryTarget groupUserStoryTarget = new GroupUserStoryTarget();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC37300Gc1.A1E(A0s)) {
                    groupUserStoryTarget.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("group_members".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            PendingRecipient parseFromJson = C7NT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    groupUserStoryTarget.A03 = arrayList;
                } else if ("display_name".equals(A0s)) {
                    groupUserStoryTarget.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("thread_key".equals(A0s)) {
                    groupUserStoryTarget.A00 = AbstractC83623o5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return groupUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
