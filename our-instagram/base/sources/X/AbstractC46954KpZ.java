package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.KpZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46954KpZ {
    public static C33191hh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33191hh c33191hh = new C33191hh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33191hh.A03 = AbstractC31172DnG.A0o(c16l);
                } else if ("query_string".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c33191hh.A04 = A0m;
                } else if ("sticker_id".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c33191hh.A05 = A0m2;
                } else if ("sticker_image_url".equals(A0q)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c33191hh.A01 = A00;
                } else if ("replied_to_message".equals(A0q)) {
                    c33191hh.A02 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c33191hh, A0q);
                }
                c16l.A0z();
            }
            return c33191hh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
