package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I54 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IF1, java.lang.Object] */
    public static IF1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2497).equals(A0s)) {
                    obj.A00 = I52.parseFromJson(c16l);
                } else if ("ig_media".equals(A0s)) {
                    obj.A01 = I53.parseFromJson(c16l);
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
