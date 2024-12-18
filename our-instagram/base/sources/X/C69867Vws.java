package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vws, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69867Vws {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.UyU, X.1um, X.1ul] */
    public static C67795UyU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("accounts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            UP8 parseFromJson = AbstractC68361VNv.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("body_text".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("cover_image_url".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("header_text".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A04;
            C14360o3.A0A(list);
            c40791um.A00 = new UP6(c40791um.A01, c40791um.A02, c40791um.A03, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
