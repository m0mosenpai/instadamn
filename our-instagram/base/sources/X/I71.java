package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I71 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IJC, java.lang.Object] */
    public static IJC parseFromJson(C16L c16l) {
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
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("destination".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    Integer[] A00 = C05F.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (1 - num.intValue() != 0) {
                                str = "product_description_link";
                            } else {
                                str = "about_this_shop_link";
                            }
                            if (str.equals(A0m)) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    obj.A03 = num;
                } else if ("shop_info".equals(A0q)) {
                    obj.A02 = I8J.parseFromJson(c16l);
                } else if ("secondary_link".equals(A0q)) {
                    obj.A00 = I76.parseFromJson(c16l);
                } else if ("description_content".equals(A0q)) {
                    obj.A01 = I8G.parseFromJson(c16l);
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
