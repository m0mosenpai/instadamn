package X;

import java.io.IOException;

/* renamed from: X.4v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108844v9 {
    public static C108854vA parseFromJson(C16L c16l) {
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
                if ("android_is_required_mvvm_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_broadcast_level_expand_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_host_comment_liking_enabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_host_comment_reply_redesign_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("android_is_required_mvvm_enabled", "IGLiveCommentInteractionsImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_host_comment_liking_enabled", "IGLiveCommentInteractionsImpl");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_host_comment_reply_redesign_enabled", "IGLiveCommentInteractionsImpl");
                } else {
                    return new C108854vA(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("is_broadcast_level_expand_enabled", "IGLiveCommentInteractionsImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
