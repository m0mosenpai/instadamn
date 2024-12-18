package X;

import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hqb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40108Hqb {
    public static NoteChatResponseInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("group_chat_hash".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_member".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("last_num_members".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("num_members".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("social_context_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("group_chat_hash", c16l, "NoteChatResponseInfoImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("num_members", c16l, "NoteChatResponseInfoImpl");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("social_context_users", c16l, "NoteChatResponseInfoImpl");
                } else {
                    return new NoteChatResponseInfoImpl(num2, str, arrayList, num.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_member", c16l, "NoteChatResponseInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
