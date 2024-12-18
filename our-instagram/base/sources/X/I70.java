package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I70 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IGv] */
    public static C41078IGv parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1E(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    Integer[] A00 = C05F.A00(7);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (C14360o3.A0K(AbstractC41360ISn.A00(num), A0m)) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    obj.A01 = num;
                } else if ("content".equals(A0q)) {
                    obj.A00 = AbstractC40823I6z.parseFromJson(c16l);
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
