package X;

import java.io.IOException;

/* renamed from: X.KpF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46934KpF {
    public static C31311ea parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31311ea c31311ea = new C31311ea();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("direct_pending_media".equals(A0s)) {
                    c31311ea.A01 = AbstractC47065KrM.parseFromJson(c16l);
                } else if ("view_mode".equals(A0s)) {
                    c31311ea.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("reply_type".equals(A0s)) {
                    c31311ea.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("source_media_id".equals(A0s)) {
                    c31311ea.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("replied_to_message".equals(A0s)) {
                    c31311ea.A00 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c31311ea, A0s);
                }
                c16l.A0z();
            }
            return c31311ea;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
