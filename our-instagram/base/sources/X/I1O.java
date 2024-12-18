package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1O {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IHx] */
    public static C41106IHx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("serverMediaUpdateRequest".equals(A0s)) {
                    obj.A00 = I1P.parseFromJson(c16l);
                } else if ("conferenceStateRequest".equals(A0s)) {
                    obj.A01 = I1I.parseFromJson(c16l);
                } else if ("dismissRequest".equals(A0s)) {
                    obj.A02 = I1J.parseFromJson(c16l);
                } else if ("ringRequest".equals(A0s)) {
                    obj.A03 = I1N.parseFromJson(c16l);
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
}
