package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OPS {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.N3H, X.1um, X.1ul] */
    public static N3H parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A0s)) {
                    c40791um.A00 = AbstractC38841rG.parseFromJson(c16l);
                } else if ("comments_disabled".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("comment_post_error".equals(A0s)) {
                        c40791um.A04 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(4148).equals(A0s)) {
                        c40791um.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("mitigation".equals(A0s)) {
                        c40791um.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("non_mentionable_users".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        c40791um.A06 = arrayList;
                    } else if ("cause".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("comment_creation_key".equals(A0s)) {
                        c40791um.A01 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
