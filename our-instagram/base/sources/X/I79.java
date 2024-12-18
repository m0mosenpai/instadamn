package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I79 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IGw] */
    public static C41079IGw parseFromJson(C16L c16l) {
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
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("alignment".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "center";
                                    break;
                                case 2:
                                    str = "end";
                                    break;
                                default:
                                    str = "start";
                                    break;
                            }
                            if (!str.equals(A0m)) {
                                i++;
                            }
                        } else {
                            num = C05F.A01;
                        }
                    }
                    obj.A00 = num;
                } else if ("should_transition_on_variant_switch".equals(A0s)) {
                    obj.A02 = c16l.A0d();
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
