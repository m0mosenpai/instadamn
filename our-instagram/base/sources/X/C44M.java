package X;

import java.io.IOException;

/* renamed from: X.44M, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44M {
    public static C44N parseFromJson(C16L c16l) {
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
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audience_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("is_added_to_inbox".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_collaborator".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_follower".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_invited_collaborator".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_subscriber".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("audience_type", "CreatorBroadcastChatThreadPreviewResponseImpl");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_added_to_inbox", "CreatorBroadcastChatThreadPreviewResponseImpl");
            } else {
                return new C44N(bool2, bool3, bool4, bool5, num.intValue(), bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
