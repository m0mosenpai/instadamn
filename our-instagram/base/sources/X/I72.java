package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I72 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.ICu] */
    public static C40973ICu parseFromJson(C16L c16l) {
        String A1P;
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
                if ("destination".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "influencer_posts";
                                    break;
                                case 2:
                                    str = "featured_product_medias";
                                    break;
                                default:
                                    str = "related_posts";
                                    break;
                            }
                            if (!str.equals(A1P)) {
                                i++;
                            }
                        } else {
                            num = C05F.A00;
                        }
                    }
                    obj.A00 = num;
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
