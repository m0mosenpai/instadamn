package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34788FUq {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ECp, X.1um, X.1ul] */
    public static C32194ECp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("in_thread_content_results".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34607FMq parseFromJson = F5C.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A01 = arrayList;
                } else if ("thread".equals(A0s)) {
                    c40791um.A00 = JV4.parseFromJson(c16l);
                } else if ("has_more".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
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
