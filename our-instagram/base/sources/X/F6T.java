package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6T {
    public static C29841bz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29841bz c29841bz = new C29841bz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("business_name".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c29841bz.A01 = A0m;
                } else if ("whatsapp_display_number".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c29841bz.A03 = A0m2;
                } else if (AbstractC111324zv.A00(74).equals(A0s)) {
                    ExtendedImageUrl parseFromJson = C17Y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c29841bz.A00 = parseFromJson;
                } else if ("cta_title".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c29841bz.A02 = A0m3;
                } else {
                    AbstractC47856LCb.A01(c16l, c29841bz, A0s);
                }
                c16l.A0z();
            }
            return c29841bz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
