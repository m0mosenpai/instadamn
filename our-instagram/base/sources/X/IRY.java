package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class IRY {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.HAc, X.1um, X.1ul] */
    public static C38880HAc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pageInfo".equals(A0s)) {
                    IKY parseFromJson = AbstractC40760I4o.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c40791um.A02 = parseFromJson;
                } else if ("learnMoreInfo".equals(A0s)) {
                    II2 parseFromJson2 = AbstractC40759I4n.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c40791um.A01 = parseFromJson2;
                } else if ("media_or_ad".equals(A0s)) {
                    c40791um.A00 = C38321qM.A00(c16l);
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
