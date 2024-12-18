package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OQL {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.N3I, X.1um, X.1ul] */
    public static N3I parseFromJson(C16L c16l) {
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
                if ("comments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C56803PIu parseFromJson = AbstractC54256Nyb.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("system_comments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C56802PIt parseFromJson2 = AbstractC54259Nye.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if ("comment_count".equals(A0s)) {
                    c16l.A1D();
                } else if ("pinned_comment".equals(A0s)) {
                    c40791um.A03 = AbstractC54256Nyb.parseFromJson(c16l);
                } else if ("live_seconds_per_comment".equals(A0s)) {
                    c40791um.A00 = c16l.A1D();
                } else if ("comment_muted".equals(A0s)) {
                    c40791um.A08 = c16l.A0d();
                } else if ("is_viewer_comment_allowed".equals(A0s)) {
                    c40791um.A09 = c16l.A0d();
                } else if ("user_pay_supporters_info".equals(A0s)) {
                    c40791um.A01 = AbstractC54260Nyf.parseFromJson(c16l);
                } else if ("join_request_counts".equals(A0s)) {
                    c40791um.A02 = OQM.parseFromJson(c16l);
                } else if ("visible_comments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C56803PIu parseFromJson3 = AbstractC54256Nyb.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    c40791um.A06 = arrayList;
                } else if ("visible_comments_like_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C56803PIu parseFromJson4 = AbstractC54256Nyb.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    c40791um.A07 = arrayList;
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
