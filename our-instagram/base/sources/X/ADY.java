package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ADY {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.9el, X.1um, X.1ul] */
    public static C214479el parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MSV.A00(108).equals(A0s)) {
                    c40791um.A00 = AbstractC38741r6.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("background_image_uris".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c40791um.A02 = arrayList;
                    } else if ("sticker_id".equals(A0s)) {
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
