package X;

import java.io.IOException;

/* renamed from: X.Gry, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38255Gry {
    public static C114575Fd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("delay_time_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("highlight_time_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C114575Fd(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C114575Fd c114575Fd) {
        anonymousClass182.A0d();
        Integer num = c114575Fd.A00;
        if (num != null) {
            anonymousClass182.A0Q("delay_time_ms", num.intValue());
        }
        Integer num2 = c114575Fd.A01;
        if (num2 != null) {
            anonymousClass182.A0Q("highlight_time_ms", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
