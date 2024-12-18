package X;

import java.io.IOException;

/* renamed from: X.8yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203388yv {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.8qu] */
    public static C198948qu parseFromJson(C16L c16l) {
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
                if ("music_sticker_tag".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A03 = A1P;
                } else if ("music_data_source".equals(A0q)) {
                    obj.A02 = A1N.parseFromJson(c16l);
                } else if ("start_time_ms".equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if ("duration_ms".equals(A0q)) {
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
}
