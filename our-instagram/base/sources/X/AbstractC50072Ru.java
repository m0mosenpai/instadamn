package X;

import java.io.IOException;

/* renamed from: X.2Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50072Ru {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2E4, java.lang.Object] */
    public static C2E4 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (!"timestamp_seconds".equals(A0q) && !"cursor_timestamp_seconds".equals(A0q)) {
                    if ("thread_v2_id".equals(A0q) || "cursor_thread_v2_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P = null;
                        } else {
                            A1P = c16l.A1P();
                        }
                        obj.A01 = A1P;
                    }
                } else {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C2E4 c2e4) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("timestamp_seconds", c2e4.A00);
        String str = c2e4.A01;
        if (str != null) {
            anonymousClass182.A0S("thread_v2_id", str);
        }
        anonymousClass182.A0a();
    }
}
