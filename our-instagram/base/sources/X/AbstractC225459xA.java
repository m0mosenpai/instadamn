package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.9xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225459xA {
    public static C169397hD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            SimpleImageUrl simpleImageUrl = null;
            Integer num = null;
            Boolean bool = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("profile_id".equals(A0s)) {
                    l = Long.valueOf(c16l.A0y());
                } else if (AbstractC111324zv.A00(261).equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("request_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("request_count_overflow".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(5256).equals(A0s)) {
                    simpleImageUrl2 = AbstractC222616c.A00(c16l);
                } else if (AbstractC111324zv.A00(3184).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C169397hD(simpleImageUrl, simpleImageUrl2, bool, num, l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
