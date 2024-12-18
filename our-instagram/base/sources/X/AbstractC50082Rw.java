package X;

import java.io.IOException;

/* renamed from: X.2Rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50082Rw {
    public static C9C6 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C9C6 c9c6 = new C9C6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("folder_summary".equals(A0q)) {
                    c9c6.A00 = FUS.parseFromJson(c16l);
                } else if ("inbox_oldest_cursor".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c9c6.A03 = A1P;
                } else if ("inbox_has_older".equals(A0q)) {
                    c9c6.A04 = c16l.A0d();
                } else if ("inbox_prev_key".equals(A0q)) {
                    C2E4 parseFromJson = AbstractC50072Ru.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c9c6.A02 = parseFromJson;
                } else if ("inbox_next_key".equals(A0q)) {
                    C2E4 parseFromJson2 = AbstractC50072Ru.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c9c6.A01 = parseFromJson2;
                }
                c16l.A0z();
            }
            return c9c6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C9C6 c9c6, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        if (c9c6.A00 != null) {
            anonymousClass182.A0r("folder_summary");
            FUS.A00(anonymousClass182, (C50092Rx) c9c6.A00);
        }
        String str = c9c6.A03;
        if (str != null) {
            anonymousClass182.A0S("inbox_oldest_cursor", str);
        }
        anonymousClass182.A0T("inbox_has_older", c9c6.A04);
        if (c9c6.A02 != null) {
            anonymousClass182.A0r("inbox_prev_key");
            AbstractC50072Ru.A00(anonymousClass182, (C2E4) c9c6.A02);
        }
        if (c9c6.A01 != null) {
            anonymousClass182.A0r("inbox_next_key");
            AbstractC50072Ru.A00(anonymousClass182, (C2E4) c9c6.A01);
        }
        anonymousClass182.A0a();
    }
}
