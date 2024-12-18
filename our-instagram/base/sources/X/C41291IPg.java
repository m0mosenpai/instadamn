package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IPg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41291IPg {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.K8P, X.1um, X.1ul] */
    public static K8P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("require_approval".equals(A0s)) {
                    c16l.A0d();
                } else if ("whitelisted_users".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c40791um.A00 = arrayList;
                } else if ("pending_approval_requests_count".equals(A0s)) {
                    c16l.A1D();
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
