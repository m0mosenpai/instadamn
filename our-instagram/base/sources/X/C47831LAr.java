package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LAr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47831LAr {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.K86, X.1um, X.1ul] */
    public static K86 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("author_notif_control".equals(A0s)) {
                    c40791um.A00 = AbstractC46597Kja.parseFromJson(c16l);
                } else if ("containing_thread".equals(A0s)) {
                    c40791um.A03 = AbstractC40471Hx4.parseFromJson(c16l);
                } else if ("downwards_thread_will_continue".equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0d(c16l);
                } else if ("is_author_of_root_post".equals(A0s)) {
                    c40791um.A05 = AbstractC166997dE.A0d(c16l);
                } else if ("is_subscribed_to_target_post".equals(A0s)) {
                    c40791um.A06 = AbstractC166997dE.A0d(c16l);
                } else if ("paging_tokens".equals(A0s)) {
                    c40791um.A01 = AbstractC46593KjW.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("reply_threads".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C38634Gyb parseFromJson = AbstractC40471Hx4.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A0C = arrayList;
                    } else if ("show_unavailable_replies_disclaimer".equals(A0s)) {
                        c40791um.A07 = AbstractC166997dE.A0d(c16l);
                    } else if ("sibling_threads".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C38634Gyb parseFromJson2 = AbstractC40471Hx4.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A0D = arrayList;
                    } else if ("sibling_threads_header".equals(A0s)) {
                        c40791um.A08 = AbstractC167017dG.A0m(c16l);
                    } else if ("target_post_id".equals(A0s)) {
                        c40791um.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("target_post_reply_context_disclaimer".equals(A0s)) {
                        c40791um.A0A = AbstractC167017dG.A0m(c16l);
                    } else if ("target_post_reply_placeholder".equals(A0s)) {
                        c40791um.A0B = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            C51749MtY c51749MtY = c40791um.A00;
            C38634Gyb c38634Gyb = c40791um.A03;
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A04);
            boolean A1b2 = AbstractC31172DnG.A1b(c40791um.A05);
            boolean A1b3 = AbstractC31172DnG.A1b(c40791um.A06);
            C50679MYx c50679MYx = c40791um.A01;
            C14360o3.A0A(c50679MYx);
            List list = c40791um.A0C;
            C14360o3.A0A(list);
            boolean A1b4 = AbstractC31172DnG.A1b(c40791um.A07);
            List list2 = c40791um.A0D;
            C14360o3.A0A(list2);
            c40791um.A02 = new C45074Jx3(c51749MtY, c50679MYx, c38634Gyb, c40791um.A08, c40791um.A09, c40791um.A0A, c40791um.A0B, list, list2, A1b, A1b2, A1b3, A1b4);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
