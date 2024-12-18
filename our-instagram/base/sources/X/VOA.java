package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VOA {
    public static UPH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audience_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("is_added_to_inbox".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(454).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_follower".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_invited_collaborator".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("is_subscriber".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, "thread_creator");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("audience_type", c16l, "CreatorBroadcastChatThreadGroupLinkPreviewResponse");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thread_creator", c16l, "CreatorBroadcastChatThreadGroupLinkPreviewResponse");
                } else {
                    return new UPH(user, bool2, bool3, bool4, bool5, num.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_added_to_inbox", c16l, "CreatorBroadcastChatThreadGroupLinkPreviewResponse");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
