package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A09 {
    public static C51737MtK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("start_time_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("end_time_ms".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("start_time_ms", c16l, "CaptionAudioBleep");
            } else if (num2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("end_time_ms", c16l, "CaptionAudioBleep");
            } else {
                return new C51737MtK(num.intValue(), num2.intValue(), 12);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
