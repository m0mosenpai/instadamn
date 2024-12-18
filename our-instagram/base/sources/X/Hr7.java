package X;

import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class Hr7 {
    public static C114855Gv parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState = null;
            String str = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("badge_preview_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    pendingShareToFriendsStoryBadgePreviewState = (PendingShareToFriendsStoryBadgePreviewState) PendingShareToFriendsStoryBadgePreviewState.A01.get(A1P);
                    if (pendingShareToFriendsStoryBadgePreviewState == null) {
                        pendingShareToFriendsStoryBadgePreviewState = PendingShareToFriendsStoryBadgePreviewState.A05;
                    }
                } else if ("cursor".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C114855Gv(pendingShareToFriendsStoryBadgePreviewState, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
