package X;

import java.io.IOException;

/* renamed from: X.3oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83983oi {
    public static C84023om parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C84003ok c84003ok = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("additional_audio_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("audio_reattribution_info".equals(A0q)) {
                    c84003ok = AbstractC83993oj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C84023om(c84003ok, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
