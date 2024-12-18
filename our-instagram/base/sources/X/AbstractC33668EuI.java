package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EuI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33668EuI {
    public static E7a parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C87493vH c87493vH = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("liker_user_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("recommender_info".equals(A0s)) {
                    c87493vH = AbstractC87453vC.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new E7a(c87493vH, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
