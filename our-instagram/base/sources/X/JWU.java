package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class JWU {
    public static JWT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            JWT jwt = new JWT();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                ArrayList arrayList2 = null;
                if ("oldest_cursor".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    jwt.A03 = str;
                } else if ("has_older".equals(A0q)) {
                    jwt.A02 = Boolean.valueOf(c16l.A0d());
                } else if ("threads".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C43707JUs parseFromJson = JV4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    jwt.A05 = arrayList2;
                } else if ("pinned_threads".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C43707JUs parseFromJson2 = JV4.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    jwt.A04 = arrayList;
                }
                c16l.A0z();
            }
            return jwt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
