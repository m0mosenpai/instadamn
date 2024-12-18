package X;

import java.io.IOException;

/* renamed from: X.Nry, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53870Nry {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.OL5] */
    public static OL5 parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("enabled".equals(A0s)) {
                    obj.A05 = c16l.A0d();
                } else if ("is_account_linked".equals(A0s)) {
                    obj.A06 = c16l.A0d();
                } else if ("account_id".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("posting_type".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("page_name".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("reels_share_to_facebook".equals(A0s)) {
                    obj.A08 = c16l.A0d();
                } else if ("reels_destination_id".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("reels_cross_app_share_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    Integer[] A00 = C05F.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (C14360o3.A0K(AbstractC54209Nxn.A00(num), A0m)) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    obj.A00 = num;
                } else if ("reels_cross_app_share_fb_validation_check_bypass".equals(A0s)) {
                    obj.A07 = c16l.A0d();
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
