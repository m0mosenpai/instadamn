package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Kpz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46980Kpz {
    public static C31001e3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31001e3 c31001e3 = new C31001e3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creator_igid".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c31001e3.A02 = A0m;
                } else if ("profile_pic_url".equals(A0s)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c31001e3.A01 = A00;
                } else if ("crown_icon".equals(A0s)) {
                    SimpleImageUrl A002 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A002, 0);
                    c31001e3.A00 = A002;
                } else if ("header_text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c31001e3.A05 = A0m2;
                } else if ("header_subtitle".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c31001e3.A04 = A0m3;
                } else if (MSV.A00(427).equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c31001e3.A03 = A0m4;
                } else {
                    AbstractC47856LCb.A01(c16l, c31001e3, A0s);
                }
                c16l.A0z();
            }
            return c31001e3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
