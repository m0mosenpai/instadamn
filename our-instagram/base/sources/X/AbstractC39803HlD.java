package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HlD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39803HlD {
    public static C87883vw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            String str2 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("duration_in_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("indicator_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("should_enable_autoadvance".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("showcase_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1I(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("thumbnail_position".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "thumbnail_width");
                }
                c16l.A0z();
            }
            return new C87883vw(bool, num, num2, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
