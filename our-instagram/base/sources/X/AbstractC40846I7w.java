package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I7w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40846I7w {
    public static C38613GyG parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C38613GyG c38613GyG = new C38613GyG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant".equals(A0s)) {
                    User A0S = AbstractC31171DnF.A0S(c16l, false);
                    C14360o3.A0B(A0S, 0);
                    c38613GyG.A00 = A0S;
                } else {
                    String str = null;
                    ArrayList arrayList = null;
                    if ("pinned_product_ids".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c38613GyG.A02 = arrayList;
                    } else if ("request_source".equals(A0s)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        Integer[] A00 = C05F.A00(1);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A00[i];
                                if ("storefront_relevance_sorted".equals(str)) {
                                    break;
                                }
                                i++;
                            } else {
                                num = null;
                                break;
                            }
                        }
                        C14360o3.A0B(num, 0);
                        c38613GyG.A01 = num;
                    }
                }
                c16l.A0z();
            }
            return c38613GyG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
