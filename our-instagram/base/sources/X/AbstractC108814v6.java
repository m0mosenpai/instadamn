package X;

import java.io.IOException;

/* renamed from: X.4v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108814v6 {
    public static C108824v7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("join_request_system_comment_delay_5_else_0".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("share_system_comment_delay_10_else_5".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("show_join_request_system_comment".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("show_share_system_comment".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("join_request_system_comment_delay_5_else_0", "IGLiveShareSystemCommentImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("show_join_request_system_comment", "IGLiveShareSystemCommentImpl");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("show_share_system_comment", "IGLiveShareSystemCommentImpl");
                } else {
                    return new C108824v7(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("share_system_comment_delay_10_else_5", "IGLiveShareSystemCommentImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
