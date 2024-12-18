package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A2O {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.A6E, java.lang.Object] */
    public static A6E parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("signal_to_decision_maker".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = c16l.A1D();
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
