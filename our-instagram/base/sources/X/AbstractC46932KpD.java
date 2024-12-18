package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.IOException;

/* renamed from: X.KpD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46932KpD {
    public static C31071eB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31071eB c31071eB = new C31071eB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("animated_media".equals(A0s)) {
                    DirectAnimatedMedia parseFromJson = AbstractC47867LCn.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c31071eB.A03 = parseFromJson;
                } else if ("pending_media_key".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31071eB.A04 = A1P;
                } else if ("replied_to_message".equals(A0s)) {
                    c31071eB.A01 = AnonymousClass442.A00(c16l);
                } else if ("pending_media".equals(A0s)) {
                    c31071eB.A02 = AbstractC47865LCl.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c31071eB.A00 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c31071eB, A0s);
                }
                c16l.A0z();
            }
            return c31071eB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
