package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FVQ {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1um, X.ED6, X.1ul] */
    public static ED6 parseFromJson(C16L c16l) {
        Integer num;
        String str;
        Integer num2;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(1249).equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    Integer[] A00 = C05F.A00(9);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num2 = A00[i];
                            if (!C14360o3.A0K(AbstractC34227F7z.A00(num2), A1Q)) {
                                i++;
                            }
                        } else {
                            num2 = C05F.A1F;
                        }
                    }
                    c40791um.A01 = num2;
                } else if ("tos_version".equals(A0s)) {
                    String A1Q2 = c16l.A1Q();
                    Integer[] A002 = C05F.A00(3);
                    int length2 = A002.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            num = A002[i2];
                            switch (num.intValue()) {
                                case 1:
                                    str = "row";
                                    break;
                                case 2:
                                    str = "unknown";
                                    break;
                                default:
                                    str = "eu";
                                    break;
                            }
                            if (!str.equals(A1Q2)) {
                                i2++;
                            }
                        } else {
                            num = C05F.A0C;
                        }
                    }
                    c40791um.A02 = num;
                } else if (AbstractC111324zv.A00(73).equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("contents".equals(A0s)) {
                    c40791um.A00 = AbstractC34223F7v.parseFromJson(c16l);
                } else if ("gdpr_s".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
