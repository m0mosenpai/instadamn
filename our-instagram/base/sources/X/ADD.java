package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ADD {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.9eV, X.1um, X.1ul] */
    public static C214319eV parseFromJson(C16L c16l) {
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
                if ("custom_avatar_sticker_url".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("dynamic_default_entrypoint_images".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("has_avatar".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            List list = c40791um.A03;
            Boolean bool = c40791um.A01;
            C14360o3.A0A(bool);
            c40791um.A00 = new C9ZA(str, list, bool.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}