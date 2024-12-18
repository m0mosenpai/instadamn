package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FSg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34741FSg {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.EAe, X.1um, X.1ul] */
    public static C32131EAe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_public_channels".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("pinned_channels_list".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C44P parseFromJson = C44L.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Boolean bool = c40791um.A01;
            List list = c40791um.A02;
            C14360o3.A0A(list);
            c40791um.A00 = new C81173jm(bool, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
