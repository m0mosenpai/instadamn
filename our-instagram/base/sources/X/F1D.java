package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class F1D {
    public static C37271oQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37271oQ c37271oQ = new C37271oQ();
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
                    HashMap hashMap = null;
                    if ("creator_ai_enabled_map".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    Boolean A0d = AbstractC166997dE.A0d(c16l);
                                    if (A0d != null) {
                                        A1G.put(A1P, A0d);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c37271oQ.A01 = hashMap;
                    } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        c37271oQ.A00 = A0m;
                    } else {
                        AbstractC43669JTd.A01(c16l, c37271oQ, A0s);
                    }
                    c16l.A0z();
                } else {
                    return c37271oQ;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
