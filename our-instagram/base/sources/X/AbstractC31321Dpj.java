package X;

import java.io.IOException;

/* renamed from: X.Dpj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31321Dpj {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.5mV, java.lang.Object] */
    public static C125805mV parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("reported_timestamp_ms".equals(A0q)) {
                    obj.A00 = c16l.A0y();
                } else if ("reviewed_timestamp_ms".equals(A0q)) {
                    obj.A01 = c16l.A0y();
                } else if ("visibility".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A02 = A1P;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C125805mV c125805mV) {
        anonymousClass182.A0d();
        anonymousClass182.A0R("reported_timestamp_ms", c125805mV.A00);
        anonymousClass182.A0R("reviewed_timestamp_ms", c125805mV.A01);
        String str = c125805mV.A02;
        if (str != null) {
            anonymousClass182.A0S("visibility", str);
        }
        anonymousClass182.A0a();
    }
}
