package X;

import java.io.IOException;

/* renamed from: X.Hlc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39828Hlc {
    public static C38703H2o parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("effect_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "segment_index");
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("effect_id", c16l, "ClipsTemplateSegmentEffectInfo");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("segment_index", c16l, "ClipsTemplateSegmentEffectInfo");
            } else {
                return new C38703H2o(l.longValue(), num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
