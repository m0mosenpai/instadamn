package X;

import java.io.IOException;

/* renamed from: X.Hz3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40583Hz3 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IEQ, java.lang.Object] */
    public static IEQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(4222).equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4269).equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
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
