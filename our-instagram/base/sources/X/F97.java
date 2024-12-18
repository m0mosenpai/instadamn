package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F97 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.EtD, java.lang.Object] */
    public static C33601EtD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33613EtP c33613EtP = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C33613EtP c33613EtP2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31189DnY.A01().equals(A0s)) {
                    c33613EtP = F98.parseFromJson(c16l);
                } else if ("full_name".equals(A0s)) {
                    c33613EtP2 = F98.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A01 = c33613EtP;
            obj.A00 = c33613EtP2;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
