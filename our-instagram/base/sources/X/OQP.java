package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class OQP {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1um, X.N2z, X.1ul] */
    public static C52099N2z parseFromJson(C16L c16l) {
        EnumC53192Nfo enumC53192Nfo;
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
                    c40791um.A00 = AbstractC54256Nyb.parseFromJson(c16l);
                } else if ("comments_disabled".equals(A0s)) {
                    c16l.A0d();
                } else if ("is_offensive".equals(A0s)) {
                    c40791um.A01 = c16l.A0d();
                } else if ("warning_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    EnumC53192Nfo[] values = EnumC53192Nfo.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC53192Nfo = values[i];
                            if (C14360o3.A0K(enumC53192Nfo.A00, A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC53192Nfo = null;
                            break;
                        }
                    }
                    C14360o3.A0B(enumC53192Nfo, 0);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
