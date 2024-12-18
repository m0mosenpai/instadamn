package X;

import java.io.IOException;

/* renamed from: X.I6t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40817I6t {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IIJ] */
    public static IIJ parseFromJson(C16L c16l) {
        Integer num;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1D(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("enabled".equals(A0s)) {
                    obj.A03 = c16l.A0d();
                } else if ("destination".equals(A0s)) {
                    obj.A00 = I8A.A00(AbstractC167017dG.A0m(c16l));
                } else if ("style".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "label";
                                    break;
                                case 2:
                                    str = "label_emphasized";
                                    break;
                                default:
                                    str = "info_emphasized";
                                    break;
                            }
                            if (!str.equals(A0m)) {
                                i++;
                            }
                        } else {
                            num = C05F.A0C;
                        }
                    }
                    obj.A01 = num;
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
