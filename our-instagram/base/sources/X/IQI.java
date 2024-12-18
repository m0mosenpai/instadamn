package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class IQI {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HAq, X.1um, X.1ul] */
    public static C38894HAq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("total_participant_requests".equals(A0s)) {
                        c40791um.A00 = c16l.A1D();
                    } else if ("total_thread_participants".equals(A0s)) {
                        c40791um.A01 = c16l.A1D();
                    } else {
                        HashMap hashMap = null;
                        ArrayList arrayList = null;
                        if ("cursor".equals(A0s)) {
                            c40791um.A02 = AbstractC167017dG.A0m(c16l);
                        } else if ("users".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167017dG.A1H(c16l, arrayList);
                                }
                            }
                            c40791um.A04 = arrayList;
                        } else if ("requester_usernames".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap);
                                }
                            }
                            c40791um.A03 = hashMap;
                        } else {
                            C55702hA.A01(c16l, c40791um, A0s);
                        }
                    }
                    c16l.A0z();
                } else {
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
