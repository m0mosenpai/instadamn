package X;

import java.io.IOException;

/* renamed from: X.KnS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46833KnS {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.L2m] */
    public static C47653L2m parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("interactive_sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("interactive_user_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("emoji_reaction_unicode".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("poll_vote_string".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (str2 != null) {
                obj.A02 = str2;
            }
            if (str3 != null) {
                obj.A00 = str3;
            }
            if (str4 != null) {
                obj.A03 = str4;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
