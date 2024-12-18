package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34792FUu {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDn, X.1um, X.1ul] */
    public static C32214EDn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("inform_module".equals(A0s)) {
                    c40791um.A00 = AbstractC40607HzR.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("ranked_recipients".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C36441G5q parseFromJson = F5A.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A05 = arrayList;
                    } else if ("filtered".equals(A0s)) {
                        c40791um.A06 = c16l.A0d();
                    } else if (TraceFieldType.RequestID.equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("rank_token".equals(A0s)) {
                        c40791um.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("section_order".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c40791um.A04 = arrayList;
                    } else if ("remaining_message_request_count".equals(A0s)) {
                        c40791um.A01 = AbstractC166997dE.A0h(c16l);
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
