package X;

import java.io.IOException;

/* renamed from: X.Nvh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54083Nvh {
    public static NRI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("target_segment_length_sec".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("min_segment_length_sec".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("target_segment_length_sec", c16l, "SegmentedStrategyConfiguration");
            } else if (l2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("min_segment_length_sec", c16l, "SegmentedStrategyConfiguration");
            } else {
                return new NRI(l.longValue(), l2.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
