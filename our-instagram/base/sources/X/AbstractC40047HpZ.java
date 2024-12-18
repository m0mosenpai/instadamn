package X;

import com.instagram.api.schemas.LiveNoteResponseInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HpZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40047HpZ {
    public static LiveNoteResponseInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("subscribed_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else {
                    l = AbstractC37303Gc4.A0O(c16l, l, A0s, "timer_end_timestamp");
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("timer_end_timestamp", c16l, "LiveNoteResponseInfo");
                throw C00O.createAndThrow();
            }
            return new LiveNoteResponseInfo(arrayList, l.longValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
