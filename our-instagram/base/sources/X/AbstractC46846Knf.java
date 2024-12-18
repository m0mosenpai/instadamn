package X;

import java.io.IOException;

/* renamed from: X.Knf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46846Knf {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.LGd] */
    public static C47948LGd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reaction_type".equals(A0s)) {
                    obj.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("reaction_status".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("item_id".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("original_message_client_context".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("reaction_client_context".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("message_content_type_id".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("emoji".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("super_react_type".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("reaction_action_source".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("avatar_reaction".equals(A0s)) {
                    obj.A00 = LC7.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
