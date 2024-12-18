package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.LCw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47876LCw {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1um, X.K8S, X.1ul] */
    public static K8S parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("show_search".equals(A0s)) {
                    c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("sticker_pack_id".equals(A0s)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("stickers".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C148286ly parseFromJson = AbstractC201088uq.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A08 = arrayList;
                    } else if ("next_item_cursor".equals(A0s)) {
                        c40791um.A02 = AbstractC166997dE.A0h(c16l);
                    } else if ("has_next_page".equals(A0s)) {
                        c40791um.A01 = AbstractC166997dE.A0d(c16l);
                    } else if ("avatar_revision_id".equals(A0s)) {
                        c40791um.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("config_hash".equals(A0s)) {
                        c40791um.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("avatar_id".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(175).equals(A0s)) {
                        c40791um.A05 = AbstractC167017dG.A0m(c16l);
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
