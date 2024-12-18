package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAM {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IFx] */
    public static C41054IFx parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("payload".equals(A0s)) {
                    IN3 parseFromJson = IAL.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                } else if ("binaryPayload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A01 = A1P;
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
